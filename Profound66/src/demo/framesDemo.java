package demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class framesDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // driver jaake chrome se baat kriye
		
		driver.get("https://demoqa.com/frames"); // jayiye google open 
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,150)");
		
		driver.switchTo().frame("frame1");
	    String actualValue = driver.findElement(By.id("sampleHeading")).getText();
	    Assert.assertEquals("This is a sample page",actualValue);
	    System.out.println("all worked well");
	    
	    Thread.sleep(3000);
	    driver.close();
		
	
		
	}

}
