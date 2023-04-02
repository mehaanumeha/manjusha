package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		// dropdown1 : way 1: using select
		Select selectElement = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
		selectElement.selectByIndex(3);
		Thread.sleep(3000);
		selectElement.selectByVisibleText("Google");
		
		
		// dropdown : way 2: using x path directly  
		driver.findElement(By.xpath("//option[@value='babycat']")).click();
		
		
		// drop down 3 :   click on button then select element
		driver.findElement(By.id("custom")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(.,'sp')]")).click();
		
		
		// multiselct : as values  is on the page .. directly use xpath
		driver.findElement(By.xpath("//option[@value='donut']")).click();
		driver.findElement(By.xpath("//option[contains(.,'Burger')]")).click();
	}

}
