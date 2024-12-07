pluginManagement {
    repositories {
        maven {
            name = "gradle-plugin"
            url = uri(System.getenv("GRADLE_PLUGIN_URL") ?: "https://plugins.gradle.org/m2/")
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "legend-ide-intellij"
