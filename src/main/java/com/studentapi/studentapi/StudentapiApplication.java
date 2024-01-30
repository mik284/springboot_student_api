package com.studentapi.studentapi;

import com.studentapi.studentapi.student.Student;
import com.studentapi.studentapi.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@SpringBootApplication
public class StudentapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//		return args -> {
//			Student mary = new Student(
//					"mary",
//					"mary@gmail.com",
//					LocalDate.of(2000, APRIL, 12)
//			);
//			studentRepository.save(mary);
//		};
//	}
}
