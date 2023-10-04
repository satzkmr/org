package com.example.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(com.example.org.controller)
public class OrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgApplication.class, args);
	}

}
