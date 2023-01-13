package com.aman.library.springbootlibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aman.library.springbootlibrary.model.StudentModel;

//@Controller
@RestController
public class RestControllerClass {
	
	@GetMapping("/info")
	//@ResponseBody
	public StudentModel get() {
		StudentModel student = new StudentModel();
		student.setName("Aman");
		student.setRollno(1);
		return student;
	}
	
	@PostMapping("/getInfo")
	public StudentModel getStudent(int rollno, String name) {
		StudentModel student = new StudentModel();
		student.setName(name);
		student.setRollno(rollno);
		return student;
		
	}

}
