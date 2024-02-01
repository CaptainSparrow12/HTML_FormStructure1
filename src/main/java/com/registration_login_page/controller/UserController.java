package com.registration_login_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration_login_page.model.User;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegister(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		System.out.println(user.getUsername());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getDob());
		
		return "welcome";
	}
	
}
