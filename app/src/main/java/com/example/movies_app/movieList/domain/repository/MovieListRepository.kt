package com.example.movies_app.movieList.domain.repository

import com.example.movies_app.movieList.domain.model.Movie
import com.example.movies_app.movieList.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFromRemote: Boolean,
        category: String,
        page: Int
    ) : Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int) : Flow<Resource<Movie>>
}