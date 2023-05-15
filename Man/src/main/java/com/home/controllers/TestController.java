package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	@RequestMapping("/Pain")
	public String hello(Model model) {
		model.addAttribute("name", "Madhav");
		return "index";
	}
}
