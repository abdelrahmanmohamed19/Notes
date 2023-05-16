package com.example.notes.ui.notes

import com.example.notes.R
import com.example.notes.data.Note
import com.example.notes.ui.base.BaseAdapter
import com.example.notes.ui.base.BaseInteractionListener

class NoteAdapter(items: List<Note>, listener: NotesFragment) :
    BaseAdapter<Note>(items, listener) {
    override val layoutId: Int = R.layout.item_notes

}

interface NoteInteractionListener : BaseInteractionListener {

}