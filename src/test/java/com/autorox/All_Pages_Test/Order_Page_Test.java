package com.autorox.All_Pages_Test;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class Order_Page_Test extends All_Page_Intializer {

	
//	  @Test(priority = 1) 
//	  
//	  public void verifyOrderSettings() throws  InterruptedException { 
//		  
//	  LoginPageTest().Valid_Login("admin31","Admin@Super@AX/08/10/24"); 
//	  InwardPageTest().superadminSettings();
//	  OrderPageTest().PartsOrderSettingOff(); }
//	  
//	  @Test(priority = 2) 
//	  
//	  public void verifyOrderOptionOFF() throws InterruptedException { 
//	 
//	  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
//	  OrderPageTest().verifyPartsOrder(); }
//	  
//	  @Test(priority = 3) 
//	  
//	  public void verifyOrderSettings1() throws  InterruptedException { 
//		  
//	   LoginPageTest().Valid_Login("admin31","Admin@Super@AX/08/10/24"); 
//	   InwardPageTest().superadminSettings();
//	   OrderPageTest().PartsOrderSettingOn(); }
//	  
//	  @Test(priority = 4) 
//	  
//	  public void verifyOrderOptionON() throws InterruptedException { 
//	  
//	  LoginPageTest().Valid_Login("maverick","5KXZpC&s");
//	  OrderPageTest().verifyPartsOrder(); }
//	 

	@Test(priority = 5)
	public void verifyPartsOrderElements() throws InterruptedException {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().navigatetoOrdersHomePage();
		Thread.sleep(5000);
		OrderPageTest().validateElementsPartsOrder();

	}

	@Test(priority = 6)
	public void verifynavigatetoStockList() throws InterruptedException {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().verifynavigatetostocklist();

	}

	@Test(priority = 7)
	public void verifyexistingOrdersDetails() throws InterruptedException {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().navigatetoOrdersHomePage();
		OrderPageTest().verifyOrderslist();

	}

	@Test(priority = 8)
	public void orderpartstoExistingVendor() throws InterruptedException {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().orderpartstoexistingvendor();
	}

	@Test(priority = 9)
	public void orderpartsfromPreivousOrder() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().orderpartsfrompreviousorder();
	}

	@Test(priority = 10)
	public void verifylistofexistingOrdersDetails() throws InterruptedException {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().navigatetoOrdersHomePage();
		OrderPageTest().validateexistingVendordetails();

	}

	@Test(priority = 11)
	public void cancelOrder() {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().CO();

	}
	
	@Test(priority = 12)
	public void reorder() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().reOrderLevel();
		

	}

	@Test(priority = 13)
	public void orderpartsVendorActive() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().VendorActive();
		
	}

	@Test(priority = 14)
	public void orderpartsfromNewVendor() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().orderPartsfromNewVendor();
		InwardPageTest().pendingInward(1);
		OrderPageTest().IssuePart();

	}

	@Test(priority = 15)
	public void orderpartsforOutofStockOrder() throws Throwable {
		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
		OrderPageTest().orderpartsforOutofStockorder();
	}

//	@Test(priority = 16)
//	public void orderpartsfromJC() throws InterruptedException {
//		LoginPageTest().Valid_Login("maverick","5KXZpC&s");
//		OrderPageTest().orderpartsfromJobcard();
//
//	}

//	@Test(priority = 17)
//	public void AutozillaSettings() throws InterruptedException {
//		LoginPageTest().Valid_Login("part", "Admin@321");
//		OrderPageTest().autozillasettings();
//
//	}
//
//	@Test(priority = 18)
//
//	public void orderpartstoAutozillavendor() throws InterruptedException {
//
//		LoginPageTest().Valid_Login("part", "Admin@321");
//		OrderPageTest().orderPartstoAutoZilla();
//
//	}

//	  @Test(priority=16) 
//	  public void orderpartstoGSFCarPartsvendor() throws
//	  InterruptedException { LoginPageTest().Valid_Login("part", "Admin@321");
//	  OrderPageTest().orderpartstoGSFvendor(); }
//	  
//	  @Test(priority=18) 

//	  public void orderpartstoRajOtomate() throws
//	  InterruptedException { OrderPageTest().orderPartstoRajOtomateVendor(); }
//	 
	/*
	 * @Test(priority = 15) public void issue() throws Throwable {
	 * LoginPageTest().Valid_Login("Bhutan", "Admin@123");
	 * OrderPageTest().IssuePart1(1); }
	 */
	

	
	/*
	 * @Test(priority=17) public void JC() throws Throwable {
	 * LoginPageTest().Valid_Login("Tanzania@Zoho", "Admin@123");
	 * OrderPageTest().newJobcardOpen();
	 * 
	 * }
	 * 
	 * @Test(priority=18) public void JCus() throws Throwable {
	 * LoginPageTest().Valid_Login("sara", "Admin@123");
	 * OrderPageTest().newJobcardOpenusa();
	 * 
	 * }
	 */

}
