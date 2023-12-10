/**
 * Three things to consider in build.gradle files:
 *   1. setup plugins
 *   2. config plugin extension
 *   3. specify dependencies
 *      dependencies can be external, sub-projects, or binary repos
 */

// Define plugins
plugins {
    // Plugins include Core-Plugins, Community Plugins with own version, Local defined convention plugins
    id("p-java-library") // local convention plugin
}

group = "org.example" // A company name, for example, `org.jetbrains`
version = "1.0-SNAPSHOT" // Version to assign to the built artifact


dependencies {
    implementation(fileTree("../../distr") {include("*.jar")})
    // implementation(project(":some-sub-project-or-modules"))
    // implementation("org.apache.commons:commons-lang3:3.9")
}

//tasks.test {
//    useJUnitPlatform() // JUnitPlatform for tests.
//}