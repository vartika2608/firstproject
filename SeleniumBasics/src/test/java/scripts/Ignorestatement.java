package scripts;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class Ignorestatement {

	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(10, calc.add(5, 5));
	}

	@Ignore
	@Test
	public void testDiv() {

		assertEquals(5, calc.div(20, 4));

	}

}