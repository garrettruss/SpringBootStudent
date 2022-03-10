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
                        LocalDate.of(1994, 06, 9),
                        27
                    );
                    Student bob = new Student(
                    "Bob",
                    "Bob@russ.com",
                    LocalDate.of(1995, 06, 9),
                    26
                    );
                    repository.saveAll(
                        List.of(garrett, bob)
                    );
        };
    };
    
}
