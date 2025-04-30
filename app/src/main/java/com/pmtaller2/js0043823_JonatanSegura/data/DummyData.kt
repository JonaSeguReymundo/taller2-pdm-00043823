package com.pmtaller2.js0043823_JonatanSegura.data

import com.pmtaller2.js0043823_JonatanSegura.data.Dish
import com.pmtaller2.js0043823_JonatanSegura.data.Restaurant

object DummyData {
    val restaurants = listOf(
        Restaurant(
            name = "Taco Loco",
            description = "Deliciosa comida mexicana",
            imageUrl = "https://example.com/taco.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco al Pastor", "Tacos con piña", "https://example.com/taco1.jpg"),
                Dish("Quesadilla", "Queso derretido", "https://example.com/quesadilla.jpg")
            )
        ),
        Restaurant(
            name = "Pizza Plus",
            description = "Auténtica pizza italiana",
            imageUrl = "https://example.com/pizza.jpg",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Pizza Margarita", "Tomate y albahaca", "https://example.com/margarita.jpg"),
                Dish("Pepperoni", "Con pepperoni clásico", "https://example.com/pepperoni.jpg")
            )
        ),
        Restaurant(
            name = "Wendolin's",
            description = "Las mejores hamburgesas americanas",
            imageUrl = "https://example.com/hamburguesa.jpg",
            category = "Comida Rapida",
            menu = listOf(
                Dish("Baconator", "Bacon", "")
            )
        )
        // Agrega más restaurantes
    )
}
