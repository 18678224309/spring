package com.service;

public class Student extends People{
	@Override
	public People getPeople() {
		return this;
	}
}
