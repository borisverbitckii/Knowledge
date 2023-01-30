plugins {
    id("android-setup")
    id("multiplatform-compose-setup")
}

kotlin {
    android()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":shared:infrastructure:constants"))
                api(project(":shared:presentation:modules:splash:view"))
                api(project(":shared:presentation:modules:quiz:questions:view"))
            }
        }
    }
}