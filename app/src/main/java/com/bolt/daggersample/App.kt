package com.bolt.daggersample

import android.app.Application
import com.bolt.daggersample.di.component.AppComponent
import com.bolt.daggersample.di.component.DaggerAppComponent
import com.bolt.daggersample.di.component.MainComponent
import com.bolt.daggersample.di.component.RandomTextComponent

class App : Application() {

    lateinit var appComponent: AppComponent
    private var mainComponent: MainComponent? = null
    private var randomTextComponent: RandomTextComponent? = null

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    fun plusMainComponent(): MainComponent {
        if (mainComponent == null) {
            mainComponent = appComponent.plusMainComponent()
        }
        return mainComponent!!
    }

    fun clearMainComponent() {
        mainComponent = null
    }

    fun plusRandomTextComponent(): RandomTextComponent {
        if (randomTextComponent == null) {
            randomTextComponent = appComponent.plusRandomTextComponent()
        }
        return randomTextComponent!!
    }

    fun clearRandomTextComponent() {
        randomTextComponent = null
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
    }
}