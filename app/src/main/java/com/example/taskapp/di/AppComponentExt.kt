package com.example.taskapp.di

import android.app.Activity
import android.content.Context

fun Context.findAppComponent() = (applicationContext as? AppComponentProvider)?.getAppComponent()
    ?: throw IllegalStateException("application class must implement AppComponentProvider")