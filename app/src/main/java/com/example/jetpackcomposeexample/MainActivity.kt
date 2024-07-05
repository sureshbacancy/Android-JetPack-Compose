package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //You can uncomment function to run & check particular demo

            //ShowCustomTexts()
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
            //TextSelection()
            //ExpandableCardView()
            //TextFieldExample(this)
            //CustomGoogleButton()
            PasswordTextField()
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    val context = LocalContext.current

    JetPackComposeExampleTheme {
        //You can uncomment function to run & check particular demo

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
        //ShowBoxCustomization(
        //ShowCustomTexts()
        //TextSelection()
        //ExpandableCardView()
        //TextFieldExample(context)
        //CustomGoogleButton()
        PasswordTextField()
    }
}
