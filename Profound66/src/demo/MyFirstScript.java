package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstScript {

	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/"); // it will open  the page
		
		 driver.navigate().forward();
		 
		WebElement searchElement =  driver.findElement(By.xpath("//input[@title='Search']"));
		searchElement.sendKeys("manual testing");
		searchElement.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.partialLinkText("manual testing")).click();
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().forward();
		driver.close();
		// driver.quit(); 
		
		 
	}

}

//WebDriverWait wait  = new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@title='Search']"))));
