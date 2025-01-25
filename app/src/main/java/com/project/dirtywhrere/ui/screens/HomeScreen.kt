package com.project.dirtywhrere.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.project.dirtywhrere.ui.components.MainHomeScreen
import com.project.dirtywhrere.ui.components.TopBar
import com.project.dirtywhrere.viewmodel.HomeViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
    Scaffold ( topBar ={
        TopBar(
            title = "Dirty Where"
        )
    })
    {innerPadding ->
        MainHomeScreen(
            boxTitles = viewModel.boxTitles,
            modifier = Modifier.padding(innerPadding)
        )

    }
}