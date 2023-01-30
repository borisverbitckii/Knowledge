import ru.alexgladkov.odyssey.compose.extensions.flow
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.generateGraph() {
    screen(name = NavigationTree.SplashScreen.name) {
        SplashScreen()
    }

    flow(NavigationTree.QuestionFlow.name) {
        screen(NavigationTree.QuestionFlow.Question.name) {
            QuestionScreen()
        }
    }
}