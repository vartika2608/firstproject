package scripts;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void testSub() {
		assertEquals(5, calc.sub(10, 5));
	}

	@Test
	public void testMul() {

		assertEquals(20, calc.mul(5, 4));

	}

}