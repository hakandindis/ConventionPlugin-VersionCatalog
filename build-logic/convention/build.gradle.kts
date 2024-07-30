plugins {
    `kotlin-dsl`
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("moduleConfigPlugin") {
            id = "hakandindis.module.config"
            implementationClass = "ModuleConfigPlugin"
        }

        register("composeConfigPlugin") {
            id = "hakandindis.compose.config"
            implementationClass = "ComposeConfigPlugin"
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}