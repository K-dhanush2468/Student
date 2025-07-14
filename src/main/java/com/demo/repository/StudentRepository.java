package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.studentEntity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
	
	@Query(value="Select*from student_table where id=?",nativeQuery=true)

	List<StudentEntity> findStudentId(int a);

	@Query(value="Select*from student_table where age=?",nativeQuery=true)
	List<StudentEntity> findStudentAge(int a);
	
	

}
