package com.notallyz.note.recyclerview.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.notallyz.note.databinding.RecyclerColorBinding
import com.notallyz.note.miscellaneous.Operations
import com.notallyz.note.recyclerview.ItemListener
import com.notallyz.note.room.Color

class ColorVH(private val binding: RecyclerColorBinding, listener: ItemListener) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.CardView.setOnClickListener {
            listener.onClick(adapterPosition)
        }
    }

    fun bind(color: Color) {
        val value = Operations.extractColor(color, binding.root.context)
        binding.CardView.setCardBackgroundColor(value)
    }
}