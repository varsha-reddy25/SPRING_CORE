package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
	//	Student obj =(Student)ctx.getBean("std");
		//System.out.println(obj);
	    Order obj1=(Order)ctx.getBean("order1");
		System.out.println(obj1);
	}
}
