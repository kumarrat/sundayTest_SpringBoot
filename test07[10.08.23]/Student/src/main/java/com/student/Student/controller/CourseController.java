package com.student.Student.controller;

import com.student.Student.model.Course;
import com.student.Student.model.Laptop;
import com.student.Student.service.CourseService;
import com.student.Student.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse)
    {
        return CourseService.saveCourse(newCourse);
    }

    @GetMapping("courses")
    public List<Course> getCourse()
    {
        return courseService.getCourse();
    }

    @DeleteMapping("course/{id}")
    public String removeCourse(@PathVariable Long id)
    {
        return courseService.removeCourse(id);
    }

    @GetMapping("course/{id}/id")
    public Course getCourseById(@PathVariable Long id)
    {
        return courseService.getCourseById(id);
    }


}
