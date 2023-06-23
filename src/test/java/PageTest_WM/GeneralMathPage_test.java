package PageTest_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.GeneralMath_Page;
import Pages_WM.Home_Page;

public class generalMathPagetest extends basepageWebMath{

	
	generalMathPage Gp;
		
	
		@BeforeMethod
		public void browserConfig() {
			
	      initialization();	
		  Gp=new generalMathPage();
	    
	  }
		  @Test
	     public void validateGeneralMathPage() {
	      
	    	 Gp .generalMathbutton();
	  }
	     @Test
	     public void validateMathhelp() {
	    	 validateGeneralMathPage();
	    	 Gp.mathHelp();
	  }
	     @Test
	     public void validateFactor() {
	    	 validateGeneralMathPage();
	    	 Gp.factor();
	  }
	     @Test
	     public void validateGCF() {
	    	 validateGeneralMathPage();
	    	 Gp.GCF();
	    	
	     }
	     @Test
	     public void validateLCM() {
	    	 validateGeneralMathPage();
	    	 Gp.LCM();
	    	
	     }
	     @Test
	     public void validatePronouncing() {
	    	 validateGeneralMathPage();
	    	 Gp.pronouncing();
	    	 
	     }
	     @AfterMethod
	 	 public void validateBrowserClosing() {
	 		pageTearDown();
	 	}
}
