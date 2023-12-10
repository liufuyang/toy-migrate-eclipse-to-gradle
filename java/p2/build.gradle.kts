/**
 * Three things to consider in build.gradle files:
 *   1. setup plugins
 *   2. config plugin extension
 *   3. specify dependencies
 *      dependencies can be external, sub-projects, or binary repos
 *
 *  Build file should not contain too many Kotlin files, use plugins to write Kotlin scripts
 */

// Define plugins
plugins {
    id("application")
}

// Plugin extension
java {
    // set target java version
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {
    // implementation(fileTree("../../distr") {include("*.jar")})
    implementation(project(":p1"))
    // implementation("org.apache.commons:commons-lang3:3.9")
}

application {
    // Define the main class for the application.
    mainClass.set("com.p2.P2")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
        resources {
            setSrcDirs(listOf("src/resources"))
        }
    }
}