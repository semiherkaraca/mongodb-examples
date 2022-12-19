package com.mongodb.MongoDb.Example.controller;

import com.mongodb.MongoDb.Example.model.Student;
import com.mongodb.MongoDb.Example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<?> getStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return ResponseEntity.ok().body(allStudents);
    }

}
