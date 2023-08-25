package com.rt.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentService {
	@Autowired
		StudentDao dao;
	
	public void addStudent(Student e) {
		
		dao.save(e);
		
	}
//Select by id operation******************************************************************************
	public Student getById(int id) {
		Student s = null;
		
		Optional < Student > s1 = dao.findById(id);
		
		if (s1.isPresent()) {
			
			s = s1.get();
					
					return s ;
			
		} 
		return s;
		

	}
//Delete operation******************************************************************************
	public Student deleteStudentById(int id) {
		dao.deleteById(id);

		return null;
	}
	
	


		
	

		

}
