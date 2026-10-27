package com.student.Student.service;

import com.student.Student.entity.StudentEntity;
import com.student.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentEntityService {
    @Autowired
    StudentRepository studentRepository;
    public StudentEntity createAccount(StudentEntity se){ return studentRepository.save(se); }
}
