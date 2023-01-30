import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.provider

val splashModule = DI.Module(ModulesNames.SPLASH.name) {
    bind<SplashViewModel>() with provider {
        SplashViewModel()
    }
}