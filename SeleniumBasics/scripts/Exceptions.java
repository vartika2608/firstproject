package scripts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exceptions {

	private int[] xs;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Print before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		System.out.println("Print after class");
	}

	@Test(expected = ArithmeticException.class)
	public void test() {
		int a, b, c;
		a = 10;
		b = 0;
		c = a / b;
		System.out.println(c);
	}

	@Test(expected =NullPointerException.class)
	public void test2() {
		xs = null;
		int y= xs.length;
		
		System.out.println(y);

	}

	@Test(expected =ArrayIndexOutOfBoundsException.class)
	public void test3() {
		int z[] = new int[6];
		z[10]= 50;
		
		System.out.println(z);
	}
	
	@Test(expected =NumberFormatException.class)
	public void test4() {
		String t = "xyz";
		int i = Integer.parseInt(t);
		
		System.out.println(t);
	}
	@Test(timeout = 10000)
	public void test5() {
		int k;
		k = 1;
		while (k == 1) {
			System.out.println(k);
		}
	}
}
