package com.example.jetpackcomposeexample.demos

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Created by Suresh Prajapati - 01-07-2024
// Three static expandable view

@ExperimentalMaterial3Api
@Composable
fun ExpandableCardView() {

    var expandableStateAndroid by remember { mutableStateOf(false) }
    val rotationStateAndroid by animateFloatAsState(
        targetValue = if (expandableStateAndroid) 180f else 0f, label = ""
    )

    var expandableStateIos by remember { mutableStateOf(false) }
    val rotationStateIos by animateFloatAsState(
        targetValue = if (expandableStateIos) 180f else 0f, label = ""
    )

    var expandableStateJava by remember { mutableStateOf(false) }
    val rotationStateJava by animateFloatAsState(
        targetValue = if (expandableStateJava) 180f else 0f, label = ""
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        Card(colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ), modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), onClick = {
            expandableStateAndroid = expandableStateAndroid.not()
        }) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Text(
                        text = "Android",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .weight(7f)
                            .padding(start = 10.dp),
                        fontWeight = FontWeight.W700,
                        color = Color.Black
                    )

                    IconButton(modifier = Modifier
                        .weight(1f)
                        .rotate(rotationStateAndroid),
                        onClick = {
                            expandableStateAndroid = expandableStateAndroid.not()
                        }) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
                    }
                }

                if (expandableStateAndroid) {
                    Text(
                        text = "Android is an operating system (OS) developed by Google primarily for touchscreen mobile devices like smartphones and tablets. It's based on a modified version of the Linux kernel and other open-source software. Android has become the most widely used mobile OS globally, powering devices from various manufacturers.",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

        Card(colors = CardDefaults.cardColors(
            containerColor = Color.Yellow,
        ), modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), onClick = {
            expandableStateIos = expandableStateIos.not()
        }) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Text(
                        text = "iOS",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .weight(7f)
                            .padding(start = 10.dp),
                        fontWeight = FontWeight.W700,
                        color = Color.Black
                    )

                    IconButton(modifier = Modifier
                        .weight(1f)
                        .rotate(rotationStateIos), onClick = {
                        expandableStateIos = expandableStateIos.not()
                    }) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
                    }
                }

                if (expandableStateIos) {
                    Text(
                        text = "iOS is a mobile operating system developed by Apple Inc. It is exclusively designed for Apple's hardware, including iPhones, iPads, and iPod Touch devices. iOS is known for its smooth user interface, security features, and seamless integration with other Apple products and services.",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

        Card(colors = CardDefaults.cardColors(
            containerColor = Color.Blue,
        ), modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), onClick = {
            expandableStateJava = expandableStateJava.not()
        }) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Text(
                        text = "JAVA",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .weight(7f)
                            .padding(start = 10.dp),
                        fontWeight = FontWeight.W700,
                        color = Color.White
                    )

                    IconButton(modifier = Modifier
                        .weight(1f)
                        .rotate(rotationStateJava), onClick = {
                        expandableStateJava = expandableStateJava.not()
                    }) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "", tint = Color.White)
                    }
                }

                if (expandableStateJava) {
                    Text(
                        text = "Java is a high-level, object-oriented programming language. It was designed to have minimal implementation dependencies, meaning that compiled Java code can run on any platform that supports Java without needing to be recompiled. This feature is often summarized as \"write once, run anywhere\" (WORA).",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                        textAlign = TextAlign.Justify,
                        color = Color.White
                    )
                }
            }
        }
    }
}