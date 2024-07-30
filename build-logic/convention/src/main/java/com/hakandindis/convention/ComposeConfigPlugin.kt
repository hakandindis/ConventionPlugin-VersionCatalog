package com.hakandindis.convention

import org.gradle.api.Plugin
import org.gradle.api.Project

class ComposeConfigPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")
        }
    }

}