package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage2 {
	WebDriver driver;
	
	
	By btn_Backpack=By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(3) div.cart_item_label a:nth-child(1) > div.inventory_item_name");
	By btn_BikeLight=By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(4) div.cart_item_label a:nth-child(1) > div.inventory_item_name");
	By btn_Cancel=By.cssSelector("#cancel");
	By btn_Finish=By.cssSelector("#finish");
	
	public CheckoutPage2(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SL_Backpack()
	{
		driver.findElement(btn_Backpack);
		
	}
	
	public void SL_BikeLight()
	{
		driver.findElement(btn_BikeLight);
		
	}
	
	public void Cancel()
	{
		driver.findElement(btn_Cancel).click();
		
	}
	public void Finish()
	{
		driver.findElement(btn_Finish).click();;
		
	}
}
	
	
	
