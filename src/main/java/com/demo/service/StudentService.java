package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.entity.StudentEntity;
import com.demo.exception.AgeNotFound;
import com.demo.exception.IdNotFound;
import com.demo.exception.NameNotFound;

@Service
public class StudentService {
@Autowired
StudentDao sd;

public String postdetails(List<StudentEntity> s) {
	return sd.DetailsPost(s);
}

public List<StudentEntity> GetDetails() {
	return sd.getDetails();
}

public List<StudentEntity> pathName(String n) throws NameNotFound {
	if(sd.namePath(n).isEmpty()) {
		throw new NameNotFound("the name does not exist");
	}else {
		return sd.namePath(n);
	}
}

public List<StudentEntity> ageexception(int a) throws AgeNotFound{
	if(sd.ageException(a).isEmpty()) {
		throw new AgeNotFound("the age does not exist");
	}else {
	return sd.ageException(a);
	}
}

public List<StudentEntity> IdException(int i) throws IdNotFound{
	if(sd.iDException(i).isEmpty()) {
		throw new IdNotFound("The id does not exist");
	}else {
	return sd.iDException(i);
	}
}
}
