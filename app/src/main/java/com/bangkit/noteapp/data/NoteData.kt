package com.bangkit.noteapp.data

import com.bangkit.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                title = "A good bay",
                description = "We went on a vacation to the mountains. It was a great trip."
            ),
            Note(
                title = "A good bay",
                description = "Working on Compose is fun!"
            ),
            Note(
                title = "Keep at it...",
                description = "Sometimes things just happen"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
            Note(
                title = "A movie day",
                description = "Watching a movie with my family"
            ),
        )
    }
}