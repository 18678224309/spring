package com.service;

import org.springframework.context.annotation.*;

@ComponentScan("com.service")
@Description("这是一个描述注解，会被Spring设置到BD的属性中")
public class App {


/*	@Bean
	public TestService testService(){
		System.err.println("testService");
		return new TestService();
	}

	@Bean
	public A a(){
		testService();
		return new A();
	}*/
}
