plugins {
    java
    // id("org.jetbrains.kotlin.jvm") //
    // kotlin("jvm")
}

// Plugin extension
java {
    // set target java version
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

//kotlin { // Extension for easy setup
//    jvmToolchain(11) // Target version of generated JVM bytecode.
//}

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
