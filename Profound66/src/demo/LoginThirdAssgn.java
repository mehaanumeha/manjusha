package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginThirdAssgn {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.get("file:///C:/Users/Vinay/Desktop/assignments/Selenium/html/ThirdAssignment.html");
		 String username="anumeha";
		 
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys("abc");
		 driver.findElement(By.id("submit")).click();
		 
		 
		 
		
		String res= driver.findElement(By.id("welcome")).getText();
		System.out.println(res);
		if(res.equals("Welcome "+username))
		{
			System.out.println("test case pass");
		}
		 
		

	}

}
