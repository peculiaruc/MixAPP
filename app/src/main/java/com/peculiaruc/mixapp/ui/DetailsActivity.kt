package com.peculiaruc.mixapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiaruc.mixapp.R
import com.peculiaruc.mixapp.adapter.FactAdapter
import com.peculiaruc.mixapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private var binding: ActivityDetailsBinding? = null
    private var image = 0
    private var name: String? = null
    private var details: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        image = intent.getIntExtra(FactAdapter.IMAGE_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        details = intent.getStringExtra(FactAdapter.FACT_EXTRAS)

        factDetails()
    }

    private fun factDetails() {
        binding?.textViewDetails?.text = details
        binding?.detailImage?.setImageResource(image)
        title = name


    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
