package com.michae1.codechallenge.fragment.listfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.michae1.codechallenge.data.datasource.RemoteDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val datasource: RemoteDataSource

): ViewModel() {
    val dataRoot = liveData(Dispatchers.IO) {
        val data = datasource.getCuriosityPhotos()

        emit(data)
    }
}