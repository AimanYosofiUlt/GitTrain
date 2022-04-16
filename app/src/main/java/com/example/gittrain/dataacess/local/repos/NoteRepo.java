package com.example.gittrain.dataacess.local.repos;

import com.example.gittrain.dataacess.local.daos.NoteDao;
import com.example.gittrain.dataacess.local.entites.Note;

import java.util.List;

import javax.inject.Inject;

public class NoteRepo {
    @Inject
    NoteDao noteDao;

    @Inject
    public NoteRepo() {

    }

    public List<Note> searchNote(String searchText){
        return noteDao.searchNote(searchText);
    }
}
