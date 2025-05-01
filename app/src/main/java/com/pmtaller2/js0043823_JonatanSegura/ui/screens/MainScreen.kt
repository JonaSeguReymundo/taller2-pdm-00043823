package com.pmtaller2.js0043823_JonatanSegura.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pmtaller2.js0043823_JonatanSegura.ui.components.RestaurantCard
import com.pmtaller2.js0043823_JonatanSegura.viewmodel.MainViewModel

@Composable
fun MainScreen(navController: NavHostController, viewModel: MainViewModel) {
    val grouped = viewModel.restaurants.collectAsState().value.groupBy { it.category }

    Column(modifier = Modifier.padding(8.dp)) {
    Text("JS Shop", style = MaterialTheme.typography.titleLarge)
    Spacer(modifier = Modifier.padding(8.dp))

    LazyColumn {
        grouped.forEach { (category, list) ->
            item {
                Text(category, style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(8.dp))
                LazyRow {
                    items(list) { restaurant ->
                        RestaurantCard(restaurant) {
                            navController.navigate("menu/${restaurant.name}")
                        }
                    }
                }
            }
        }
    }}
}

