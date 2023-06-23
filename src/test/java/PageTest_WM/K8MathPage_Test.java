package PageTest_WM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.K8Math_Page;

public class k8MathPageTest extends basepageWebMath{

	k8MathPage Kp;
	
	@BeforeMethod
    public void browserConfig() {
		
	  initialization();
      Kp=new k8MathPage();
      } 
      
	@Test
    public void validateK8Mathpage() {
		Kp.k8MathButton();
	}
	@Test
	public void validateMultiply() {
		validateK8Mathpage() ;
		Kp.multiply();
	}
	@Test
	public void validateDivide() {
		validateK8Mathpage() ;
		Kp.divide();
	}
	@Test
	 public void validatePlacevalue() {
		validateK8Mathpage() ;
		Kp.placevalue();
	}	
	@Test
	  public void validateNumberLine() {
		validateK8Mathpage() ;
		  Kp.numberLine();
		}	
	@Test
	  public void validateNumberRoundingttens() {
		validateK8Mathpage() ;
		  Kp.numberRoundingtens();
		}		
	@Test
	  public void validateNumberRoundingthousands() {
		validateK8Mathpage() ;
		  Kp.numberRoundingthousands();
		}		
	@Test
	  public void validateCompareNumberLine() {
		validateK8Mathpage() ;
		  Kp.compareNumberLine();
		}		
	
	 @AfterMethod
 	 public void validateBrowserClosing() {
 		pageTearDown();
 	}
		
		
	
	
}
