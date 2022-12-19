package com.mongodb.MongoDb.Example.service;

import com.mongodb.MongoDb.Example.model.Student;
import com.mongodb.MongoDb.Example.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
