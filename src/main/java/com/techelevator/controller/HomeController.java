package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHomePage() {
		return "home";
	}
	
	@RequestMapping(path="/about", method=RequestMethod.GET)
	public String displayAboutPage() {
		return "about";
	}
	
	@RequestMapping(path="/pricing", method=RequestMethod.GET)
	public String displayPricePage() {
		return "pricing";
	}
	
//	@RequestMapping(path="/contact", method=RequestMethod.GET)
//	public String displayBenefitsPage() {
//		return "contact";
//	}
}