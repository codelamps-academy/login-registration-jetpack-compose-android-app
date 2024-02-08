package com.codelamps.loginregistrationjetpackcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.codelamps.loginregistrationjetpackcompose.navigation.PostOfficeAppRouter
import com.codelamps.loginregistrationjetpackcompose.navigation.Screen
import com.codelamps.loginregistrationjetpackcompose.screen.SignUpScreen
import com.codelamps.loginregistrationjetpackcompose.screen.TermsAndConditionScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditonScreen -> {
                    TermsAndConditionScreen()
                }
            }
        }
    }
}
