package dummy1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Assertstatements {
	Calculator tc = new Calculator();

	int a = 7;
	int b = 9;
	String exc = "JUnit";
	String act = "JUnit";

	@Before
	public void before() {

		System.out.println("Before Method");

	}

	@Test
	public void testadd() {
		System.out.println("AssertEquals");
		assertEquals(20, tc.add(14, 6));
	}

	@Test
	public void testcompareString()

	{
		System.out.println("AssertEquals");
		assertEquals("Selenium", tc.compareString("Selenium"));

	}

	@Test
	public void assertNotNull()

	{
		System.out.println("AssertNotNull");

		String newstr =null;
		Assert.assertNotNull(newstr);

	}

	@Test
	public void assertArray()

	{
		System.out.println("AssertArrayEquals");
		int[] act = { 1, 2, 3, 4 };
		int[] exc = { 1, 2, 3, 4 };
		assertArrayEquals(exc, act);

	}

	@Test
	public void assertSame()

	{
		System.out.println("AssertSame");

		Assert.assertSame("The Strings are same", exc, act);

	}

	@Test
	public void assertNotSame()

	{
		System.out.println("AssertNotSame");
		Assert.assertNotSame(exc, act);
	}

	@Test
	public void assertTrue()

	{
		System.out.println("AssertTrue");
		Assert.assertTrue(a > b);
	}

	@Test
	public void assertFalse()

	{
		System.out.println("AssertFalse");
		Assert.assertFalse(a < b);

	}

	@After
	public void after()

	{
		System.out.println("After Method");
	}
}
