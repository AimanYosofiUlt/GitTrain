package com.example.gittrain.dataacess.local.repos;

import com.example.gittrain.dataacess.local.daos.AddressDao;

import javax.inject.Inject;

public class AddressRepo {
    @Inject
    AddressDao addressDao;

    @Inject
    public AddressRepo() {
    }
}
