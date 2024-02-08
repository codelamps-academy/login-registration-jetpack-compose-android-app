package com.codelamps.loginregistrationjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelamps.loginregistrationjetpackcompose.R
import com.codelamps.loginregistrationjetpackcompose.comoponents.HeadingTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.NormalTextComponent
import com.codelamps.loginregistrationjetpackcompose.navigation.PostOfficeAppRouter
import com.codelamps.loginregistrationjetpackcompose.navigation.Screen
import com.codelamps.loginregistrationjetpackcompose.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp)
            .size(10.dp)
    ) {
        HeadingTextComponent(
            value = stringResource(R.string.terms_and_conditions_heading)
        )

//        Spacer(modifier = Modifier.height(50.dp))
//
//        NormalTextComponent(value = stringResource(id = R.string.terms_and_conditions))
        SystemBackButtonHandler {
            PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
        }
    }
}

@Preview
@Composable
fun TermsAndConditionScreenPreview() {
    TermsAndConditionScreen()
}
