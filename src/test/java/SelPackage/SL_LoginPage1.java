package SelPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.PropertiesFile;


import pageObjects.SL_LPObjects;
import utils.ExcelDemo;

public class SL_LoginPage1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	int rc=ExcelDemo.getRowcount();
	String BN=PropertiesFile.getBrowsername();
	System.out.println(BN);
	String url=PropertiesFile.getURL();
	System.out.println(url);
	if(BN.equalsIgnoreCase("chrome"))
	{
		 driver=new ChromeDriver();
	}
	else if(BN.equalsIgnoreCase("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	for(int i=1;i<rc-2;i++)
	{
		
		
		driver.get(url);
		driver.manage().window().maximize();
		SL_LPObjects LPObj=new SL_LPObjects(driver);
		String username=ExcelDemo.getCellValue(i,0);
		String password=ExcelDemo.getCellValue(i,1);
		
		LPObj.enterUsername(username);
		LPObj.enterPassword(password);
		LPObj.clickLoginbtn();
		driver.close();


	}

}
}
