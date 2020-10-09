package com.testng.Firstpackage;

import org.testng.annotations.Test;

public class EnableDisableTests {

	@Test
	public void firstTest()
	{
		System.out.println("First Test Executed");
	}
       
	@Test(enabled=false)
	public void secondTest()
	{
		System.out.println("Second Test Executed");
	}
	
	@Test
	public void ThirdTest()
	{
		System.out.println("Third Test Executed");
	}

}