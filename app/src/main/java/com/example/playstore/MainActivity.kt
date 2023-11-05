package com.example.playstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.playstore.adapter.AppAdapter
import com.example.playstore.adapter.ListAppAdapter
import com.example.playstore.data.Data
import com.example.playstore.databinding.ActivityMainBinding
import com.example.playstore.databinding.ListAppBinding
import com.example.playstore.model.ListApp

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listAppBinding: ListAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        listAppBinding = ListAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAppSet: List<ListApp> = listOf(
            ListApp("Social apps", Data().loadSocialApp()),
            ListApp("Flight booking", Data().loadFlightApp()),
            ListApp("Popular apps", Data().loadPopularApp()),
            ListApp("Game", Data().loadGame())
        )

        binding.listItemRecyclerView.adapter = ListAppAdapter(this, listAppSet);


    }
}