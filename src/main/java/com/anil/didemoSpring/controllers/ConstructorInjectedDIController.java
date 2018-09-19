/**
 * 
 */
package com.anil.didemoSpring.controllers;

import org.springframework.stereotype.Controller;

import com.anil.didemoSpring.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class ConstructorInjectedDIController {

	private GreetingService greetingService;

	/*
	 * For constructor based DI Injection @Autowired is not required framework will
	 * default it
	 */
	public ConstructorInjectedDIController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
