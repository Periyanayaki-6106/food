package com.example.addressService.Service;

//import org.springframework.beans.factory.annotation.Autowired;


import com.example.addressService.entity.Address;
//import com.example.addressService.repository.AddressRepo;


public interface AddressService {
	Address saveAddress(Address address);

}
