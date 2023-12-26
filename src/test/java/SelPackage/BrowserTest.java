package SelPackage;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("PavanVarma");
        //driver.findElement(By.cssSelector("#APjFqb")).sendkeys("PavanVarma");
        driver.close();
        
        	
	}

}
