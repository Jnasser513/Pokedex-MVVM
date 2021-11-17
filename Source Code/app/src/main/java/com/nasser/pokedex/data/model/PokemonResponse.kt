package com.nasser.pokedex.data.model

import androidx.room.Embedded

data class PokemonResponse(
    var name: String,
    @Embedded
    var url: Pokemon
)

data class Pokemon(
    var id: Long,
    var name: String,
    @Embedded
    var types: PokemonType
)

data class PokemonType(
    var slot: Int,
    @Embedded
    var type: PokemonResponse
)
