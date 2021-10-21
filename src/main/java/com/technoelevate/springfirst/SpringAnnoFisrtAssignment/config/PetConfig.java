package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity.Pet;

@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {
		return new Pet("XYZ");
	}
}
