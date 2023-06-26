package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// Stereotype annotation of @Component
public class HelloController {
	
	// adding the request mapping -->URL
	@RequestMapping("/hello")
   public String giveHelloMassage() {
		return "hello";
	}
	
	// adding the request mapping -->URL
		@RequestMapping("/goodbye")
	   public String giveGoodbyeMassage() {
			return "goodbye";
		}
		
		// adding the request mapping -->URL
		@RequestMapping("/")
	   public String WelcomeMassage() {
			return "welcome";
		}
}
