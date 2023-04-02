package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
		 driver.get("http://uitestingplayground.com/textinput");
		 // ye page open krega -> jo page open krna hia uska url likenge
		 driver.findElement(By.xpath("//input[@id='newButtonName']")).sendKeys("abc");
		 // find krega elment ko                                      type krga ele ko
		 driver.findElement(By.id("updatingButton")).click();
		  // find kia ele ko                         // click kraya
		 

	}

}
