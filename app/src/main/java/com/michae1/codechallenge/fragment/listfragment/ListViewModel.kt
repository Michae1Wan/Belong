package com.michae1.codechallenge.fragment.listfragment

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.michae1.codechallenge.data.datasource.RemoteDataSource
import kotlinx.coroutines.Dispatchers

class ListViewModel @ViewModelInject constructor(
    private val datasource: RemoteDataSource

): ViewModel() {
    val dataRoot = liveData(Dispatchers.IO) {
        val data = datasource.getCuriosityPhotos()

        emit(data)
    }
}