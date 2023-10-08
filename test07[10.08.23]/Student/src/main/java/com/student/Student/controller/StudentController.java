package com.student.Student.controller;

import com.student.Student.model.Student;
import com.student.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent)
    {
        return StudentService.saveStudent(newStudent);
    }

    @GetMapping("students")
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }


    @DeleteMapping("student/{id}")
    public String removeStudent(@PathVariable Long id)
    {
        return studentService.removeStudent(id);
    }

    @GetMapping("student/{id}/id")
    public Student getStudentById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }


}
