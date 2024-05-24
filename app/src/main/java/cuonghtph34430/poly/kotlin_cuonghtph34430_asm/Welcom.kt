package cuonghtph34430.poly.kotlin_cuonghtph34430_asm

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

class Welcom : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            enableEdgeToEdge()
            val content = LocalContext.current
            GetLayoutBoarding(NavController(context = content))

        }
    }

    @Composable
    fun GetLayoutBoarding(navController: NavController) {
        val context = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.bg_boarding),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(35.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(1f),
                verticalArrangement = Arrangement.Center,

                ) {
                Column(
                    modifier = Modifier
                        .weight(3f)
                        .padding(top = 50.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "MAKE YOUR",
                        fontFamily = FontFamily.Serif,
                        color = Color(0xff606060),
                        fontSize = 24.sp,
                        fontWeight = FontWeight(600)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "HOME BEAUTIFUL",
                        fontFamily = FontFamily.Serif,
                        color = Color(0xff303030),
                        fontSize = 30.sp,
                        fontWeight = FontWeight(700)
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
                        fontFamily = FontFamily.Serif,
                        color = Color(0xff808080),
                        fontSize = 14.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(start = 30.dp),
                        textAlign = TextAlign.Justify
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            val intent = Intent(context, Login::class.java)
                            context.startActivities(arrayOf(intent))
                        },
                        modifier = Modifier.size(160.dp, 50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff242424)
                        ),
                        shape = RoundedCornerShape(8.dp)

                    ) {
                        Text(
                            text = "Get Started",
                            fontFamily = FontFamily.Serif
                        )
                    }
                }

            }

        }

    }

    @Preview
    @Composable
    fun GreetingBoarding() {
        val content = LocalContext.current
        val navController = NavController(context = content)
        GetLayoutBoarding(navController)
    }
}
