package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Thread.sleep(3000);
	    
	    //way 1: 
	    //driver.switchTo().alert().accept();
	   // Thread.sleep(3000);
	    
	    // way 2: 
	    Alert alert=driver.switchTo().alert();
	    alert.accept();
	    
	    driver.close();

	}

}
