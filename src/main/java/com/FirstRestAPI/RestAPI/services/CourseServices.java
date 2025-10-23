package com.FirstRestAPI.RestAPI.services;

import java.util.List;

import com.FirstRestAPI.RestAPI.entities.Course;

public interface CourseServices {
    public List<Course> getCourse();
    public Course getCourse(long long1);
    public Course addCourse(Course course);
    public void deleteCourse(long courseId);
}