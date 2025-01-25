package com.project.dirtywhrere.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.project.dirtywhrere.classes.DetailsData

@Composable
fun MainDetailsScreen(
    details: List<DetailsData>, // List of data to display
    paddingValues: PaddingValues // Padding values for the screen
) {
    Column(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(details) { detail -> // Correct usage of `items`
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(48.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Display Clean/Dirty status (Left)
                    Text(
                        text = if (detail.status == true) "Clean" else "Dirty",
                        modifier = Modifier.weight(1f)
                    )

                    // Display Description (Center)
                    Text(
                        text = detail.description?:"",
                        modifier = Modifier.weight(2f)
                    )

                    // Display Date (Right)
                    Text(
                        text = (detail.DateUpdate.toString()),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}
