package com.student.Student.service;

import com.student.Student.model.Student;
import com.student.Student.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    static IStudentRepo studentRepo;

    public static String saveStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "Student Added";
    }

    public List<Student> getStudent() {
       return studentRepo.findAll();
    }

    public String removeStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student Deleted";
    }

    public Student getStudentById(Long id) {

        return studentRepo.findById(id).orElseThrow();
    }
}
