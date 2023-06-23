package Pages_WM;

import org.openqa.selenium.By;

import BasePage_Webmath.BasePage_WM;

public class plotsandGeometryPage extends basePageWebMath{

	public void plotsandGeometryButton() {
		driver.findElement(By.id("plots")).click();
	}
}
