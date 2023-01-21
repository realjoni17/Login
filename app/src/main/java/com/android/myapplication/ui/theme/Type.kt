package com.android.myapplication.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
   h1 = TextStyle(
       fontSize = 28.sp,
       letterSpacing = 1.15.sp,
   ),
    h2 = TextStyle(
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        ),
    h3 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
    ),
    body1 = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        letterSpacing = 1.15.sp,

    )
)