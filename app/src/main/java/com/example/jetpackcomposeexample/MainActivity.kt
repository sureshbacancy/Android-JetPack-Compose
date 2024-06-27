package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
    }
}