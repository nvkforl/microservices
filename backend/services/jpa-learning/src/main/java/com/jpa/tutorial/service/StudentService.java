package com.jpa.tutorial.service;

import com.jpa.tutorial.model.Student;
import com.jpa.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student add(Student student){
        return studentRepository.save(student);
    }

    public List<Student> get(){
        return studentRepository.findAll();
    }
}
