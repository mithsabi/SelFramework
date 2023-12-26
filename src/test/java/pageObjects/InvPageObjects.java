package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvPageObjects {
	WebDriver driver;
	

By btn_bckpack=By.cssSelector("#add-to-cart-sauce-labs-backpack");
	By btn_bikeLight=By.cssSelector("#add-to-cart-sauce-labs-bike-light");
	By btn_Tshirt=By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
	By btn_jacket=By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
	By btn_onesie=By.cssSelector("#add-to-cart-sauce-labs-onesie");
	By btn_RedTshirt=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By btn_Cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	
	public InvPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	public void addBackpack()
	{
		driver.findElement(btn_bckpack).click();
	}
	public void addBikeligt()
	{
		driver.findElement(btn_bikeLight).click();
	}
	public void addTshirt()
	{
		driver.findElement(btn_Tshirt).click();
	}
	public void addJacket()
	{
		driver.findElement(btn_jacket).click();
	}
	public void addOnesie()
	{
		driver.findElement(btn_onesie).click();
	}
	public void addRedtshirt()
	{
		driver.findElement(btn_RedTshirt).click();
	}
	public void clickonCart()
	{
		driver.findElement(btn_Cart).click();
	}
}
