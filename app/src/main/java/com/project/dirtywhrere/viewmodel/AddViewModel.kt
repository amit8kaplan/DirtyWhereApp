package com.project.dirtywhrere.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.project.dirtywhrere.classes.AddData

class AddViewModel : ViewModel() {
    private val _addData = mutableStateOf(AddData())
    var addData: AddData by mutableStateOf(_addData.value)

    // Function to update the "isClean" state
    fun updateCleanStatus(isClean: Boolean) {
        addData = addData.copy(isClean = isClean)
    }

    // Function to update the description
    fun updateDescription(description: String) {
        addData = addData.copy(description = description)
    }

    // Function to "report" the form (handle submission logic here)
    fun submitReport() {
        // Example logic: Print to logs or handle backend call
        println("Report submitted: $addData")
    }
}
