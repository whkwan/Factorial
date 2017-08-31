package FactorialCalculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorialOfZeroIsOne {

	@Test
	public void testFactorialOfZeroIsOne() {
		
		//Prepare
		int expected = 1;
		int result = new FactorialCalculator().factorial(0);
		
		//Assert
		assertEquals(expected, result);
	}

}
