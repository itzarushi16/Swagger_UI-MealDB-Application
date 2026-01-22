package com.example.swagger.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<String> getStudents() {
        return List.of("Amit", "Aruahi", "Rahul");
    }

    @PostMapping
    public String addStudent(@RequestBody String name) {
        return "Student added: " + name;
    }
}
