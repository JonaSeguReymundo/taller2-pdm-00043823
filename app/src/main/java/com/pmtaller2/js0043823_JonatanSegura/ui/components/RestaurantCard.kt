package com.pmtaller2.js0043823_JonatanSegura.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.ui.layout.ContentScale
import com.pmtaller2.js0043823_JonatanSegura.data.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Card(modifier = Modifier
        .padding(8.dp)
        .width(200.dp)
        .clickable(onClick = onClick)) {
        Column {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = null,
                modifier = Modifier.height(120.dp).fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(restaurant.name, modifier = Modifier.padding(8.dp))
        }
    }
}

