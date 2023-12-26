package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.MediaEntityBuilder;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.SL_LPObjects;
import pageObjects.InvPageObjects;
import pageObjects.CartPageObjects;
import pageObjects.CheckoutPage1;
import pageObjects.CheckoutPage2;

public class SL_ExtentReport2 {

	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("SL_Report1.html");
        extent.attachReporter(spark);

        extent.createTest("SwagLabs")
                .addScreenCaptureFromPath("extent1.png")
                .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent1.png").build());

        extent.createTest("Test Execution").info("Started");
             
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		SL_LPObjects LPObj=new SL_LPObjects(driver);
		LPObj.enterUsername("standard_user");
		LPObj.enterPassword("secret_sauce");
		LPObj.clickLoginbtn();
extent.createTest("Inventory page validation").pass("Navigated to inventory page successfully");		
	
//inventory page code
	InvPageObjects IP=new InvPageObjects(driver);
	IP.addBackpack();
	IP.addBikeligt();
	IP.addTshirt();
	IP.clickonCart();
	extent.createTest("Swaglabs_E2EFlow").pass("Navigated to cart page");
	
	
	//cart page code
	
	CartPageObjects CP=new CartPageObjects(driver);
	CP.Rm_bikeLight();
	CP.Checkout();
	extent.createTest("Cart page validation").pass("Navigated to cart page successfully");	
		// checkout page1 code
	
	CheckoutPage1 Chk1=new CheckoutPage1(driver);
	Chk1.First_Name("sailakshmi");
	Chk1.Last_Name("Raghavarju");
	Chk1.Postal_Code("524003");
	Chk1.ContinueButton();
	extent.createTest("Checkout page 2 validation").pass("Navigated to check out page 2 successfully");	
	
	//checkout page 2 code
	CheckoutPage2 Chk2=new CheckoutPage2(driver);
	extent.createTest("Thank you page validation").pass("Navigated to thank you page successfully");	
	Chk2.Finish();
	  driver.close();
	System.out.println("test completed successfully");
	 extent.createTest("Test Execution").info("completed");
	
	extent.flush();

		
	}
}
