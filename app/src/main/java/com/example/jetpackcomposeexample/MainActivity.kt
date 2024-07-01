package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowCustomTexts()
            //BlackAndWhiteCubeWithText()
            //ShowListViewUsingItems()
            //ShowListViewUsingForLoopAndColumns()
            //ShowSignUpPage()
            //ShowEditTextAndSubmitButtonView()
            //ShowColorfulClickableCube()
            //ShowDecoratedText()
            //RoundedText()()
            //ShowRoundedImageWithText()
            //TextWithBackGround()
            //ShowNormalHorizontalText()
            //ShowVerticalNormalText()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetPackComposeExampleTheme {
        //BlackAndWhiteCubeWithText()
        //ShowListViewUsingItems()
        //ShowListViewUsingForLoopAndColumns()
        //ShowSignUpPage()
        //ShowEditTextAndSubmitButtonView()
        //ShowColorfulClickableCube()
        //ShowDecoratedText()
        //RoundedText()
        //ShowRoundedImageWithText()
        //TextWithBackGround()
        //ShowNormalHorizontalText()
        //ShowVerticalNormalText()
        //ShowBoxCustomization()
        ShowCustomTexts()
    }
}