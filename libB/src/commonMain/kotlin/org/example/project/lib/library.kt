package org.example.project.libB

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun foo(any: String = "lib B") {
    Text("foo from $any")
}