package sleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumTask1 {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		System.out.println("Chrome browser Launched");
		
		driver.get("https://www.stealmylogin.com/demo.html");
		
		System.out.println("Stealmylogin page opened");
		
		System.out.println("Stealmylogin page opened: " + driver.getTitle());
		
		System.out.println("Stealmylogin page URL: "+ driver.getCurrentUrl());
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("TestUsername");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("TestPassword@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Homepage page opened: " + driver.getTitle());
		
		driver.close();
		
	}

}
