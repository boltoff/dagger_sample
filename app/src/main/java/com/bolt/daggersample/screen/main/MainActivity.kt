package com.bolt.daggersample.screen.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bolt.daggersample.databinding.ActivityMainBinding
import com.bolt.daggersample.di.util.appComponent
import com.bolt.daggersample.screen.randomtext.RandomTextActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        appComponent().inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[MainViewModel::class.java]

        initViews()
        initObservers()
    }

    private fun initViews() {
        binding.openRandomButton.setOnClickListener {
            startActivity(Intent(this, RandomTextActivity::class.java))
        }
    }

    private fun initObservers() {
    }
}