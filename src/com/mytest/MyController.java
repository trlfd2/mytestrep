package com.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/start.ly")
	public String ProjectStart() {
		System.out.println("test123");
		return "mystart";
	}
}
