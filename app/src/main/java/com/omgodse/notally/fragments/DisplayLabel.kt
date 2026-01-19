package com.notallyz.note.fragments

import androidx.lifecycle.LiveData
import com.notallyz.note.R
import com.notallyz.note.miscellaneous.Constants
import com.notallyz.note.room.Item

class DisplayLabel : NotallyFragment() {

    override fun getBackground() = R.drawable.label

    override fun getObservable(): LiveData<List<Item>> {
        val label = requireNotNull(requireArguments().getString(Constants.SelectedLabel))
        return model.getNotesByLabel(label)
    }
}