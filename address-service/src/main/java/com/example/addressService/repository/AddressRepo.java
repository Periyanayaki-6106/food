package com.example.addressService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressService.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}
