package com.example.section_15.model

import androidx.annotation.DrawableRes

data class Superhero(
    var superheroName: String,
    var realName: String,
    @DrawableRes var photo: Int
)
