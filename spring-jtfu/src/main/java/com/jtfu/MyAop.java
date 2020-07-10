package com.jtfu;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAop {


	@Pointcut("execution(void com.jtfu.A.*(..))")
	public void pointCut(){}



	@Before("pointCut()")
	public void Before()  {
		System.out.println("-----------------------------切面");
	}
}
