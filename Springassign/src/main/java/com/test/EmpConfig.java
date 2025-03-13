package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
   
	static List<String> comp=Arrays.asList("Accenture","mphasis");
	@Bean
	public static Employee Emp()
	{
		return new Employee(1,"Gita",comp);
	}
	
}
