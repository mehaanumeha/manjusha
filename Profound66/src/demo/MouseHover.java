package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	void verifyMouseaction() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/"); // it will open  the page
		Thread.sleep(3000);
		
		WebElement parentEle = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement childEle = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(parentEle).moveToElement(childEle).click().build().perform();
		
		
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MouseHover mh = new MouseHover();
		mh.verifyMouseaction();
	}

}
