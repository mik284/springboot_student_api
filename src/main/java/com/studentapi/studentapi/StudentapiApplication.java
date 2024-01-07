package com.studentapi.studentapi;

import com.studentapi.studentapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class StudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}
	@GetMapping
	public List<Student> student(){
		return List.of(new Student(1L, "Munyui", "munyui@gmail.com", LocalDate.of( 2000, Month.APRIL, 12 ), 24 ));
	}
}
