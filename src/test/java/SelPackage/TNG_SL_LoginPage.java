package SelPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import pageObjects.SL_LoginpageObjects;

public class TNG_SL_LoginPage {
@Test(dataProvider="inputData",enabled=false)
	public void AppLogin(String uname,String pwd)
	{
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com");
driver.manage().window().maximize();
SL_LoginpageObjects.txt_Username(driver).sendKeys(uname);
SL_LoginpageObjects.txt_Password(driver).sendKeys(pwd);
SL_LoginpageObjects.btn_Login(driver).click();

String ActualTitle=driver.getTitle();
System.out.println(ActualTitle);
Assert.assertEquals(ActualTitle,"Swag Labs");
driver.close();
	}
@DataProvider
public Object[][] inputData()
{
	Object[][] data=new Object[3][2];
	//row1 data
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";

	//row2 data

	data[1][0]="performance_glitch_user";
	data[1][1]="secret_sauce";
	
	//row3
	data[2][0]="visual_user";
	data[2][1]="secret_sauce";
	
	return data;

}

}
