package com.autorox.All_Pages_Test;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class Inward_Test extends All_Page_Intializer{

	
	  @Test(priority=1) 
	  public void verifyInventorySettings() throws InterruptedException { 
		  LoginPageTest().Valid_Login("admin31","Admin@Super@AX/08/10/24"); 
		  InwardPageTest().superadminSettings();
	      InwardPageTest().inventoryManagementOff(); 
	      }
	  
	  @Test(priority=2) 
	  public void verifyPartsOptionOFF() throws InterruptedException { 
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	      InwardPageTest().verifyParts(); }
	  
	  @Test(priority=3) 
	  public void verifyInventorySettings1() throws InterruptedException { 
		  LoginPageTest().Valid_Login("admin31","Admin@Super@AX/08/10/24"); 
		  InwardPageTest().superadminSettings();
	      InwardPageTest().inventoryManagementOn(); }
	  
	  @Test(priority=4) 
	  public void verifyPartsOptionON() throws InterruptedException { 
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	      InwardPageTest().verifyParts(); }
	  
	  @Test(priority=5) 
	  public void verifyInwardElements() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	      InwardPageTest().Parts();
	      InwardPageTest().validateElementsPartsInward(); }
	  
	  @Test(priority=6) 
	  public void verifyAddNewVendorWindow() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		  InwardPageTest().Parts();
		  InwardPageTest().clickonNewVendor(); 
		  InwardPageTest().verifyAddVendorLabel();
	  
	  }
	  
	  @Test(priority=7) 
	  public void addNewVendor() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		  InwardPageTest().Parts(); 
		  InwardPageTest().addNewVendor();
	  }
	  
	  @Test(priority=8) 
	  
	  public void verifyBillnoDateTaxType() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		  InwardPageTest().Parts();
		  InwardPageTest().verifyBillnoDateTaxtype(); }
	  
	  
	  @Test(priority=9) 
	  public void verifyAlert() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		  InwardPageTest().Parts(); 
		  InwardPageTest().Alert(); }
	  
	  @Test(priority=10) 
	  public void verifyAlert1() throws Throwable {
	  
		  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		  InwardPageTest().Parts();
		  InwardPageTest().verifyalert();
	  }
	  
	 
	@Test(priority=11)
	public void DirectInward() throws Throwable {
		
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	    InwardPageTest().Parts();
	    InwardPageTest().directInward();
	}
	
	
	
	@Test(priority=12)
	public void Cancel() throws Throwable {
		
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		InwardPageTest().cancel();
		
	}

	@Test(priority=13)
	public void directInwardFromNewVendor() throws Throwable {
		
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	    InwardPageTest().Parts();
	    InwardPageTest().directInwardfromNewVendor();
	    
	}

	
	@Test(priority=14)
	public void InwardbyOrder() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
	    InwardPageTest().Parts();
	    InwardPageTest().InwardbyOrder();

	}
	
	@Test(priority=15)
	public void OrderandInward() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().orderpartstoExistingVendor();
		InwardPageTest().Parts();
		InwardPageTest().InwardbyOrder();
		
	}
	
	
	
	@Test(priority=16)
	public void PendinInward() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		InwardPageTest().pendingInward(1);
	}
	
//	@Test(priority=17)
//	public void OrderandInwardfromJC() throws Throwable {
//		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
//		//OrderPageTest().orderpartsfromJobcard();
//		InwardPageTest().inwardpartsfromJobcard();
//		
//	}

}

