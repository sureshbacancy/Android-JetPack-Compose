package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.R

// Created by Suresh Prajapati - 13-02-2024

@Composable
fun ShowRoundedImageWithText() {
    val painter = painterResource(id = R.drawable.bg_image)
    val description = "Card Image demo"
    val title = "Card Image Demo"
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        ImageCard(painter = painter, title = title, contentDescription = description)
    }
}


@Composable
fun ImageCard(
    painter: Painter, title: String, contentDescription: String, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )

    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, Color.Black
                            ), startY = 300f
                        )
                    )
            ) {}

            Box(
                modifier = modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = title, style = TextStyle(color = Color.White, fontSize = 16.sp)
                )
            }
        }
    }
}