package com.autorox.All_Pages_Test;
import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class NewJC_Test extends All_Page_Intializer{

	
	  @Test(priority=1) 
	  public void elementsvalidate() throws InterruptedException { 
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s"); 
		  NewJCPageTest().gotonewJobcard();
		  NewJCPageTest().validateElements();
	      }
	  @Test(priority=2) 
	  public void jc() throws InterruptedException { 
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s"); 
		  NewJCPageTest().gotonewJobcard();
		  NewJCPageTest().jcc();
		  
		  
	      }
	  
}
