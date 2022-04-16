package com.example.gittrain.dataacess.local.repos;

import com.example.gittrain.dataacess.local.daos.AddressDao;
import com.example.gittrain.dataacess.local.entites.Address;

import javax.inject.Inject;

public class AddressRepo {
    @Inject
    AddressDao addressDao;

    @Inject
    public AddressRepo() {
    }

    public long addAddress(Address address) {
        return addressDao.insertAddress(address);
    }
}
