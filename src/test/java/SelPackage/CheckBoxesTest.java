package SelPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
	}

}
