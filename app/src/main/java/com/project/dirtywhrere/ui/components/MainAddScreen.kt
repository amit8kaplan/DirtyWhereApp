package com.project.dirtywhrere.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.dirtywhrere.viewmodel.AddViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAddScreen(viewModel: AddViewModel, paddingValues: PaddingValues) {
    val add = viewModel.addData

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)) // Light gray background
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(12.dp))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Title
            Text(
                text = "Add Gate Details",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )

            // Switch for Clean/Dirty
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Status:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.weight(1f),
                    color = Color(0xFF666666)
                )
                Switch(
                    checked = add.isClean,
                    onCheckedChange = { viewModel.updateCleanStatus(it) },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.Green,
                        uncheckedThumbColor = Color.Red,
                        checkedTrackColor = Color.Green.copy(alpha = 0.3f),
                        uncheckedTrackColor = Color.Red.copy(alpha = 0.3f)
                    )
                )
                Text(
                    text = if (add.isClean) "Clean" else "Dirty",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (add.isClean) Color.Green else Color.Red
                )
            }

            // Description Text Field
            TextField(
                value = add.description,
                onValueChange = { viewModel.updateDescription(it) },
                label = { Text("Description") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFF0F0F0),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                singleLine = true
            )
        }

        // Submit Button
        Button(
            onClick = { viewModel.submitReport() },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(4.dp),
            colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6200EE),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(28.dp)
        ) {
        Text(
            text = "Submit Report",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
    }
}
