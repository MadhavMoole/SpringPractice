package com.ecommerce.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//Need to define a controller so that spring will create an object of this class and it will be ready to use wherever you want inside the IoC container
@Controller
//In Order to identify this class as a part of the Spring web app, Component scanning is required.
@ComponentScan(basePackages = "com.ecommerce")
public class LoginController {
	
	//used for sending response to a specific request by the user
	@ResponseBody
	//assigned to respond whenever the user sends a request to this particular url 
	@RequestMapping("/login")
	public String login() {
		return "This is a Login Page";
	}
	
	@ResponseBody
	@RequestMapping("/logout")
	public String logout() {
		return "You Logged out!";
	}
}
