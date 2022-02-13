package com.bolt.daggersample.di.module

import androidx.lifecycle.ViewModel
import com.bolt.daggersample.di.util.ViewModelKey
import com.bolt.daggersample.screen.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun mainViewModel(viewModel: MainViewModel): ViewModel
}