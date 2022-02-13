package com.bolt.daggersample.di.component

import com.bolt.daggersample.di.module.MainModule
import com.bolt.daggersample.di.module.ViewModelModule
import com.bolt.daggersample.screen.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, MainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}