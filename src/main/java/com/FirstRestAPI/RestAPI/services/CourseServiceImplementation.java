package com.FirstRestAPI.RestAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FirstRestAPI.RestAPI.entities.Course;
import com.FirstRestAPI.RestAPI.repository.CourseRepository;

@Service
public class CourseServiceImplementation implements CourseServices {
    
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        courseRepository.deleteById(courseId);
    }
}