package FactorialCalculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfZeroIsOne {

	@Test
	public void testFactorialOfZeroIsOne() {
		int expected = 1;
		int result = new FactorialCalculator().factorial(0);
		assertEquals(expected, result);
	}

}
