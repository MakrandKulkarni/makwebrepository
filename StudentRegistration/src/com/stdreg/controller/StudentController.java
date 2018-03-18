package com.stdreg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class StudentController {
	
	@RequestMapping(value="welcome", method=RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(){
		
		return "register";
		
	}

}
