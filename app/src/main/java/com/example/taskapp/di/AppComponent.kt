package com.example.taskapp.di

import android.app.Application
import android.content.Context
import com.example.taskapp.ApplicationLoader
import com.example.taskapp.data.ShapesRepository
import com.example.taskapp.di.module.BindsModule
import com.example.taskapp.ui.activity.MainActivity
import com.example.taskapp.utils.ViewModelProviderFactory
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@AppScope
@Component(modules = [BindsModule::class])
interface AppComponent {

    fun provideContext(): Context
    fun provideRepository(): ShapesRepository
    fun provideViewModelFactory(): ViewModelProviderFactory


    fun inject(application: ApplicationLoader)
    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application):AppComponent
    }

}