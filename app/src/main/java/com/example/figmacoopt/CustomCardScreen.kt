package com.example.figmacoopt

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmacoopt.customcard.CustomCard
import com.example.figmacoopt.ui.theme.FigmaCoOptTheme


class CustomCardScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaCoOptTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    customCard()
                }
            }
        }
    }
}

@Preview
@Composable
fun customCard() {
    val context = LocalContext.current
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        CustomCard(
            text = "Click Me",
            onClick = {
                val message = "You made it to the final boss, Congrats you beat the demo!"
                Toast.makeText(context, message, Toast.LENGTH_LONG).show()
            }
        )
    }
}
