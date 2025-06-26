package org.example.project.lib

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun hello(any: String = "world") {
    Text("hello $any")
}