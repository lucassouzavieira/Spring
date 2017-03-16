package com.mm.os.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.mm.os.repository.Clientes;

@Controller
public class ClienteController {
	
	@Autowired
	private Clientes clientes;
	
	@GetMapping("/clientes")
	public ModelAndView hello(){
		ModelAndView modelAndView = new ModelAndView("Hello");
		modelAndView.addObject("clientes", clientes.findAll());
		return modelAndView;
	}

}
