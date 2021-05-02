package com.peculiaruc.mixapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiaruc.mixapp.R
import com.peculiaruc.mixapp.adapter.FactAdapter
import com.peculiaruc.mixapp.databinding.ActivityListViewBinding
import com.peculiaruc.mixapp.model.DummyData

class ListViewActivity : AppCompatActivity() {

    var binding: ActivityListViewBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setUpListView()
    }
    private fun setUpListView(){
        adapter = FactAdapter(this, DummyData.funfact)
        binding?.listViewfact?.adapter= adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}