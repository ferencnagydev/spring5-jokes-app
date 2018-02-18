package hu.exercise.ferencnagydev.springbootjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "guru.springframework.norris.chuck")
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJokesAppApplication.class, args);
	}
}
