package Pages_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class generalMathPage extends basePageWebMath{
     
	public void generalMathbutton() {
		driver.findElement(By.id("generalMathbutton")).click();
	}
	public void mathHelp() {
		
		Select topic=new Select(driver.findElement(By.id("Mathhelp1")));
		topic.selectByVisibleText(prop.getProperty("GM_topic"));
		driver.navigate().back();
	}
	public void factor() {
		driver.findElement(By.xpath("(Factor1")).click();
		Select show_meAll=new Select(driver.findElement(By.name("Factor2")));
		show_meAll.selectByVisibleText(prop.getProperty("Select_All"));
		driver.findElement(By.name("Factor4")).sendKeys(prop.getProperty("Factor_numAll"));
		driver.findElement(By.xpath("Factor6")).click();
		driver.navigate().back();
		
		Select show_mePrime=new Select(driver.findElement(By.name("Factor7")));
		show_mePrime.selectByVisibleText(prop.getProperty("Select_Prime"));
		driver.findElement(By.name("Factor9")).clear();
		driver.findElement(By.name("Factor10")).sendKeys(prop.getProperty("Factor_numPrim"));
		driver.findElement(By.xpath("Factor12")).click();
	}
	 public void GCF() {
			
		 driver.findElement(By.xpath("GCF1")).click();	
		 driver.findElement(By.name("GCF2")).clear();
		 driver.findElement(By.name("GCF3")).sendKeys(prop.getProperty("GCF")); 
		 driver.findElement(By.xpath("GCF4")).click();

    }
	 public void LCM() {
			
		 driver.findElement(By.xpath("LCM1")).click();	
		 driver.findElement(By.name("LCM2")).clear();
		 driver.findElement(By.name("LCM3")).sendKeys(prop.getProperty("LCM")); 
		 driver.findElement(By.xpath("LCM4")).click();

    }
	 public void pronouncing() {
			
		 driver.findElement(By.xpath("Pronounce1")).click();	
		 driver.findElement(By.name("Pronounce2")).clear();
		 driver.findElement(By.name("Pronounce3")).sendKeys(prop.getProperty("Pronounce")); 
		 driver.findElement(By.xpath("Pronounce4")).click();

    }
}