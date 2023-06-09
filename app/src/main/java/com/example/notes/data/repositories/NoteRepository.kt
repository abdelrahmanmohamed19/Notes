package com.example.notes.data.repositories

import com.example.notes.data.Note
import com.example.notes.data.database.NoteDatabase

class NoteRepository {
    val dao = NoteDatabase.getInstanceWithoutContext().noteDao()

    suspend fun insertNewNote(note: Note) {
        return dao.insertNote(note)
    }

    fun getAllNotes() = dao.getAllNotes()

    suspend fun getFilteredNotes(searchTerm: String) = dao.getFilteredNotes("%$searchTerm%")
}