package com.example.jetpackcomposeexample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            // Demo 10.2 : 14-02-2024

      /*      LazyColumn {

                items(500000) {
                    Text(
                        text = "item $it",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }*/

            // Demo 10 : 14-02-2024

            /* val scrollState = rememberScrollState()

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

             }*/


            // Demo 9 : 14-02-2024

            /* val snackBarHostState = remember { SnackbarHostState() }
             val scope = rememberCoroutineScope()

             var name by remember {
                 mutableStateOf("")
             }
             var email by remember {
                 mutableStateOf("")
             }
             var phone by remember {
                 mutableStateOf("")
             }
             var password by remember {
                 mutableStateOf("")
             }

             Scaffold(
                 snackbarHost = { SnackbarHost(hostState = snackBarHostState) }
             ) {
                 Column(
                     modifier = Modifier
                         .background(Color.White)
                         .fillMaxSize(),
                     horizontalAlignment = Alignment.CenterHorizontally
                 ) {

                     Text(
                         text = "REGISTRATION",
                         color = Color.Black,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(30.dp),
                         textAlign = TextAlign.Center,
                         fontSize = 30.sp,
                         fontWeight = FontWeight.Bold
                     )

                     TextField(
                         value = name,
                         onValueChange = {
                             name = it
                         },
                         label = {
                             Text(text = "Enter Name")
                         },
                         singleLine = true,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(top = 20.dp, end = 20.dp, start = 20.dp),
                         keyboardOptions = KeyboardOptions(
                             keyboardType = KeyboardType.Text,
                             imeAction = ImeAction.Next
                         )
                     )

                     TextField(
                         value = email,
                         onValueChange = {
                             email = it
                         },
                         label = {
                             Text(text = "Enter email")
                         },
                         singleLine = true,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                         keyboardOptions = KeyboardOptions(
                             keyboardType = KeyboardType.Email,
                             imeAction = ImeAction.Next
                         )
                     )

                     TextField(
                         value = phone,
                         onValueChange = {
                             phone = it
                         },
                         label = {
                             Text(text = "Enter phone")
                         },
                         singleLine = true,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                         keyboardOptions = KeyboardOptions(
                             keyboardType = KeyboardType.Phone,
                             imeAction = ImeAction.Next
                         )
                     )

                     TextField(
                         value = password,
                         onValueChange = {
                             password = it
                         },
                         label = {
                             Text(text = "Enter password")
                         },
                         singleLine = true,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(top = 10.dp, end = 20.dp, start = 20.dp),
                         keyboardOptions = KeyboardOptions(
                             keyboardType = KeyboardType.Password,
                             imeAction = ImeAction.Done
                         )
                     )

                     Spacer(modifier = Modifier.height(25.dp))

                     Button(onClick = {

                         if (name.isEmpty()) {
                             scope.launch {
                                 snackBarHostState.showSnackbar("Please enter name")
                             }
                         } else if (email.isEmpty()) {
                             scope.launch {
                                 snackBarHostState.showSnackbar("Please enter email")
                             }
                         } else if (phone.isEmpty()) {
                             scope.launch {
                                 snackBarHostState.showSnackbar("Please enter phone")
                             }
                         } else if (password.isEmpty()) {
                             scope.launch {
                                 snackBarHostState.showSnackbar("Please enter password")
                             }
                         } else {
                             scope.launch {
                                 snackBarHostState.showSnackbar("Registration successfully")
                             }
                         }

                     }) {
                         Text(text = "Submit")
                     }

                 }
             }*/


            // Demo 8 : 13-02-2024

            /* val snackBarHostState = remember { SnackbarHostState() }
             var textFieldState by remember {
                 mutableStateOf("")
             }
             val scope = rememberCoroutineScope()


             Scaffold(
                 modifier = Modifier.fillMaxSize(),
                 snackbarHost = { SnackbarHost(hostState = snackBarHostState) }

             ) {

                 Column(
                     horizontalAlignment = Alignment.CenterHorizontally,
                     verticalArrangement = Arrangement.Center,
                     modifier = Modifier
                         .fillMaxSize()
                         .padding(horizontal = 30.dp)
                         .background(Color.White)
                 ) {

                     TextField(
                         value = textFieldState, onValueChange = {
                             textFieldState = it
                         },
                         label = {
                             Text(text = "Enter Your Name")
                         },
                         singleLine = true,
                         modifier = Modifier.fillMaxWidth(),
                         keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done)

                     )
                     Spacer(modifier = Modifier.height(16.dp))
                     Button(onClick = {

                         if (textFieldState.isEmpty()){
                             scope.launch {
                                 snackBarHostState.showSnackbar("Please enter name")
                             }
                         }else {
                             scope.launch {
                                 snackBarHostState.showSnackbar(textFieldState)
                             }
                         }


                     }) {
                         Text(text = "Submit")
                     }
                 }
             }*/


            // Demo 7 : 13-02-2024

            /* Column(
                 modifier = Modifier
                     .fillMaxSize(),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center

             ) {

                 ColorBox()
                 Text(text = "Click on box to change its color",Modifier.padding(top = 20.dp))
             }*/


            // Demo 6 : 13-02-2024

            /* val fontFamily = FontFamily(
                 Font(R.font.protest_revolution_regular, FontWeight.Thin),
                 Font(R.font.titillium_web_black, FontWeight.Thin),
             )

             Box(
                 modifier = Modifier
                     .fillMaxSize()
                     .background(Color.White)
                     .padding(15.dp),
                 contentAlignment = Alignment.Center


             ) {
                 Text(
                     text = buildAnnotatedString {
                         withStyle(
                             style = SpanStyle(
                                 color = Color.Red,
                                 fontSize = 60.sp
                             )
                         ) {
                             append("A")
                         }
                         append("ndroid   ")

                         withStyle(
                             style = SpanStyle(
                                 color = Color.Red,
                                 fontSize = 60.sp
                             )
                         ) {
                             append("J")
                         }
                         append("etpack")
                     },
                     color = Color.Black,
                     fontSize = 28.sp,
                     fontFamily = fontFamily,
                     fontWeight = FontWeight.ExtraBold,
                     textAlign = TextAlign.Center
                 )
             }*/


            // Demo 5 : 13-02-2024

            /*       val painter = painterResource(id = R.drawable.bg_image)
                   val description = "Card Image demo"
                   val title = "Card Image Demo"
                   Box(
                       modifier = Modifier
                           .padding(16.dp)
                   ) {
                       ImageCard(painter = painter, title = title, contentDescription = description)
                   }
       */

            // Demo 4 : 13-02-2024

            /* Column(
                 modifier = Modifier
                     .padding(20.dp)
                     .fillMaxSize()
                     // .fillMaxWidth() // something like Match_Parent
                     // .fillMaxHeight()
                     .background(Color.LightGray),
                 horizontalAlignment = Alignment.CenterHorizontally,
                 verticalArrangement = Arrangement.Center
             ) {
                 Text(
                     text = "Hello Bacancy",
                     color = Color.Black,
                     fontSize = 40.sp,
                     modifier = Modifier
                         .border(width = 5.dp, color = Color.Black, shape = RoundedCornerShape(90.dp))
                         .padding(20.dp)

                 )
             }*/

            // Demo 3 : 13-02-2024

            /*  Column(
                  modifier = Modifier
                      .padding(20.dp)
                      .fillMaxSize()
                      // .fillMaxWidth() // something like Match_Parent
                      // .fillMaxHeight()
                      .background(Color.Cyan),
                  horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.Center
              ) {
                  Text(
                      text = "Hello Dell",
                      color = Color.White,
                      fontSize = 50.sp,
                      modifier = Modifier
                          .background(Color.Red)
                          .padding(20.dp)

                  )
              }*/


            // Demo 2 : 12-02-2024

            /*  Row(
                  modifier = Modifier
                      .fillMaxSize()         // Full height / width
                      // .fillMaxSize(0.5f)     // Specific height / width
                      // .height(200.dp)        // Specific height
                      // .width(200.dp)         // Specific width
                      .background(Color.Red),// Background Color

                  horizontalArrangement = Arrangement.SpaceBetween,
                  //Arrangement.Top, Arrangement.Bottom, Arrangement.Center, Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
                  verticalAlignment = Alignment.CenterVertically
                  //Alignment.End, Alignment.Start, Alignment.CenterHorizontally

              ) {

                  Text(text = "JAVA")
                  Text(text = "PHP", color = Color.Blue)
                  Text(text = "Python")
              }*/

            // Demo 1 : 12-02-2024

            /*  Column(
                  modifier = Modifier
                      .fillMaxSize()         // Full height / width
                     // .fillMaxSize(0.5f)     // Specific height / width
                     // .height(200.dp)        // Specific height
                     // .width(200.dp)         // Specific width
                      .background(Color.Green),// Background Color
                  horizontalAlignment = Alignment.CenterHorizontally, // Horizontal Alignment
                  //Alignment.End, Alignment.Start, Alignment.CenterHorizontally
                  verticalArrangement = Arrangement.SpaceBetween // Vertical Arrangement
                   // Arrangement.Top, Arrangement.Bottom, Arrangement.Center,
                   // Arrangement.SpaceAround, Arrangement.SpaceBetween, Arrangement.SpaceEvenly
              ) {

                  Text(text = "Hello")
                  Text(text = "Android", color = Color.Red)
                  Text(text = "Kotlin")
              }*/

        }
    }

}

/*
@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {


    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )


    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )


            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            ) {


            }


            Box(
                modifier = modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart


            ) {
                Text(
                    text = title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp)
                )
            }
        }
    }


}*/

/*
@Composable
fun ColorBox() {

    val color = remember {
        mutableStateOf(Color.Green)
    }

    Box(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            }
    )

}*/

