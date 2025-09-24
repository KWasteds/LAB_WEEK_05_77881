package com.example.lab_week_05_77881.model

import com.squareup.moshi.Json

data class ImageData(
    @field:Json(name = "url") val imageUrl: String,
    val breeds: List<CatBreedData>
)