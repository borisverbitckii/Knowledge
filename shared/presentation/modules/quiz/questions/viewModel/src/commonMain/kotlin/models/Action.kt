package models

sealed class QuizAction {
    object ShowNextQuestion: QuizAction()
    object ShowResults: QuizAction()
}