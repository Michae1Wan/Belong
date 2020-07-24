package com.michae1.codechallenge.data.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("camera") val camera: Camera,
    @SerializedName("earth_date") val earth_date: String,
    @SerializedName("id") val id: Int,
    @SerializedName("img_src") val img_src: String,
    @SerializedName("rover") val rover: Rover,
    @SerializedName("sol") val sol: Int
)