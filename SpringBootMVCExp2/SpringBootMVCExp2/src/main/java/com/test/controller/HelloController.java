package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String hompage()
	{
		return "home";
	}
	
	@RequestMapping("/user")
	public String userForm()
	{
		return "userform";
	}
}
