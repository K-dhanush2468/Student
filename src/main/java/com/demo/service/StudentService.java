package com.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.gobalexception.AgeNotFoundException;
import com.demo.gobalexception.IdNotFountException;
import com.demo.studentEntity.StudentEntity;

@Service
public class StudentService {
	
	@Autowired
	StudentDao sd;

	public String postStudent(List<StudentEntity> s) {
		// TODO Auto-generated method stub
		return sd.postStudent(s);
	}

	public List<StudentEntity> findStudentId(int a) throws IdNotFountException {
		// TODO Auto-generated method stub
		
		if(sd.findStudentId(a).isEmpty()) {
			
			throw new IdNotFountException("Not Found");
		}else {
		return sd.findStudentId(a);
		
		}
	}

	public List<StudentEntity> findStudentAge(int a) throws AgeNotFoundException {
		// TODO Auto-generated method stub
		if(sd.findStudentAge(a).isEmpty()) {
			throw new AgeNotFoundException("Not Found");
		}else {
		return sd.findStudentAge(a);
		}
	}

}
