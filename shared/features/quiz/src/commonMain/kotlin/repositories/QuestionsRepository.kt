interface IQuestionsRepository {
    fun getQuestionsCount(): Int
    fun getQuestion(): IQuestion
}

final class QuestionsRepository(private val dataSource: IQuestionsDataSource): IQuestionsRepository {

    // Override methods
    override fun getQuestionsCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getQuestion(): IQuestion {
        TODO("Not yet implemented")
    }
}