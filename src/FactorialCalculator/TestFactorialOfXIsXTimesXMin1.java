package FactorialCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfXIsXTimesXMin1 {

	@Test
	public void test() {

		//Prepare
		int x = 10;
		int result = new FactorialCalculator().factorial(x);
		
		//Assert
		assertEquals((x-1)*x, result);
	}

}
