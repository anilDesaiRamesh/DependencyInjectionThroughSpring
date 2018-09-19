/**
 * 
 */
package com.anil.didemoSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anil.didemoSpring.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class SetterInjectedDIController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
