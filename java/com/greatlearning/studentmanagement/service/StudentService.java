package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.model.Student;

@Service
public interface StudentService {

	public List<Student> findAll();

	public Student findById(int sId);

	public void save(Student sStudent);

	public void deleteById(int sId);

}
