package Pages_WM;

import org.openqa.selenium.By;

import BasePage_Webmath.BasePage_WM;

public class algebraPage extends basePageWebMath{

	public void algebraButton() {
		driver.findElement(By.id("algebra")).click();
	}
}
