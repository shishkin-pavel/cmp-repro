package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.example.project.lib.hello

@Composable
@Preview
fun App() {
    Column {
        Text("asdf")
        hello()
    }
}