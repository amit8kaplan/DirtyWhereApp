package com.project.dirtywhrere.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.project.dirtywhrere.ui.components.MainHomeScreen
import com.project.dirtywhrere.ui.components.TopBar
import com.project.dirtywhrere.viewmodel.HomeViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = viewModel()) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Dirty Where"
            )
        }
    ) { innerPadding ->
        MainHomeScreen(
            gatesData = viewModel.gatesDatatemp,
            modifier = Modifier
                .padding(innerPadding) // Apply the inner padding to avoid overlap
                .padding(8.dp),
            onBoxClick = {
                val id = it
                Log.d("NavLog", "Box clicked to details: $id")
                navController.navigate("details/$id")
            },
            onAddBtnClick = {
                val id = it
                Log.d("NavLog", "Add button clicked" + it)
                navController.navigate("add/${id}")
            }
        )
    }
}
