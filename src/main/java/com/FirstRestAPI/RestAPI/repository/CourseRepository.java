package com.FirstRestAPI.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FirstRestAPI.RestAPI.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // Spring Data JPA will automatically implement basic CRUD operations
}