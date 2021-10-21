package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.interfaces.Animal;

import lombok.Data;

@Data
public class Pet {

	private String name;
	@Autowired
	@Qualifier("cat")
	private Animal cat;
	@Autowired
	@Qualifier("dog")
	private Animal dog;

	public Pet(String name) {
		this.name = name;
	}

}
