package com.bolt.daggersample.di.util

import android.content.Context
import com.bolt.daggersample.App
import com.bolt.daggersample.di.component.AppComponent
import com.bolt.daggersample.di.component.MainComponent
import com.bolt.daggersample.di.component.RandomTextComponent

fun Context.appComponent(): AppComponent {
    return when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent()
    }
}
fun Context.mainComponent(): MainComponent {
    return when (this) {
        is App -> mainComponent
        else -> applicationContext.mainComponent()
    }
}
fun Context.randomTextComponent(): RandomTextComponent {
    return when (this) {
        is App -> randomTextComponent
        else -> applicationContext.randomTextComponent()
    }
}