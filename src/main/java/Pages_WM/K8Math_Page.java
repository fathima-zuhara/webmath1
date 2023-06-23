package Pages_WM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class k8MathPage extends basePageWebMath{

	public void k8MathButton() {
		driver.findElement(By.id("k8math")).click();
	}
	
	public void multiply() {
		
		driver.findElement(By.xpath("multiply1]")).click();
		driver.findElement(By.name("multiply2")).sendKeys(prop.getProperty("Num1"));
		driver.findElement(By.name("multiply3")).sendKeys(prop.getProperty("Num2"));
		driver.findElement(By.xpath("multiply4")).click();
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,700)", "");
	}
    public void divide() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[4])[1]")).click();
		driver.findElement(By.name("divisor")).sendKeys(prop.getProperty("Divisor"));
		driver.findElement(By.name("dividend")).sendKeys(prop.getProperty("Divident"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
    public void placevalue() {
		
		driver.findElement(By.xpath("(placevalue1")).click();
		driver.findElement(By.name("placevalue2")).sendKeys(prop.getProperty("place_valueNum"));
		driver.findElement(By.xpath("placevalue3]")).click();
		driver.switchTo().frame("placevalue4");
		 WebElement table=driver.findElement(By.xpath("placevalue5"));
		 WebElement names=table.findElement(By.xpath("placevalue6"));
		 names.click();
		
		
	}
   public void numberLine() {
		
		driver.findElement(By.xpath("numberline1")).click();
		driver.findElement(By.name("numberline2")).sendKeys(prop.getProperty("NumberLine"));
		driver.findElement(By.xpath("numberline3")).click();
		
		
		
	}
   public void numberRoundingtens() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[6])[1]")).click();
		driver.findElement(By.name("number")).sendKeys(prop.getProperty("NumberRounding_tens"));
		Select topic=new Select(driver.findElement(By.name("roundto")));
		topic.selectByVisibleText(prop.getProperty("Roundto_tens"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
   public void numberRoundingthousands() {
	    driver.findElement(By.xpath("numberRoundingthousands1")).click();
 		driver.findElement(By.name("numberRoundingthousands2")).clear();
 		driver.findElement(By.name("numberRoundingthousands3")).sendKeys(prop.getProperty("NumberRounding_thousands"));
 		Select topic=new Select(driver.findElement(By.name("numberRoundingthousands4")));
 		topic.selectByVisibleText(prop.getProperty("Roundto_thousands"));
 		driver.findElement(By.xpath("numberRoundingthousands5")).click();
 		
 		
 		
 	}
   public void compareNumberLine() {
	    driver.findElement(By.xpath("compareNumberLine1")).click();
		driver.findElement(By.name("compareNumberLine2")).sendKeys(prop.getProperty("Comp-Num1"));
		driver.findElement(By.name("compareNumberLine3")).sendKeys(prop.getProperty("Comp-Num2"));
		
		driver.findElement(By.xpath("compareNumberLine4")).click();
		
		
		
	}
}
