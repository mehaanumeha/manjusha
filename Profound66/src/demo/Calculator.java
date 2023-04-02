package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		
		// open broswer
		// enter url
		// identify field no 1  and enter value
		// identify field no 2  and enter value
		// identify button  no 2  and click
		// verify the result is correct (soft assert | hard assert)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Desktop\\res\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		driver.findElement(By.id("number1Field")).sendKeys("4");
		driver.findElement(By.name("number2")).sendKeys("6");
		
		//way1 : drirectly fond xpath and click on it 
		//driver.findElement(By.xpath("//option[contains(text(),'Multiply')]")).click();
		//Thread.sleep(1000);
		Thread.sleep(2000);
		//way2 :
		WebElement ele=driver.findElement(By.id("selectOperationDropdown"));
		Select select = new Select(ele);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Divide");
		
		
		driver.findElement(By.xpath("//input[@id='calculateButton']")).click();
		
		Thread.sleep(3000);
		
		String ans=driver.findElement(By.id("numberAnswerField")).getText();
		System.out.println("ans : "+ans);
		if(ans.equals("10"))
		{
			System.out.println("pass");
		}
		
		
		
		
		
		
		
		
		

	}

}
