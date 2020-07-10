package com.service;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import org.springframework.stereotype.Component;


public class UserServiceImpl implements UserService1,UserService2,
		ApplicationContextAware, BeanFactoryAware {

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//System.err.println(applicationContext.getBeanDefinitionNames().length);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		//DefaultListableBeanFactory b= (DefaultListableBeanFactory) beanFactory;
	}
}
