package com.example.jetpackcomposeexample

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

//Custom Google button with text and progress loader
//Created by suresh prajapati - 04-07-2024

@Composable
fun CustomGoogleButton(){

    var clicked by remember {
        mutableStateOf(false)
    }

    var textValue by remember {
        mutableStateOf("Sign Up with Google")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Surface(
            onClick = {
                clicked = clicked.not()
            },
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(width = 1.dp, Color.Gray),
            color = Color.White,
            modifier = Modifier.padding(50.dp),

            ) {

            Row(
                modifier = Modifier
                    .padding(
                        start = 12.dp,
                        end = 16.dp,
                        top = 12.dp,
                        bottom = 12.dp
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_google_logo),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
                Text(
                    text = textValue,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                    fontWeight = FontWeight.Bold
                )

                if (clicked){
                    textValue = "Please wait..."
                    CircularProgressIndicator(
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp),

                        strokeWidth = 2.dp,
                        color = Color.Black
                    )

                } else {
                    textValue = "Sign Up with Google"
                }
            }
        }
    }
}