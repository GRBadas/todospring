package com.badas.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DocumentationApplication {

	@RequestMapping("/")
	String home() {
		return "Hello Spring";
	}
	public static void main(String[] args) {
		SpringApplication.run(DocumentationApplication.class, args);
	}

}
