package org.development.Student_Management_System.repository;

import org.development.Student_Management_System.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
    Optional<Student> findByIdAndIsDeletedIsFalse(UUID id);

    List<Student> findAllByIsDeletedIsFalse();
}

//public class StudentRepositoryImpl implements StudentRepository{
//
//}