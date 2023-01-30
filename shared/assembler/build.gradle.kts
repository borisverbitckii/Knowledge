plugins {
    id("com.android.library")
    id("multiplatform-setup")
    kotlin("native.cocoapods")
}

kotlin {
    sourceSets {
        androidMain {
            dependencies {
                api(project(":shared:presentation:navigation"))
                api(libs.activity.compose)
                api(libs.androidCompose.foundation)
            }
        }

        commonMain {
            dependencies {
                // Infrastructure
                implementation(project(":shared:infrastructure:DI"))
                api(project(":shared:infrastructure:constants"))

                // Features
                implementation(project(":shared:features:quiz"))

                // Presentation
                implementation(project(":shared:presentation:modules:quiz:questions:viewModel"))
                implementation(project(":shared:presentation:modules:splash:viewModel"))
            }
        }

        iosMain {
            dependencies {
                // Infrastructure
                api(project(":shared:infrastructure:DI"))
                api(project(":shared:infrastructure:constants"))

                // Features
                api(project(":shared:features:quiz"))

                // Presentation
                api(project(":shared:presentation:modules:quiz:questions:viewModel"))
                api(project(":shared:presentation:modules:splash:viewModel"))
            }
        }

        cocoapods {
            name = "KnowledgeCommon"
            summary = "Mobile lms"
            homepage = "github.com"
            version = "1.0"
            ios.deploymentTarget = "14.0"
            podfile = rootProject.file("../Knowledge/iosApp/Podfile")
            framework {
                baseName = "KnowledgeCommon"
                export(project(":shared:infrastructure:DI"))
                export(project(":shared:infrastructure:constants"))
                export(project(":shared:features:quiz"))
                export(project(":shared:presentation:modules:quiz:questions:viewModel"))
                export(project(":shared:presentation:modules:splash:viewModel"))
            }
        }
    }
}

android {
    compileSdkVersion = "android-31"
}