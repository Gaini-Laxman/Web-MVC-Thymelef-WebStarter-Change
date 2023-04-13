package com.klinnovations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Good Evening");
		return "index";
	}
	
	@GetMapping("/hello")
	
	public String sayHello() {
	String msg = "Hello, How are you ?";
		return msg;
	}

}
