package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageObjects {
	WebDriver driver;
	

	By btn_bckpack=By.cssSelector("#remove-sauce-labs-backpack");
		By btn_rm_bikeLight=By.cssSelector("#remove-sauce-labs-bike-light");
		By btn_rm_Tshirt=By.cssSelector("#remove-sauce-labs-bolt-t-shirt");
		By btn_rm_jacket=By.cssSelector("#remove-sauce-labs-fleece-jacket");
		By btn_rm_onesie=By.cssSelector("#remove-sauce-labs-onesie");
		By btn_rm_RedTshirt=By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]");
		By btn_ContinueShopping=By.xpath("//*[@id=\"continue-shopping\"]");
		By btn_Checkout=By.xpath("//*[@id=\"checkout\"]");
		
		
		
		public CartPageObjects(WebDriver driver) {
			this.driver=driver;
		}
		public void Rm_Backpack()
		{
			driver.findElement(btn_bckpack).click();
		}
		public void Rm_bikeLight()
		{
			driver.findElement(btn_rm_bikeLight).click();
		}
		public void Rm_Tshirt()
		{
			driver.findElement(btn_rm_Tshirt).click();
		}
		public void Rm_Jacket()
		{
			driver.findElement(btn_rm_jacket).click();
		}
		public void RM_onesie()
		{
			driver.findElement(btn_rm_onesie).click();
		}
		public void Rm_Redtshirt()
		{
			driver.findElement(btn_rm_RedTshirt).click();
		}
		public void continueShopping()
		{
			driver.findElement(btn_ContinueShopping).click();
		}
		public void Checkout()
		{
			driver.findElement(btn_Checkout).click();
		}
}
