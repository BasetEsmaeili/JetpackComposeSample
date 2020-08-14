package com.example.taskapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Shape
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.res.dimensionResource
import androidx.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import com.example.taskapp.R
import com.example.taskapp.di.findAppComponent
import com.example.taskapp.ui.activity.ShapesApp
import com.example.taskapp.ui.component.SimpleButton
import com.example.taskapp.ui.base.TaskAppTheme
import com.example.taskapp.utils.ViewModelProviderFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var viewModelFactory: ViewModelProviderFactory
        @Inject set

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findAppComponent().inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        setContent {
            ShapesApp(viewModel = viewModel)
        }
    }
}