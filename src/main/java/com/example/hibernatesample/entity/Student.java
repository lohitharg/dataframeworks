package com.example.hibernatesample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    @OneToOne
           @JoinColumn (name="name")
 ProfessorDetails professorDetails;
    String professorname;
    String name;

}
