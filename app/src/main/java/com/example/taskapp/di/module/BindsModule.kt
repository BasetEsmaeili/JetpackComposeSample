package com.example.taskapp.di.module

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.example.taskapp.data.ShapesRepository
import com.example.taskapp.data.impl.FakeShapesRepositoryImpl
import com.example.taskapp.utils.ViewModelProviderFactory
import dagger.Binds
import dagger.BindsInstance
import dagger.Module

@Module
abstract class BindsModule {
    @Binds
    abstract fun bindApplication(@BindsInstance application: Application): Context

    @Binds
    abstract fun bindRepository(fakeShapesRepositoryImpl: FakeShapesRepositoryImpl): ShapesRepository
}