package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gobalexception.AgeNotFoundException;
import com.demo.gobalexception.IdNotFountException;
import com.demo.service.StudentService;
import com.demo.studentEntity.StudentEntity;

@RestController
@RequestMapping("/student/api")
public class StudentController {
	
	@Autowired
	StudentService ss;

	@PostMapping("/insertValue")
	
	public String postStudent(@RequestBody List<StudentEntity> s){
		
		return ss.postStudent(s);
	}
	
	@GetMapping("/findStudentId/{a}")
	public List <StudentEntity> findStudentId(@PathVariable int  a) throws IdNotFountException{
		
		return ss.findStudentId(a);
	}
	
	@GetMapping("/findStudentAge/{a}")
	public List<StudentEntity>findStudenAge(@PathVariable int  a) throws IdNotFountException, AgeNotFoundException{
		
		return ss.findStudentAge(a);
	}
	@GetMapping("hello")
	public String hello(){
		
		return "success";
	}
}
