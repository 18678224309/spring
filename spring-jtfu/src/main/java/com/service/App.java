package com.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.*;

/**
 * SpringAop的主要实现原理是@EnableAspectJAutoProxy 中的 @Import(AspectJAutoProxyRegistrar.class)；
 * AspectJAutoProxyRegistrar 这个类中 注册了一个 AnnotationAwareAspectJAutoProxyCreator 的bd；
 * 这个bd实现了 SmartInstantiationAwareBeanPostProcessor 接口，在Spring实例化Bean的过程中 会调用这个处理器的
 * getEarlyBeanReference 方法，Spring就在这里完成了AOP；
 */
@ComponentScan("com.service")
@EnableAspectJAutoProxy
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
