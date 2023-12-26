package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank_Loans {
@Test
	public void Bank_personalLoans() 
	{
	System.out.println("BankLoans : personalLoans code");	
	}
@Test(groups= {"Smoke"})
	public void Bank_homeLoans() 
	{
	System.out.println("BankLoans : homeLoans code");	
	}
@Test
	public void Bank_carLoans() 
	{
	System.out.println("BankLoans : carLoans code");	
	}
   @BeforeTest
   public void BefTest()
   {
	   System.out.println("Before test code started");
   }
   @AfterTest
   public void AftTest()
   {
	   System.out.println("After test code completed");
   }
}

