package com.example.jetpackcomposeexample.demos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample() {
    var bottomSheetState by remember { mutableStateOf(false) }

    BottomSheetScaffold(
        sheetContent = {
            // Content of the BottomSheet
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "BottomSheet Content")
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { bottomSheetState = false }) {
                    Text(text = "Close BottomSheet")
                }
            }
        },
        sheetPeekHeight = if (bottomSheetState) 300.dp else 0.dp,
        scaffoldState = rememberBottomSheetScaffoldState()
    ) {
        // Your main content goes here
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { bottomSheetState = true }) {
                Text(text = "Open BottomSheet")
            }
        }
    }
}