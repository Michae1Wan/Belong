package com.michae1.codechallenge.di

import com.michae1.codechallenge.data.datasource.RemoteDataSource
import com.michae1.codechallenge.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

const val BASE_URL = "https://api.nasa.gov/mars-photos/api/v1/"
const val API_KEY = "fvvS00Y3AMr7J3mAjo6xJV88ZTmus4WuoVCeW8vn"

/**
 *
 * Created by Michae1 (michae1wan@live.com) on 7/23/2020.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideApiService() : ApiService =  Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    @Singleton
    @Provides
    fun provideRemoteDataSource (apiService : ApiService) : RemoteDataSource = RemoteDataSource(apiService, API_KEY)
}