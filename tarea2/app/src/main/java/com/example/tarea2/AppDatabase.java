
package com.example.tarea2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Category.class, Note.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NotesDao notesDao();
}
