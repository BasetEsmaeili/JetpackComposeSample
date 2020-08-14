package com.example.taskapp.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.taskapp.data.ShapesRepository
import com.example.taskapp.ui.activity.MainViewModel
import javax.inject.Inject

class ViewModelProviderFactory @Inject constructor(private val repository: ShapesRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown class name ${modelClass.name}")
    }
}