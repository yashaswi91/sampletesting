package com.yashu.springaop;


public class AgeValidator {

	public void validate(int age) throws Exception{
		if(age<25)
		{
			throw new ArithmeticException("Not a valid age for auto insurance");
		}
		
		else{
			System.out.println("valid age");
		}
	}
	
}
