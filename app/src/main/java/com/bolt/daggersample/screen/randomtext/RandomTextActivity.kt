package com.bolt.daggersample.screen.randomtext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bolt.daggersample.databinding.ActivityRandomTextBinding
import com.bolt.daggersample.di.util.appComponent
import javax.inject.Inject

class RandomTextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRandomTextBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: RandomTextViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomTextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        appComponent().inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[RandomTextViewModel::class.java]

        initViews()
        initObservers()
    }

    private fun initViews() {
        binding.randomButton.setOnClickListener {
            viewModel.onRandomButtonClick()
        }
    }

    private fun initObservers() {
        viewModel.randomValue.observe(this) {
            binding.randomTextView.text = it
        }
    }
}