package com.example.taskapp.ui.activity

import androidx.compose.MutableState
import androidx.compose.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.ui.graphics.Shape
import com.example.taskapp.data.ShapesRepository

class MainViewModel(repository: ShapesRepository) : ViewModel() {
    private val _shapes: MutableState<List<Shape>> = mutableStateOf(repository.getShapes().shapes)
    private val _isHorizontalAlign: MutableState<Boolean> = mutableStateOf(false)

    fun getShapes() = _shapes

    fun isHorizontalAlign() = _isHorizontalAlign


    fun addShape(shape: Shape) {
        _shapes.value += shape
    }

    fun setHorizontalAlign(state: Boolean) {
        _isHorizontalAlign.value = state
    }
}