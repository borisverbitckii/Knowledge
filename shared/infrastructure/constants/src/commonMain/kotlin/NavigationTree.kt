sealed class NavigationTree {
    object SplashScreen: NavigationTree()  {
        val name = "SplashScreen"
    }

    sealed class QuestionFlow {
        open val name = "QuestionFlow"

        object  Question: QuestionFlow() {
            override val name = "QuestionScreen"
        }
        object Results: QuestionFlow() {
            override val name = "ResultsScreen"
        }

        companion object {
            val name = "QuestionFlow"
        }
    }
}