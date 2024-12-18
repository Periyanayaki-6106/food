package com.example.addressService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressService.entity.Address;
import com.example.addressService.repository.AddressRepo;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
    private AddressRepo addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

}
