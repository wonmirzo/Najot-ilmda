package com.wonapplications.najotilmda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.wonapplications.najotilmda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            val navController = findNavController(R.id.fragmentContainerView)
            bottomNavigationView.setupWithNavController(navController)
        }
    }
}