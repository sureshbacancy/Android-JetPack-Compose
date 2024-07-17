package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.R

// Created by Suresh Prajapati - 13-02-2024

@Composable
fun ShowDecoratedText() {
    val fontFamily = FontFamily(
        Font(R.font.protest_revolution_regular, FontWeight.Thin),
        Font(R.font.titillium_web_black, FontWeight.Thin),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(15.dp),
        contentAlignment = Alignment.Center


    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black, fontSize = 60.sp
                    )
                ) {
                    append("A")
                }
                append("ndroid   ")

                withStyle(
                    style = SpanStyle(
                        color = Color.Black, fontSize = 60.sp
                    )
                ) {
                    append("J")
                }
                append("etpack")
            },
            color = Color.Black,
            fontSize = 28.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedText() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            // .fillMaxWidth() // something like Match_Parent
            // .fillMaxHeight()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello Android",
            color = Color.Black,
            fontSize = 40.sp,
            modifier = Modifier
                .border(
                    width = 5.dp, color = Color.Black, shape = RoundedCornerShape(90.dp)
                )
                .padding(20.dp)

        )
    }
}

@Composable
fun TextWithBackGround() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            // .fillMaxWidth() // something like Match_Parent
            // .fillMaxHeight()
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello Dell",
            color = Color.White,
            fontSize = 50.sp,
            modifier = Modifier
                .background(Color.Black)
                .padding(20.dp)

        )
    }
}

// Created by Suresh Prajapati - 12-02-2024

@Composable
fun ShowNormalHorizontalText() {
    Row(
        modifier = Modifier
            .fillMaxSize()         // Full height / width
            // .fillMaxSize(0.5f)     // Specific height / width
            // .height(200.dp)        // Specific height
            // .width(200.dp)         // Specific width
            .background(Color.White),// Background Color

        horizontalArrangement = Arrangement.SpaceEvenly,
        //Arrangement.Top, Arrangement.Bottom, Arrangement.Center, Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
        verticalAlignment = Alignment.CenterVertically
        //Alignment.End, Alignment.Start, Alignment.CenterHorizontally

    ) {

        Text(text = "JAVA")
        Text(text = "PHP")
        Text(text = "Python")
    }
}

// Created by Suresh Prajapati - 12-02-2024

@Composable
fun ShowVerticalNormalText() {
    Column(
        modifier = Modifier
            .fillMaxSize()         // Full height / width
            // .fillMaxSize(0.5f)     // Specific height / width
            // .height(200.dp)        // Specific height
            // .width(200.dp)         // Specific width
            .background(Color.White),// Background Color
        horizontalAlignment = Alignment.CenterHorizontally, // Horizontal Alignment
        //Alignment.End, Alignment.Start, Alignment.CenterHorizontally
        verticalArrangement = Arrangement.SpaceEvenly // Vertical Arrangement
        // Arrangement.Top, Arrangement.Bottom, Arrangement.Center,
        // Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
    ) {

        Text(text = "Hello")
        Text(text = "Android", color = Color.Black)
        Text(text = "Kotlin")
    }
}