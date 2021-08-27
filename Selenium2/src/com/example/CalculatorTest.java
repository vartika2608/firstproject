package com.example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calc=new Calculator();

  @Test(dataProvider="dpadd")
  public void mul(int exp,int a,int b) {
    Assert.assertEquals(exp,calc.mul(a, b) );
    Reporter.log("Data provider annotation implies for data driven testing",true);
  }

  @Test(enabled=false)
  public void sub() {
	  Assert.assertEquals(10,calc.sub(20, 10) );
  }
  
  @Test(expectedExceptions=ArithmeticException.class) 
  public void div() {
	  
	  int a,b,c;
	  a=10;
	  b=0;
	  c=a/b;
	  System.out.println(c);
	  
}
  
  
  @DataProvider(name="dpadd")
  public Object[][] getData(){
	  Object[][] table_values=new Object[][] {
		  {36,6,6},
		  {25,5,5},
		  {10,3,3}
		  };
		  
		  return table_values;
	  }
  }
  