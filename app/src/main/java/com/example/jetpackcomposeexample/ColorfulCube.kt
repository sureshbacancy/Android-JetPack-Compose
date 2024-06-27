package com.example.jetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

// Created by Suresh Prajapati - 13-02-2024

@Composable
fun ShowColorfulClickableCube() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        ColorBox()
        Text(text = "Click on the box to change its color", Modifier.padding(top = 20.dp))
    }
}

@Composable
fun ColorBox() {

    val color = remember {
        mutableStateOf(Color.Red)
    }

    Box(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f
            )
        })
}