package com.example.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
