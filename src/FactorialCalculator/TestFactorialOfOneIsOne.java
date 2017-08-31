package FactorialCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfOneIsOne {

	@Test
	public void testFactorialOfOneIsOne() {

		//Prepare
		int expected = 1;
		int result = new FactorialCalculator().factorial(1);
		
		//Assert
		assertEquals(expected, result);
	}

}
