package com.lonard.capstoneprojectapptest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lonard.capstoneprojectapptest.ui.theme.CapstoneProjectAppTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CapstoneProjectAppTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    Greeting("Hello world!")
                    Greeting("Hello world ! This is an app for capstone!")
                    Greeting("Hello Kak")
                    Greeting("Hello Kak!!!")

                    TitleName("My Capstone Project")
                    SubTitleName("doing everything better ehe.")

                    Greeting("Dimas")

                    TitleName("Here is my work, guys!")
                    SubTitleName("getting myself graduate.")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TitleName(appTitle: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to $appTitle.",
        modifier = modifier
    )
}

@Composable
fun SubTitleName(thing: String, modifier: Modifier = Modifier) {
    Text(
        text = "An Android app for $thing",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CapstoneProjectAppTestTheme {
        Greeting("Android")
    }
}


//Halo saya Lonard
//Tes222