package com.student.Student.controller;

import com.student.Student.model.Address;
import com.student.Student.model.Laptop;
import com.student.Student.service.AddressService;
import com.student.Student.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress)
    {
        return AddressService.saveAddress(newAddress);
    }

    @GetMapping("Address")
    public List<Address> getAddress()
    {
        return addressService.getAddress();
    }

    @DeleteMapping("address/{id}")
    public String removeAddress(@PathVariable Long id)
    {
        return addressService.removeAddress(id);
    }

    @GetMapping("address/{id}/id")
    public Address getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }


}
