rootProject.name = "Knowledge"
enableFeaturePreview("VERSION_CATALOGS")

includeBuild("buildLogic")

include(
    ":androidApp",
    ":shared:infrastructure:services:network",
    ":shared:infrastructure:services:storage",
    ":shared:infrastructure:dependencies:core",
    ":shared:infrastructure:dependencies:ui",
    ":shared:infrastructure:dependencies:viewModels",
    ":shared:infrastructure:constants",
    ":shared:infrastructure:DI",

//    ":shared:domain:dataSources",
//    ":shared:domain:repositories",
//    ":shared:domain:DTOs",
//    ":shared:domain:useCases",

    ":shared:features:quiz",

    ":shared:presentation:modules:splash:view",
    ":shared:presentation:modules:splash:viewModel",
    ":shared:presentation:modules:quiz:questions:viewModel",
    ":shared:presentation:modules:quiz:questions:view",
    ":shared:presentation:modules:quiz:results",

    ":shared:presentation:navigation",
    ":shared:presentation:theme",
    ":shared:presentation:views",

    ":shared:assembler"
)
