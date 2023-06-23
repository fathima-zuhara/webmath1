package PageTest_WM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.Algebra_Page;
import Pages_WM.GeneralMath_Page;
import Pages_WM.Home_Page;
import Pages_WM.K8Math_Page;
import Pages_WM.Math_ForEveryonePage;
import Pages_WM.OtherStuff_Page;
import Pages_WM.PlotsandGeometry_Page;
import Pages_WM.Trigandcalculas_Page;

public class homePageTest extends basepageWebMath{

	
	homePage Hp;
	k8MathPage Kp;
	algebraPage Ap;
	plotsandGeometryPage Pp;
	trigandcalculasPage Tp;
	otherStuffPage Op;
	
	@BeforeMethod
     public void  browserConfig() {
		
		      initialization();
              
              Hp=new homePage();
              Kp=new k8MathPage();
              Ap=new algebraPage();
              Pp=new plotsandGeometryPage();
              Tp=new trigandcalculasPage();
              Op= new otherStuffPage();
              
            }
	
     @Test
	 public void validateHomepage() {
    	
		Hp.homeButton();
     }
     
     
     @Test
     public void validatePageTitle() {
    	String actTitle=Hp.pageTitle();
    	String expTitle=prop.getProperty("title");
 		Assert.assertEquals(actTitle, expTitle);
	}
		
     @Test
     public void validatePageLogo() {
		boolean logo=Hp.pageLogo();
	    Assert.assertTrue(logo);
	   
     }
     @Test
     public void validateMathHelp() {
    	 Hp.mathHelp();
	}
     
     @Test
     public void validateImage() {
	    Hp.image11();
	    Hp.image2();
	    Hp.image3();
	}

    @Test(priority = 4)
     public void validateAlgebrapage(){
    	 Ap.algebraButton();
     }
     
    @Test(priority = 5)
     public void ValidatePlotsandGeometry_page(){
    	 Pp.PlotsandGeometry_button();
     }
     
     @Test(priority = 6)
     public void ValidateTrigandcalculas_page(){
    	 Tp.Trigandcalculas_button();
     }
     
     @Test(priority = 7)
     public void validateOtherStuffPage(){
    	 Op.OtherStuff_button();
     }
     
     @AfterMethod
 	 public void validateBrowserClosing() {
 		pageTearDown();
 	}
     
     
     
     
     
     
     
}
