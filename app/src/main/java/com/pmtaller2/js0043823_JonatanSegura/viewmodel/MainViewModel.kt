package com.pmtaller2.js0043823_JonatanSegura.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmtaller2.js0043823_JonatanSegura.data.Dish
import com.pmtaller2.js0043823_JonatanSegura.data.DummyData
import com.pmtaller2.js0043823_JonatanSegura.data.Restaurant
import kotlinx.coroutines.flow.*

class MainViewModel : ViewModel() {
    private val _restaurants = MutableStateFlow(DummyData.restaurants)
    val restaurants: StateFlow<List<Restaurant>> = _restaurants

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun getFilteredRestaurants(): StateFlow<List<Restaurant>> =
        combine(_restaurants, _searchQuery) { restaurants, query ->
            if (query.isBlank()) restaurants
            else {
                restaurants.filter {
                    it.name.contains(query, true) ||
                            it.category.contains(query, true) ||
                            it.menu.any { dish -> dish.name.contains(query, true) }
                }
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())


    private val _cart = MutableStateFlow<List<Dish>>(emptyList())
    val cart: StateFlow<List<Dish>> = _cart

    fun addToCart(dish: Dish) {
        _cart.value = _cart.value + dish
    }
}