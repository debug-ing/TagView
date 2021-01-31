package com.goftino.tagviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.goftino.tagviewapp.adapter.TagsAdapter
import com.goftino.tagviewapp.databinding.ActivityMainBinding
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var tags:TagsAdapter
    lateinit var data: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        make()
    }
    fun make(){
        data = ArrayList<String>()
        data.add("Ali")
        data.add("Reza")
        data.add("Mahdi")
        data.add("Ali Reza")
        data.add("Akbar")
        val layoutManager = FlexboxLayoutManager(this)
        tags = TagsAdapter(data)
        list.adapter = tags
        list.layoutManager = layoutManager
    }
}