plugins {
    kotlin("jvm") version "2.1.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation "org.jetbrains.kotlin:kotlin-stdlib"
}

tasks.test {
    useJUnitPlatform()
}