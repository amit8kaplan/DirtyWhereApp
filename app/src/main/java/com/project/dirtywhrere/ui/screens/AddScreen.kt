package com.project.dirtywhrere.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AddScreen(id: String?) {

    Box {
        Text("Add Screen for gate with id: $id")
    }
}