interface IAnswer {
    val parentQuestionID: String
    val answerID: String
    val text: String
}

data class Answer(
    override val parentQuestionID: String,
    override val answerID: String,
    override val text: String
) : IAnswer
