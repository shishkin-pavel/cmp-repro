package org.example.project.libB

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

@Composable
fun foo(any: String = "lib B") {
    BasicText("foo from $any")
}