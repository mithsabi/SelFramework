package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage1 {
	WebDriver driver;
	By txt_firstname=By.cssSelector("#first-name");
	By txt_lastname=By.cssSelector("#last-name");
	By txt_postalcode=By.cssSelector("#postal-code");
	By btn_continue=By.cssSelector("#continue");
	By btn_cancel=By.cssSelector("#cancel");
	
	

public CheckoutPage1(WebDriver driver)
{
	this.driver=driver;
}
public void First_Name(String Fname)
{
	driver.findElement(txt_firstname).sendKeys(Fname);
}
public void Last_Name(String Lname)
{
	driver.findElement(txt_lastname).sendKeys(Lname);
}
public void Postal_Code(String Pcode)
{
	driver.findElement(txt_postalcode).sendKeys(Pcode);
}
public void ContinueButton()
{
	driver.findElement(btn_continue).click();
}
public void CancelButton()
{
	driver.findElement(btn_cancel).click();
}

}
