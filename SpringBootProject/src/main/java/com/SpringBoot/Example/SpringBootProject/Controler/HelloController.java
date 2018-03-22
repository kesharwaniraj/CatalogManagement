package com.SpringBoot.Example.SpringBootProject.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Welcom to spring Boot";
	}

}
