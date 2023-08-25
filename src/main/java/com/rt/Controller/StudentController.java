package com.rt.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.rt.Entity.Student;
import com.rt.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
	@Autowired
	StudentService stud;
	
	@PostMapping("/std")
	public String addStudent(@RequestBody Student e){
		
		stud.addStudent(e);
		
		return "Added successfully";
		
	}
	
	
	
	//Seect syudent by id**********************************************************************************
	
	
	@PostMapping("/student/id/{id}")
	public Student getById(@PathVariable int id ){
		
		Student e = stud.getById(id);
	
	 return e;
		
	}
	//Delete operation**********************************************************************************
	
	
	@DeleteMapping("/student/id/{id}")
	public String deletStudent(@PathVariable int id ){
		
		Student s = stud.deleteStudentById(id);
	
	 return " Student Deleted  Succesfully";
		
	}


	

		
		
		
		
	}




