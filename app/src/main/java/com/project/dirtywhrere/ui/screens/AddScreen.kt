package com.project.dirtywhrere.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.project.dirtywhrere.ui.components.MainAddScreen
import com.project.dirtywhrere.ui.components.MainDetailsScreen
import com.project.dirtywhrere.ui.components.TopBar
import com.project.dirtywhrere.viewmodel.AddViewModel

@Composable
fun AddScreen(id: String?, viewModel: AddViewModel = viewModel()) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Add Report for Gate: $id"
            )
        }
    ) { paddingValues ->
        MainAddScreen(viewModel = viewModel, paddingValues = paddingValues)
    }
}

