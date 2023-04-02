package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyEvent {
	
	 void keyEvents()
	 {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
			WebDriver  	 driver= new ChromeDriver();
        	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	driver.manage().window().maximize();

        	WebElement ele = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
        	Actions action = new Actions(driver);
        	action.contextClick(ele).build().perform();
        	//action.sendKeys(Keys.ENTER);
        	
        	driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']")).click();
        	
        	driver.switchTo().alert().accept();
        	
        	
	 }
	 
	 public static void main(String[] args) {
		 MouseKeyEvent ke = new MouseKeyEvent();
		 ke.keyEvents();
	}

}
