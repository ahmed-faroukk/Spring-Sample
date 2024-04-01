package com.example.demo.student.service;

import com.example.demo.student.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {

        return List.of(
                new Student(
                        1L , "Ahmed Farouk" , "ahed.faaroukk@gmail.com", "Egypt , Mansoura ", LocalDate.of(2002 , Month.NOVEMBER , 7)
                ),new Student(
                        2L , "Ahmed Farouk" , "ahed.faaroukk@gmail.com", "Egypt , Mansoura ", LocalDate.of(2002 , Month.NOVEMBER , 7)
                ),new Student(
                        3L , "Ahmed Farouk" , "ahed.faaroukk@gmail.com", "Egypt , Mansoura ", LocalDate.of(2002 , Month.NOVEMBER , 7)
                )
        ) ;
    }
}
