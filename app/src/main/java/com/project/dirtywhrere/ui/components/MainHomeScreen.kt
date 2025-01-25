package com.project.dirtywhrere.ui.components


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainHomeScreen(boxTitles: List<String>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier // Apply the passed modifier to respect Scaffold padding
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(4.dp)
    ) {
        repeat(2) { row ->
            Row(
                modifier = Modifier
                    .weight(1f) // Divide the space evenly among rows
                    .padding(4.dp)
            ) {
                repeat(2) { column ->
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f) // Divide the space evenly among boxes
                            .fillMaxHeight()
                            .border(1.dp, Color.Black)
                            .background(
                                color = Color(0xFFBB86FC),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = row.toString() + column.toString(),
                            color = Color.White,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
