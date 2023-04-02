package demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Assert;  // java unit test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShots {
	
	void comparison() throws IOException{
		
        System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); // it will open  the page
        
        
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
       
        // we are verifying that we logged in successfully
		boolean res =driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		Assert.assertTrue(res);// if its true test wil pass other wise test wil fail
		
		// we want to verify weather the product name is correct
		String firstproductDisplayOnPage = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).getText();
		System.out.println("print verification : "+firstproductDisplayOnPage);
		Assert.assertEquals("Sauce Labs Backpack", firstproductDisplayOnPage);
		
		
		// screen shot can be taken  // class TakeScreenshot  //java support it
		// a) on script failiure
		// b) all success and  failiure 
		// c) compare two screen shots
		
		// req  actual image - expected image
		
		//  reading image - we will use file
		
		File  file = new File(".\\imageres\\sauce-backpack.jpg");
		System.out.println("file read properly");
		BufferedImage  expectedImage = ImageIO.read(file);
		System.out.println("created the  image buffer");
		
		//AShot obj = new AShot(); // will be needing the  jar file for it
		Screenshot actualScreenshot =  new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage  actualImage = actualScreenshot.getImage();
		// comparison
		ImageDiffer imgComp = new ImageDiffer();  // comapred the part of it 
		ImageDiff diff = imgComp.makeDiff(actualImage,expectedImage);
		System.out.println("comparsion sucess");
			
	}
	
	public static void main(String[] args) throws IOException {
		ScreenShots ss = new ScreenShots();
		ss.comparison();
	}

}
