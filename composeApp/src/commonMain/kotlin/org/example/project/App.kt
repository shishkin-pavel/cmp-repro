package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.example.project.libA.hello
import org.example.project.libB.foo

@Composable
@Preview
fun App() {
    Column {
        Text("app")
        hello()
        foo()
    }
}