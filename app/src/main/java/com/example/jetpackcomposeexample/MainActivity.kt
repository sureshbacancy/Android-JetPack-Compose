package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBar("Android")
        }
    }

    @Composable
    fun TopAppBar(name: String) {
        Text(text = "Hello $name")
    }

    @Preview(showBackground = true)
    @Composable
    fun defaultPreview(){
        TopAppBar("Android")
    }
}