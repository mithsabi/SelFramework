package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SL_LoginpageObjects {
	WebDriver driver;
	public static WebElement txt_Username(WebDriver driver)
	{
		WebElement element=driver.findElement(By.id("user-name"));
		return element;
	}
	public static WebElement txt_Password(WebDriver driver)
	{
		WebElement element=driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement btn_Login(WebDriver driver)
	{
		WebElement element=driver.findElement(By.id("login-button"));
		return element;
	}
	

}
