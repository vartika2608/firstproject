package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupMethods {
	
	@BeforeSuite
	public void before_suite1() {
		System.out.println("Before Suite file");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void before_method1() {
		System.out.println("Before method");
	}
	
	@BeforeTest
	public void before_test1() {
		System.out.println("Before Test");
	}
	
	@Test(groups={"Smoke test","Functional test"}) 
	public void p() {
	System.out.println("First test method");	
	}
	

	@Test(groups={"Functional test"})
	public void q() {
	System.out.println("Second test method");	
	}
	
	 @Test(groups={"Functional test"})
		public void r() {
		System.out.println("Third test method");	
		}
	 
	 @Test(groups={"Smoke test"})
		public void s() {
		System.out.println("Fourth test method");	
		}
	@AfterMethod
	public void after_method1() {
		System.out.println("after method");
	}
	
	@AfterTest
	public void after_test1() {
		System.out.println("after Test");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	
	@AfterSuite
	public void after_suite1() {
		System.out.println("After Suite file ");
	}


}



