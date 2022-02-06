package com.bolt.daggersample

import android.app.Application
import android.content.Context

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
    }
}

fun Context.appComponent(): AppComponent {
    return when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent()
    }
}