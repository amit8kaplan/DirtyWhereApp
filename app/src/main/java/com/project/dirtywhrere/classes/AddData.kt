package com.project.dirtywhrere.classes

import java.util.Date

data class AddData(
    var isClean: Boolean = false, // Clean or dirty
    var description: String = "", // Description provided by the user
    var date: Date = Date() // Date of the report
)
