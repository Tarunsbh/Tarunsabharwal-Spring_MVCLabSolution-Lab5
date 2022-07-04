package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.studentmanagement.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	public StudentService sdata;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sdata.findAll();
	}

	@Override
	public Student findById(int sId) {
		// TODO Auto-generated method stub
		return sdata.findById(sId);
	}

	@Override
	public void save(Student sStudent) {
		// TODO Auto-generated method stub
		sdata.save(sStudent);
	}

	@Override
	public void deleteById(int sId) {
		// TODO Auto-generated method stub
		sdata.deleteById(sId);
	} 

	

}
