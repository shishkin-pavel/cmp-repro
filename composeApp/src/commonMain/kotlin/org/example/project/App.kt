package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

import org.example.project.libA.hello

@Composable
fun App() {
    Column {
        BasicText("app")
        hello()
    }
}
