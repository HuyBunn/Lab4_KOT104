package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                MyApp()
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        Button(onClick = {
            navController.navigate("screen1")
        }) {
            Text("Bài 1")
        }
        Button(onClick = {
            navController.navigate("screen2")
        }) {
            Text("Bài 2")
        }
        Button(onClick = {
            navController.navigate("screen3")
        }) {
            Text("Bài 3")
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home_screen") {
        composable("home_screen") {
            HomeScreen(navController)
        }
        composable("screen1") {
            Bai1()
        }
        composable("screen2") {
            Bai2()
        }
        composable("screen3") {
            Bai3()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab4Theme {
        MyApp()
    }
}
