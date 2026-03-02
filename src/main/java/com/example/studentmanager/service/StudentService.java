package com.example.studentmanager.service;

import org.springframework.stereotype.Service;
import com.example.studentmanager.entity.Student;
import com.example.studentmanager.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}