interface IQuestion {
    val questionID: String
    val questionText: String
}

data class DefaultQuestion(
    override val questionID: String,
    override val questionText: String,
) : IQuestion
