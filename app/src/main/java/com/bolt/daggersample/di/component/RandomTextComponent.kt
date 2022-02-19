package com.bolt.daggersample.di.component

import com.bolt.daggersample.di.module.RandomTextViewModelModule
import com.bolt.daggersample.di.scope.RandomTextScope
import com.bolt.daggersample.screen.randomtext.RandomTextActivity
import dagger.Component

@RandomTextScope
@Component(dependencies = [AppComponent::class], modules = [RandomTextViewModelModule::class])
interface RandomTextComponent {

    fun inject(activity: RandomTextActivity)
}