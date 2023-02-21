package sleniumcode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1Task 
{
	public static void main(String[] args) throws InterruptedException 
	{

    WebDriver driver= new ChromeDriver();
    
    driver.manage().window().maximize();
    
    System.out.println("Chrome has Launched");
    
    driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    
    System.out.println("Seleniumeasy URL opened");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
    String MsgEntered="Selenium easy is one of the best site to practice selenium task";
    
    WebElement EnterMsg = driver.findElement(By.xpath("//input[@id='user-message']"));
   
    EnterMsg.sendKeys(MsgEntered);
    
    System.out.println("Entered Message:" + MsgEntered);
    
    WebElement ShowMsgCTA = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    
    ShowMsgCTA.click();
    
    String DiaplayMsg=driver.findElement(By.xpath("//span[@id='display']")).getText();
    
    System.out.println("Displayed Message:" + DiaplayMsg);
    
    if(MsgEntered.equals(DiaplayMsg))
    {
    	System.out.println("Entered Message text is equal to Displayed Message text");	
    }
    
    else
    {
    	System.out.println("Entered Message text is not equal to Displayed Message text");		
    }
    
    driver.close();
             
	}

}
