package com.demo.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GalleryController {
	
	@RequestMapping(value="/gallery", method=RequestMethod.GET)
	public String gallery() {
		return "gallery";
	}

}
