package com.service;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class BeanOne implements FactoryBean {

	@Value("${one:ooooo}")
	private String One;

	public void BeanOne(){
		System.out.println(One);
	}


	public String getOne() {
		return One;
	}

	public void setOne(String one) {
		One = one;
	}

	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
