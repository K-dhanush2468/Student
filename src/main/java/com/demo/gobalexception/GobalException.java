package com.demo.gobalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GobalException {
	
	@ExceptionHandler(IdNotFountException.class)
	
	public ResponseEntity<Object>getId(IdNotFountException e){
		
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AgeNotFoundException.class)
	
	public ResponseEntity<Object>getAge(AgeNotFoundException e){
		
		
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
