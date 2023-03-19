package com.aurosaswat.stylingtext


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Add All of your Fonts and give them a weight ;)
        val fontFamily= FontFamily(
            Font(R.font.rubiklso, FontWeight.Thin)
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))){
                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green
                            , fontSize = 50.sp
                        )
                    ){
                        append("J")
                    }
                    append("etpack ")

                    withStyle(
                            style = SpanStyle(
                                color = Color.Green
                                , fontSize = 50.sp
                            )
                        ){
                            append("C")
                        }
                    append("ompose")

                }
                , color = androidx.compose.ui.graphics.Color.White
                , fontSize = 30.sp
                , fontFamily = fontFamily
                , fontWeight = FontWeight.Bold
                , fontStyle = FontStyle.Italic
                , textAlign = TextAlign.Center
                , textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}
