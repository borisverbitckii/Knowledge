plugins {
    id("android-setup")
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                // Infrastructure
                implementation(project(":shared:infrastructure:dependencies:viewModels"))

                implementation(project(":shared:features:quiz"))
            }
        }
    }
}