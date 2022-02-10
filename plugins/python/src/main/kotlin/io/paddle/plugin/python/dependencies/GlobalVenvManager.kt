package io.paddle.plugin.python.dependencies

import io.paddle.execution.CommandExecutor
import io.paddle.execution.ExecutionResult
import io.paddle.execution.local.LocalCommandExecutor
import io.paddle.plugin.python.dependencies.index.PyPackagesRepositories
import io.paddle.plugin.python.extensions.Requirements
import io.paddle.terminal.Terminal
import io.paddle.terminal.TextOutput
import java.io.File

/**
 * A service for managing Paddle's internal virtual environment, where all the packages are installed for the first time.
 * Then, it moves them to the corresponding ~/.paddle/cache/package/version folder.
 */
object GlobalVenvManager {
    private val dummyOutput = TextOutput.Console // TODO: use internal logging instead of TextOutput.Console
    private val executor: CommandExecutor = LocalCommandExecutor(dummyOutput)
    private val terminal: Terminal = Terminal(dummyOutput)

    private val globalVenv: VenvDir

    init {
        createVenv().orElse { error("Failed to create Paddle's internal virtualenv. Check your python installation.") }
        globalVenv = VenvDir(PythonDependenciesConfig.venvDir.toFile())
    }

    fun smartInstall(dependency: Requirements.Descriptor, repositories: PyPackagesRepositories): ExecutionResult {
        return createVenv(args = listOf("--clear")).then {
            install(dependency, repositories)
        }
    }

    private fun createVenv(args: List<String> = emptyList()): ExecutionResult {
        return executor.execute(
            command = "python3",
            args = listOf("-m", "venv") + args + PythonDependenciesConfig.venvDir.toAbsolutePath().toString(),
            workingDir = PythonDependenciesConfig.paddleHome.toFile(),
            terminal = terminal
        )
    }

    private fun install(dependency: Requirements.Descriptor, repositories: PyPackagesRepositories): ExecutionResult {
        val args = ArrayList<String>().apply {
            add("install")
            add("--index-url")
            add(repositories.primarySource.urlSimple)
            for (repo in repositories.all) {
                if (repo != repositories.primarySource) {
                    add("--extra-index-url")
                    add(repo.urlSimple)
                }
            }
            add("${dependency.name}==${dependency.version}")
        }

        return executor.execute(
            command = "${PythonDependenciesConfig.venvDir}/bin/pip",
            args = args,
            workingDir = PythonDependenciesConfig.paddleHome.toFile(),
            terminal = terminal
        )
    }

    fun contains(pkgName: String): Boolean {
        val distInfoDirName = globalVenv.sitePackages.listFiles()
            ?.find { it.isDirectory && it.name.startsWith(pkgName) && it.name.endsWith(".dist-info") }
            ?.name
        val topLevelName = distInfoDirName?.let { resolveTopLevelName(it, pkgName) } ?: pkgName
        return globalVenv.sitePackages.listFiles()?.any { it.name == topLevelName } ?: false
    }

    fun getInstalledPackageVersionByName(name: String): String? {
        return globalVenv.sitePackages.listFiles()
            ?.find { it.isDirectory && it.name.matches(RegexCache.getDistInfoRegex(name)) }
            ?.name?.substringAfter("$name-")?.substringBefore(".dist-info")
    }

    /**
     * Extract all directories and files which could be potentially related to the @param dependency.
     *
     * FIXME: This is a temporary solution. Should find a corresponding reference (or PEP) and fix it.
     */
    fun getPackageRelatedStuff(dependency: Requirements.Descriptor): List<File> {
        // Some strange and corner case
        if (dependency.name == "py") {
            return globalVenv.sitePackages.listFiles()
                ?.filter { it.name == "py" || it.name.startsWith("py-") }
                ?: error("Paddle's internal virtualenv is empty or corrupted.")
        }

        // Otherwise, for instance, package "attrs" has top-level name "attr", so we need to extract and consider it as well
        val topLevelName = resolveTopLevelName(dependency.distInfoDirName, dependency.name)
        return globalVenv.sitePackages.listFiles()
            ?.filter { it.name.matches(RegexCache.getPackageRelatedRegex(dependency.name, topLevelName)) }
            ?: error("Paddle's internal virtualenv is empty or corrupted.")
    }

    private fun resolveTopLevelName(distInfoDirName: String, pkgName: String): String {
        return globalVenv.sitePackages.resolve(distInfoDirName).resolve("top_level.txt").let {
            if (it.exists()) it.readText().trim() else pkgName
        }
    }
}