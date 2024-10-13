package com.rahul.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.StudentsManagementSystem.entity.Student;
import com.rahul.StudentsManagementSystem.repository.Studentrepository;
import com.rahul.StudentsManagementSystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	Studentrepository studentrepository;

	@Override
	public List<Student> getAllstudents() {
		
		return studentrepository.findAll();
	}

	@Override
	public Student SaveStudent(Student student) {
	
		return studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		studentrepository.deleteById(id);
		
	}
}
