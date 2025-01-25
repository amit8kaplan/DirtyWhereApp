package com.project.dirtywhrere.classes

import java.util.Date

class GateData {
    var name: String? = null
    var statusGate: Boolean? = null
    var statusDirty: Boolean? = null
    var lastUpdated: Date? = null
}

fun gates(): List<GateData> {
    return listOf(
        GateData().apply {
            name = "Gate 1"
            statusGate = true
            statusDirty = false
            lastUpdated = Date()
        },
        GateData().apply {
            name = "Gate 2"
            statusGate = false
            statusDirty = true
            lastUpdated = Date()
        },
        GateData().apply {
            name = "Gate 3"
            statusGate = true
            statusDirty = true
            lastUpdated = Date()
        },
        GateData().apply {
            name = "Gate 4"
            statusGate = false
            statusDirty = false
            lastUpdated = Date()
        }
    )
}