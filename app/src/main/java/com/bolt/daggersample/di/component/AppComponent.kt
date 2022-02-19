package com.bolt.daggersample.di.component

import com.bolt.daggersample.di.module.UtilsModule
import com.bolt.daggersample.utils.CustomText
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilsModule::class])
interface AppComponent {

    @Named("FirstText")
    fun firstText(): CustomText

    @Named("SecondText")
    fun secondText(): CustomText
}