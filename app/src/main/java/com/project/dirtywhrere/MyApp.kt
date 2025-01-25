package com.project.dirtywhrere

import android.util.Log
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.dirtywhrere.ui.screens.AddScreen
import com.project.dirtywhrere.ui.screens.DetailsScreen
import com.project.dirtywhrere.ui.screens.HomeScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") {
            Log.d("NavLog", "HomeScreen called")
            HomeScreen(navController)
        }
        composable("add/{id}") {backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")
            Log.d("NavLog", "AddScreen called")
            AddScreen(id = id)


        }
        composable("details/{id}") {backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")
            Log.d("NavLog", "DetailsScreen called: $id")
            DetailsScreen(id = id)
        }
    }
}
