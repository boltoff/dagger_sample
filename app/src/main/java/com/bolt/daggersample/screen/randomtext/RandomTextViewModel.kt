package com.bolt.daggersample.screen.randomtext

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class RandomTextViewModel
@Inject constructor() : ViewModel() {

    private val _randomValue = MutableLiveData<String>()
    val randomValue: LiveData<String> = _randomValue

    fun onRandomButtonClick() {
        _randomValue.value = (0..10000000000000).random().toString()
    }
}