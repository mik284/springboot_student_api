package com.studentapi.studentapi.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Munyui",
                        "munyui@gmail.com",
                        LocalDate.of( 2000, Month.APRIL, 12 ),
                        24
                ) );
    }
}
