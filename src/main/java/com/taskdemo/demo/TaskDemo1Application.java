package com.taskdemo.demo;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class TaskDemo1Application {

	public static void main(String[] args) {
		System.out.println("main run");
		SpringApplication.run(TaskDemo1Application.class, args);
		System.out.println("After run method");
	}

}
