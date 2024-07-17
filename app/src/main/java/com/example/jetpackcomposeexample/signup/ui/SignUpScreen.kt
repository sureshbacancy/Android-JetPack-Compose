package com.example.jetpackcomposeexample.signup.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.R
import com.example.jetpackcomposeexample.base.BaseActivity
import com.example.jetpackcomposeexample.extension.openScreen
import com.example.jetpackcomposeexample.home.ui.HomeScreen
import com.example.jetpackcomposeexample.signup.viewmodel.SignUpViewModel
import com.example.jetpackcomposeexample.theme.JetPackComposeExampleTheme
import com.example.jetpackcomposeexample.theme.fontFamily
import kotlinx.coroutines.launch

class SignUpScreen : BaseActivity() {

    private val signUpViewModel: SignUpViewModel by viewModels {
        SignUpViewModel.SignUpViewModelFactory(
            firebaseAuth, firebaseUser, this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExampleTheme {
                val snackBarHostState = remember { SnackbarHostState() }
                val scope = rememberCoroutineScope()

                var name by remember {
                    mutableStateOf("")
                }

                var email by remember {
                    mutableStateOf("")
                }

                var mobile by remember {
                    mutableStateOf("")
                }

                var password by remember {
                    mutableStateOf("")
                }

                var passwordVisibility by remember {
                    mutableStateOf(false)
                }

                var signUpButtonText by remember {
                    mutableStateOf("Sign Up")
                }

                var isShowLoader by remember { mutableStateOf(false) }
                val icon = if (passwordVisibility) painterResource(id = R.drawable.eye_opened)
                else painterResource(id = R.drawable.eye_closed)

                Scaffold(snackbarHost = { SnackbarHost(hostState = snackBarHostState) }) {
                    Column(
                        modifier = Modifier
                            .padding(it)
                            .background(Color.White)
                            .verticalScroll(state = ScrollState(1))
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = "Registration",
                            color = Color.Black,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 50.dp, bottom = 100.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontFamily,
                            letterSpacing = 1.sp
                        )

                        TextField(value = name,
                            onValueChange = {
                                name = it
                            },
                            label = {
                                Text(text = "Name")
                            },
                            leadingIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(
                                        imageVector = Icons.Default.Person, contentDescription = ""
                                    )
                                }
                            },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                            )
                        )

                        TextField(value = email,
                            onValueChange = {
                                email = it
                            },
                            label = {
                                Text(text = "Email")
                            },
                            leadingIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
                                }
                            },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Email, imeAction = ImeAction.Next
                            )
                        )

                        TextField(value = mobile,
                            onValueChange = {
                                mobile = it
                            },
                            label = {
                                Text(text = "Mobile")
                            },
                            leadingIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Default.Call, contentDescription = "")
                                }
                            },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Phone, imeAction = ImeAction.Next
                            ),
                        )

                        TextField(value = password,
                            onValueChange = {
                                password = it
                            },
                            label = {
                                Text(text = "Password")
                            },
                            leadingIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Default.Lock, contentDescription = "")
                                }
                            },
                            trailingIcon = {
                                IconButton(modifier = Modifier.padding(5.dp), onClick = {
                                    passwordVisibility = passwordVisibility.not()
                                }) {
                                    Icon(
                                        modifier = Modifier.padding(8.dp),
                                        painter = icon,
                                        contentDescription = ""
                                    )
                                }
                            },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password, imeAction = ImeAction.Done
                            ),
                            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation()
                        )

                        Spacer(modifier = Modifier.height(30.dp))

                        Button(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                            onClick = {
                                if (name.isEmpty()) {
                                    scope.launch {
                                        snackBarHostState.showSnackbar("Please enter name")
                                    }
                                } else if (email.isEmpty()) {
                                    scope.launch {
                                        snackBarHostState.showSnackbar("Please enter email")
                                    }
                                } else if (mobile.isEmpty()) {
                                    scope.launch {
                                        snackBarHostState.showSnackbar("Please enter mobile")
                                    }
                                } else if (password.isEmpty()) {
                                    scope.launch {
                                        snackBarHostState.showSnackbar("Please enter password")
                                    }
                                } else {

                                    signUpViewModel.createUser(
                                        name, email, mobile, password
                                    ) { result ->

                                        when (result) {
                                            is SignUpViewModel.CreateUserState.Loading -> {
                                                isShowLoader = result.isShowLoader
                                            }

                                            is SignUpViewModel.CreateUserState.Success -> {
                                                openScreen(HomeScreen::class.java, isFinish = true)
                                                finish()
                                            }

                                            is SignUpViewModel.CreateUserState.Error -> {
                                                scope.launch {
                                                    snackBarHostState.showSnackbar(result.errorMessage)
                                                }
                                            }

                                            is SignUpViewModel.CreateUserState.NetworkError -> {

                                            }
                                        }

                                    }
                                }

                            }) {

                            if (isShowLoader) {
                                signUpButtonText = ""
                                CircularProgressIndicator(
                                    modifier = Modifier
                                        .width(20.dp)
                                        .height(20.dp),

                                    strokeWidth = 2.dp, color = Color.White
                                )

                            } else {
                                signUpButtonText = "Sign Up"
                            }

                            Text(text = signUpButtonText)
                        }

                        Button(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                            onClick = {
                                onBackPressed()
                            }) {
                            Text(text = "Login")
                        }
                    }
                }
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreviewSplash() {
    SignupScreenContent()
}

@Composable
fun SignupScreenContent() {

}