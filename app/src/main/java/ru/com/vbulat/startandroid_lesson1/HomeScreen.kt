package ru.com.vbulat.startandroid_lesson1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Row(verticalAlignment = CenterVertically) {
        Box {
            Text("N", fontSize = 48.sp)
            Text("ame", modifier = Modifier.align(BottomCenter))
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text("Title")
            Text("Description")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}