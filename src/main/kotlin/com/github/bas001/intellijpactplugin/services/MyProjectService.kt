package com.github.bas001.intellijpactplugin.services

import com.intellij.openapi.project.Project
import com.github.bas001.intellijpactplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
