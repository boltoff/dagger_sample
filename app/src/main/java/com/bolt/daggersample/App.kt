package com.bolt.daggersample

import android.app.Application
import com.bolt.daggersample.di.component.AppComponent
import com.bolt.daggersample.di.component.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
    }
}