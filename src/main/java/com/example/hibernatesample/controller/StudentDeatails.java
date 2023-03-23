package com.example.hibernatesample.controller;

import com.example.hibernatesample.dao.StudentRepo;
import com.example.hibernatesample.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/student")

public class StudentDeatails {

    @Autowired
    StudentRepo studentrepo;

    @PostMapping("/save")
    public Student save(@RequestBody Student Student) {
        return studentrepo.save(Student);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentrepo.deleteById(id);
    }

    @PostMapping("/update/{id}")
    public Student update(@RequestBody Student Student) {
        return studentrepo.save(Student);
    }









}
