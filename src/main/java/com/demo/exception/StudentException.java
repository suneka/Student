package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {
@ExceptionHandler(NameNotFound.class)
public ResponseEntity<Object>namenot(NameNotFound e){
	return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(AgeNotFound.class)
public ResponseEntity<Object>agenot(AgeNotFound a){
	return new ResponseEntity<Object>(a.getMessage(), HttpStatus.NOT_FOUND);
}
@ExceptionHandler(IdNotFound.class)
public ResponseEntity<Object>idnot(IdNotFound i){
	return new ResponseEntity<Object>(i.getMessage(), HttpStatus.NOT_FOUND);
}
}
