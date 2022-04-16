package com.example.gittrain.dataacess.local.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gittrain.dataacess.local.entites.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User")
    LiveData<List<User>> selectUsers();

    @Insert
    void insertUser(User user);
}
