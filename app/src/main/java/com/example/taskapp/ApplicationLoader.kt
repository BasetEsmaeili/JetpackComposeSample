package com.example.taskapp

import android.app.Application
import com.example.taskapp.di.AppComponent
import com.example.taskapp.di.AppComponentProvider
import com.example.taskapp.di.DaggerAppComponent

class ApplicationLoader : Application(), AppComponentProvider {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this).also {
            it.inject(this)
        }
    }

    override fun getAppComponent(): AppComponent = appComponent
}