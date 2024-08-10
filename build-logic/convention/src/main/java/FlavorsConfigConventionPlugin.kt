import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType


class FlavorsConfigConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            val extensions = extensions.getByType<ApplicationExtension>()
            extensions.apply {
                flavorDimensions += mutableListOf("server")
                productFlavors {
                    create("development") {
                        dimension = "server"
                        applicationIdSuffix = ".dev"
                    }
                    create("production") {
                        dimension = "server"
                    }
                }
            }
        }
    }
}