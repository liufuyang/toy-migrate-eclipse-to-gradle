rootProject.name = "g1"

pluginManagement {
    repositories {
        gradlePluginPortal()
        // google()
    }
     includeBuild("../build-logic")
}


dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    // includeBuild("../my-other-project")
}

// For sub projects, and we have the power  of Kotlin!
// include("p1", "p2")
val ignoredSubFolders = listOf("gradle")
rootDir.listFiles()
        .filter{ it.isDirectory && !it.isHidden && !it.name.startsWith(".") && !ignoredSubFolders.contains(it.name) }
        .forEach { include(it.name) }