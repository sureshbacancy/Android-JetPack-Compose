package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.ui.theme.JetPackComposeExampleTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
            // TextSelection()
            //ExpandableCardView()
        }
    }
}

@ExperimentalMaterial3Api
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
        //ShowBoxCustomization(
        //ShowCustomTexts()
        //TextSelection()
        //ExpandableCardView()
    }
}