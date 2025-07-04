package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.StudentEntity;
import com.demo.exception.AgeNotFound;
import com.demo.exception.IdNotFound;
import com.demo.exception.NameNotFound;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentService ss;

@PostMapping("/postdetails")
public String PostDetails(@RequestBody List<StudentEntity> s) {
	return ss.postdetails(s);
}
@GetMapping("/getdetails")
public List<StudentEntity> getDetails(){
	return ss.GetDetails();
}
@GetMapping("/pathName/{n}")
public List<StudentEntity>namePath(@PathVariable String n) throws NameNotFound{
	return ss.pathName(n);
}
@GetMapping("/ageException/{a}")
public List<StudentEntity>ageException(@PathVariable int a) throws AgeNotFound{
	return ss.ageexception(a);
}
@GetMapping("/idException/{i}")
public List<StudentEntity>idException(@PathVariable int i) throws IdNotFound{
	return ss.IdException(i);
}
}
















