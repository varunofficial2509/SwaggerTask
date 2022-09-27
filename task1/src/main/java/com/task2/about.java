package com.task2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class about 
{

	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	

}
