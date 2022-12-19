package com.mongodb.MongoDb.Example.repository;

import com.mongodb.MongoDb.Example.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student>  findStudentByEmail(String email);

}
