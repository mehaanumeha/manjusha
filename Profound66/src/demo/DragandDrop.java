package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	void verifyDragoptions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\training module\\cd\\new\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/droppable"); // it will open  the page
        Thread.sleep(2000);
        // find the drag ele
        WebElement dragele = driver.findElement(By.id("draggable"));
        //find  the drop location 
        WebElement droploc = driver.findElement(By.id("droppable"));
             
        // way 1:  
        Actions  action  = new Actions(driver);
       // action.dragAndDrop(dragele, droploc).build().perform();
       
       // way 2:
        action.dragAndDropBy(dragele, 300, 200).build().perform();    
        
     // driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		DragandDrop dd = new DragandDrop();
		dd.verifyDragoptions();
	}

}
