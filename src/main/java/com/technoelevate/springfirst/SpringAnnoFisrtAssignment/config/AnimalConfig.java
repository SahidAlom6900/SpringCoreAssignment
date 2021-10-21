package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity.Cat;
import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity.Dog;
import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.interfaces.Animal;

@Configuration
public class AnimalConfig {
	@Bean("dog")
	public Animal getDog() {
		return new Dog();
	}

	@Bean("cat")
	public Animal getCat() {
		return new Cat();
	}
}
