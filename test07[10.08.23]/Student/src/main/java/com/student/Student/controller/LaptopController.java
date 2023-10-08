package com.student.Student.controller;

import com.student.Student.model.Laptop;
import com.student.Student.model.Student;
import com.student.Student.service.LaptopService;
import com.student.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newLaptop)
    {
        return LaptopService.saveLaptop(newLaptop);
    }

    @GetMapping("Laptops")
    public List<Laptop> getLaptop()
    {
        return laptopService.getLaptop();
    }

    @DeleteMapping("laptop/{id}")
    public String removeLaptop(@PathVariable Long id)
    {
        return laptopService.removeLaptop(id);
    }

    @GetMapping("laptop/{id}/id")
    public Laptop getLaptopById(@PathVariable Long id)
    {
        return laptopService.getLaptopById(id);
    }


}
