package com.bolt.daggersample

import android.app.Application
import com.bolt.daggersample.di.component.AppComponent
import com.bolt.daggersample.di.component.DaggerAppComponent
import com.bolt.daggersample.di.component.DaggerMainComponent
import com.bolt.daggersample.di.component.DaggerRandomTextComponent
import com.bolt.daggersample.di.component.MainComponent
import com.bolt.daggersample.di.component.RandomTextComponent

class App : Application() {

    lateinit var appComponent: AppComponent
    lateinit var mainComponent: MainComponent
    lateinit var randomTextComponent: RandomTextComponent

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
        mainComponent = DaggerMainComponent.builder()
            .appComponent(appComponent)
            .build()
        randomTextComponent = DaggerRandomTextComponent.builder()
            .appComponent(appComponent)
            .build()
    }
}