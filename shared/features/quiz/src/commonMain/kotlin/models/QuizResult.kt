interface IQuizResult {
    val questionsCount: Int
    val rightAnswers: Int
    val mistakes: List<Pair<IQuestion, IAnswer>>
}

data class QuizResult(
    override val questionsCount: Int,
    override val rightAnswers: Int,
    override val mistakes: List<Pair<IQuestion, IAnswer>>
): IQuizResult
