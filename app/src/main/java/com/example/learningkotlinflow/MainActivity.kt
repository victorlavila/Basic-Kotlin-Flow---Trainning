package com.example.learningkotlinflow

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learningkotlinflow.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAdapter()
        setupView()
    }

    private fun setAdapter() {
        binding.myList.adapter = adapter
        binding.myList.layoutManager = LinearLayoutManager(this)
    }

    private fun setupView(){
        lifecycleScope.launch {
            viewModel.getNames().collect { names ->
                adapter.addNames(names)
            }
        }
    }
}