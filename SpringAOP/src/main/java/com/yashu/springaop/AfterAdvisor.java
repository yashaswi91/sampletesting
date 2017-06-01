package com.yashu.springaop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
public class AfterAdvisor implements AfterReturningAdvice{
//this is saran
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("After returning advice is called");
		
	}
}

