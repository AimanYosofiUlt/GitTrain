package com.example.gittrain.dataacess.local.repos;

import com.example.gittrain.dataacess.local.daos.UserDao;
import com.example.gittrain.dataacess.local.entites.User;

import javax.inject.Inject;

public class UserRepo {
    @Inject
    UserDao userDao;

    @Inject
    public UserRepo() {

    }
}
