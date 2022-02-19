package com.bolt.daggersample.screen.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bolt.daggersample.utils.CustomText
import javax.inject.Inject
import javax.inject.Named

class MainViewModel
@Inject constructor(
    @Named("FirstText")
    private val firstText: CustomText,
    @Named("SecondText")
    private val secondText: CustomText
) : ViewModel() {

    private val _dependencyText = MutableLiveData<Pair<String, String>>()
    val dependencyText: LiveData<Pair<String, String>> = _dependencyText

    init {
        _dependencyText.value = firstText.text to secondText.text
    }
}