package com.example.pertemuan9.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
// Pastikan import HalamanHome dan HalamanEntry benar
import com.example.pertemuan9.view.HomeScreen
import com.example.pertemuan9.view.EntrySiswaScreen
// Pastikan import Destinasi benar
import com.example.pertemuan9.view.route.DestinasiEntry
import com.example.pertemuan9.view.route.DestinasiHome

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}