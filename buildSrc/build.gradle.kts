plugins {
    `kotlin-dsl`
}
repositories {
//    maven{url = uri("https://xxxxxxxxx")}
    mavenCentral()
    google()
    gradlePluginPortal()
}

kotlin {
    version = 1.8
}



tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
//        useIR = true
    }
}

tasks.compileTestKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
//        useIR = true
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

