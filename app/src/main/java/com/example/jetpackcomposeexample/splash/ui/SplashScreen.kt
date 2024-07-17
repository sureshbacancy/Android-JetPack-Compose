package com.example.jetpackcomposeexample.splash.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.R
import com.example.jetpackcomposeexample.base.BaseActivity
import com.example.jetpackcomposeexample.extension.openScreen
import com.example.jetpackcomposeexample.home.ui.HomeScreen
import com.example.jetpackcomposeexample.login.ui.LoginScreen
import com.example.jetpackcomposeexample.splash.viewmodel.SplashViewModel

class SplashActivity : BaseActivity() {

    private val splashViewModel: SplashViewModel by viewModels {
        SplashViewModel.SplashViewModelFactory(
            this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenContent()
            splashViewModel.fetchLoginData { status ->
                when (status) {
                    SplashViewModel.RedirectionStatus.Login -> {
                        openScreen(LoginScreen::class.java)
                        finish()
                    }

                    SplashViewModel.RedirectionStatus.Home -> {
                        openScreen(HomeScreen::class.java)
                        finish()
                    }
                }
            }
        }
    }
}

@Composable
fun SplashScreenContent() {
    val fontFamily = FontFamily(
        Font(R.font.protest_revolution_regular, FontWeight.Thin),
        Font(R.font.titillium_web_black, FontWeight.Thin),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp),
        contentAlignment = Alignment.Center

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black, fontSize = 60.sp
                        )
                    ) {
                        append("A")
                    }
                    append("ndroid   ")

                    withStyle(
                        style = SpanStyle(
                            color = Color.Black, fontSize = 60.sp
                        )
                    ) {
                        append("J")
                    }
                    append("etpack")
                },
                color = Color.Black,
                fontSize = 28.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

            Text(text = "By Suresh Prajapati", textAlign = TextAlign.Right)
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreviewSplash() {
    SplashScreenContent()
}