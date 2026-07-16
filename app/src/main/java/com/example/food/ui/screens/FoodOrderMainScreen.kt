package com.example.food.ui.screens

import com.example.food.ui.components.mainScreen.FoodPopResource
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food.ui.theme.BackgroundColor
import com.example.food.ui.components.mainScreen.BottomNavBar
import com.example.food.ui.components.mainScreen.CategoryLazyRow
import com.example.food.ui.components.mainScreen.FoodLazyResource
import com.example.food.ui.components.mainScreen.HomeTitle

@Composable
fun MainScreen() {
    Column(
        modifier= Modifier
            .fillMaxSize()
            .fillMaxWidth()
            //.padding(0.dp,60.dp,0.dp,0.dp)
            .background(color = BackgroundColor)
    ) {
        Spacer(modifier = Modifier.padding(20.dp))
        HomeTitle()
        Spacer(modifier = Modifier.padding(1.dp))
        FoodPopResource()
        Spacer(modifier = Modifier.padding(1.dp))
        Row (
            modifier = Modifier
        ){
            Text(
                text ="Categories",
                color = Color.White,
                fontSize = 15.sp, // Font size for titles
                modifier = Modifier.padding(top = 2.dp, start = 20.dp) // Add some space above the text
            )
        }
        CategoryLazyRow()
        Row (
            modifier = Modifier
        ){
            Text(
                text ="Popular products",
                color = Color.White,
                fontSize = 15.sp, // Font size for titles
                modifier = Modifier.padding(top = 2.dp, start = 20.dp) // Add some space above the text
            )
        }
        FoodLazyResource()
        Spacer(modifier = Modifier.padding(15.dp))
        BottomNavBar()
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}