package org.example.project

//import androidx.compose.foundation.ExperimentalFoundationApi
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.onClick
//import androidx.compose.foundation.text.BasicText
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController

//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//actual fun baz() {
//    val (count, setCount) = remember { mutableStateOf(0) }
//    val navController = rememberNavController()
//    val clickToIncCountModifier = Modifier.onClick {
//        setCount(count + 1)
//    }
//
//    Column {
//        BasicText("Count outside: $count", clickToIncCountModifier)
//        NavHost(navController, "0") {
//            repeat(4) { i ->
//                composable(i.toString()) {
//                    Column {
//                        BasicText("Screen $i")
//                        BasicText("Count in `NavHost`: $count", clickToIncCountModifier)
//                    }
//                }
//            }
//        }
//    }
//}

