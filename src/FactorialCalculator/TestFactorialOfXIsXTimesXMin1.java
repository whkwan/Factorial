package FactorialCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfXIsXTimesXMin1 {

	@Test
	public void test() {

		int x = 10;
		int result = new FactorialCalculator().factorial(x);
		assertEquals((x-1)*x, result);
	}

}
