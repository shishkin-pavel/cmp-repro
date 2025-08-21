package org.example.project.libA

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun hello(any: String = "lib A") {
    Text("hello from $any")
}