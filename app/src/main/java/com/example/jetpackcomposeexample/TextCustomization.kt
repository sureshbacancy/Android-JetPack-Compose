package com.example.jetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowCustomTexts(){
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.White)
            ,
            horizontalAlignment = Alignment.Start,

            ) {
            Text(
                text = "Android",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Red)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 30.sp,
                color = Color.White,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Black)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 30.sp,
                color = Color.Yellow,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Gray)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 25.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Green)
                    .padding(20.dp),
            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.White)
            ,
            horizontalAlignment = Alignment.Start,

            ) {
            Text(
                text = "Android",
                fontSize = 30.sp,
                letterSpacing = 1.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Red)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 30.sp,
                color = Color.White,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Black)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 30.sp,
                color = Color.Yellow,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Gray)
                    .padding(20.dp),
            )

            Text(
                text = "Android",
                fontSize = 25.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.Green)
                    .padding(20.dp),
            )
        }
    }
}