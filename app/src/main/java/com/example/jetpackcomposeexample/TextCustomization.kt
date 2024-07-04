package com.example.jetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShowCustomTexts() {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.White),
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
                .background(Color.White),
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

val aa =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vel velit eu dui luctus tincidunt. Ut efficitur justo et dui volutpat tincidunt. Proin quis ante id arcu pharetra gravida at a libero. Nulla facilisi."
val bb =
    " Sed posuere ligula id odio faucibus, eget gravida turpis congue. Integer id nulla nec justo rhoncus ultrices. Nulla facilisi. Suspendisse potenti."
val cc =
    " Sed posuere ligula id odio faucibus, eget gravida turpis congue. Integer id nulla nec justo rhoncus ultrices. Nulla facilisi. Suspendisse potenti. Quisque consequat aliquet erat, sit amet mollis risus eleifend id. Vivamus nec malesuada nisi. Sed fringilla diam lectus, id rutrum ex lobortis id. Maecenas varius, ligula sit amet congue tristique, enim nulla consectetur quam, ac feugiat erat orci a mi. Nunc convallis elit a ex congue, sit amet ullamcorper quam sagittis. Maecenas sit amet semper lectus. Vivamus sed eros in urna tempor lobortis."

@Composable
fun TextSelection() {
    val text =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vel velit eu dui luctus tincidunt. Ut efficitur justo et dui volutpat tincidunt. Proin quis ante id arcu pharetra gravida at a libero. Nulla facilisi. Sed posuere ligula id odio faucibus, eget gravida turpis congue. Integer id nulla nec justo rhoncus ultrices. Nulla facilisi. Suspendisse potenti. Quisque consequat aliquet erat, sit amet mollis risus eleifend id. Vivamus nec malesuada nisi. Sed fringilla diam lectus, id rutrum ex lobortis id. Maecenas varius, ligula sit amet congue tristique, enim nulla consectetur quam, ac feugiat erat orci a mi. Nunc convallis elit a ex congue, sit amet ullamcorper quam sagittis. Maecenas sit amet semper lectus. Vivamus sed eros in urna tempor lobortis."

    val annotatedString = with(AnnotatedString.Builder()) {
        append(text)
        addStyle(
            style = SpanStyle(color = Color.Red),
            start = 57,
            end = 213,
        )
        toAnnotatedString()
    }

    SelectionContainer {
        Text(
            text = annotatedString,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        )
    }
}