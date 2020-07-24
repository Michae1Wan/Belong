package com.michae1.codechallenge.data.model

import com.google.gson.annotations.SerializedName


/**
 *
 * Created by Michae1 (michae1wan@live.com) on 7/24/2020.
 */
data class Photos (
    @SerializedName("photos") val photos: List<Photo>
)