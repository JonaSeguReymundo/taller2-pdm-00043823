package com.pmtaller2.js0043823_JonatanSegura.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pmtaller2.js0043823_JonatanSegura.ui.components.CartItemCard
import com.pmtaller2.js0043823_JonatanSegura.viewmodel.MainViewModel

@Composable
fun OrdersScreen(viewModel: MainViewModel) {
    val cartItems = viewModel.cart.collectAsState().value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Tu carrito", style = MaterialTheme.typography.titleLarge)

        if (cartItems.isEmpty()) {
            Text("No hay platillos en tu carrito.", modifier = Modifier.padding(top = 16.dp))
        } else {
            LazyColumn {
                items(cartItems) { dish ->
                    CartItemCard(dish)
                }
            }
        }
    }
}
