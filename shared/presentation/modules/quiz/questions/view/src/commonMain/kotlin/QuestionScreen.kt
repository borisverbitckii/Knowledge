import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adeo.kviewmodel.compose.observeAsState
import com.adeo.kviewmodel.odyssey.StoredViewModel
import models.QuizEvent

@Composable
fun QuestionScreen() {
    StoredViewModel(factory = { Injector.instance<QuizViewModel>() }) { viewModel ->
        val viewState = viewModel.viewStates().observeAsState()
        val viewActions = viewModel.viewActions().observeAsState()

        Surface(
            Modifier
                .height(200.dp)
                .width(400.dp), color = MaterialTheme.colors.background) {
            Button({viewModel.obtainEvent(QuizEvent.NextQuestion)}) {
                Text("Button text")
            }
        }
    }
}