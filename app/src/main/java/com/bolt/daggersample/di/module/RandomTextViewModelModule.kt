package com.bolt.daggersample.di.module

import androidx.lifecycle.ViewModel
import com.bolt.daggersample.di.util.ViewModelKey
import com.bolt.daggersample.screen.randomtext.RandomTextViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RandomTextViewModelModule : ViewModelModule() {

    @Binds
    @IntoMap
    @ViewModelKey(RandomTextViewModel::class)
    abstract fun randomTextViewModel(viewModel: RandomTextViewModel): ViewModel
}