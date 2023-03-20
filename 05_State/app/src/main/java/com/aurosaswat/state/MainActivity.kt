package com.aurosaswat.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aurosaswat.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            State describes how our UI looks at a particular moment
            /**
             *
             * In context of Jetpack Compose, a state is a value that is related to updating your UI. Every time a state value changes, Jetpack Compose will automatically update the UI for you.
             * The value of the state can be of any type. Sometimes it can be as simple as a Boolean or a String. Other times the state can be a complex data class that contains values for the entire rendered screen.
             *
             * */
            Column(Modifier.fillMaxSize()) {
                val color= remember{
                    mutableStateOf(Color.Yellow)
                }
                ColorBox(
                    Modifier
                        .weight(1f)
                        .fillMaxSize()
                ){
//                    When Color Box is clicked that lambda function is called
//                    This will give new Color ;)
                    color.value=it
                }
                Box(
                    Modifier
                        .background(color.value)
                        .weight(1f)
                        .fillMaxSize())
            }

        }
    }
}


@Composable
fun ColorBox(modifier:Modifier=Modifier,updateColor:(Color)->Unit){

    Box(modifier= modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}
