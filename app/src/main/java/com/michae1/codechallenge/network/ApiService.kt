package com.michae1.codechallenge.network

import com.michae1.codechallenge.data.model.Photos
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 * Created by Michae1 (michae1wan@live.com) on 7/23/2020.
 */
interface ApiService {
    @GET("rovers/curiosity/photos")
    suspend fun getCuriosityPhotos(
        @Query("sol") sol: String,
        @Query("page") page: String,
        @Query("api_key") api_key: String

    ) : Response<Photos>
}