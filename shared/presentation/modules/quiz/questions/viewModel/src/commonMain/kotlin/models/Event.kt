package models

sealed class QuizEvent {
    object NextQuestion: QuizEvent()
}
