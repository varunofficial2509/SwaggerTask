package com.task;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class person 
{
	@RequestMapping("/varun")
	public String varun()
	{
		return "person";
	}
	
//	@RequestMapping("/about")
//	public String about()
//	{
//		return "about";
//	}
	

}