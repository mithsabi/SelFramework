package SelPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.manage().window().maximize();
		WebElement dropdownElement=driver.findElement(By.id("dropdown"));
		Select dropdown=new Select(dropdownElement);
		//dropdown.selectByVisibleText("Option 2");
		//dropdown.selectByIndex(2);
		dropdown.selectByValue("2");
		
		
	}

}
