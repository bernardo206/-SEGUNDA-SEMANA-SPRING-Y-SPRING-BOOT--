package com.dh.c20231.springboot.primerejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerejemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerejemploApplication.class, args);
	}

	@GetMapping("saludar")
	public String saludar(){
		return "Hola!";
	}

	@GetMapping("año")
	public int quéAñoEs(){
		return 2023;
	}

	@GetMapping("servicioX")
	public String servicioX(){
		X objetoX = new X();

		return objetoX.toString();
	}

}
