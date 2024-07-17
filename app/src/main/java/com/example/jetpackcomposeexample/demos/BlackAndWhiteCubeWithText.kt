package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Created by Suresh Prajapati - 26-06-2024

@Composable
fun BlackAndWhiteCubeWithText() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .border(5.dp, Color.Red)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "A")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "B")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "C")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "D")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "E")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "F")
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "G")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "H")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "I")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "J")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "K")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "L")
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "M")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "N")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "O")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "P")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "Q")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "R")
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "S")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "T")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "U")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "V")
            SurfaceItem(backgroundColor = Color.Black, textColor = Color.White, text = "W")
            SurfaceItem(backgroundColor = Color.White, textColor = Color.Black, text = "X")
        }
    }
}


@Composable
fun ColumnScope.SurfaceItem(backgroundColor: Color, textColor: Color, text: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = backgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text, color = textColor, style = TextStyle(
                    color = Color.Black, fontSize = 50.sp
                ), textAlign = TextAlign.Center
            )
        }
    }
}