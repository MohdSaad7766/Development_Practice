package org.development.Student_Management_System.service;

import org.development.Student_Management_System.entity.Student;
import org.development.Student_Management_System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudent(UUID id){
        Optional<Student> student = studentRepository.findByIdAndIsDeletedIsFalse(id);

        if(student.isPresent()){
            return student.get();
        }
        else{
            return null;
        }
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAllByIsDeletedIsFalse();
    }

    public Student updateStudent(UUID id, Student updateStudent){
        Student student = getStudent(id);
        if(student != null){
            student.setGrNo(updateStudent.getGrNo());
            student.setRollNo(updateStudent.getRollNo());
            student.setName(updateStudent.getName());
            student.setMobileNo(updateStudent.getMobileNo());
            student.setAge(updateStudent.getAge());
            student.setStd(updateStudent.getStd());
            student.setDOB(updateStudent.getDOB());

            return addStudent(student);
        }
        return null;
    }

    public boolean deleteStudent(UUID id){
        Student student = getStudent(id);
        if(student != null){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean deleteStudentSoftly(UUID id){
        Student student = getStudent(id);
        if(student != null){
            student.setDeleted(true);
            studentRepository.save(student);
            return true;
        }
        return false;
    }
}
