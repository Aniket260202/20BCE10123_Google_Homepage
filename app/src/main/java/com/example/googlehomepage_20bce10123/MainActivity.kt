package com.example.googlehomepage_20bce10123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.googlehomepage_20bce10123.ui.theme.GoogleHomePage20BCE10123Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)) {
                Image(painterResource(id = R.drawable.img),
                    contentDescription = " ")
                Text(text = "Hello! How can I help you?", fontSize =
                20.sp, color = Color.Black)
                var text by remember {
                    mutableStateOf("Search")
                }
                Text(text = "", fontSize = 20.sp)
                TextField(
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    }
                )
                Row() {
                    Text(text = "News ")
                }
            }
        }
    }
}
