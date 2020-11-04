package com.github.54868yy.erthr.services

import com.intellij.openapi.project.Project
import com.github.54868yy.erthr.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
