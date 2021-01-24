package com.jpa.tutorial.controller;

import com.jpa.tutorial.model.Student;
import com.jpa.tutorial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.get();
    }

    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        return studentService.add(student);
    }
}
