package Pages_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePage_Webmath.BasePage_WM;

public class homePage extends basePageWebMath{
    
	public void homeButton() {
	
	driver.findElement(By.id("homebutton")).click();	
		
    }
	
	public String pageTitle() {
		 return driver.getTitle();
	}
	public boolean pageLogo() {
		
		return driver.findElement(By.xpath("pagelogo")).isDisplayed();
    
	} 
	
	public void mathHelp() {
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			 }
		
		Select topic=new Select(driver.findElement(By.id("topicItem")));
		topic.selectByVisibleText(prop.getProperty("topic"));
		driver.navigate().back();
	 }
	
	public void image1() {
		
	    driver.switchTo().frame("image1a");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement image1=driver.findElement(By.xpath("image1b"));
		js.executeScript("arguments[0].click();",image1);	

	       
	         driver.switchTo().defaultContent();
		
	}
	
	
	public void image2() {
	    driver.switchTo().frame("image2a");
	    driver.findElement(By.xpath("image2b")).click();
        driver.switchTo().defaultContent();
	}
	
	public void image3() {
	    driver.switchTo().frame("image3a");
	    driver.findElement(By.xpath("image3b")).click();
        driver.switchTo().defaultContent();
	}
	
}
