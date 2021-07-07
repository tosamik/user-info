package com.sam.ms.userinfo.controllers;

import java.util.List;

import com.sam.ms.userinfo.model.Address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AddressController {

    @GetMapping("v1/addresses")
    public List<Address> findAddresses() {
        List<Address> addressList = null;

        return addressList;
    }
    
    @GetMapping("v1/address/{id}")
    public Address findAddress(@RequestParam String id) {
        Address address = null;

        return address;

    }

    @PostMapping
    public void saveAddress(@RequestBody Address address) {

    }
}
