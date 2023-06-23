package Pages_WM;

import org.openqa.selenium.By;

import BasePage_Webmath.BasePage_WM;

public class otherStuffPage extends basePageWebMath{

	public void otherStuffButton() {
		driver.findElement(By.id("otherstuff")).click();
	}
	
}
