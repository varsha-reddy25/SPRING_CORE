package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudConfig {

	@Bean
	public static Student getstud()
	{
		return new Student();
	}
	
   @Bean
   public static Order getOrder()
   {
	   return new Order(11,"Apple",234);
   }
}
