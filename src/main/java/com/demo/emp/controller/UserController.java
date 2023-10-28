package com.demo.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.emp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String userController(Model model) {
		model.addAttribute("user", service.getAllUsers());
		return "users";
	}

}
