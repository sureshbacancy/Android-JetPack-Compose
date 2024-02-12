package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Demo 1 : 12-02-2024

       /*    Column(
               modifier = Modifier
                   .fillMaxSize()         // Full height / width
                  // .fillMaxSize(0.5f)     // Specific height / width
                  // .height(200.dp)        // Specific height
                  // .width(200.dp)         // Specific width
                   .background(Color.Green),// Background Color
               horizontalAlignment = Alignment.CenterHorizontally, // Horizontal Alignment
               //Alignment.End, Alignment.Start, Alignment.CenterHorizontally
               verticalArrangement = Arrangement.SpaceEvenly // Vertical Arrangement
                // Arrangement.Top, Arrangement.Bottom, Arrangement.Center,
                // Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
           ) {

               Text(text = "Hello")
               Text(text = "Android", color = Color.Red)
               Text(text = "Kotlin")
           }*/

            // Demo 2 : 12-02-2024

           /* Row(
                modifier = Modifier
                    .fillMaxSize()         // Full height / width
                    // .fillMaxSize(0.5f)     // Specific height / width
                    // .height(200.dp)        // Specific height
                    // .width(200.dp)         // Specific width
                    .background(Color.Red),// Background Color

                horizontalArrangement = Arrangement.SpaceAround,
                //Arrangement.Top, Arrangement.Bottom, Arrangement.Center, Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
                verticalAlignment = Alignment.CenterVertically
                //Alignment.End, Alignment.Start, Alignment.CenterHorizontally

            ) {

                Text(text = "JAVA")
                Text(text = "PHP", color = Color.Blue)
                Text(text = "Python")
            }*/
        }
    }

}