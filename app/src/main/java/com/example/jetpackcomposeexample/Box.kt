package com.example.jetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Created by suresh prajapati - 27-06-2024

@Composable
fun ShowBoxCustomization() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red), contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
                .background(Color.White)
                .horizontalScroll(rememberScrollState()), contentAlignment = Alignment.Center
        ) {

            Text(text = "Android, Kotlin, Java, PHP, Python", fontSize = 50.sp, maxLines = 1)
        }
    }
}