package com.example.dummyandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dummyandroidapp.ui.theme.DummyAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DummyAndroidAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Adding Surface -- Just like a container or a box -- Inorder to add background color to it
    // option + return -> Surround with widget -> Surround with row -> Change Box to Surface ()
    Surface (color = Color.Cyan) {
        // The above argument sets the background color of the Surface to cyan.
        Text(
            text = "Hello $name!",
            // Adding padding to the greeting container
            modifier = modifier.padding(50.dp)
        )
    }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DummyAndroidAppTheme {
        Greeting("Android")
    }
}