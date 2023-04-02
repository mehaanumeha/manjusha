package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html"); // it will open  the page
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outer =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		WebElement inner =driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
		driver.switchTo().frame(inner);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	}

}
