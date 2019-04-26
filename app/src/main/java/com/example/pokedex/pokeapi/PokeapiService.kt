package com.example.pokdex.pokeapi

import com.example.pokdex.models.PokemonResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//import jdk.nashorn.internal.runtime.PropertyDescriptor.GET

interface PokeapiService {

    @GET("pokemon")
    fun getListaPokemon(@Query("limit") limit: Int, @Query("offset") offset: Int): Call<PokemonResponse>
}