package com.example.gittrain.dataacess.local.repos;

import com.example.gittrain.dataacess.local.daos.NoteDao;

import javax.inject.Inject;

public class NoteRepo {
    @Inject
    NoteDao noteDao;

    @Inject
    public NoteRepo() {
    }
}
