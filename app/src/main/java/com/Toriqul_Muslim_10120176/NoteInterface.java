package com.Toriqul_Muslim_10120176;

import android.database.Cursor;

import com.Toriqul_Muslim_10120176.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}


//10120176 - IF5 - Muhammad Toriqul Muslim




