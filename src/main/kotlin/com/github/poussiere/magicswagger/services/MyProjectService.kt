package com.github.poussiere.magicswagger.services

import com.intellij.openapi.project.Project
import com.github.poussiere.magicswagger.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
