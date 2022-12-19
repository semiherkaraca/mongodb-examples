package com.mongodb.MongoDb.Example;

import com.mongodb.MongoDb.Example.model.Address;
import com.mongodb.MongoDb.Example.model.Gender;
import com.mongodb.MongoDb.Example.model.Student;
import com.mongodb.MongoDb.Example.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoDbExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository studentRepository) {
        return args -> {
            Address address = new Address("Turkiye",
                    "0001",
                    "Istanbul");
            Student student = new Student(null,
                    "Semih",
                    "Erkaraca",
                    "semiherkaraca1@windowslive.com",
                    Gender.MALE,
                    address,
                    List.of("Computer Sience", "Maths"),
                    new BigDecimal(10),
                    LocalDateTime.now());
            studentRepository.insert(student);
        };
    }
}
