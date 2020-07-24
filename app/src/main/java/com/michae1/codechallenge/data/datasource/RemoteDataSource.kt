package com.michae1.codechallenge.data.datasource

import com.michae1.codechallenge.network.ApiService
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


/**
 *
 * Created by Michae1 (michae1wan@live.com) on 7/23/2020.
 */
class RemoteDataSource @Inject constructor(
    private val apiService: ApiService,
    private val apiKey: String
) : BaseDataSource() {
    suspend fun getCuriosityPhotos() = getResult {
//        val pattern = "yyyy-MM-dd"
//        val simpleDateFormat = SimpleDateFormat(pattern)
//        val date: String = simpleDateFormat.format(Date())
        //TODO add pagination
        apiService.getCuriosityPhotos(0.toString(), 1.toString(), apiKey)
    }
}