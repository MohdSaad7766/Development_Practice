package org.development.Student_Management_System.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "student-table")
public class Student {
    @Id
    private UUID id;

    @Column(name = "gr-no", nullable = false, unique = true)
    private int grNo;

    @Column(name = "roll-no", nullable = false, unique = true)
    private int rollNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, updatable = false, unique = true)
    private String email;

    @Column(name = "mobile-no", nullable = false)
    private String mobileNo;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String std;

    @Transient
    private String address;

    @Column(columnDefinition = "TEXT")
    private String DOB;

    private boolean isDeleted;
}
