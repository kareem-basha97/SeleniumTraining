package sleniumcode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args)
	
	{
	
     WebDriver driver= new ChromeDriver();
     
     driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     int c=30;
     
     WebElement a=driver.findElement(By.xpath("//input[@id='sum1']"));
     
     a.sendKeys("10");
     
     WebElement b=driver.findElement(By.xpath("//input[@id='sum2']"));
     
     b.sendKeys("20");
    
     WebElement GrandTotalCTA=driver.findElement(By.xpath("//button[text()='Get Total']"));
     
     GrandTotalCTA.click();
     
     WebElement TotalValue=driver.findElement(By.xpath("//span[@id='displayvalue']"));
     
     String sumOfA_B=TotalValue.getText();
     
     int sumOfAandB=Integer.valueOf(sumOfA_B);
     
     
     System.out.println(sumOfAandB);
     
     if(c==sumOfAandB)
       
     {
    	 System.out.println("sum of a and b value is equal to the grandtotal :" + sumOfAandB); 
     }
     
     else
    	 
     {
    	 System.out.println("sum of a and b value is not equal to the grandtotal :" + sumOfAandB);
     }
     
     driver.close();
     
	}

}
