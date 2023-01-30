import com.adeo.kviewmodel.BaseSharedViewModel
import models.QuizAction
import models.QuizEvent
import models.QuizState

final class QuizViewModel(private val quiz: IQuiz):
    BaseSharedViewModel<QuizState, QuizAction, QuizEvent>(initialState = QuizState(0,"What are you doing?")) {

    // Private properties
    private val quizCompletion: (IQuizResult) -> Unit = { result ->
        showResults(result)
    }

    init {
        quiz.setupDependencies(10, quizCompletion)
    }

    // Override methods
    override fun obtainEvent(viewEvent: QuizEvent) {
        when (viewEvent) {
            QuizEvent.NextQuestion -> showNextQuestion()
        }
    }

    // Private methods
    private fun showNextQuestion() {
        println("Моя запись")
    }

    private fun showResults(with: IQuizResult) {
    }
}