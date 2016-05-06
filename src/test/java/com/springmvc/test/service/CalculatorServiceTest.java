package com.springmvc.test.service;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.springmvc.service.impl.CalculatorImpl;

 
 
public class CalculatorServiceTest {

	@Test
    public void testAdd(){
		CalculatorImpl calculatorService = new CalculatorImpl();
        assertNotNull(calculatorService);        
        double result = calculatorService.add(Double.valueOf(1), Double.valueOf(1));
        assertEquals(2.0D, result, 0.0D);
        
    }
    
    @Test
    public void testSubstract(){
    	CalculatorImpl calculatorService = new CalculatorImpl();
        
        double result = calculatorService.substract(Double.valueOf(2), Double.valueOf(1));
        assertEquals(1.0D, result, 0.0D);
        

    }
    
    @Test
    public void testMultiply(){
    	CalculatorImpl calculatorService = new CalculatorImpl();
        
        double result = calculatorService.multiply(Double.valueOf(2), Double.valueOf(1));
        assertEquals(2.0D, result, 0.0D);
        

    }
    
    @Test
    public void testDivide(){
    	CalculatorImpl calculatorService = new CalculatorImpl();
        
        double result = calculatorService.divide(Double.valueOf(2), Double.valueOf(1));
        assertEquals(2.0D, result, 0.0D);        
    } 
    
    @Test(expected = ArithmeticException.class)
    public void testException(){
    	CalculatorImpl calculatorService = new CalculatorImpl();
        
        calculatorService.divide(Double.valueOf(2), Double.valueOf(0));          
        
    }     
}