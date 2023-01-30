import org.kodein.di.*

val questionsModule = DI.Module(ModulesNames.QUESTION.name) {

    bind<IQuestionsDataSource>() with provider {
        QuestionsDataSource()
    }

    bind<IQuestionsRepository>() with provider {
        QuestionsRepository(instance())
    }

    bind<IAnswersDataSource>() with provider {
        AnswersDataSource()
    }

    bind<IAnswersRepository>() with provider {
        AnswersRepository(instance())
    }

    bind<IQuiz>() with provider {
        Quiz(instance(), instance())
    }

    bind<QuizViewModel>() with provider {
        QuizViewModel(instance())
    }
}