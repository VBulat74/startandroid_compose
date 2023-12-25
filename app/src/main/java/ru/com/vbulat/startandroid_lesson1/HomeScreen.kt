package ru.com.vbulat.startandroid_lesson1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(){
    Text(
        text = "Home screen",
        fontSize = 32.sp,
        color = Color.Green
    )
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}