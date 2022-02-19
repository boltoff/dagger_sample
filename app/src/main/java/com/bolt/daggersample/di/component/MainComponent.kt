package com.bolt.daggersample.di.component

import com.bolt.daggersample.di.module.MainViewModelModule
import com.bolt.daggersample.di.scope.MainScope
import com.bolt.daggersample.screen.main.MainActivity
import dagger.Component

@MainScope
@Component(dependencies = [AppComponent::class], modules = [MainViewModelModule::class])
interface MainComponent {

    fun inject(activity: MainActivity)
}