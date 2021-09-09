package com.github.yougusen.breakpointsmanager.services

import com.intellij.openapi.project.Project
import com.github.yougusen.breakpointsmanager.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
