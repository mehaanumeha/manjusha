package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithtexbox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Thread.sleep(3000);
	    
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("anu");
	    Thread.sleep(3000);
	    alert.accept();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Thread.sleep(3000);
	    Alert alert1 = driver.switchTo().alert();
	    alert1.dismiss();
	    Thread.sleep(3000);
	    
	    driver.close();
	  
	}

}
