package org.example.project.libB

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

import org.example.project.libC.bar

@Composable
fun foo(any: String = "lib B") {
    BasicText("foo from $any")
    bar("called from libB")
}