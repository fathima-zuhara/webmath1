package PageTest_WM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.Home_Page;
import Pages_WM.Math_ForEveryonePage;

public class mathForEveryonepageTest extends basePageWebMath{
	
	mathForEveryonePage Mp;
	
	@BeforeMethod
	public void browserConfig() {
		initialization();
		Mp=new mathForEveryonePage();
	}
	
	@Test
	public void validateMathForEveryonePage() {
		Mp.mathForEveryoneButton()();
	}
	
	@Test
	public void validateeverydayMath() {
		Mp.mathForEveryoneButton()();
		Mp.everydayMath()();
	}
	
	@Test
	public void validateMathhelp() {
		validateMathForEveryonePage();
		Mp.mathHelp();
	}
		
		@Test
	public void ValidateTip_calcutor() {
        ValidateeverydayMath();
		Mp.tipCalcutor();
	}
	@Test	
	public void ValidateSale_price() {
		validateMathForEveryonePage());
		Mp.salePrice();
	}
	
	@Test
	public void ValidateWindchill() {
		validateMathForEveryonePage();
		Mp.windChill();
	}
	
	@Test
	public void validatecountCoins() {
		validateMathForEveryonePage();
		Mp.countCoins();
	}

	@Test
	public void  validatelotteryOdds() {
		validateMathForEveryonePage();
		Mp.lotteryOdds();
	}
    @AfterMethod
	 public void validateBrowserClosing() {
		pageTearDown();
	}
}   

