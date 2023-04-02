package extra;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioTest {
	  
	  private WebDriver driver;
	   JavascriptExecutor js;
	   
	   

	 @Test
	  public void radio()throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
			
		    driver = new ChromeDriver();
		 	  driver.get("https://opensource-demo.orangehrmlive.com"); 
				 
				    Thread.sleep(3000);
				    driver.manage().window().maximize();
				    Thread.sleep(10000);
				    driver.findElement(By.name("username")).sendKeys("Admin");
				    driver.findElement(By.name("password")).sendKeys("admin123");
				    driver.findElement(By.xpath("//button[@type='submit']")).click();
				    Thread.sleep(3000);
	    
	    
	      WebElement element = driver.findElement(By.linkText("Admin"));
	      Thread.sleep(3000);
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	      
	      Thread.sleep(3000);
	    driver.findElement(By.linkText("Admin")).click();
	    Thread.sleep(3000);
	      WebElement element1 = driver.findElement(By.tagName("body"));
	     Thread.sleep(3000);
	     Actions builder1 = new Actions(driver);
	     builder1.moveToElement(element1, 0, 0).perform();
	    
	      Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".oxd-topbar-body-nav-tab:nth-child(7) > .oxd-topbar-body-nav-tab-item")).click();
	    
	    Thread.sleep(30000);
	    driver.findElement(By.linkText("Email Configuration")).click();
	    Thread.sleep(3000);
	   driver.findElement(By.cssSelector(".oxd-input-group:nth-child(1) > div > .oxd-radio-wrapper .oxd-radio-input")).click(); Thread.sleep(3000);
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();		 	
	    }






	
}