package com.example.hibernatesample.controller;

import com.example.hibernatesample.dao.StudentRepo;
import com.example.hibernatesample.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/student")

public class StudentDeatails {

    @Autowired
    StudentRepo studentrepo;

    @PostMapping("/save")
    public Student save(@RequestBody Student Student) {
        return studentrepo.save(Student);
    }

    @GetMapping("/students")
    public List<Student> getall() {
        return studentrepo.findAll();
    }


    @GetMapping("/students/{id}")
    public Optional<Student> getbyid(@PathVariable Integer id) {
        return studentrepo.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentrepo.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Student update(@RequestBody Student Studentrequest, @PathVariable  Integer id) {
     //  Optional<Student> studentexist = Optional.of(studentrepo.findById(id).get());
       Student studentupdate=new Student();
       studentupdate.setId(id);
        studentupdate.setName(Studentrequest.getName());
       return studentrepo.save(studentupdate);
    }









}
