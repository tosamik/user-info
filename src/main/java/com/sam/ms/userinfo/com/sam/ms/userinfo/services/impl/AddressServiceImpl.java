package com.sam.ms.userinfo.com.sam.ms.userinfo.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.sam.ms.userinfo.com.sam.ms.userinfo.repository.AddressRepository;
import com.sam.ms.userinfo.com.sam.ms.userinfo.services.AddressService;
import com.sam.ms.userinfo.entity.AddressEntity;
import com.sam.ms.userinfo.model.Address;
import com.sam.ms.userinfo.model.Addresses;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    AddressRepository addressRepository;
    Addresses addresses;
    ModelMapper modelMapper;
 
    AddressServiceImpl(AddressRepository addressRepository, Addresses addresses, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.addresses = addresses;
        this.modelMapper = modelMapper;
    }

    @Override
    public Addresses findAddresses() {
        List<AddressEntity> entities = addressRepository.findAll();
        List<Address> addressList = entities.stream().map(this::convertToDto).collect(Collectors.toList());
        addresses.setAddresses(addressList);
        return addresses;
    }

    private Address convertToDto(AddressEntity entity) {
        Address address = modelMapper.map(entity, Address.class);
        return address;
    }    
}
