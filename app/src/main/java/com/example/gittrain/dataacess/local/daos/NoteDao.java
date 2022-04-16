package com.example.gittrain.dataacess.local.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gittrain.dataacess.local.entites.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM Note " +
            "WHERE userId = :userId")
    LiveData<List<Note>> getUserId(Integer userId);

    @Query("SELECT * FROM Note " +
            "WHERE text like '%'+:searchText+'%'")
    List<Note> searchNote(String searchText);

    @Insert
    void insertNote(Note note);
}
