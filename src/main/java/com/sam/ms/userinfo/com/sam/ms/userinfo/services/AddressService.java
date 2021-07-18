package com.sam.ms.userinfo.com.sam.ms.userinfo.services;

import com.sam.ms.userinfo.model.Address;
import com.sam.ms.userinfo.model.Addresses;

public interface AddressService {
    Addresses findAddresses();
    Address findAddressById(int id);
    void saveAddress(Address address);
    Address updateAddress(Address address, int id);
}
