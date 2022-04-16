package com.example.gittrain.dataacess.local.repos;

import androidx.lifecycle.LiveData;

import com.example.gittrain.dataacess.local.daos.UserDao;
import com.example.gittrain.dataacess.local.entites.User;

import java.util.List;

import javax.inject.Inject;

public class UserRepo {
    @Inject
    UserDao userDao;

    @Inject
    public UserRepo() {

    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }

    public LiveData<List<User>> getUsers() {
        return userDao.selectUsers();
    }
}
