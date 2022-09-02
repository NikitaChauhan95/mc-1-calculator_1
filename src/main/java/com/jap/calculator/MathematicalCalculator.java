package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		return  num1 + num2;
	}
	public int subtract(int num1, int num2)
	{	
		return  num1 - num2;

	}
	public int multiply(int num1, int num2)
	{	
		return num1 * num2;
	}
	/*
	public int divide(int num1, int num2) {
		//write the code and handle the ArithmeticException
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException exception) {
			System.out.println(exception.getMessage());

		}
		return result;
	}

	 */


	public int modulo(int num1, int num2)
	{
		return num1 % num2;
	}
}
