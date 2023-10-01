package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.Address;
import com.geekster.Ecommerce.API.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String saveAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }
}
