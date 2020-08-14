package com.example.taskapp.ui.activity

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.ScrollerPosition
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.layout.*
import androidx.ui.material.Checkbox
import androidx.ui.res.dimensionResource
import androidx.ui.res.stringResource
import com.example.taskapp.R
import com.example.taskapp.ui.base.TaskAppTheme
import com.example.taskapp.ui.component.DrawShape
import com.example.taskapp.ui.component.SimpleButton

@Composable
fun ShapesApp(viewModel: MainViewModel) {
    TaskAppTheme {
        AppContent(viewModel)
    }
}

@Composable
fun AppContent(viewModel: MainViewModel) {
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_stn)).fillMaxSize(),
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.weight(5f)) {
            ShapesList(viewModel)
        }
        Box(modifier = Modifier.weight(2f)) {
            ShapeController(viewModel)
        }
    }
}

@Composable
fun ShapesList(viewModel: MainViewModel) {
    if (viewModel.isHorizontalAlign().value)
        VerticalScroller {
            FlowRow {
                viewModel.getShapes().value.forEach { shape ->
                    DrawShape(shape = shape)
                    val checkedSate = state { false }
                    Checkbox(checked = checkedSate.value, onCheckedChange = {
                        checkedSate.value = it
                    })
                }
            }

        }
    else
        VerticalScroller {
            FlowColumn {
                viewModel.getShapes().value.forEach { shape ->
                    DrawShape(shape = shape)
                    val checkedSate = state { false }
                    Checkbox(checked = checkedSate.value, onCheckedChange = {
                          checkedSate.value=it
                    })
                }
            }
        }
}

@Composable
fun ShapeController(viewModel: MainViewModel) {
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_stn)).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        SimpleButton(text = stringResource(id = R.string.lbl_create_shape), onClick = {
            viewModel.addShape(CircleShape)
        }, modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_stn)))
        SimpleButton(text = stringResource(id = R.string.lbl_align_horizontally), onClick = {
            viewModel.setHorizontalAlign(true)
        }, modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_stn)))
        SimpleButton(text = stringResource(id = R.string.lbl_align_vertically), onClick = {
            viewModel.setHorizontalAlign(false)
        }, modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_stn)))
    }
}