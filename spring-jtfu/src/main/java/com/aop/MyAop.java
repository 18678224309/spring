package com.aop;



import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAop {


	@Pointcut("execution(* com.jtfu.A.*.*(..))")
	public void pointCut(){}



	@Before("pointCut")
	public void Before()  {
		System.out.println("-----------------------------切面");
	}
}
