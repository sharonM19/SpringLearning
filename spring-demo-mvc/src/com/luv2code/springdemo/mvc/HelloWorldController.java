package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFromVersionThree")
	public String processFromVersionThree(@RequestParam("studentName") String theName ,Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Hello ,Welcome to Spring MVC "+ theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	  
	}
	

}
