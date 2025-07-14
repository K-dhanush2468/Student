package com.demo.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.repository.StudentRepository;
import com.demo.studentEntity.StudentEntity;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository sr;

	public String postStudent(List<StudentEntity> s) {
		// TODO Auto-generated method stub
		
		sr.saveAll(s);
		
		return "succsess";
	}

	public List<StudentEntity> findStudentId(int a) {
		// TODO Auto-generated method stub
		
		
		  
		return sr.findStudentId(a);
	}

	public List<StudentEntity> findStudentAge(int a) {
		// TODO Auto-generated method stub
		return sr.findStudentAge(a);
	}

	
	
}
