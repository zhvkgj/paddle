package io.paddle.plugin.python.extensions

import io.paddle.plugin.python.dependencies.index.PYPI_URL
import io.paddle.plugin.python.dependencies.index.PyPackageRepositoryUrl
import io.paddle.project.Project
import io.paddle.utils.Hashable
import io.paddle.utils.config.ConfigurationView
import io.paddle.utils.ext.Extendable
import io.paddle.utils.hashable
import java.io.File

val Project.requirements: Requirements
    get() = extensions.get(Requirements.Extension.key)!!

class Requirements(val descriptors: MutableList<Descriptor>, val files: MutableList<File>, val repositories: List<PyPackageRepositoryUrl>) : Hashable {
    object Extension : Project.Extension<Requirements> {
        override val key: Extendable.Key<Requirements> = Extendable.Key()

        override fun create(project: Project): Requirements {
            val config = object : ConfigurationView("requirements", project.config) {
                val requirementsFile by string("file", default = "requirements.txt")
                val libraries by list<Map<String, String>>("libraries", default = emptyList())
                val repositories by list("repositories", default = listOf(PYPI_URL))
            }

            val libraries = config.libraries.map { Descriptor(it["name"]!!, it["version"]!!) }.toMutableList()

            return Requirements(libraries, mutableListOf(File(project.workDir, config.requirementsFile)), config.repositories)
        }
    }

    data class Descriptor(val name: String, val version: String) : Hashable {
        val distInfoDirName = "${name}-${version}.dist-info"

        override fun hash(): String {
            return listOf(name.hashable(), version.hashable()).hashable().hash()
        }
    }

    override fun hash(): String {
        return (files.map { it.hashable() } + descriptors).hashable().hash()
    }
}
