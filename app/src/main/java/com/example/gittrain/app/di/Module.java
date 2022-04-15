package com.example.gittrain.app.di;

import android.content.Context;

import com.example.gittrain.dataacess.local.daos.AddressDao;
import com.example.gittrain.dataacess.local.daos.NoteDao;
import com.example.gittrain.dataacess.local.daos.UserDao;
import com.example.gittrain.dataacess.local.db.AppDatabase;
import com.example.gittrain.dataacess.local.entites.Address;

import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;

@dagger.Module
@InstallIn(ActivityComponent.class)
public class Module {
    @ActivityScoped
    @Provides
    AppDatabase provideAppDatabase(Context context) {
        return AppDatabase.getInstance(context);
    }

    @ActivityScoped
    @Provides
    UserDao provideUserDao(AppDatabase appDatabase) {
        return appDatabase.userDao();
    }

    @ActivityScoped
    @Provides
    NoteDao provideNoteDao(AppDatabase appDatabase) {
        return appDatabase.noteDao();
    }

    @ActivityScoped
    @Provides
    AddressDao provideAddressDao(AppDatabase appDatabase) {
        return appDatabase.addressDao();
    }
}
