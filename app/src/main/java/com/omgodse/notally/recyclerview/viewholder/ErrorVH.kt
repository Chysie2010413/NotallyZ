package com.notallyz.note.recyclerview.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.notallyz.note.databinding.ErrorBinding
import com.notallyz.note.image.ImageError

class ErrorVH(private val binding: ErrorBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(error: ImageError) {
        binding.Name.text = error.name
        binding.Description.text = error.description
    }
}