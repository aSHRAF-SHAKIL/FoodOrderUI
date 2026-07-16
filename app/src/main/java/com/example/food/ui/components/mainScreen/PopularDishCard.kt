package com.example.food.ui.components.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.tooling.preview.Preview
import com.example.food.R

@Composable
fun FoodPopResource() {
    // Sample list of drawable resource IDs
    val imageList = listOf(
        R.drawable.rectangle1, // Replace with your actual drawable resource names
        R.drawable.rectangle1,
        R.drawable.rectangle1,
        R.drawable.rectangle1, // Replace with your actual drawable resource names
        R.drawable.rectangle1,
        R.drawable.rectangle1,
        R.drawable.rectangle1, // Replace with your actual drawable resource names
        R.drawable.rectangle1,
        R.drawable.rectangle1
        // Add more drawable resource IDs as needed
    )

    Column {
        HorizontalImageLazyRow(imageList = imageList)
    }
}

@Composable
fun HorizontalImageLazyRow(imageList: List<Int>) { // Now it takes a list of resource IDs
    LazyRow(
        modifier = Modifier.padding(5.dp), // Adjust padding as needed
    ) {
        items(imageList) { imageRes ->
            Box(
                modifier = Modifier
                    .width(380.dp) // Set width to 380 pixels
                    .height(220.dp) // Set height to 220 pixels
                    .padding(5.dp) // Optional padding around each image
            ) {
                Image(
                    painter = painterResource(id = imageRes), // Load image from resources
                    contentDescription = null,
                    modifier = Modifier.size(380.dp, 220.dp) // Ensure image size is correct
                )
            }
        }
    }
}

@Preview
@Composable
private fun HorizontalImageLazyRowPreview() {
    FoodPopResource()
}