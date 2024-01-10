package com.studentapi.studentapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student munyui = new Student(
                    "Munyui",
                    "munyui@gmail.com",
                    LocalDate.of(2000, APRIL, 12),
                    24
            );

            Student eric = new Student(
                    "eric",
                    "eric@gmail.com",
                    LocalDate.of(2004, APRIL, 12),
                    24
            );

            repository.saveAll(List.of(munyui, eric));
        };
    }
}
