package com.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<TestService> {
	@Override
	public TestService getObject() {
		TestService testService=new TestService();
		testService.setName("Jtfu");
		return testService;
	}

	@Override
	public Class<?> getObjectType() {
		return TestService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
