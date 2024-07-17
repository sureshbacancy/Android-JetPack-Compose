package com.example.jetpackcomposeexample.demos

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExample(context: Context) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        // Max 10 characters allow to enter
        var text0 by remember { mutableStateOf("") }
        val max = 11
        TextField(
            modifier = Modifier.padding(5.dp),
            value = text0,
            onValueChange = { newText ->
                if(text0.length <= max){
                    text0 = newText
                } else {
                    text0 = text0.dropLast(1)
                    Toast.makeText(context, "Max 10 characters limit", Toast.LENGTH_SHORT).show()
                }
            },
            placeholder = {
                Text(text = "Max characters Example")
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),

        )

        var text1 by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.padding(5.dp),
            value = text1,
            onValueChange = { newText ->
                text1 = newText
            },
            placeholder = {
                Text(text = "Normal EditText Example")
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )

        TextField(
            modifier = Modifier.padding(5.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "This is disabled example")
            },
            enabled = false,

            )

        TextField(
            modifier = Modifier.padding(5.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "This is read only Example")
            },
            readOnly = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )

        var text2 by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.padding(5.dp),
            value = text2,
            onValueChange = { newText ->
                text2 = newText
            },
            label = {
                Text(text = "This is example of Lable")
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )

        var text3 by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.padding(5.dp),
            value = text3,
            onValueChange = { newText ->
                text3 = newText
            },
            placeholder = {
                Text(text = "This is leading icon example")
            },
            leadingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "Icon pressed", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
        )

        var text4 by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.padding(5.dp),
            value = text4,
            onValueChange = { newText ->
                text4 = newText
            },
            placeholder = {
                Text(text = "This is trailing icon example")
            },
            trailingIcon = {
                IconButton(onClick = {
                    Toast.makeText(context, "Icon pressed", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                }
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
        )

        var text5 by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .padding(top = 5.dp),
            placeholder = {
                Text(text = "This is OutlinedTextField Example")
            },
            value = text5,
            onValueChange = {
                text5 = it
            }
        )

        var text6 by remember { mutableStateOf("This is BasicTextField") }
        BasicTextField(
            modifier = Modifier.padding(top = 10.dp),
            value = text6,
            onValueChange = {
                text6 = it
            }
        )
    }
}