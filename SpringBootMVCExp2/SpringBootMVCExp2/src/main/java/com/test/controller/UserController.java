package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class UserController {

	/*
	 //http method
	@RequestMapping("/submituser")
	public String submitForm(HttpServletRequest request,Model model)
	{
		
		String user=request.getParameter("user");
		String pas=request.getParameter("pwd");
		
		User user1 = new User();
		
		user1.setUserName("user");
		user1.setPassword(pas);
		
		model.addAttribute("info",user1);
		
		return "userdata";*/
	
	//spring boot approach
	@RequestMapping("/submituser")
	public String submitform(@RequestParam("user") String usr,
			@RequestParam("pwd") String pas,Model model,User user)
	{
		user.setPassword(pas);
		user.setUserName(usr);
		
		model.addAttribute("info",user);
	
		return "userdata";
	
	
	}
}
