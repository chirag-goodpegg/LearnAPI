package com.example.learnnavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnnavigation.screens.ScreenA
import com.example.learnnavigation.screens.ScreenB

@Composable
fun Naigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SCREEN_A, builder = {
        composable(Routes.SCREEN_A) {
            ScreenA(navController)
        }
        composable(Routes.SCREEN_B+"/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(navController,name?:"no name")
        }
    })
}