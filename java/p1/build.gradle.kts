/**
 * Three things to consider in build.gradle files:
 *   1. setup plugins
 *   2. config plugin extension
 *   3. specify dependencies
 *      dependencies can be external, sub-projects, or binary repos
 */

// Define plugins
plugins {
    id("java-library")
}

// Plugin extension
java {
    // set target java version
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {
    implementation(fileTree("../../distr") {include("*.jar")})
    // implementation(project(":some-sub-project-or-modules"))
    // implementation("org.apache.commons:commons-lang3:3.9")
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