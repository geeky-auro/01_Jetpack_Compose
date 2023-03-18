package com.aurosaswat.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aurosaswat.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//      We can force the width as wide as we can specify .requiredWidth()
//            offset(from row,to column)
        Column(modifier = Modifier
            .background(Color.Green)
//            .width(300.dp)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .border(5.dp,Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Cyan)
            .padding(5.dp)
            .border(5.dp, Color.Red)
                ) {
            Text(modifier = Modifier
                .offset(0.dp,20.dp),text = "Hello world")
//            To insert Space between two widgets we use a composible called Spacer ;)
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "AURO",Modifier.border(5.dp,Color.Yellow)
                .clickable {
//                    Inserty Code when Clicked
                }

            )
            Text(text = "Saswat")

        }
        }
    }
}
