package org.example.project.libA

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

@Composable
fun hello(any: String = "lib A") {
    BasicText("hello from $any")
}