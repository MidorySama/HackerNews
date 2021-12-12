package com.dipand.hackernews.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dipand.hackernews.R
import com.dipand.hackernews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var bindind : ActivityMainBinding? = null
    //private val viewModel: NewsHitsViewModel by viewModel()

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 }
}

