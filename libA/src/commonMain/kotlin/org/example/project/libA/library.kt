package org.example.project.libA

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import org.example.project.libB.foo

@Composable
fun hello(any: String = "lib A") {
    BasicText("hello from $any")
    foo("lib A")
}