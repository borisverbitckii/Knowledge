interface IAnswersDataSource {
}

final class AnswersDataSource: IAnswersDataSource {
    suspend fun checkAnswer(pair: HashMap<IQuestion, IAnswer>): Boolean {
        TODO("Not yet implemented")
    }
}
