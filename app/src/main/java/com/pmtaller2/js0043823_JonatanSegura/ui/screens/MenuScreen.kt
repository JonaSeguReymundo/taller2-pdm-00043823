package com.pmtaller2.js0043823_JonatanSegura.ui.screens


import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pmtaller2.js0043823_JonatanSegura.data.Restaurant
import com.pmtaller2.js0043823_JonatanSegura.ui.components.DishCard
import com.pmtaller2.js0043823_JonatanSegura.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurant: Restaurant, navController: NavHostController, viewModel: MainViewModel) {
    var search by remember { mutableStateOf("") }
    val context = LocalContext.current
    val filteredMenu = restaurant.menu.filter {
        it.name.contains(search, true)
    }

    Column {
        TopAppBar(
            title = { Text(restaurant.name) },
            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = null)
                }
            }
        )
        Text(restaurant.description, Modifier.padding(8.dp))
        TextField(
            value = search,
            onValueChange = { search = it },
            placeholder = { Text("Buscar platillo") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        LazyColumn {
            items(filteredMenu) { dish ->
                DishCard(dish) {
                    viewModel.addToCart(dish)
                    Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
