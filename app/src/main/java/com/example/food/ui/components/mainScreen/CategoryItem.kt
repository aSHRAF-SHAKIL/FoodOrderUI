package com.example.food.ui.components.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.food.ui.theme.SecondCardBack

@Composable
fun CategoryItem(categoryName: String, imageRes: Int, itemTitle: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
            .size(130.dp,155.dp)
    ) {
        // Image with padding, background color, and border-radius
        Box(
            modifier = Modifier
                .size(120.dp) // Image size
                .padding(top = 1.dp, bottom = 5.dp) // Top and bottom padding
                .clip(RoundedCornerShape(15.dp)) // Border radius: 15px 0px 0px 0px
                .background(color= SecondCardBack) // SecondCardBack color
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )


        }
            // Bottom title (e.g. "Pasta")
        Text(
                text = itemTitle,
        color = Color.Red,
        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp),
        modifier = Modifier
            .size(100.dp,20.dp)
        )



    }
}

@Composable
fun HorizontalCategoryLazyRow(imageList: List<Int>) {
    LazyRow(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(imageList) { imageRes ->
            CategoryItem(
                categoryName = "Categories",  // Static title for now, can be dynamic
                imageRes = imageRes,  // Image from the list
                itemTitle = "Pasta"  // Static item title for now, can be dynamic
            )
        }
    }
}

@Composable
fun CategoryLazyRow() {
    // Sample list of drawable resource IDs
    val imageList = listOf(
        R.drawable.image1_nuts, // Replace with your actual drawable resource names
        R.drawable.image2_spices,
        R.drawable.image_seeds,
        R.drawable.image1_nuts,
        R.drawable.image2_spices,
        R.drawable.image_seeds,
        // Add more drawable resource IDs as needed
    )

    HorizontalCategoryLazyRow(imageList = imageList)
}

@Preview(showBackground = true)
@Composable
fun PreviewHorizontalCategoryLazyRow() {
    // Sample list of drawable resource IDs
    val imageList = listOf(
        R.drawable.image1_nuts, // Replace with your actual drawable resource names
        R.drawable.image2_spices,
        R.drawable.image_seeds,
        R.drawable.image1_nuts,
        R.drawable.image2_spices,
        R.drawable.image_seeds,
        // Add more drawable resource IDs as needed
    )

    HorizontalCategoryLazyRow(imageList = imageList)
}
