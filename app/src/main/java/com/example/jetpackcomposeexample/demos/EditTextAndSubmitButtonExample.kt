package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

//Created by Suresh Prajapati - 13-02-2024

@Composable
fun ShowEditTextAndSubmitButtonView() {
    val snackBarHostState = remember { SnackbarHostState() }
    var textFieldState by remember {
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()

    Scaffold(modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) }

    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(it)
                .background(Color.White)
                .verticalScroll(state = ScrollState(1))
                .fillMaxSize(),
        ) {

            TextField(value = textFieldState,
                onValueChange = {
                    textFieldState = it
                },
                label = {
                    Text(text = "Enter Your Name")
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )

            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {

                if (textFieldState.isEmpty()) {
                    scope.launch {
                        snackBarHostState.showSnackbar("Please enter name")
                    }
                } else {
                    scope.launch {
                        snackBarHostState.showSnackbar(textFieldState)
                    }
                }


            }) {
                Text(text = "Submit")
            }
        }
    }
}