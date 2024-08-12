package com.rev;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.revature.Calculator;

public class CalculatorTest {
	@Test
	public void testSum() {
		//Arrange
		Calculator calculator = new Calculator();
		int inp1 = 10;
		int inp2 = 10;
		int result = 0;
		
		//Act
		result = calculator.sum(inp1, inp2);
		
		//Assert
		Assertions.assertEquals(20, result);
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All...");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each...");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All....");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("After Each...");
	}
	
}
