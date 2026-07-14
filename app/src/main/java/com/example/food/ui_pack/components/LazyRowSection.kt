package com.example.food.ui_pack.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.example.food.R
import com.example.food.ui.theme.ThirdCardSecond
import com.example.food.ui.theme.thirdCardFirst

@Composable
fun CustomLazyCard(imageList: List<Int>, firstImageIndex: Int) {
    // Main card background with rounded corners
    Box(
        modifier = Modifier
            .width(130.dp) // Width: 130px
            .height(180.dp) // Height: 200px
            //.clip(RoundedCornerShape(15.dp,15.dp,15.dp,15.dp)) // Border-radius: 15px 0px 0px 0px
            .background(color = ThirdCardSecond) // Background color for the card
            .padding(0.dp)
    ) {
        // First image from the provided list of drawable IDs (120x120 on top of the card)
            Box(modifier = Modifier.background(color = ThirdCardSecond)
            ) {
                Image(
                    painter = painterResource(id = imageList[firstImageIndex]),  // Set the image from the list
                    contentDescription = "Main Image",  // Description for accessibility
                    contentScale = ContentScale.Crop,  // Crop the image to fill the container
                    modifier = Modifier
                        .size(120.dp)   // Set the size of the image
                        .clip(RoundedCornerShape(15.dp))  // Clip to rounded corners with a 15.dp radius
                        .background(color = thirdCardFirst)  // Set background color inside the clipped bounds
                        .padding(8.dp,8.dp,0.dp,0.dp)  // Add padding around the image
                        .align(Alignment.TopCenter)  // Align the image to the top center
                )

            }
        // Second image from drawable (20x20 small image positioned at top: 130px, left: 105px)
        Image(
            painter = painterResource(id = R.drawable.add_cart), // Small image from drawable
            contentDescription = "Small Image",
            modifier = Modifier
                .size(20.dp) // Width & Height: 20x20px
                .offset(x = 85.dp, y = 130.dp) ,// Positioned using offset
            contentScale = ContentScale.Crop
        )

        // Text positioned at (top: 132px, left: 5px)
        Text(
            text = "Sample Text",
            fontSize = 12.sp, // Adjust text size
            color = Color.Black, // Text color
            modifier = Modifier
                .width(27.dp) // Width: 27px
                .height(15.dp) // Height: 15px
                .offset(x = 5.dp, y = 132.dp) // Positioned using offset
        )

        // Third image from drawable (12x12 image positioned at top: 134px, left: 36px)
        Image(
            painter = painterResource(id = R.drawable.star_icon), // Third image from drawable
            contentDescription = "Other Image",
            modifier = Modifier
                .size(12.dp) // Width & Height: 12x12px
                .offset(x = 36.dp, y = 134.dp) // Positioned using offset
        )

        // New element: (Width: 24px, Height: 10px, top: 150px, left: 5px)
        Box(
            modifier = Modifier
                .size(width = 24.dp, height = 10.dp) // Width & Height: 24x10px
                .offset(x = 5.dp, y = 150.dp) // Positioned using offset
        )
    }
}

@Composable
fun LazyCardList3(imageList: List<Int>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(imageList.size) { index ->
            CustomLazyCard(imageList = imageList, firstImageIndex = index)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

@Composable
fun FoodLazyResource() {
    // Sample list of drawable resource IDs
    val imageList = listOf(
        R.drawable.image1_nuts, // Replace with your actual drawable resource names
        R.drawable.image1_nuts,
        R.drawable.image1_nuts,
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts,
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts,
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts
    )

    Column {
        LazyCardList3(imageList = imageList)
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewLazyCardList3() {
    // Sample list of drawable resource IDs for preview purposes
    val sampleImageList = listOf(
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts,
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts,
        R.drawable.image1_nuts, // Replace with actual drawable resources in your project
        R.drawable.image1_nuts,
        R.drawable.image1_nuts
    )

    // Preview of the lazy column with multiple custom lazy cards
    LazyCardList3(imageList = sampleImageList)
}