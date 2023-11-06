plugins {
    `kotlin-dsl`
}

repositories {
//    maven{url = uri("https://xxxxxxxxx")}

    mavenCentral()
    google()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    version = "1.8"
}