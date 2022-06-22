package com.example.learningkotlinflow

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainAdapter : Adapter<MainViewHolder>() {

    private val nameList: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(nameList[position])
    }

    override fun getItemCount() = nameList.count()

    fun addNames(names: String) {
        nameList.add(names)
        notifyItemInserted(itemCount)
    }
}