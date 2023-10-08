package com.student.Student.repo;

import com.student.Student.controller.LaptopController;
import com.student.Student.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
