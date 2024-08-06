package com.tinellus.myrecipeapp

sealed class Screen(val route:String) {
    object RecipeScreen:Screen(route = "recipescreen")
    object DetailsScreen:Screen(route = "detailsscreen")
}