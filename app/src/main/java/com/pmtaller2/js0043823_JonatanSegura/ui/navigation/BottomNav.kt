package com.pmtaller2.js0043823_JonatanSegura.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

sealed class BottomNavItem(val route: String, val label: String, val icon: ImageVector) {
    object Restaurants : BottomNavItem("main", "Inicio", Icons.Filled.Home)
    object Search : BottomNavItem("search", "Buscar", Icons.Filled.Search)
    object Orders : BottomNavItem("orders", "Pedidos", Icons.Filled.List)
}

@Composable
fun BottomNavBar(navController: NavHostController, currentRoute: String?) {
    val items = listOf(
        BottomNavItem.Restaurants,
        BottomNavItem.Search,
        BottomNavItem.Orders
    )

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = { navController.navigate(item.route) },
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) }
            )
        }
    }
}