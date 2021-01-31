package com.goftino.tagviewapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.goftino.tagviewapp.R
import com.goftino.tagviewapp.databinding.TagBinding

class TagsAdapter(private val dataSet: ArrayList<String>) :RecyclerView.Adapter<TagsAdapter.ViewHolder>()  {
    inner class ViewHolder (val view:TagBinding) :RecyclerView.ViewHolder(view.root){
        init {
            view.remove.setOnClickListener{
                var index = adapterPosition;
                delete(index)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TagBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount()=dataSet.size;
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.text.text = dataSet[position]
    }
    fun delete(index:Int){
        dataSet.removeAt(index)
        notifyItemRemoved(index)
    }
    fun add(text:String){
        dataSet.add(text)
        notifyItemInserted(dataSet.size -1)
    }
}