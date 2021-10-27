package com.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hallo")
public class ObjetivosController {
	
	@GetMapping
	public String hallo () 
	{
		return "Os meus objetivos para essa semana são me familiarizar com o Spring Tool";
	}
}
