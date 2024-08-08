package com.example.calculator_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.widget.Toolbar
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newandroid.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("calculator")
        val toolbar = findViewById<Toolbar>(R.id.xml_toolbar)


        actionBar
        enableEdgeToEdge()

//        setContent {
//            calculator_ui {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//setContentView(R.layout.activity_main)
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Calculator_UITheme {
//        Greeting("Android")
//    }
//}
