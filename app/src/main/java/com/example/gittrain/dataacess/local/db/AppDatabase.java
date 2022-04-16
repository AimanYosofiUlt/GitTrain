package com.example.gittrain.dataacess.local.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.gittrain.dataacess.local.daos.AddressDao;
import com.example.gittrain.dataacess.local.daos.NoteDao;
import com.example.gittrain.dataacess.local.daos.UserDao;
import com.example.gittrain.dataacess.local.entites.Address;
import com.example.gittrain.dataacess.local.entites.Note;
import com.example.gittrain.dataacess.local.entites.User;

@Database(entities = {User.class, Note.class, Address.class}
        , exportSchema = false
        , version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

    public abstract UserDao userDao();

    public abstract AddressDao addressDao();

    private static final AppDatabase INSTANCE = null;

    public static AppDatabase getDatabase(Context context) {
        AppDatabase temp = INSTANCE;
        if (temp != null)
            return temp;

        return Room.databaseBuilder(
                context,
                AppDatabase.class,
                "GitTrainDB"
        ).allowMainThreadQueries().build();
    }
}