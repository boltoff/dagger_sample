package com.bolt.daggersample.di.module

import androidx.lifecycle.ViewModelProvider
import com.bolt.daggersample.di.util.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}