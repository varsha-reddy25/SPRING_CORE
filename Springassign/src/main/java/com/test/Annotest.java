package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee obj=(Employee)ctx.getBean("Emp");
		System.out.println(obj);
	}
}
