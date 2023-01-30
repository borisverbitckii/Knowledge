plugins {
    id("android-setup")
    id("multiplatform-compose-setup")
}

kotlin {
    android()

    sourceSets {
        commonMain {
            dependencies {
                api(project(":shared:infrastructure:dependencies:ui"))
                api(project(":shared:infrastructure:DI"))
                api(project(":shared:presentation:theme"))
                implementation(project(":shared:presentation:modules:quiz:questions:viewModel"))
            }
        }
    }
}