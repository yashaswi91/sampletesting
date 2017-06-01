package com.yashu.springaop;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.naming.directory.ModificationItem;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable{
		
		System.out.println("additional concern before actual logic");
		System.out.println("method info:" +method.getName()+" "+method.getModifiers());
		
		int x = method.getModifiers();
		String modifier = Modifier.toString(x);
		System.out.println(modifier);
		System.out.println("argument info: ");
		
		for(Object arg:args)
			System.out.println(arg);
		System.out.println("target object:"+target);
		System.out.println("target object class name: "+target.getClass().getName());
	}
	
}
