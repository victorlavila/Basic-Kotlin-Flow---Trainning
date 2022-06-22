package com.example.learningkotlinflow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    fun getNames(): Flow<String> {
        return flow {
            val namesToList = namesForList()

            for (names in namesToList) {
                emit(names)
                delay(1000)
            }
        }
    }
}