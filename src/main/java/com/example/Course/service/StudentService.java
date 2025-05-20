package com.example.Course.service;

import com.example.Course.model.Student;
import com.example.Course.repository.Studentrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private Studentrepository repo;

    public void save(Student student) {
        repo.save(student);
    }
}
