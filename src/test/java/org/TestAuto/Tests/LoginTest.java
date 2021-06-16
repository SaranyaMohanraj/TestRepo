package org.TestAuto.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.TestAuto.Login.*;

public class LoginTest {
	
	
	@BeforeMethod
	public void Beforetestmethod()
	{
	System.out.println("Beforetestmethod");
	}

	@Test
	public void Duringtest()
	{
		Loginclass objlogin = new Loginclass();
		System.out.println("Duringtest");
	}
	@AfterMethod
	public void Aftertestmethod()
	{
	System.out.println("Aftertestmethod");
	}
}
