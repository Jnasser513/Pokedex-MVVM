package com.nasser.pokedex.data.services

import com.nasser.pokedex.data.model.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getPokemonList(@Url url: String): Response<PokemonResponse>
}