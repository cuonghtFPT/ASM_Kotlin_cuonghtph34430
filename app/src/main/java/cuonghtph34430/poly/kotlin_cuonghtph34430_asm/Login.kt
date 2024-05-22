package cuonghtph34430.poly.kotlin_cuonghtph34430_asm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.customcompose.TitleCompose

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val content = LocalContext.current
            GetLayoutLogin(NavController(content))
        }
    }

    @Composable
    fun GetLayoutLogin(navController: NavController) {
        var isShowPass by remember {
            mutableStateOf(false)
        }
        var email by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 35.dp)
            ) {
                TitleCompose()
            }
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 50.dp, start = 10.dp, bottom = 15.dp
                    )
                ) {
                    Text(
                        text = "Hello !",
                        fontFamily = FontFamily.Serif,
                        color = Color(0xff909090),
                        fontWeight = FontWeight(500),
                        fontSize = 35.sp
                    )
                    Text(
                        text = "WELCOME BACK",
                        fontFamily = FontFamily.Serif,
                        color = Color(0xff303030),
                        fontWeight = FontWeight(700),
                        fontSize = 35.sp
                    )

                }

                Column(
                    modifier = Modifier
                        .size(370.dp, 440.dp)
                        .shadow(
                            elevation = 3.dp,
                            shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                        )
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                        )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = 20.dp, end = 20.dp, top = 30.dp, bottom = 30.dp
                            )
                    ) {
                        Column {
                            Text(
                                text = "Email",
                                color = Color(0xff909090),
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.padding(bottom = 3.dp)
                            )
                            TextField(
                                value = email,
                                onValueChange = {
                                    email = it
                                },
                                modifier = Modifier.fillMaxWidth(),
                                colors = TextFieldDefaults.colors(
                                    focusedContainerColor = Color.Transparent,
                                    unfocusedContainerColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color(0xffE0E0E0),
                                    focusedIndicatorColor = Color(0xffE0E0E0),
                                    cursorColor = Color.Black
                                ),
                                textStyle = TextStyle(
                                    fontFamily = FontFamily.Serif
                                ),
                            )
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Column {
                            Text(
                                text = "Password",
                                color = Color(0xff909090),
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.padding(bottom = 3.dp)
                            )
                            TextField(
                                value = password,
                                onValueChange = {
                                    password = it
                                },
                                modifier = Modifier.fillMaxWidth(),
                                colors = TextFieldDefaults.colors(
                                    focusedContainerColor = Color.Transparent,
                                    unfocusedContainerColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color(0xffE0E0E0),
                                    focusedIndicatorColor = Color(0xffE0E0E0),
                                    cursorColor = Color.Black
                                ),
                                trailingIcon = {
                                    IconButton(onClick = {
                                        isShowPass = !isShowPass
                                    }) {
                                        Icon(
                                            painter = painterResource(
                                                id = if (isShowPass) R.drawable.an else R
                                                    .drawable.show
                                            ),
                                            contentDescription = null,
                                            modifier = Modifier.size(20.dp, 20.dp)
                                        )
                                    }
                                },
                                textStyle = TextStyle(
                                    fontFamily = FontFamily.Serif
                                ),
                                visualTransformation = if (isShowPass) VisualTransformation.None else PasswordVisualTransformation()
                            )
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(
                                text = "Forgot Password",
                                fontFamily = FontFamily.Serif,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(600),
                                color = Color(0xff303030),
                                modifier = Modifier.padding(top = 15.dp, bottom = 15.dp)
                            )
                            Button(
                                onClick = {
                                    navController.navigate("home")
                                },
                                modifier = Modifier.size(290.dp, 50.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xff242424)
                                ),
                                shape = RoundedCornerShape(8.dp)

                            ) {
                                Text(
                                    text = "Log in",
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight(600)
                                )
                            }
                            Text(
                                text = "SIGN UP",
                                modifier = Modifier.padding(top = 20.dp).selectable(
                                    selected = true,
                                    onClick = {
                                        navController.navigate("signup")
                                    }
                                ),
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Serif,
                                color = Color(0xff303030)
                            )

                        }


                    }

                }
            }

        }


    }


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingLogin() {
        val content = LocalContext.current
        GetLayoutLogin(NavController(content))
    }
}