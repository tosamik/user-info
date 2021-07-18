package com.sam.ms.userinfo.com.sam.ms.userinfo.services.impl;

import java.util.List;
import java.util.Optional;
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
    
    @Override 
    public Address findAddressById(int id) {
        AddressEntity address = addressRepository.findAddressById(id);
        return convertToDto(address);
    }

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(convertToEntity(address));
    }

    @Override
    public Address updateAddress(Address newAddress, int id) {
        if(addressRepository.findById(id).isPresent()) {
            Address address = convertToDto(addressRepository.findById(id).get());
            System.out.println("Address" + address);
            populateAddress(newAddress, address);
            System.out.println("Updated Address" + address);
            addressRepository.save(convertToEntity(address));   
            return convertToDto(addressRepository.getById(id));
        }
        return null;
    }

    private Address populateAddress(Address newAddress, Address address) {
        address.setBlock(newAddress.getBlock());
        address.setFloor(newAddress.getFloor());
        address.setUnit(newAddress.getUnit());
        address.setPostalCode(newAddress.getPostalCode());
        address.setStreet1(newAddress.getStreet1());
        address.setStreet2(newAddress.getStreet2());
        return address;
    }

    private Address convertToDto(AddressEntity entity) {
        Address address = modelMapper.map(entity, Address.class);
        return address;
    }

    private AddressEntity convertToEntity(Address address) {
        AddressEntity entity = modelMapper.map(address, AddressEntity.class);
        return entity;
    }
}
