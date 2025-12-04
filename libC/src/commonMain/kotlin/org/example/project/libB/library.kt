package org.example.project.libC

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

@Composable
fun bar(any: String = "lib C") {
    BasicText("bar from $any")
}