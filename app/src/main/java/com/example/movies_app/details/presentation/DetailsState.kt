package com.example.movies_app.details.presentation

import com.example.movies_app.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
