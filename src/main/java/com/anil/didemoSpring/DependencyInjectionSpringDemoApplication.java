package com.anil.didemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.didemoSpring.controllers.ConstructorInjectedDIController;
import com.anil.didemoSpring.controllers.PropertyInjectedController;
import com.anil.didemoSpring.controllers.SetterInjectedDIController;

@SpringBootApplication
public class DependencyInjectionSpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DependencyInjectionSpringDemoApplication.class,
				args);

		System.out.println("Property Injected : " + run.getBean(PropertyInjectedController.class).sayHello());
		System.out.println("Setter Injected : " + run.getBean(SetterInjectedDIController.class).sayHello());
		System.out.println("Constructor Injected : " + run.getBean(ConstructorInjectedDIController.class).sayHello());
	}
}
