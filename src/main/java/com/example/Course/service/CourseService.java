package com.example.Course.service;

import com.example.Course.model.Course;
import com.example.Course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public void save(Course course) {
        repo.save(course);
    }

    public List<Course> getAll() {
        return repo.findAll();
    }

    public Course getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    
}
