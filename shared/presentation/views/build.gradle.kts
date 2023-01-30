plugins {
    id("android-setup")
    id("multiplatform-compose-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":shared:infrastructure:dependencies:ui"))
                implementation(project(":shared:presentation:theme"))
            }
        }
    }
}