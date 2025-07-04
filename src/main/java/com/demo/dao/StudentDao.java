package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.StudentEntity;
import com.demo.repository.StudentRepository;

@Repository
public class StudentDao {
@Autowired
StudentRepository sr;

public String DetailsPost(List<StudentEntity> s) {
	sr.saveAll(s);
	return "Saved Successfully";
}

public List<StudentEntity> getDetails() {
	return sr.findAll();
}

public List<StudentEntity> namePath(String n) {
	return sr.pathName(n);
}

public List<StudentEntity> ageException(int a) {
	return sr.exceptionAge(a);
}

public List<StudentEntity> iDException(int i) {
	return sr.idException(i);
}
}
