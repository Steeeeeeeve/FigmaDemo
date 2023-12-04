package com.example.figmacoopt

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmacoopt.custombutton.CustomButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
            ){
                button()
            }
        }
    }
}

@Preview
@Composable
fun button() {
    val currentContext = LocalContext.current
    CustomButton(
        text = "Log in",
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            val intent = Intent(currentContext, CustomCardScreen::class.java)
            currentContext.startActivity(intent)
        }
        ,
        icon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = null)
        })
}
