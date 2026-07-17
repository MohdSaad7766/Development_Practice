package org.development.controller;

import org.development.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class StudentController {

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        System.out.println(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }
}
