package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeexample.R

// Created by suresh prajapati - 05-07-2024
// Text Filed for Password.

@Composable
fun PasswordTextField() {

    var password by remember {
        mutableStateOf("")
    }

    var passwordVisibility by remember {
        mutableStateOf(false)
    }

    val icon = if (passwordVisibility) painterResource(id = R.drawable.eye_opened)
    else painterResource(id = R.drawable.eye_closed)



    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            placeholder = {
                Text(text = "Password")
            },
            label = {
                Text(text = "Password")
            },
            trailingIcon = {
                IconButton(modifier = Modifier.padding(5.dp), onClick = {
                    passwordVisibility = passwordVisibility.not()
                }) {
                    Icon(
                        modifier = Modifier.padding(8.dp), painter = icon, contentDescription = ""
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
    }
}