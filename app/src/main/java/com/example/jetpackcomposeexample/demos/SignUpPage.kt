package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

// Created by Suresh Prajapati - 14-02-2024

@Composable
fun ShowSignUpPage() {
    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

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
                text = "REGISTRATION",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            TextField(value = name,
                onValueChange = {
                    name = it
                },
                label = {
                    Text(text = "Enter Name")
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, end = 20.dp, start = 20.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                )
            )

            TextField(value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text(text = "Enter email")
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email, imeAction = ImeAction.Next
                )
            )

            TextField(value = phone,
                onValueChange = {
                    phone = it
                },
                label = {
                    Text(text = "Enter phone")
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone, imeAction = ImeAction.Next
                )
            )

            TextField(value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    Text(text = "Enter password")
                },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password, imeAction = ImeAction.Done
                )
            )

            Spacer(modifier = Modifier.height(25.dp))

            Button(onClick = {

                if (name.isEmpty()) {
                    scope.launch {
                        snackBarHostState.showSnackbar("Please enter name")
                    }
                } else if (email.isEmpty()) {
                    scope.launch {
                        snackBarHostState.showSnackbar("Please enter email")
                    }
                } else if (phone.isEmpty()) {
                    scope.launch {
                        snackBarHostState.showSnackbar("Please enter phone")
                    }
                } else if (password.isEmpty()) {
                    scope.launch {
                        snackBarHostState.showSnackbar("Please enter password")
                    }
                } else {
                    scope.launch {
                        snackBarHostState.showSnackbar("Registration successfully")
                    }
                }

            }) {
                Text(text = "Submit")
            }
        }
    }
}