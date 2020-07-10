package com.jtfu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Spring_Test {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Spring_jtfu.class);

		//ac.register(Spring_jtfu.class);
		//ac.addBeanFactoryPostProcessor(beanFactory -> System.out.println("=========================="));
		//ac.refresh();
		//ac.getBean("a");
	}
}
