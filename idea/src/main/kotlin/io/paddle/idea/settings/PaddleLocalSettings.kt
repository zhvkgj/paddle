package io.paddle.idea.settings

import com.intellij.openapi.components.Service
import com.intellij.openapi.externalSystem.settings.AbstractExternalSystemLocalSettings
import com.intellij.openapi.project.Project
import io.paddle.idea.PaddleManager

@Service
class PaddleLocalSettings(project: Project) : AbstractExternalSystemLocalSettings<AbstractExternalSystemLocalSettings.State>(PaddleManager.ID, project) {
}

