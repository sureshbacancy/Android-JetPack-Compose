package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GradientButtons(onClick: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = onClick, modifier = Modifier
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color(0xFF6A0572), Color(0xFFC54B68))
                    ), RoundedCornerShape(12.dp)
                )
                .width(170.dp)
                .height(60.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(text = "Android", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = onClick, modifier = Modifier
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.Green, Color.Red)
                    ), RoundedCornerShape(12.dp)
                )
                .width(170.dp)
                .height(60.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(text = "iOS", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = onClick, modifier = Modifier
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.Black, Color.Blue)
                    ), RoundedCornerShape(12.dp)
                )
                .width(170.dp)
                .height(60.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(text = "PHP", fontSize = 18.sp, color = Color.White)
        }


        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = onClick, modifier = Modifier
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color.Yellow, Color.Cyan)
                    ), RoundedCornerShape(12.dp)
                )
                .width(170.dp)
                .height(60.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(text = "JAVA", fontSize = 18.sp, color = Color.White)
        }
    }
}