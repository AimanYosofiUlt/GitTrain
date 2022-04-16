package com.example.gittrain.presntation.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.gittrain.dataacess.local.repos.NoteRepo;
import com.example.gittrain.dataacess.local.repos.UserRepo;
import com.example.gittrain.dataacess.remote.api.AddressApi;

import javax.inject.Inject;

public class MainActivityViewModel extends AndroidViewModel {
    @Inject
    UserRepo userRepo;
    @Inject
    NoteRepo noteRepo;
    @Inject
    AddressApi api;

    @Inject
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }
}
