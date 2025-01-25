package com.project.dirtywhrere.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


//TODO: add an option to go back to the home screen, depending on the screen
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String) {
    TopAppBar(
        title = {
            Text(text = title, color = Color.White)
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF6200EE))
    )
}
