package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getLandingPage() {
		return "landingPage";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}

}