package com.codelamps.loginregistrationjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelamps.loginregistrationjetpackcompose.R
import com.codelamps.loginregistrationjetpackcompose.comoponents.ButtonComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.ClickableForgotPasswordLoginComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.ClickableLoginTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.ClickableRegisterTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.DividerTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.HeadingTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.MyPasswordFieldComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.MyTextFieldComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.NormalTextComponent
import com.codelamps.loginregistrationjetpackcompose.navigation.PostOfficeAppRouter
import com.codelamps.loginregistrationjetpackcompose.navigation.Screen

@Composable
fun LoginScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

        NormalTextComponent(value = stringResource(id = R.string.heythere))
            HeadingTextComponent(value = stringResource(R.string.welcome_back))

            Spacer(modifier = Modifier.height(15.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email), painter = painterResource(
                    id = R.drawable.mail
                )
            )

            MyPasswordFieldComponent(
                labelValue = stringResource(id = R.string.password), painter = painterResource(
                    id = R.drawable.padlock
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            ClickableForgotPasswordLoginComponent(onTextSelected = {})

            Spacer(modifier = Modifier.height(170.dp))

            ButtonComponent(value = stringResource(R.string.login))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingLogin = false, onTextSelected = {PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)})
        }

    }
}


@Composable
@Preview
fun LoginScreenPreview(){
    LoginScreen()
}
