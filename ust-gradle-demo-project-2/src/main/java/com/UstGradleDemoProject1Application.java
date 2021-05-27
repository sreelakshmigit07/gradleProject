package com;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UstGradleDemoProject1Application {

	public static void main(String[] args) {
		System.out.println("MainApplication");
		SpringApplication.run(UstGradleDemoProject1Application.class, args);
	}
	
	@Deprecated
	private String check() {
		return "Oh no! This was a secret!";
	}
	
	double numDouble = 1.1;

	BigDecimal bigDouble = new BigDecimal(numDouble); // Noncompliant; see comment above
	BigDecimal bigDoublenew = new BigDecimal(1.1); // Noncompliant; same result

}