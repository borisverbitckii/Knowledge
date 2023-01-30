import androidx.compose.runtime.Composable
import com.adeo.kviewmodel.odyssey.StoredViewModel
import ru.alexgladkov.odyssey.compose.extensions.present
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun SplashScreen() {
    StoredViewModel(factory = { Injector.instance<SplashViewModel>() } ) { viewModel ->
        val rootController = LocalRootController.current
        rootController.present(NavigationTree.QuestionFlow.name)
    }
}