import org.kodein.di.*

object Injector {

    private var _di: DirectDI? = null

    val di: DirectDI
        get() = requireNotNull(_di)

    fun setup(modules: List<DI.Module>) {
        if (_di != null) return
        _di = DI {
            importAll(
                modules
            )
        }.direct
    }

    inline fun <reified T> instance(): T {
        return di.instance()
    }

    inline fun <reified A : Any, reified T: Any> factory(arg: A): T {
        return di.factory<A,T>()(arg)
    }
}

