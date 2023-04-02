package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    
        driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
        driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
	         
        Thread.sleep(3000);
           
       
         Set val1 =  driver.getWindowHandles();
        
       
        for (Object object : val1) {
        	
        	
        	String title =driver.switchTo().window(object.toString()).getTitle();
        	System.out.println(title);
        	if(title.equals("Selenium"))
        	{
        		
        	driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
        	}
		}
        
        
        
        
       //
	    
	    
	    
	    
	    
	    Thread.sleep(5000);
	    driver.quit();
	}

}
