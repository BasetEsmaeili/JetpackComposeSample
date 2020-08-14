package com.example.taskapp.ui.component

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.graphics.Shape
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.res.dimensionResource
import com.example.taskapp.R
import com.example.taskapp.ui.base.purple200

@Composable
fun DrawShape(shape: Shape) {
    Box(
        modifier = Modifier.preferredSize(dimensionResource(id = R.dimen.size_circle)).padding(
            dimensionResource(id = R.dimen.padding_mini)
        ),
        backgroundColor = purple200,
        shape = shape
    )
}