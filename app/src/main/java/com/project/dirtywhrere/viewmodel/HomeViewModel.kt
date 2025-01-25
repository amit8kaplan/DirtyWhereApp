package com.project.dirtywhrere.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.project.dirtywhrere.classes.GateData

class HomeViewModel : ViewModel() {
    // List of box data (you can replace this with dynamic data later)
    var gatesData = mutableStateListOf(
        GateData().apply {
            name = "Gate 1"
            statusGate = true
            statusDirty = false
        },
        GateData().apply {
            name = "Gate 2"
            statusGate = false
            statusDirty = true
        },
        GateData().apply {
            name = "Gate 3"
            statusGate = true
            statusDirty = true
        },
        GateData().apply {
            name = "Gate 4"
            statusGate = false
            statusDirty = false
        }
    )
}
