package com.adetayoolaitan.eventqrmanager.presentation.event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.adetayoolaitan.eventqrmanager.R
import com.adetayoolaitan.eventqrmanager.databinding.ActivityEventBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment_activity_event)
        navController.setGraph(R.navigation.event_navigation,intent.extras)
    }
}