/**
 * 
 */
package com.anil.didemoSpring.services;

import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.didemoManual.services.GreetingService#sayGreeting()
	 */
	@Override
	public String
	sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
