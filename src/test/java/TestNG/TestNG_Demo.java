package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Demo {
	@Test
	public void Test1()
	{
		//lines of code
		System.out.println("TestNG_Demo-First Test");
	}
	@Test(groups= {"Smoke"})
	public void Test2()
	{
		System.out.println("TestNG_Demo-second Test");
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("This is before method-will be called before execution of every method");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("This is after method-will be called after execution of every method");
	}
	


}
