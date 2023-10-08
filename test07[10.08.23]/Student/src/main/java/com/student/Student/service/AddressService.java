package com.student.Student.service;

import com.student.Student.model.Address;
import com.student.Student.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    static IAddressRepo addressRepo;

    public static String saveAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "Address added";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String removeAddress(Long id) {
        addressRepo.deleteById(id);
        return "Address removed";
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }
}
