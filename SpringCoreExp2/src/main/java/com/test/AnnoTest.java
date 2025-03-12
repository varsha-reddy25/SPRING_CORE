package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(StudConfig.class);
		
	/*	Student obj=(Student)ctx.getBean("getstud");
		obj.setId(111);
		obj.setName("Rita");
		List<String> skills=Arrays.asList("python","C");
		obj.setSkills(skills);
		System.out.println(obj);*/
		
		Order obj =(Order)ctx.getBean("getOrder");
		System.out.println(obj);
		
	
	}
}
