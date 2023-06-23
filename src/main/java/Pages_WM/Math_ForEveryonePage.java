package Pages_WM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class mathForEveryonePage extends basePageWebMath {
 
	public void mathForEveryoneButton() {
		
		driver.findElement(By.id("mathForEveryoneButton")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void everydayMath() {
		WebElement table=driver.findElement(By.xpath("everydayMath1"));
	    WebElement names=table.findElement(By.xpath("everydayMath2"));
	    
	    names.click();
	}
	
	public void tipCalcutor() {
		driver.findElement(By.name("tipCalcutor1")).clear();
		 driver.findElement(By.name("tipCalcutor2")).sendKeys(prop.getProperty("tip")); 
		 driver.findElement(By.name("tipCalcutor3")).sendKeys(prop.getProperty("cost"));
		 driver.findElement(By.xpath("tipCalcutor4")).click();
	}
	
	public void mathHelp() {
		
		Select topic=new Select(driver.findElement(By.xpath("mathhelp")));
		topic.selectByVisibleText(prop.getProperty("Mp_topic"));
		driver.navigate().back();
	}
	
	public void salePrice() {
		
		driver.findElement(By.xpath("salePrice1")).click();	
		driver.findElement(By.name("salePrice2")).clear();
		 driver.findElement(By.name("salePrice3")).sendKeys(prop.getProperty("Original_cost")); 
		 driver.findElement(By.name("salePrice4")).sendKeys(prop.getProperty("sale"));
		 driver.findElement(By.xpath("salePrice5")).click();
	}
	
   public void windChill() {
		
		 driver.findElement(By.xpath("windChill1")).click();	
		 driver.findElement(By.name("windChill2")).clear();
		 driver.findElement(By.name("windChill3")).sendKeys(prop.getProperty("outside_temp")); 
		 driver.findElement(By.name("windChill4")).sendKeys(prop.getProperty("wind_speed"));
		 driver.findElement(By.xpath("windChill5")).click();
	}
   
   public void countCoins() {
		
		 driver.findElement(By.xpath("countCoins1")).click();	
		 driver.findElement(By.name("countCoins2")).sendKeys(prop.getProperty("quarters"));
		 driver.findElement(By.name("countCoins3")).sendKeys(prop.getProperty("dimes")); 
		 driver.findElement(By.name("countCoins4")).sendKeys(prop.getProperty("nickels"));
		 driver.findElement(By.name("countCoins5")).sendKeys(prop.getProperty("pennies"));
		 driver.findElement(By.xpath("countCoins6")).click();
	
	}
   
   public void lotteryOdds() {
		
		driver.findElement(By.xpath("lotteryOdds1")).click();	
		driver.findElement(By.name("lotteryOdds2")).sendKeys(prop.getProperty("count"));
		driver.findElement(By.name("lotteryOdds3")).sendKeys(prop.getProperty("lowest_num")); 
	    driver.findElement(By.name("lotteryOdds4")).sendKeys(prop.getProperty("highest_num"));
	    driver.findElement(By.xpath("lotteryOdds5")).click();
	
	}
}
