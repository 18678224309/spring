package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Import(A.class)
public class TestConfig {

	@Bean
	public TestService testService(){
		System.err.println("testService");
		return new TestService();
	}

	@Bean
	public A a(){
		testService();
		return new A();
	}


}
