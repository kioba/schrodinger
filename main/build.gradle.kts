import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
    }
}

plugins {
    kotlin("jvm") version "1.3.41"
    id("org.jetbrains.dokka") version "0.9.18"
}
group = "dev.kioba.schrodinger"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.1")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

// config JVM target to 1.8 for kotlin compilation tasks
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}

val dokka by tasks.getting(DokkaTask::class) {
    outputDirectory = "${rootProject.projectDir}/docs"
    // outputFormat = "gfm"
    outputFormat = "jekyll"
    jdkVersion = 8
    reportUndocumented = true
    includeNonPublic = true
    skipDeprecated = false
    // Emit warnings about not documented members. Applies globally, also can be overridden by packageOptions
    reportUndocumented = true
    skipEmptyPackages = false // Do not create index pages for empty packages

    impliedPlatforms = mutableListOf("JVM")
}

defaultTasks(dokka)