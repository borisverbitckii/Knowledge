package com.example.knowledge.android

import AppTheme
import NavigationTree
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import ru.alexgladkov.odyssey.compose.base.Navigator
import ru.alexgladkov.odyssey.compose.local.LocalRootController
import ru.alexgladkov.odyssey.compose.navigation.modal_navigation.ModalNavigator
import ru.alexgladkov.odyssey.compose.navigation.modal_navigation.configuration.DefaultModalConfiguration
import ru.alexgladkov.odyssey.core.configuration.DisplayType
import setupNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootController = setupNavigation()

        setContent {
            AppTheme {
                val backgroundColor = Theme.colors.primaryBackground
                rootController.backgroundColor = backgroundColor

                CompositionLocalProvider(
                    LocalRootController provides rootController
                ) {
                    ModalNavigator(DefaultModalConfiguration( backgroundColor, DisplayType.FullScreen)) {
                        Navigator(startScreen = NavigationTree.SplashScreen.name)
                    }
                }
            }
        }
    }
}