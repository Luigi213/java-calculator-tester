package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	private Calculator c;
	
	@BeforeEach
	public void initCalculator() {
		final float x = 5;
		final float y = 5;
		
		c = new Calculator(x, y);
	}
	
	@RepeatedTest(10)
	public void getAdd() {
		final float attRes = c.getNum1() + c.getNum2();
		final float res = c.add(5, 5);
		
		assertEquals(attRes, res, "addizioni tra float");
	}
	
	@RepeatedTest(10)
	public void getSubtract() {
		final float attRes = c.getNum1() - c.getNum2();
		final float res = c.subtract(5, 5);
		
		assertEquals(attRes, res, "sottrazioni tra float");
	}
	
	@RepeatedTest(10)
	public void getDivide() {
		final float attRes = c.getNum1() / c.getNum2();
		final float res = c.divide(5, 5);
		
		assertEquals(attRes, res, "divisioni tra float");
	}
	
	@RepeatedTest(10)
	public void getMultiply() {
		final float attRes = c.getNum1() * c.getNum2();
		final float res = c.multiply(5, 5);
		
		assertEquals(attRes, res, "moltiplicazioni tra float");
	}
}
