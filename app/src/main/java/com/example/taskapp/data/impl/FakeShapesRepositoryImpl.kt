package com.example.taskapp.data.impl

import com.example.taskapp.data.ShapesRepository
import com.example.taskapp.model.ShapesState
import javax.inject.Inject

class FakeShapesRepositoryImpl @Inject constructor() : ShapesRepository {
    override fun getShapes(): ShapesState = ShapesState(emptyList())


}