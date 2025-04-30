package com.pmtaller2.js0043823_JonatanSegura.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pmtaller2.js0043823_JonatanSegura.viewmodel.MainViewModel

@Composable
fun SearchScreen(navController: NavHostController, viewModel: MainViewModel) {
    var query by remember { mutableStateOf("") }

    val restaurants = viewModel.restaurants.collectAsState().value
    val results = restaurants.filter { restaurant ->
        query.isNotBlank() && (
                restaurant.name.contains(query, ignoreCase = true) ||
                        restaurant.category.contains(query, ignoreCase = true) ||
                        restaurant.menu.any { dish -> dish.name.contains(query, ignoreCase = true) }
                )
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Pantalla de búsqueda", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))
        TextField(
            value = query,
            onValueChange = { query = it },
            placeholder = { Text("Buscar restaurante, platillo o categoría") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))
        LazyColumn {
            items(results) { restaurant ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                        .clickable {
                            navController.navigate("menu/${restaurant.name}")
                        }
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(restaurant.name, style = MaterialTheme.typography.titleMedium)
                        Text(restaurant.category, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}
