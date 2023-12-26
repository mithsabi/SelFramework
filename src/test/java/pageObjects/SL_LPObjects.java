package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SL_LPObjects {
	WebDriver driver;
	By txt_Username=By.id("user-name");
	By txt_Password=By.name("password");
	By btn_Login=By.id("login-button");
	
	public SL_LPObjects(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUsername(String uname)
	{
		driver.findElement(txt_Username).sendKeys(uname);
	}
		public void enterPassword(String pwd)
		{
		driver.findElement(txt_Password).sendKeys(pwd);	
		}
		public void clickLoginbtn()
		{
			driver.findElement(btn_Login).click();
		}
	

}
