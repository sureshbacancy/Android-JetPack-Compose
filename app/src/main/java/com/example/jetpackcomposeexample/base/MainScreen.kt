package com.example.jetpackcomposeexample.base

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.demos.BlackAndWhiteCubeWithText
import com.example.jetpackcomposeexample.demos.CustomGoogleButton
import com.example.jetpackcomposeexample.demos.ExpandableCardView
import com.example.jetpackcomposeexample.demos.GradientButtons
import com.example.jetpackcomposeexample.demos.PasswordTextField
import com.example.jetpackcomposeexample.demos.RoundedText
import com.example.jetpackcomposeexample.demos.ShowAlertDialog
import com.example.jetpackcomposeexample.demos.ShowBoxCustomization
import com.example.jetpackcomposeexample.demos.ShowColorfulClickableCube
import com.example.jetpackcomposeexample.demos.ShowCustomTexts
import com.example.jetpackcomposeexample.demos.ShowDecoratedText
import com.example.jetpackcomposeexample.demos.ShowListViewUsingItems
import com.example.jetpackcomposeexample.demos.ShowNormalHorizontalText
import com.example.jetpackcomposeexample.demos.ShowRoundedImageWithText
import com.example.jetpackcomposeexample.demos.ShowVerticalNormalText
import com.example.jetpackcomposeexample.demos.TextFieldExample
import com.example.jetpackcomposeexample.demos.TextSelection
import com.example.jetpackcomposeexample.demos.TextWithBackGround
import com.example.jetpackcomposeexample.demos.ViewBorder
import com.example.jetpackcomposeexample.theme.JetPackComposeExampleTheme

class MainScreen : BaseActivity() {

    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewId = intent.getIntExtra("viewId",0)
            val viewTitle = intent.getStringExtra("viewTitle")?:"Custom View"

            JetPackComposeExampleTheme {
                Scaffold(topBar = {
                    TopAppBar(
                        title = {
                        Text(
                            text = viewTitle,fontSize = 17.sp
                        )
                    }, navigationIcon = {
                        IconButton(onClick = {
                            onBackPressedDispatcher.onBackPressed()
                        }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }, colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Black,
                        titleContentColor = MaterialTheme.colorScheme.onPrimary,
                        navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                        actionIconContentColor = MaterialTheme.colorScheme.onSecondary
                    )
                    )
                }, content = { padding ->
                    Box(modifier = Modifier.padding(padding)) {

                        when (viewId) {
                            1 -> BlackAndWhiteCubeWithText()
                            2 -> ShowListViewUsingItems()
                            3 -> ShowColorfulClickableCube()
                            4 -> ShowDecoratedText()
                            5 -> RoundedText()
                            6 -> ShowRoundedImageWithText()
                            7 -> TextWithBackGround()
                            8 -> ShowNormalHorizontalText()
                            9 -> ShowVerticalNormalText()
                            10 -> ShowBoxCustomization()
                            11 -> ShowCustomTexts()
                            12 -> TextSelection()
                            13 -> ExpandableCardView()
                            14 -> TextFieldExample(context)
                            15 -> CustomGoogleButton()
                            16 -> PasswordTextField()
                            17 -> GradientButtons { }
                            18 -> ViewBorder()
                            19 -> ShowAlertDialog()
                        }
                    }
                })
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    val context = LocalContext.current

    //You can uncomment function to run & check particular demo
    JetPackComposeExampleTheme {
        //ShowAlertDialog()
        //BottomSheetExample()
        //BlackAndWhiteCubeWithText()
        //ShowListViewUsingItems()
        //ShowListViewUsingForLoopAndColumns()
        //ShowSignUpPage()
        //ShowEditTextAndSubmitButtonView()
        //ShowColorfulClickableCube()
       // ShowDecoratedText()
        //RoundedText()
        //ShowRoundedImageWithText()
        //TextWithBackGround()
        //ShowNormalHorizontalText()
        //ShowVerticalNormalText()
        //ShowBoxCustomization()
        //ShowCustomTexts()
        //TextSelection()
        //ExpandableCardView()
        //TextFieldExample(context)
        //CustomGoogleButton()
        //PasswordTextField()
        //GradientButtons {
        //    Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
        //}
        //ViewBorder()
    }
}