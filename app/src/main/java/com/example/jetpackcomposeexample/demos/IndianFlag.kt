package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ViewBorder() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier.border(width = 1.dp, Color.Black, shape = RoundedCornerShape(1.dp)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .height(60.dp)
                    .width(320.dp)
                    //.border(width = 2.dp, Color.Black, shape = RoundedCornerShape(0.dp))
                    .background(Color(0xFFFF5722), shape = RoundedCornerShape(0.dp)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

            }

            Column(
                modifier = Modifier
                    .height(60.dp)
                    .width(320.dp)
                    //.border(width = 2.dp, Color.Black, shape = RoundedCornerShape(90.dp))
                    .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(0.dp)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .border(width = 5.dp, Color.Blue, shape = RoundedCornerShape(90.dp))
                        .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(0.dp)),
                    contentAlignment = Alignment.Center
                ) {

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .rotate(90f)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .rotate(60f)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .rotate(120f)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .rotate(150f)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }

                    Box(
                        modifier = Modifier
                            .height(58.dp)
                            .width(2.dp)
                            .rotate(210f)
                            .background(Color.Blue, shape = RoundedCornerShape(0.dp)),
                        contentAlignment = Alignment.Center
                    ) {

                    }
                }
            }

            Column(
                modifier = Modifier
                    .height(60.dp)
                    .width(320.dp)
                    //.border(width = 2.dp, Color.Black, shape = RoundedCornerShape(0.dp))
                    .background(Color(0xFF4CAF50), shape = RoundedCornerShape(0.dp)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {}
        }
    }
}