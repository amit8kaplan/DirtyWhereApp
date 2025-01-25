package com.project.dirtywhrere.ui.components


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.dirtywhrere.classes.GateData
import com.project.dirtywhrere.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainHomeScreen(
    gatesData: List<GateData>,
    modifier: Modifier = Modifier,
    onBoxClick: (Int) -> Unit,
    onAddBtnClick: (Int) -> Unit) {
    var index = 0;
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
                        Box (
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    if (gatesData[index].statusDirty == true)
                                        Color(0xFF83E26E)
                                    else if (gatesData[index].statusDirty == false)
                                        Color(0xFFE26E6F)
                                    else
                                        Color(0xFFCECECE)
                                )
                                .clickable(onClick = {
                                    onBoxClick(index)
                                }),
                        ){
                            Image(
                                painter = painterResource(
                                    id = if (gatesData[index].statusDirty == true) R.drawable.green_light else R.drawable.policeman
                                ),
                                contentDescription = "none",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Fit
                            )
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.TopEnd) // Place in top-right corner
                                .padding(8.dp)
                                .size(40.dp) // Button size
                                .background(Color.White, RoundedCornerShape(50)) // Circular button
                                .clickable { onAddBtnClick(index) }, // Button click
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add",
                                tint = Color.Black
                            )
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter) // Place at the bottom
                                .fillMaxWidth()
                                .background(Color(0xCC000000)) // Semi-transparent background
                                .padding(4.dp)
                                .clickable { onBoxClick(index) } // Same click as photo
                        ) {
                            Text(
                                text = "the Info is Brand New!", // Example data
                                color = Color.White,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                    index++
                }
            }
        }
    }
}
