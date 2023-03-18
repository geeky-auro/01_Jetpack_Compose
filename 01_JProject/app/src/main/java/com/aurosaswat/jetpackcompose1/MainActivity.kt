package com.aurosaswat.jetpackcompose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aurosaswat.jetpackcompose1.ui.theme.JetpackCompose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Before Jetpack Compose we had setContentView()

        setContent {
            Greeting(name = "Auro Saswat Raj")
        }
    }
}

// To Define Views in Kotlin we use functions in Kotlin ;-0
// We annotate the function with @Composable ;)
@Composable
fun Greeting(name: String) {
//    Used to Display Text ;)
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        Greeting("Saswat")

}