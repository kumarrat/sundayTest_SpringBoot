package com.student.Student.service;

import com.student.Student.model.Laptop;
import com.student.Student.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    static ILaptopRepo laptopRepo;

    public static String saveLaptop(Laptop newLaptop) {
        laptopRepo.save(newLaptop);
        return "Laptop added";
    }

    public List<Laptop> getLaptop() {

        return laptopRepo.findAll();
    }

    public String removeLaptop(Long id) {
        laptopRepo.deleteById(id);
        return "Laptop removed";
    }

    public Laptop getLaptopById(Long id) {
        return laptopRepo.findById(id).orElseThrow();
    }
}
