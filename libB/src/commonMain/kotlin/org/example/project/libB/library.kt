package org.example.project.libB

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

@Composable
fun foo(from: String = "from libB") {
    BasicText("libB.foo $from")
}