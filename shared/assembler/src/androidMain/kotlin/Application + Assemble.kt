import android.app.Application
import android.content.Context
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

fun Application.assemble() {
    val platformModule = DI.Module(ModulesNames.PLATFORM.name) {
        bind<Context>() with singleton { applicationContext }
    }

    val modules = listOf(platformModule, splashModule, questionsModule)
    Injector.setup(modules)
}