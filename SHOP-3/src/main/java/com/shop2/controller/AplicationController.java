package com.shop2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AplicationController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/contact")
	public String Contact() {
		return "contact";
	}
}
