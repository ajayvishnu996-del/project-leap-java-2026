package com.student.Student.controller;

import com.student.Student.StudApp.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Studappcontroller {
    public Studappcontroller() {
    }

    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(101,"Naveen",13);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("{id}/{name}/{age}")
    public ResponseEntity<Student> setStudent(@PathVariable("id") int id,
                                              @PathVariable("name") String name,
                                              @PathVariable("age") int age){
        Student student = new Student(id,name,age);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("query")
    public ResponseEntity<Student> queryStudent(@RequestParam int id, @RequestParam String name, @RequestParam int age){
        Student student = new Student(id, name, age);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student st){
        System.out.println(st.getId()+" "+ st.getName()+" "+st.getAge());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
