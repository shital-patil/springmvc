package com.cg.springmvc.service.impl;

import com.cg.springmvc.service.Calculator;

public class CalculatorImpl implements Calculator {

	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public double substract(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public double divide(double a, double b) {
		double result = 0.0;
		result = a / b;
		
		if (Double.isNaN(result) || Double.isInfinite(result)) {
			throw new ArithmeticException("operation not valid, output of calculation is : " + result);
		}
		
		return result;
	}

}
