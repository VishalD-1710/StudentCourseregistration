package com.example.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.model.Student;

public interface Studentrepository extends JpaRepository<Student,Long>{
    
}
