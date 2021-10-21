package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.interfaces.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog Sleeping");		
	}

	@Override
	public void walking() {
		System.out.println("Dog Walking");		
	}

}
