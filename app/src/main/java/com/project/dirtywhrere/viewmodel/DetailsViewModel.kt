package com.project.dirtywhrere.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.project.dirtywhrere.classes.DetailsData
import java.util.Date

class DetailsViewModel : ViewModel() {
    private val _details = mutableStateListOf<DetailsData>()
    val details: List<DetailsData> = _details
    var detailsTemp = mutableStateListOf(
        DetailsData().apply {
            id = "1"
            gateId = "1"
            status = true
            description = "Gate 1 is clean"
            DateUpdate = Date(2020, 1, 1)

        },
        DetailsData().apply {
            id = "2"
            gateId = "2"
            status = false
            description = "Gate 2 is dirty"
            DateUpdate = Date(2020, 1, 1)
        }
    )
    init {
        _details.addAll(detailsTemp)
    }
}