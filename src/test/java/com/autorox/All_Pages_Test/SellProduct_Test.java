package com.autorox.All_Pages_Test;



import org.testng.annotations.Test;



import pageObjects.initializePageObjects.All_Page_Intializer;

public class SellProduct_Test extends All_Page_Intializer {

	// Sell Product Dashboard Screen Labels validation and Actions.

	@Test(priority = 1)
	public void SellProductsDashboardScreen_LabelValidation_Actions() throws Throwable {
		Sell_Product().Valid_Login("Siddha", "Siddha@371");
		Sell_Product().SellProductsDashboardAllLabelsValidation();
		Sell_Product().SellProductDashboardScreenAction(); 
	}  

	
	@Test(priority = 2)
		public void SellProductsDashboard_page_title() { 
		
	     	//String title1= driver.getTitle();
			String title1= getWebDriver().getTitle();
			System.out.println(title1);
			validateResults(title1, "Sell Products Dashboard - Autorox");
			//validateResults(title1, "Sell Products Job Card Creation - Autorox");
				

	}

	// Sell Products Billing Screen Labels validation and Actions.

	@Test(priority = 3)
	public void SellProducts_BillingScreen_LabelValidation_Actions() throws Throwable {
		
		Sell_Product().SellProductsBillingScreen_AllLabelVerification();
		Sell_Product().AddCustomProductPOPScreen_AllLableValidation();
		Sell_Product().SellProductsBillingScreen_Actions();
	
		
	}

	
}
