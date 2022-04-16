package com.example.gittrain.dataacess.local.entites;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"addressId"})},
        foreignKeys = {
        @ForeignKey(onDelete = ForeignKey.CASCADE, entity = Address.class,
                parentColumns = {"id"}, childColumns = {"addressId"})
})
public class User {
    @PrimaryKey(autoGenerate = true)
    Integer id;
    String name;
    Integer addressId;

    public User() {
    }

    @Ignore
    public User(String name,Integer addressId) {
        this.name = name;
        this.addressId = addressId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
