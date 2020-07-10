package com.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource("classpath:spring.properties")
@Component
public class TestService {

	@Value("${name}")
	String name;



	public void test(){
		System.err.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}

}
