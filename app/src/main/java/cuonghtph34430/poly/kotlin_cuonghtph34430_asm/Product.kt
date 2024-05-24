package cuonghtph34430.poly.kotlin_cuonghtph34430_asm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import androidx.navigation.NavHostController

class Product: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GetLayoutDetailProduct(NavHostController(LocalContext.current), null)
        }


    }
}

@Composable
fun GetLayoutDetailProduct(navController: NavHostController, item: Home.Product?) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(455.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            item?.let { painterResource(id = R.drawable.image_product2) }?.let {
                Image(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 65.dp)
                        .fillMaxSize()
                        .clip(
                            shape = RoundedCornerShape(bottomStart = 50.dp)
                        ),
                    contentScale = ContentScale.Crop
                )
            }
            IconButton(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier
                    .padding(end = 260.dp, top = 20.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_back),
                    //imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = null,
                    modifier = Modifier.size(15.dp, 15.dp)
                )
            }
            Column(
                modifier = Modifier
                    .padding(end = 260.dp, top = 120.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                    .padding(10.dp)
            ) {
                CustomRadioButton(
                    selected = true,
                    onClick = { /*TODO*/ },
                    outerColor = Color.Gray,
                    innerColor = Color.White
                )
                Spacer(modifier = Modifier.height(20.dp))
                CustomRadioButton(
                    selected = false,
                    onClick = { /*TODO*/ },
                    outerColor = Color(0xffF0F0F0),
                    innerColor = Color(0xffB4916C)
                )
                Spacer(modifier = Modifier.height(20.dp))
                CustomRadioButton(
                    selected = false,
                    onClick = { /*TODO*/ },
                    outerColor = Color(0xffE4CBAD),
                    innerColor = Color(0xffE4CBAD)
                )

            }

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 15.dp, end = 15.dp, top = 20
                        .dp
                )
        ) {
            item?.let {
                Text(
                    text = it.name,
                    fontWeight = FontWeight(500),
                    fontFamily = FontFamily.Serif,
                    fontSize = 24.sp,
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                item?.let {
                    Text(
                        text = "${it.price}",
                        fontFamily = FontFamily.Serif,
                        fontSize = 30.sp,
                        fontWeight = FontWeight(700),
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .shadow(
                                elevation = 0.0.dp,
                                shape = RoundedCornerShape(10.dp)
                            )
                            .background(
                                color = Color(0xffE0E0E0),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp, 15.dp)
                        )
                    }
                    Text(
                        text = "01",
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight(600),
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                    )

                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .shadow(
                                elevation = 0.0.dp,
                                shape = RoundedCornerShape(10.dp)
                            )
                            .background(
                                color = Color(0xffE0E0E0),
                                shape = RoundedCornerShape(10.dp)
                            )
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.remove),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp, 15.dp)
                        )
                    }
                }
            }
            Row(
                modifier = Modifier.padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sta),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp, 20.dp)
                )
                Text(
                    text = "4.5",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(700),
                    modifier = Modifier.padding(start = 7.dp)

                )
                Text(
                    text = "(50 reviews)",
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color(0xff808080),
                    modifier = Modifier.padding(start = 10.dp)
                )

            }
            Text(
                text = "Minimal Stand is made of by natural wood. The design that is " +
                        "very simple and minimal. This is truly one of the best furniture's in any family for now. With 3 different colors, you can easily select the best match for your home. ",
                modifier = Modifier.padding(top = 10.dp),
                textAlign = TextAlign.Justify,
                fontSize = 14.sp,
                color = Color(0xff606060),
                lineHeight = 22.sp,
                fontFamily = FontFamily.Serif
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp, bottom = 100.dp),

                ) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 15.dp, end = 15.dp)
                        .background(
                            color = Color(0xffF0F0F0),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.favorite),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp, 20.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .weight(3f)
                        .height(60.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(10.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff242424)
                    )
                ) {
                    Text(
                        text = "Add to cart",
                        fontFamily = FontFamily.Serif
                    )
                }
            }
        }

    }


}

@Composable
fun CustomRadioButton(
    selected: Boolean,
    onClick: () -> Unit,
    outerColor: Color,
    innerColor: Color
) {
    Box(
        modifier = Modifier
            .size(24.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        // Outer circle
        Box(
            modifier = Modifier
                .size(20.dp)
                .background(color = outerColor, shape = RoundedCornerShape(10.dp))
        )
        // Inner circle
        if (selected) {
            Box(
                modifier = Modifier
                    .size(15.dp)
                    .background(color = innerColor, shape = CircleShape)
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingDetailProduct() {
    GetLayoutDetailProduct(NavHostController(LocalContext.current), null)
}