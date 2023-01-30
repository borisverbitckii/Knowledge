import com.adeo.kviewmodel.BaseSharedViewModel
import models.SplashAction
import models.SplashEvent
import models.SplashState

class SplashViewModel: BaseSharedViewModel<SplashState, SplashAction, SplashEvent>(initialState = SplashState()) {
    override fun obtainEvent(viewEvent: SplashEvent) {
    }
}
