package com.rahul.StudentsManagementSystem.service;

import java.util.List;

import com.rahul.StudentsManagementSystem.entity.Student;


public interface StudentService {

	public List<Student>getAllstudents();
	
	public Student SaveStudent(Student student);
	
	public Student getById(int id);
	
	public void deleteById(int id);
}
