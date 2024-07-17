package com.example.jetpackcomposeexample.home.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.bundleOf
import com.example.jetpackcomposeexample.base.MainScreen
import com.example.jetpackcomposeexample.R
import com.example.jetpackcomposeexample.base.BaseActivity
import com.example.jetpackcomposeexample.database.pref.SharedPrefManager
import com.example.jetpackcomposeexample.extension.openScreen
import com.example.jetpackcomposeexample.home.viewmodel.HomeViewModel
import com.example.jetpackcomposeexample.login.ui.LoginScreen
import com.example.jetpackcomposeexample.theme.JetPackComposeExampleTheme
import kotlinx.coroutines.launch

class HomeScreen : BaseActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeExampleTheme {
                HomeScreenContent(this)
            }
        }
    }

    @Composable
    fun DisplayViewList(context: Context) {
        LazyColumn {
            items(homeViewModel.getContentList().size) { position ->

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp)
                        .padding(start = 15.dp, end = 15.dp, top = 10.dp)
                        .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        modifier = Modifier
                            .padding(
                                start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp
                            )
                            .clickable {
                                context.openScreen(
                                    MainScreen::class.java,
                                    bundle = bundleOf(
                                        "viewId" to homeViewModel.getContentList()[position].viewId,
                                        "viewTitle" to homeViewModel.getContentList()[position].viewName,
                                    )
                                )
                            },
                        text = getTitleName(position),
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

    private fun getTitleName(position: Int): String {
        return "${(position + 1)}. ".plus(homeViewModel.getContentList()[position].viewName)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomeScreenContent(context: Context) {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        ModalNavigationDrawer(drawerState = drawerState, drawerContent = {
            DrawerContent(context)
        }) {
            Scaffold(topBar = {
                TopAppBar(title = {
                    Text(
                        text = "Home", fontWeight = FontWeight.Bold, fontSize = 20.sp
                    )
                }, navigationIcon = {
                    IconButton(onClick = {
                        scope.launch {
                            drawerState.open()
                        }
                    }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                    }
                }, actions = {
                    IconButton(onClick = {

                    }) {
                        Icon(Icons.Filled.MoreVert, contentDescription = "More options")
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
                    DisplayViewList(context)
                }
            })
        }
    }

    @Composable
    fun AddDivider() {
        Box(
            modifier = Modifier
                .height(1.dp)
                .fillMaxSize()
                .background(Color.White)
        )
    }

    @Composable
    fun DrawerContent(context: Context) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(250.dp)
                .background(Color.Black)
                .padding(top = 70.dp),
        ) {

            Image(
                painter = painterResource(id = R.drawable.default_user_ic),
                contentDescription = "Circular Image",
                modifier = Modifier
                    .padding(start = 70.dp, bottom = 15.dp)
                    .size(70.dp)
                    .clip(CircleShape)
                    .border(width = 1.dp, Color.White, shape = RoundedCornerShape(90)),
                contentScale = ContentScale.Crop,
            )

            Text(
                SharedPrefManager.getValue(context, SharedPrefManager.KEY_NAME),
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp),
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )

            Text(
                SharedPrefManager.getValue(context, SharedPrefManager.KEY_EMAIL),
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp, bottom = 50.dp),
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )

            AddDivider()

            Text(
                "Home",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp, start = 30.dp, bottom = 15.dp)
                    .clickable {
                        Log.d("modifier", "DrawerContent: home")
                    },
                fontSize = 20.sp,
            )

            AddDivider()

            Text(
                "Settings",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp, start = 30.dp, bottom = 15.dp)
                    .clickable {
                        Log.d("modifier", "DrawerContent: Settings")
                    },
                fontSize = 20.sp,
            )

            AddDivider()

            Text(
                "Logout",
                color = Color.White,
                modifier = Modifier
                    .padding(top = 15.dp, start = 30.dp, bottom = 15.dp)
                    .clickable {
                        Log.d("modifier", "DrawerContent: home")
                        // close drawer here
                        SharedPrefManager.clearUserDetails(context)
                        context.openScreen(LoginScreen::class.java)
                        finish()
                        // finish activity here
                    },
                fontSize = 20.sp
            )

            AddDivider()
            Spacer(modifier = Modifier.weight(1f))

            Text(
                "Jetpack compose - 1.0",
                color = Color.White,
                modifier = Modifier.padding(top = 20.dp, start = 30.dp, bottom = 20.dp),
                fontSize = 12.sp,
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreviewLogin() {
    val context = LocalContext.current
    //HomeScreenContent(context)
    //DrawerContent(context)
    //ShowDecoratedText()
}