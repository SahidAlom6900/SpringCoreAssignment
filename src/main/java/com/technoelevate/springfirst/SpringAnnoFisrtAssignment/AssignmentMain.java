package com.technoelevate.springfirst.SpringAnnoFisrtAssignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.config.AllConfig;
import com.technoelevate.springfirst.SpringAnnoFisrtAssignment.entity.Pet;

public class AssignmentMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet bean = context.getBean(Pet.class);
		System.out.println(bean.getName());
		bean.getCat().eat();
		bean.getCat().sleep();
		bean.getCat().walking();
		bean.getDog().eat();
		bean.getDog().sleep();
		bean.getDog().walking();
		context.close();
	}
}
