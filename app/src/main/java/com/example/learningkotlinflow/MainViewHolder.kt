package com.example.learningkotlinflow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learningkotlinflow.databinding.ItemNameBinding

class MainViewHolder(
    private val binding: ItemNameBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind( name: String) {
        binding.names.text = name
    }

    companion object {
        fun create(
            parent: ViewGroup
        ): MainViewHolder {
            val itemBinding = ItemNameBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)

            return MainViewHolder(itemBinding)
        }
    }
}