package org.development.Student_Management_System.controller;

import org.development.Student_Management_System.entity.Student;
import org.development.Student_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/add")
    private ResponseEntity<Student> addStudent(@RequestBody Student student){
        student.setDeleted(false);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(student));
    }

    @GetMapping("/get/{id}")
    private ResponseEntity<?> getStudent(@PathVariable UUID id){
        Student student = studentService.getStudent(id);

        if(student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id-"+id+" not Found!!!");

        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @GetMapping("/get")
    private ResponseEntity<List<Student>> getAllStudent(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

    @PutMapping("/update/{id}")
    private ResponseEntity<?> updateStudent(@PathVariable UUID id, @RequestBody Student updateStudent){
        Student student = studentService.updateStudent(id, updateStudent);

        if(student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id-"+id+" not Found!!!");

        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> deleteStudent(@PathVariable UUID id){
        if(studentService.deleteStudent(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Student with id-"+id+" has been deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id-"+id+" not Found!!!");
    }

    @PatchMapping("/delete/{id}")
    private ResponseEntity<String> deleteStudentSoftly(@PathVariable UUID id){
        if(studentService.deleteStudentSoftly(id)){
            return ResponseEntity.status(HttpStatus.OK).body("Student with id-"+id+" has been softly deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id-"+id+" not Found!!!");
    }
}
