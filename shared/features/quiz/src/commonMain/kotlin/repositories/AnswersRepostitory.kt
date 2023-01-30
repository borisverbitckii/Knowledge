interface IAnswersRepository {
    suspend fun sendAnswers(pairs: HashMap<IQuestion, IAnswer>): IQuizResult
    suspend fun getAnswersFor(question: IQuestion): Set<IAnswer>
}

final class AnswersRepository(private val dataSource: IAnswersDataSource): IAnswersRepository {
    // Override methods
    override suspend fun sendAnswers(pairs: HashMap<IQuestion, IAnswer>): IQuizResult {
        return QuizResult(
            10,
            8,
            listOf(
                Pair(
                    DefaultQuestion(
                        "1",
                        "How do you feel?"),
                    Answer(
                        "1",
                        "39",
                        "I am fine")
                )))
    }

    override suspend fun getAnswersFor(question: IQuestion): Set<IAnswer> {
        TODO("Not yet implemented")
    }
}