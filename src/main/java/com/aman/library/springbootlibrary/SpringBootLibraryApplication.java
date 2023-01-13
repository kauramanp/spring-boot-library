package com.aman.library.springbootlibrary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aman.library.springbootlibrary.model.StudentModel;

@SpringBootApplication
public class SpringBootLibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryApplication.class, args);
		System.out.println("After commandline runner");
	}

	@Override
	public void run(String... args) throws Exception {
		StudentModel studentModel = new StudentModel();
		studentModel.setRollno(1);
		studentModel.setName("Amanpreet");
		System.out.println("Information "+studentModel.toString());
	}

}