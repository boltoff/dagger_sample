package com.bolt.daggersample.di.component

import com.bolt.daggersample.di.module.MainModule
import com.bolt.daggersample.di.module.RandomTextModule
import com.bolt.daggersample.di.module.ViewModelModule
import com.bolt.daggersample.screen.main.MainActivity
import com.bolt.daggersample.screen.randomtext.RandomTextActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class, MainModule::class, RandomTextModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: RandomTextActivity)
}