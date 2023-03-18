package com.aurosaswat.rowsandcolumns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aurosaswat.rowsandcolumns.ui.theme.RowsAndColumnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Row {
//               Text(text = "Row 1") 
//            }
            /**
             * For Column Main Axis is towards Column
             * For Column Cross Axis is towards Row
             * For Row Main Axis is towards Row
             * For Row Cross Axis is towards Column
             * */
//            Column{
//              HorizontalAlignment-> set Children horizontally in the Main Axis
////            VerticalArrangement-> Arranges Item in Main Axis i.e in vertical Direction (set the children along the vertical axis)
//            }


//
//            Column(modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
//            ) {
//                Text(text = "Hello")
//                Text(text = "World")
//                Text(text = "Another Hello")
//            }


            /**
            * Modifier can be applied to any composible ;)
            * */

//            Row{
//            HorizontalArrangement-> set Children horizontally in the Main Axis i.e (set the children in Horizontal Direction)
//            VerticalAlignment-> set the Children Vertically in the Main Axis i.e (set ther children in Vertical Direction)
//            }
            Row(modifier = Modifier.width(300.dp)
//                .height(300.dp)
                .fillMaxHeight(0.7f)
                .background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
                                Text(text = "Bye")
                Text(text = "World")
                Text(text = "Another Hello")
            }

//            Row{
//                Column {
//                    Text(text = "Column 1")
//                    Text(text = "Column 1")
//                }
//                Column {
//                    Text(text = "Column 2")
//                    Text(text = "Column 2")
//                }
//            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

