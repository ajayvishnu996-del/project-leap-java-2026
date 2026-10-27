package com.student.Student.controller;

import com.student.Student.entity.StudentEntity;
import com.student.Student.service.StudentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentEntityController {
    @Autowired
    StudentEntityService studentEntityService;
    @PostMapping("/create")
    public ResponseEntity<StudentEntity> createAccount(@RequestBody StudentEntity be){
        studentEntityService.createAccount(be);
        return new ResponseEntity<>(be, HttpStatus.OK);
    }
}
