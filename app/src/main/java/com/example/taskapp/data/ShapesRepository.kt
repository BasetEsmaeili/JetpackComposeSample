package com.example.taskapp.data

import com.example.taskapp.model.ShapesState


interface ShapesRepository {
    fun getShapes(): ShapesState
}