plugins {
    id("org.jetbrains.kotlin.js") version "1.3.61"
}

group = "com.vinayak.kotlin.kotlinjs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("http://nexus.astraeus.nl/nexus/content/groups/public")
    }
}
/*
dependencies {
    implementation(kotlin("stdlib-js"))
}*/

kotlin {
    target {
        browser {
        }
    }
    dependencies {
        implementation(kotlin("stdlib-js"))

        implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.1")
        implementation("nl.astraeus:komp-js:0.1.17-SNAPSHOT")
    }
}