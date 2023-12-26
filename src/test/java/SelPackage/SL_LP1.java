package SelPackage;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.SL_LPObjects;
import pageObjects.InvPageObjects;
import pageObjects.CartPageObjects;
import pageObjects.CheckoutPage1;
import pageObjects.CheckoutPage2;
import pageObjects.Checkout_CompletePage;
public class SL_LP1 {
	
	ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("SLA_Report1.html");
    
	
	WebDriver driver;
	@Parameters({"URL"})
	@BeforeTest
	public ExtentReports LaunchBrowser(String URL)
	{
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println(URL);
		extent.attachReporter(spark);

	    extent.createTest("SwagLabbs")
	            .addScreenCaptureFromPath("extent1.png")
	            .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent1.png").build());

	    extent.createTest("Test Execution").info("Started");
	    return extent;
		
		
	}
//inventory page code
		@BeforeClass
		public void LoginTest()
		{
				SL_LPObjects LPObj=new SL_LPObjects(driver);
				LPObj.enterUsername("standard_user");
				LPObj.enterPassword("secret_sauce");
				LPObj.clickLoginbtn();
                String Pg1=driver.getCurrentUrl();
                String[] Page1=Pg1.split("https://www.saucedemo.com/");
                System.out.println(Page1[1]);
                Assert.assertEquals(Page1[1],"inventory.html","InvPage validation");
                
                if(Arrays.asList(Page1).contains("inventory.html"))
                {
                extent.createTest("Inventory page validation").pass("Navigated to inventory page successfully");
                }
                else
                {
                	extent.createTest("Inventory page validation").fail("Not navigated to inventory page ");	
                }

		}
		//inventory page code
		@Test
		public void InvPage()
		{
			InvPageObjects IP=new InvPageObjects(driver);
			IP.addBackpack();
			IP.addBikeligt();
			IP.addTshirt();
			IP.clickonCart();
			String Pg2=driver.getCurrentUrl();
            String[] Page2=Pg2.split("https://www.saucedemo.com/");
            System.out.println(Page2[1]);
            Assert.assertEquals(Page2[1],"cart.html","cart Page validation");
            
            if(Arrays.asList(Page2).contains("cart.html"))
            {
            extent.createTest("cart Page validation").pass("Navigated to cart page successfully");
            }
            else
            {
            	extent.createTest("cart Page validation").fail("Not navigated to cart page ");	
            }
		}
			//cart page code
		@Test(dependsOnMethods={"InvPage"})
			public void CartPage()
			{
			CartPageObjects CP=new CartPageObjects(driver);
			CP.Rm_bikeLight();
			CP.Checkout();
			String Pg3=driver.getCurrentUrl();
            String[] Page3=Pg3.split("https://www.saucedemo.com/");
            System.out.println(Page3[1]);
            Assert.assertEquals(Page3[1],"checkout-step-one.html","checkout page 1 Page validation");
            
            if(Arrays.asList(Page3).contains("checkout-step-one.html"))
            {
            extent.createTest("checkout Page validation").pass("Navigated to checkout page 1 successfully");
            }
            else
            {
            	extent.createTest("checkout Page validation").fail("Not navigated to checkout page 1");	
            }
            
           
			}	// checkout page1 code
		@Test(dependsOnMethods={"CartPage"})
			public void ChkoutPage()
			{
			CheckoutPage1 Chk1=new CheckoutPage1(driver);
			Chk1.First_Name("sailakshmi");
			Chk1.Last_Name("Raghavarju");
			Chk1.Postal_Code("524003");
			Chk1.ContinueButton();
			String Pg4=driver.getCurrentUrl();
            String[] Page4=Pg4.split("https://www.saucedemo.com/");
            System.out.println(Page4[1]);
            Assert.assertEquals(Page4[1],"checkout-step-two.html","checkout page 2 validation");
            if(Arrays.asList(Page4).contains("checkout-step-two.html"))
            {
            extent.createTest("checkout page 2 validation").pass("Navigated to checkout page 2  successfully");
            }
            else
            {
            	extent.createTest("checkout Page 2 validation").fail("Not navigated to checkout page 2  successfully");	
            }
            
            
			}
			//checkout page 2 code
		@Test(dependsOnMethods={"ChkoutPage"})
			public void ReviewPage()
			{
			CheckoutPage2 Chk2=new CheckoutPage2(driver);
			Chk2.Finish();
			String Pg5=driver.getCurrentUrl();
            String[] Page5=Pg5.split("https://www.saucedemo.com/");
            System.out.println(Page5[1]);
            Assert.assertEquals(Page5[1],"checkout-complete.html","checkout complete Page validation");
            
            if(Arrays.asList(Page5).contains("checkout-complete.html"))
            {
            extent.createTest("Thank you page validation").pass("Navigated to Thank you Page  successfully");
            }
            else
            {
            	extent.createTest("Thank you page validation").fail("Not navigated to Thank you Page  successfully");	
            }
            
			}
			//checkout complete page
		@AfterTest
			public void CloseApp()
			{
			Checkout_CompletePage ChkCmp=new Checkout_CompletePage(driver);
			ChkCmp.BackHome();
			ChkCmp.MenuButton();
		   driver.close();
		   extent.createTest("Test Execution").info("completed");
		   extent.flush();
		  
			}
			
			
					
			}