import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.Home
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.Login
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.Register
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.Welcom
import cuonghtph34430.poly.kotlin_cuonghtph34430_asm.ui.theme.Kotlin_cuonghtph34430_ASMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Kotlin_cuonghtph34430_ASMTheme {
                    AppNavigation()
                }

        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "boarding") {
        composable("boarding") { Welcom() }
        composable("login") { Login() }
        composable("register") { Register() }
        composable("home") { Home() }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
        AppNavigation()
}
