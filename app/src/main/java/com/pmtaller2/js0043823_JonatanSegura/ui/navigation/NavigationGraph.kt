package com.pmtaller2.js0043823_JonatanSegura.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.pmtaller2.js0043823_JonatanSegura.ui.screens.*
import com.pmtaller2.js0043823_JonatanSegura.viewmodel.MainViewModel

@Composable
fun NavigationGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val viewModel: MainViewModel = viewModel()

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController, currentRoute = currentRoute)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Restaurants.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Restaurants.route) {
                MainScreen(navController, viewModel)
            }
            composable(BottomNavItem.Search.route) {
                SearchScreen(navController, viewModel)
            }
            composable(BottomNavItem.Orders.route) {
                OrdersScreen()
            }
            composable(
                route = "menu/{restaurantName}",
                arguments = listOf(navArgument("restaurantName") { type = NavType.StringType })
            ) { backStackEntry ->
                val restaurantName = backStackEntry.arguments?.getString("restaurantName")
                val restaurants = viewModel.restaurants.collectAsState().value
                val restaurant = restaurants.find { it.name == restaurantName }
                if (restaurant != null) {
                    MenuScreen(restaurant, navController)
                }
            }
        }
    }
}