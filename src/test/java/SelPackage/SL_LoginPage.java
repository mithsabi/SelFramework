package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObjects.SL_LPObjects;

public class SL_LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExtentReports extent = new ExtentReports();
	        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
	        extent.attachReporter(spark);

	        extent.createTest("ScreenCapture")
	                .addScreenCaptureFromPath("extent.png")
	                .pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());

	        extent.createTest("LogLevels")
	                .info("info")
	                .pass("pass")
	                .warning("warn")
	                .skip("skip")
	                .fail("fail");

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		SL_LPObjects LPObj=new SL_LPObjects(driver);
		LPObj.enterUsername("standard_user");
		LPObj.enterPassword("secret_sauce");
		LPObj.clickLoginbtn();
		driver.close();

		extent.createTest("SwagLabs")
        .info("info")
        .pass("pass");
        extent.flush();
        

	}

}
