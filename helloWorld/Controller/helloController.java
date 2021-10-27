package com.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {

	@GetMapping
	public String hello() 
	{
		return "Ter uma mentalidade de Persistncia e uma Habilidade de Atenção aos Detalhes";
	}
}
