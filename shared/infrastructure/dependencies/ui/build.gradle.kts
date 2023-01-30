plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.ui)

                api(libs.kViewModel.core)
                api(libs.kViewModel.compose)
                api(libs.kViewModel.odyssey)

                api(libs.odyssey.core)
                api(libs.odyssey.compose)

            }
        }
    }
}
