package com.bolt.daggersample

import dagger.Component

@Component
interface AppComponent {

    fun inject(activity: MainActivity)
}