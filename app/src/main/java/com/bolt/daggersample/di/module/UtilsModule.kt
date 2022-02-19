package com.bolt.daggersample.di.module

import com.bolt.daggersample.utils.CustomText
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UtilsModule {

    @Provides
    @Named("FirstText")
    fun provideFirstCustomText() = CustomText("First dependency text")

    @Provides
    @Named("SecondText")
    fun provideSecondCustomText() = CustomText("Second dependency text")
}