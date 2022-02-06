package com.bolt.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bolt.daggersample.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        appComponent().inject(this)

        initViews()
    }

    private fun initViews() {
        binding.randomButton.setOnClickListener {
            binding.randomTextView.text = (0..10000000000000).random().toString()
        }
    }
}