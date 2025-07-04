package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository <StudentEntity, Integer>{

	@Query("select s from StudentEntity s where s.name=?1")
	List<StudentEntity> pathName(String n);

	@Query(value="select * from student_table where age=?1", nativeQuery=true)
	List<StudentEntity> exceptionAge(int a);

	@Query("select i from StudentEntity i where i.id=?1")
	List<StudentEntity> idException(int i);

}
