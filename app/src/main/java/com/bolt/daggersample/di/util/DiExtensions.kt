package com.bolt.daggersample.di.util

import android.content.Context
import com.bolt.daggersample.App
import com.bolt.daggersample.di.component.AppComponent

fun Context.appComponent(): AppComponent {
    return when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent()
    }
}