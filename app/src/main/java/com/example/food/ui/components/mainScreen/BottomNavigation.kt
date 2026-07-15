package com.example.food.ui.components.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.food.R
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.ui.draw.clip

@Composable
fun BottomNavBar() {
    val navItems = listOf(
        NavItem("Home", R.drawable.fluent_home_20_regular), // Replace with your actual drawable resource
        NavItem("Shop", R.drawable.mdi_light_cart),
        NavItem("Cart", R.drawable.prime_shop),
        NavItem("Profile", R.drawable.iconamoon_profile_thin)
    )

    BottomNavigation(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(15.dp)), // Set height for the navigation bar
        backgroundColor = Color(0xFF171717)
         // Background color of the navigation bar
    ) {
        navItems.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        modifier = Modifier
                            .height(24.dp)
                            .width(24.dp) ,
                        tint = Color.Red,
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = Color.Red,
                        fontSize = 10.sp, // Font size for titles
                        modifier = Modifier.padding(top = 4.dp) // Add some space above the text
                    )
                },
                selected = false, // You can manage selected state as needed
                onClick = {
                    // Handle click event
                },
                modifier = Modifier
                    .weight(1f) // Distribute space evenly
                    .padding(horizontal = 5.dp) // Add horizontal padding between items
            )
        }
    }
}

// Data class for navigation items
data class NavItem(val title: String, val icon: Int)

@Composable
fun HomeTitle(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically, // Center the items vertically
        horizontalArrangement = Arrangement.SpaceBetween // Space items evenly
    ) {
        // Centered Title
        Text(
            text = "Home",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Allow the text to take available space
            textAlign = TextAlign.Center // Center align the text
        )

        // Right-aligned Image
        Image(
            painter = painterResource(id = R.drawable.vector_bell), // Replace with your drawable resource
            contentDescription = "Icon",
            modifier = Modifier
                .size(24.dp) // Set size to 24x24
                .padding(end = 2.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}
@Preview(showBackground = true)
@Composable
fun HomeTitlePreview() {
    HomeTitle()
}