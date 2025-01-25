package com.project.dirtywhrere.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    // List of box data (you can replace this with dynamic data later)
    val boxTitles = mutableStateListOf("Box 1", "Box 2", "Box 3", "Box 4")
}
