package com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.interfaces.Animal;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat Eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat Sleeping");		
	}

	@Override
	public void walking() {
		System.out.println("Cat Walking");		
	}

}
