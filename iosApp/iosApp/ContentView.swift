import SwiftUI
import KnowledgeCommon

func getName() -> String {
    iOSInjector.shared.assemble()
    let splashViewModel = iOSInjector.shared.getSplashViewModel()
    return splashViewModel.getName()
}

struct ContentView: View {

	var body: some View {
        Text(getName())
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
