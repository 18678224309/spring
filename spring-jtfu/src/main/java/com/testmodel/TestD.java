package com.testmodel;

import com.service.*;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Map;


public class TestD {
	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext cc=new ClassPathXmlApplicationContext("classpath:spring.xml");*/

	    AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(App.class);
		System.err.println(ac.getBean(App.class));


	/*	XmlBeanFactory cc=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		TestService bean = cc.getBean(TestService.class);
		bean.test();*/

		/*Resource resource=new ClassPathResource("test.txt");
		System.err.println(resource.exists());*/
	}
}
