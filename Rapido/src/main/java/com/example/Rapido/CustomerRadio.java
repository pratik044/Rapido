package com.example.Rapido;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/asdf")
public class CustomerRadio 
{
	@GetMapping(path="/guru")
	public String check()
	{
		return "CR7 GOAT";
	}
}