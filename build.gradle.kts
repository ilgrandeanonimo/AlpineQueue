import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version("8.1.1")
}

group = "io.github.ilgrandeanonimo.alpinequeue"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") // PaperMC for VelocityAPI
    maven("https://jitpack.io") // JitPack for ConfigLib
    maven("https://repo.minebench.de/") // Minebench for MineDown
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    implementation("com.github.Exlll.ConfigLib:configlib-yaml:v4.4.0")
    compileOnly("de.themoep:minedown-adventure:1.7.1-SNAPSHOT")
}

tasks.withType<ShadowJar> {
    relocate("de.themoep.minedown","io.github.ilgrandeanonimo.libs.minedown")
}