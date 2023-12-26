package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bank_Cards {
	@Test
	public void CreditCards()
	{
		System.out.println("Bank cards -Credit card code");	
	}
	@Test(groups= {"Smoke"})
	public void DebitCards()
	{
	System.out.println("Bank cards -Debit card code");	
	}
	@Test(timeOut=50000)
	public void InsuranceCards()
	{
		System.out.println("Bank cards -Insurance card code");
	}
	@Test(enabled=false)
	public void HealthCards()
	{
		System.out.println("Bank cards -Health card code");
	}
	
	@BeforeSuite
	public void BefSuite()
	{
		System.out.println("before suite code started");
	}
	@AfterSuite
	public void AftSuite()
	{
		System.out.println("After suite code completed");
	}
	


}
