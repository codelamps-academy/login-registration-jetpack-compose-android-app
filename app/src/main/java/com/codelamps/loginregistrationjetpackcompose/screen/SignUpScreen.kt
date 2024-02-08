package com.codelamps.loginregistrationjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelamps.loginregistrationjetpackcompose.R
import com.codelamps.loginregistrationjetpackcompose.app.PostOfficeApp
import com.codelamps.loginregistrationjetpackcompose.comoponents.ButtonComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.ClickableLoginTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.DividerTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.HeadingTextComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.MyCheckboxComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.MyPasswordFieldComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.MyTextFieldComponent
import com.codelamps.loginregistrationjetpackcompose.comoponents.NormalTextComponent
import com.codelamps.loginregistrationjetpackcompose.navigation.PostOfficeAppRouter
import com.codelamps.loginregistrationjetpackcompose.navigation.Screen

@Composable
fun SignUpScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(28.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                NormalTextComponent(value = stringResource(R.string.heythere))
                HeadingTextComponent(value = stringResource(R.string.create_an_account))

                Spacer(modifier = Modifier.height(20.dp))

                MyTextFieldComponent(
                    labelValue = stringResource(R.string.fullname),
                    painter = painterResource(id = R.drawable.profiles)
                )
                MyTextFieldComponent(
                    labelValue = stringResource(R.string.email),
                    painter = painterResource(id = R.drawable.mail)
                )
                MyPasswordFieldComponent(
                    labelValue = stringResource(R.string.password),
                    painter = painterResource(id = R.drawable.padlock)
                )

                MyCheckboxComponent(onTextSelected = { PostOfficeAppRouter })

                Spacer(modifier = Modifier.height(80.dp))

                ButtonComponent(value = stringResource(R.string.register))

                Spacer(modifier = Modifier
                    .height(10.dp))

                DividerTextComponent()

                ClickableLoginTextComponent(onTextSelected = {

                })

            }
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}
