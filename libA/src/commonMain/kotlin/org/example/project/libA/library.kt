package org.example.project.libA

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import org.example.project.libB.foo

@Composable
fun hello(from: String = "from lib A") {
    BasicText("libA.hello from $from")
    foo("lib A")
}