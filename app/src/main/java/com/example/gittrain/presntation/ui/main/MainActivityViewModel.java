package com.example.gittrain.presntation.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.gittrain.dataacess.local.entites.Address;
import com.example.gittrain.dataacess.local.entites.Note;
import com.example.gittrain.dataacess.local.entites.User;
import com.example.gittrain.dataacess.local.repos.AddressRepo;
import com.example.gittrain.dataacess.local.repos.NoteRepo;
import com.example.gittrain.dataacess.local.repos.UserRepo;
import com.example.gittrain.dataacess.remote.api.AddressApi;

import java.util.List;

import javax.inject.Inject;

public class MainActivityViewModel extends AndroidViewModel {
    UserRepo userRepo;
    @Inject
    NoteRepo noteRepo;
    @Inject
    AddressRepo addressRepo;
    @Inject
    AddressApi api;

    LiveData<List<User>> userLiveData;
    MutableLiveData<List<Note>> searchNotesMDL;

    @Inject
    public MainActivityViewModel(@NonNull Application application, UserRepo userRepo) {
        super(application);
        this.userRepo = userRepo;
        userLiveData = userRepo.getUsers();
        searchNotesMDL = new MutableLiveData<>();
    }

    void searchNote(String searchText) {
        List<Note> noteList = noteRepo.searchNote(searchText);
        searchNotesMDL.setValue(noteList);
    }

    void addUser(String userName, Address address) {
        int addressId = (int) addressRepo.addAddress(address);
        User user = new User(userName, addressId);
        userRepo.addUser(user);
    }
}
