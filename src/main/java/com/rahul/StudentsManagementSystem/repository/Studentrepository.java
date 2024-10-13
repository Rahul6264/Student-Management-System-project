
package com.rahul.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.StudentsManagementSystem.entity.Student;


@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{
	
	
}

