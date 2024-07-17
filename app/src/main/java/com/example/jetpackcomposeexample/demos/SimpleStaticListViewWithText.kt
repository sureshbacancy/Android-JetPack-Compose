package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Created by Suresh Prajapati - 14-02-2024

@Composable
fun ShowListViewUsingItems() {
    LazyColumn {
        items(100) {
            Text(
                text = "Item - ${it.plus(1)}",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun ShowListViewUsingForLoopAndColumns() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..50) {
            Text(
                text = "item $i",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}