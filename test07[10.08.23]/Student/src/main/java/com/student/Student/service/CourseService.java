package com.student.Student.service;

import com.student.Student.model.Course;
import com.student.Student.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    static ICourseRepo courseRepo;

    public static String saveCourse(Course newCourse) {

        courseRepo.save(newCourse);
        return "Course Added";
    }

    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    public String removeCourse(Long id) {
        courseRepo.deleteById(id);
        return "Course removed";
    }

    public Course getCourseById(Long id) {
        return courseRepo.findById(id).orElseThrow();
    }
}
