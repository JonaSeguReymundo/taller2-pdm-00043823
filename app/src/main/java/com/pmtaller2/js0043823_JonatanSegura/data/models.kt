package com.pmtaller2.js0043823_JonatanSegura.data

data class Dish(
    val name: String,
    val description: String,
    val imageUrl: String
)

data class Restaurant(
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val menu: List<Dish>
)