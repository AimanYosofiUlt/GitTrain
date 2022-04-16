package com.example.gittrain.dataacess.local.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gittrain.dataacess.local.entites.Address;

@Dao
public interface AddressDao {
    @Insert
    long insertAddress(Address address);
}
