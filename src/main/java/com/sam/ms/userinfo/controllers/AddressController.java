package com.sam.ms.userinfo.controllers;

import com.sam.ms.userinfo.com.sam.ms.userinfo.services.AddressService;
import com.sam.ms.userinfo.model.Address;
import com.sam.ms.userinfo.model.Addresses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AddressController {

    AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("v1/addresses")
    public Addresses findAddresses() {
        return addressService.findAddresses();
    }
    
    @GetMapping("v1/addresses/{id}")
    public Address findAddress(@RequestParam String id) {
        Address address = null;

        return address;

    }

    @PostMapping("v1/addresses")
    public void saveAddress(@RequestBody Address address) {

    }

    @PutMapping("v1/addresses/{id}")
    public void updateAddress(@RequestBody Address address, @PathVariable Long id) {

    }
}
