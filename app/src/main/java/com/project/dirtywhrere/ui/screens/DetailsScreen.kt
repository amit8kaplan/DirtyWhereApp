package com.project.dirtywhrere.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.project.dirtywhrere.ui.components.MainDetailsScreen
import com.project.dirtywhrere.ui.components.TopBar
import com.project.dirtywhrere.viewmodel.DetailsViewModel
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun DetailsScreen(id: String?, viewModel: DetailsViewModel = viewModel()) {
    // Fetch and observe the dynamic list
    Scaffold (
        topBar = {
            TopBar(
                title = "Details for Gate: $id"
            )
        }
    ) { paddingValues -> MainDetailsScreen(details = viewModel.details, paddingValues = paddingValues) }  }