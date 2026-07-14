package com.example.food.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Medium, // 500 for font-weight 500
        fontSize = 20.sp,               // Font size 20px
        lineHeight = 24.2.sp,           // Line height 24.2px
        letterSpacing = 0.sp,
        textAlign = TextAlign.Left
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Medium, // 500 for font-weight 500
        fontSize = 12.sp,               // Font size 12px
        lineHeight = 14.52.sp,          // Line height 14.52px
        letterSpacing = 0.sp,
        textAlign = TextAlign.Left
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Light,  // 300 for font-weight 300
        fontSize = 8.sp,                // Font size 8px
        lineHeight = 9.68.sp,           // Line height 9.68px
        letterSpacing = 0.sp,
        textAlign = TextAlign.Left
    )
)