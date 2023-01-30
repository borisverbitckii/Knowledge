object iOSInjector {
    fun assemble() {
        val modules = listOf(questionsModule, splashModule)
        Injector.setup(modules)
    }

    fun getSplashViewModel(): SplashViewModel = Injector.instance()
    fun getQuizViewModel(): QuizViewModel = Injector.instance()
}
