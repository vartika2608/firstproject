package com.example;

import org.testng.annotations.Test;

public class dependMethods {

	@Test(dependsOnMethods = { "q" })
	public void p() {
		System.out.println("First test method");
	}

	@Test
	public void q() {
		System.out.println("Second test method");
	}

	@Test
	public void r() {
		System.out.println("Third test method");
	}

	@Test
	public void s() {
		System.out.println("Fourth test method");
	}

}
