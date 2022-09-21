package com.example.demo.service;

import com.example.demo.entety.Student;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
    public Student addStudent(Student student){

    return studentRepository.save(student);
    }
}
