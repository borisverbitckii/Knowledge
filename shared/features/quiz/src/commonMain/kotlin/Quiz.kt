import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

interface IQuiz {
    fun setupDependencies(
        questionsCount: Int?,
        quizCompletion: ((IQuizResult) -> Unit)? ,
    )
    suspend fun getQuestionAndAnswers(): Pair<IQuestion, Set<IAnswer>>
    suspend fun setAnswerFor(defaultQuestion: IQuestion,
                             answer: IAnswer)
}

class Quiz(
    private var questionsRepository: IQuestionsRepository,
    private var answersRepository: IAnswersRepository
) : IQuiz {

    // Private properties
    private var questionsCount: Int? = null
    private var quizCompletion: ((IQuizResult) -> Unit)? = null
    private val givenAnswers = HashMap<IQuestion, IAnswer>()

    // Public methods
    override fun setupDependencies(
         questionsCount: Int?,
         quizCompletion: ((IQuizResult) -> Unit)?
    ) {
        this.questionsCount = questionsCount
        this.quizCompletion = quizCompletion
    }

    // Override methods
    override suspend fun getQuestionAndAnswers(): Pair<IQuestion, Set<IAnswer>> = coroutineScope {
        val question = questionsRepository.getQuestion()
        val answers = answersRepository.getAnswersFor(question)
        return@coroutineScope Pair(question, answers)
    }

    override suspend fun setAnswerFor(defaultQuestion: IQuestion,
                                      answer: IAnswer) {
        Mutex().withLock {
            givenAnswers[defaultQuestion] = answer
        }

        if (questionsCount == givenAnswers.count()) {
            val quizResult = checkAnswers()
            quizCompletion?.invoke(quizResult)
        }
    }

    // Private methods
    private suspend fun checkAnswers(): IQuizResult = coroutineScope {
        answersRepository.sendAnswers(givenAnswers)
    }

    suspend fun checkAnswers(defaultQuestion: IQuestion,
                             answer: IAnswer): IQuizResult = coroutineScope {
        answersRepository.sendAnswers(givenAnswers)
    }
}