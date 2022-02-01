package com.example.demoRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoRestApplication {

	public static void main(String[] args) {


		SpringApplication.run(DemoRestApplication.class, args);
	}
	//homepage
	@RequestMapping("/")
	public String index() {
		return "1st Spring app！";
	}
	//getMethod
	//http://localhost:8080/saludar?name=Gerson
	@RequestMapping("/saludar")
	public String saludar(
			@RequestParam(value="name", defaultValue = "defaultName") String name
	) {
		return String.format("Hello %s!",name);
	}



}
