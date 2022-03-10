package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
               Student garrett = new Student(
                        "Garrett",
                        "garrett@russ.com",
                        LocalDate.of(1992, 06, 9)
                    );
                    Student bob = new Student(
                    "Bob",
                    "Bob@russ.com",
                    LocalDate.of(1991, 06, 9)
                    );
                    repository.saveAll(
                        List.of(garrett, bob)
                    );
        };
    };
    
}
