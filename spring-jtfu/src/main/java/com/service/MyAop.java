package com.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAop {


	@Pointcut("execution(* com.service.A.*(..))")
	public void pointCut(){}



	/*@Before("pointCut()")*/
	public void Before()  {
		System.out.println("-----------------------------切面");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("before-------");
		Object proceed = point.proceed();
		System.out.println("after-------");
		return proceed;
	}
}
