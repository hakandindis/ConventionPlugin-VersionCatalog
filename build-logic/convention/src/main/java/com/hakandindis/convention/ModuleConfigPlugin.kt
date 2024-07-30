package com.hakandindis.convention

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class ModuleConfigPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        extensions.configure<ApplicationExtension> {
            defaultConfig {
                compileSdk = 34
                targetSdk = 34
                versionName = "1.0"
                versionCode = 1

                buildFeatures {
                    buildConfig = true
                    viewBinding = true
                    dataBinding = true
                }

            }
        }
    }

    fun applyPlugins() {

    }

}