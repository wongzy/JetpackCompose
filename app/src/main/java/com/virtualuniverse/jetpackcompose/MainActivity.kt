package com.virtualuniverse.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
            Surface(color = MaterialTheme.colors.background) {
                Greeting()
            }
        }
    }
}

@Preview("test 1")
@Composable
fun Greeting() {
    Box(Modifier
        .size(300.dp)
        .clip(RoundedCornerShape(4.dp))
        .background(Color.LightGray)
        .clickable {
            println("click outer")
        }
        .padding(50.dp)
        .clip(RoundedCornerShape(4.dp))
        .background(Color.Green)
        .clickable {
            println("click inner")
        }
        .padding(30.dp)
        .clip(RoundedCornerShape(4.dp))
        .background(Color.Cyan)
        .clickable {
            println("click center")
        })
}

