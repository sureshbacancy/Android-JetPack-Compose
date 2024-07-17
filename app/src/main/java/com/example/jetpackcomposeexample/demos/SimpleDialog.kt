package com.example.jetpackcomposeexample.demos

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun Dialog(openDialog: Boolean, onCloseDialog: () -> Unit) {
    if (openDialog){
        AlertDialog(
           // shape = RoundedCornerShape(1.dp),
            onDismissRequest = { onCloseDialog() },
            title = { Text(text = "Dialog Title") },
            text = { Text(text = "This is a simple dialog. You can write here some warnings, Alert, Message etc..") },
            confirmButton = {
                Text(text = "OK", modifier = Modifier.clickable {
                    onCloseDialog()
                })
            },
            dismissButton = {
                Text(text = "Cancel", modifier = Modifier
                    .padding(end = 20.dp)
                    .clickable {
                    onCloseDialog()
                })
            }
        )
    }
}

@Composable
fun ShowAlertDialog() {
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { showDialog = true }) {
            Text(text = "Show Dialog")
        }
        Dialog(openDialog = showDialog) {
            showDialog = false
        }
    }
}