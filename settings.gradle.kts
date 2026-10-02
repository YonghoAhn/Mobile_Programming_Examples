pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Week05Examples"

include(":Ex3_1")
include(":Ex3_2")
include(":Ex3_3")
include(":Ex3_4")
include(":Ex3_5")
include(":Ex3_6")
