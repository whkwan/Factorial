package FactorialCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfOneIsOne {

	@Test
	public void testFactorialOfOneIsOne() {

		int expected = 1;
		int result = new FactorialCalculator().factorial(1);
		assertEquals(expected, result);
	}

}
