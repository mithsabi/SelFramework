package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_CompletePage {
	WebDriver driver;
	By btn_Backtohome=By.cssSelector("#back-to-products");
	By btn_Menubutton=By.cssSelector("#react-burger-menu-btn");
	By btn_Logoutbutton=By.id("logout_sidebar_link");
	
	public Checkout_CompletePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void BackHome()
	{
		driver.findElement(btn_Backtohome).click();;
		
	}
	public void MenuButton()
	{
		driver.findElement(btn_Menubutton).click();
	}
	public void Logout()
	{
		driver.findElement(btn_Logoutbutton).click();
	}
	

}
