package org.example.demo33.buoi6.service;

import org.example.demo33.buoi6.entity.Student;
import org.example.demo33.buoi6.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private StudentRepository repository = new StudentRepository();
    public List<Student> getStudents() {
        return  repository.getStudents();
    }

    public void addStudent(Student student) {
        repository.them(student);
    }
    public void xoaStudent(Long id) {
        repository.xoa(id);
    }
    public void suaStudent(Student student) {
        repository.update(student);
    }
}
