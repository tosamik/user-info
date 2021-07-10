package com.sam.ms.userinfo.com.sam.ms.userinfo.repository;

import com.sam.ms.userinfo.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <AddressEntity, Integer> {    
    
}
