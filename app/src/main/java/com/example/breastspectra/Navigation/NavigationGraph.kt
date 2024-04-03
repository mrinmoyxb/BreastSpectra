package com.example.breastspectra.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.breastspectra.View.HomeScreen.Screen.HomeScreen
import com.example.breastspectra.View.ResultScreen.ResultScreen
import com.example.breastspectra.ViewModel.BreastCancerViewModel

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    val viewModel: BreastCancerViewModel = viewModel()

    NavHost(navController = navController, startDestination = "homeScreen"){

        composable(route = "homeScreen"){
            HomeScreen(navController, viewModel)
        }
        composable(route = "resultScreen"){
            ResultScreen(viewModel)
        }
    }
}