package com.example.demo.controller;

import com.example.demo.entety.Student;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.StudentService;

import java.util.List;


@RestController
@RequestMapping("/student")
@Cacheable
public class StudentController {

    private final StudentService studentService;

    public StudentController( StudentService studentService) {
        this.studentService = studentService;

    }


    //@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @Cacheable("students")
    @GetMapping
    public List<Student> getStudent() {

        return studentService.getStudent();
    }
    @PostMapping

    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
