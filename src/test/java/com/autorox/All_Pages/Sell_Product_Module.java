package com.autorox.All_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTestMethod;



public class Sell_Product_Module extends BaseTestMethod {

// Sell Product Dashboard Screen Web Elements. 

	@FindBy(xpath = "//li[4]/a/span[normalize-space(text())='Sell Products']")
	private WebElement SellProductMenuOption;

	@FindBy(xpath = "//span[@class='icon']")
	private WebElement CartIcon;

	@FindBy(xpath = "//h3[@id='work_shop_name']")
	private WebElement WorkshopName;

	@FindBy(xpath = "(//span[normalize-space(text())='Sell Products'])[2]")
	private WebElement SellProductHeaderText;

	@FindBy(xpath = "//h4[@class='sellProductsTitle']")
	private WebElement SellProductsTitle; // page name

	@FindBy(xpath = "//button[@ID='estlater']")
	private WebElement SellProductsButton;// POSCreateButton

	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement SearchBar;

	@FindBy(xpath = "//th[text()='Counter Sale No.']")
	private WebElement CounterSaleNoTableHeader; // column

	@FindBy(xpath = "//th[text()='Reg. No.']")
	private WebElement RegNoTableHeader;

	@FindBy(xpath = "//th[text()='Customer Name']")
	private WebElement CustomerNameTableHeader;

	@FindBy(xpath = "//th[text()='Mobile No']")
	private WebElement MobileNoTableHeader;

	@FindBy(xpath = "//th[text()='Bill No.']")
	private WebElement BillNoTableHeader;

	@FindBy(xpath = "//th[text()='Bill Date']")
	private WebElement BillDateTableHeader;

	@FindBy(xpath = "//th[text()='Total Amount ₹']")
	private WebElement TotalAmount₹TableHeader;

	@FindBy(xpath = "//th[text()='Paid ₹']")
	private WebElement Paid₹TableHeader;

	@FindBy(xpath = "//th[text()='Balance ₹']")
	private WebElement Balance₹TableHeader;

	@FindBy(xpath = "//th[text()='Status']")
	private WebElement StatusTableHeader;

	@FindBy(xpath = "//th[text()='Download']")
	private WebElement DownloadTableHeader;
	
	@FindBy(xpath = "(//img[@class = 'w-45'])[1]")
	private WebElement DownloadSymbol;

	public void IncreasingRecordsCount() throws InterruptedException {

		for (int i = 1; i <= 6; i++) {
			boolean RowOptions = driver
					.findElement(By.xpath("//div[@class='dataTables_length'])[2]/label/select/option[" + i + "]"))
					.isDisplayed();
			Thread.sleep(5000);
			validateResults(RowOptions, true);

		}
	}
	// Based on above method need to remove below 12 lines of code

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[1]")
	private WebElement dataTables_length10;

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[2]")
	private WebElement dataTables_length20;

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[3]")
	private WebElement dataTables_length30;

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[4]")
	private WebElement dataTables_length40;

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[5]")
	private WebElement dataTables_length50;

	@FindBy(xpath = "(//div[@class='dataTables_length'])[2]/label/select/option[6]")
	private WebElement dataTables_length100;

	@FindBy(xpath = "//div[@class = 'dataTables_info']")
	private WebElement dataTables_info;

	@FindBy(xpath = "//table/tbody/tr/td[11]")
	private WebElement DownloadInvoice;

	@FindBy(xpath = "//table/tbody/tr[2]/td[11]")
	private WebElement DownloadEstimation;

	@FindBy(xpath = "//table/tbody/tr[6]/td[11]")
	private WebElement DownloadPreInvoice;

	@FindBy(xpath = "(//div[@id='example_paginate']/ul/LI/a/img)[1]")
	private WebElement TotalBackward;

	@FindBy(xpath = "(//div[@id='example_paginate']/ul/LI/a/img)[2]")
	private WebElement Backward;

	@FindBy(xpath = "(//div[@id='example_paginate']/ul/LI/a/img)[3]")
	private WebElement Forward;

	@FindBy(xpath = "(//div[@id='example_paginate']/ul/LI/a/img)[4]")
	private WebElement Totalforward;

	@FindBy(xpath = "//button[@id='estlater']")
	private WebElement SellProductsbutton;

	@FindBy(xpath = "//li[@id='Estimate_']")
	private WebElement SellProductsHome;

// Sell Products Dashboard Screen All Labels Validation. 

	public void SellProductsDashboardAllLabelsValidation() throws Throwable {
		Navigation("counterSale/counterSalePagination");
		boolean Element = CartIcon.isDisplayed();
		validateResults(Element, true);
		String Element1 = SellProductHeaderText.getText();
		validateResults(Element1, "Sell Products");
		System.out.println(Element1);
		scrollUp();
		String Element2 = SellProductsTitle.getText();
		validateResults(Element2, "Sell Products");
		System.out.println(Element2);
		boolean Element3 = SellProductsButton.isDisplayed();
		validateResults(Element3, true);
		boolean Element4 = SearchBar.isDisplayed();
		validateResults(Element4, true);
		String Element5 = CounterSaleNoTableHeader.getText();
		validateResults(Element5, "Counter Sale No.");
		System.out.println(Element5);
		String Element6 = RegNoTableHeader.getText();
		validateResults(Element6, "Reg. No.");
		System.out.println(Element6);
		String Element7 = CustomerNameTableHeader.getText();
		validateResults(Element7, "Customer Name");
		System.out.println(Element7);
		String Element8 = MobileNoTableHeader.getText();
		validateResults(Element8, "Mobile No");
		System.out.println(Element8);
		String Element9 = BillNoTableHeader.getText();
		validateResults(Element9, "Bill No.");
		System.out.println(Element9);
		String Element10 = BillDateTableHeader.getText();
		validateResults(Element10, "Bill Date");
		System.out.println(Element10);
		String Element11 = TotalAmount₹TableHeader.getText();
		validateResults(Element11, "Total Amount ₹");
		System.out.println(Element11);
		String Element12 = Paid₹TableHeader.getText();
		validateResults(Element12, "Paid ₹");
		System.out.println(Element12);
		String Element13 = Balance₹TableHeader.getText();
		validateResults(Element13, "Balance ₹");
		System.out.println(Element13);
		String Element14 = StatusTableHeader.getText();
		validateResults(Element14, "Status");
		System.out.println(Element14);
		String Element15 = DownloadTableHeader.getText();
		validateResults(Element15, "Download");
		System.out.println(Element15);
		
		// GetText need to call for below line.
		boolean Element16 = dataTables_length10.isDisplayed();
		validateResults(Element16, true);
		System.out.println(Element16);
		Thread.sleep(1000);
		robotZoomOut();
		robotZoomOut();
		Thread.sleep(2000);
		boolean Element17 = dataTables_info.isDisplayed();
		validateResults(Element17, true);
		System.out.println(Element17);
		boolean Element18 = WorkshopName.isDisplayed();
		validateResults(Element18, true);
		System.out.println(Element18);
		boolean Element19 = TotalBackward.isDisplayed();
		validateResults(Element19, true);
		System.out.println(Element19);
		boolean Element20 = Backward.isDisplayed();
		validateResults(Element20, true);
		System.out.println(Element20);
		boolean Element21 = Forward.isDisplayed();
		validateResults(Element21, true);
		System.out.println(Element21);
		boolean Element22 = Totalforward.isDisplayed();
		validateResults(Element22, true);
		System.out.println(Element22);
		boolean Element23 = SellProductsbutton.isDisplayed();
		validateResults(Element23, true);
		//boolean Element24 = SellProductsHome.isDisplayed();
		//validateResults(Element24, true);
		
		boolean Element24 = DownloadSymbol.isDisplayed();
		validateResults(Element24, true);

	}

	// Sell Product Dashboard Screen Action.

	public void SellProductDashboardScreenAction() throws Throwable {

		SearchBar.sendKeys("Siddharoodha");
		//search_result_verify(SearchBar);
		Thread.sleep(3000);

		SearchBar.clear();
		SearchBar.sendKeys("ABC-C000062");
		Thread.sleep(3000);
		SearchBar.clear();
		SearchBar.sendKeys("AX-I00092");
		Thread.sleep(3000);
		SearchBar.clear();
		SearchBar.sendKeys("7259088371");
		Thread.sleep(3000);
		SearchBar.clear();
		SearchBar.sendKeys("KA25UE1945");
		Thread.sleep(3000);
		SearchBar.clear();
		SearchBar.sendKeys("Sairamchinta");
		Thread.sleep(3000);
		SearchBar.clear();
		refresh();
		DownloadInvoice.click();
		DownloadEstimation.click();
		DownloadPreInvoice.click();

		dataTables_length10.click();
		Thread.sleep(5000);
		dataTables_length20.click();
		Thread.sleep(5000);
		dataTables_length30.click();
		Thread.sleep(5000);
		dataTables_length40.click();
		Thread.sleep(5000);
		dataTables_length50.click();
		Thread.sleep(5000);
		dataTables_length100.click();

//		SellProductsbutton.click();
//		boolean b = SellProductsHome.isDisplayed();
//		validateResults(b, true);
	}

	// Sell Product Creation Screen Web Elements.

	@FindBy(xpath = "//li[@id='Estimate_']")
	private WebElement SellProductHome;

	@FindBy(xpath = "(//a[contains(text(),'Sell Products')])[2]")
	private WebElement SellProductsText;
	
	@FindBy(xpath = "(//ul[@class='bill_set']/a)[1]")
	private WebElement BillNo;
	
	@FindBy(xpath = "(//ul[@class='bill_set']/a)[2]")
	private WebElement BillDate;
	
	@FindBy(xpath = "//ul[@class='bill_set']//img")
	private WebElement Date_Picker;
	
	@FindBy(xpath = "(//img[@class='print-icon'])[1]")
	private WebElement All_Image;
	
	@FindBy(xpath = "(//a[@id='pills-profile-tab']/label)[1]")
	private WebElement Text_All;
	
	@FindBy(xpath = "(//img[@class='print-icon'])[2]")
	private WebElement Tyre_Image;
	
	@FindBy(xpath = "(//a[@id='pills-profile-tab']/label)[2]")
	private WebElement Text_Tyres;
	
	@FindBy(xpath = "(//img[@class='print-icon'])[3]")
	private WebElement Battery_Image;
	
	@FindBy(xpath = "(//a[@id='pills-profile-tab']/label)[3]")
	private WebElement Text_Battery;
	
	@FindBy(xpath = "(//img[@class='print-icon'])[4]")
	private WebElement Parts_Image;
	
	@FindBy(xpath = "(//a[@id='pills-profile-tab']/label)[4]")
	private WebElement Text_Parts;
	
	@FindBy(xpath = "//input[@id='searchText_all']")
	private WebElement Search_Bar;
	
	@FindBy(id = "searchText_all")
	private WebElement WatermarkText;
	
	@FindBy(xpath = "//li[@id='all_li1']")
	private WebElement Text_Custom_Products;
	
	@FindBy(xpath = "//div[@class='item_gride']")
	private WebElement item_gride;
	
	@FindBy(xpath = "//i[@class='fa fa-plus-circle']")
	private WebElement Plus_circle;
	
	@FindBy(xpath = "//div[@class='item_gride']")
	private WebElement Text_Add_Part;
	
	@FindBy(xpath = "//li[@class='dropdown-toggle']")
	private WebElement Text_Remarks;
	
	@FindBy(xpath = "//span[@id='payCol']")
	private WebElement Text_Collections;
	
	@FindBy(xpath = "//span[@class='foot_link']")
	private WebElement Text_Service_Suggestions;
	
	@FindBy(xpath = "//span[@id='payCol_']")
	private WebElement Text_Cancelled_Invoices;
	
	@FindBy(xpath = "//button[@id='statusDone']")
	private WebElement Next_Button;
	
	@FindBy(xpath = "//button[contains(text(), 'Next')]")
	private WebElement Text_Button;
	
	@FindBy(xpath = "//i[@class='zmdi zmdi-arrow-right next_icon']")
	private WebElement NextButtonArrow;
	
	@FindBy(xpath = "//h3[contains(text(), 'Parts / Services')]")
	private WebElement Text_Parts_Services;
	
	@FindBy(xpath = "//a[@id='clearButton']")
	private WebElement Text_Clear;
	
	@FindBy(xpath = "//p[contains(text(),' Your Cart is empty. Please add items from your Inventory.')]")
	private WebElement Text_Cart_empty;
	
	// Add Custom Products PopUp Screen
	
	@FindBy(xpath = "//h4[contains(text(),'Add Custom Products')]")
	private WebElement Text_AddCustomProducts;
	
//	@FindBy(xpath = "(//button[@class='close'])[2]/i")		
//	private WebElement AddCustomProducts_CloseButton;
	
	@FindBy(xpath = "//input[@id='partnameSearch']")
	private WebElement PartNameSearch;
	
	
	
	@FindBy(xpath = "//td[@id='tdpartname_0']")
	private WebElement Selectindexnum0;
	
	@FindBy(xpath = "//td[@id='tdpartname_1']")
	private WebElement Selectindexnum1;
	
	@FindBy(xpath = "//td[@id='tdpartname_2']")
	private WebElement Selectindexnum2;
	
	// @FindBy(xpath = "(//span/label/span/text())[47]")
	
	@FindBy(xpath = "//span[@class='input input--nao']//input[@id='partnameSearch']")
	private WebElement Text_PartNamePartNo;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[1]")
	private WebElement Text_PartNo;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[2]")
	private WebElement Text_PartName;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[3]")
	private WebElement Text_Brand;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[4]")
	private WebElement Text_QoH;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[5]")
	private WebElement Text_Margin₹;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[6]")
	private WebElement Text_Price₹;
	
	@FindBy(xpath = "//*[@id=\"myModalFreq\"]/div[2]/div/div[2]/div[2]/table/thead/tr/th[7]")
	private WebElement Text_RackNo;
	
	
	public void SellProductsBillingScreen_AllLabelVerification() throws Throwable {
	Thread.sleep(2000);
	SellProductsbutton.click();
	boolean b = SellProductsHome.isDisplayed();
	validateResults(b, true); 	
  	boolean Element24 = SellProductsHome.isDisplayed();
   	validateResults(Element24, true);
   	boolean Element25 = SellProductsText.isDisplayed();
   	validateResults(Element25, true);
   	boolean Element26 = BillNo.isDisplayed();
   	validateResults(Element26, true);
   	System.out.println(Element26);
   	boolean Element27 = BillDate.isDisplayed();
   	validateResults(Element27, true);
   	System.out.println(Element27);
   	boolean Element28 = Date_Picker.isDisplayed();
   	validateResults(Element28, true);
   	boolean Element29 = All_Image.isDisplayed();
   	validateResults(Element29, true);
   	String Element30 = Text_All.getText();
	validateResults(Element30, "All");
	System.out.println(Element30);
	boolean Element31 = Tyre_Image.isDisplayed();
   	validateResults(Element31, true);
   	String Element32 = Text_Tyres.getText();
	validateResults(Element32, "Tyres");
	System.out.println(Element32);
	boolean Element33 = Battery_Image.isDisplayed();
   	validateResults(Element33, true);
   	String Element34 = Text_Battery.getText();
	validateResults(Element34, "Battery");
	System.out.println(Element34);
	boolean Element35 = Parts_Image.isDisplayed();
   	validateResults(Element35, true);
   	String Element36 = Text_Parts.getText();
	validateResults(Element36, "Parts");
	System.out.println(Element36);
	boolean Element37 = Search_Bar.isDisplayed();
   	validateResults(Element37, true);
//  String Element38 = WatermarkText.getText();
//  validateResults(Element38, "Type Part name to add (e.g. Bumper ) / Scan Barcode");
//  System.out.println(Element38);
   	boolean Element39 = Text_Custom_Products.isDisplayed();
   	validateResults(Element39, true);
   	System.out.println(Element39);
   	boolean Element40 = item_gride.isDisplayed();
   	validateResults(Element40, true);
   	boolean Element41 = Plus_circle.isDisplayed();
   	validateResults(Element41, true);
   	String Element42 = Text_Add_Part.getText();
   	validateResults(Element42, "Add Part");
   	scrollDown();
   	System.out.println(Element42);
   	String Element43 = Text_Remarks.getText();
   	validateResults(Element43, "Remarks");
   	String Element44 = Text_Collections.getText();
   	validateResults(Element44, "Collections");
   	String Element46 = Text_Service_Suggestions.getText();
   	validateResults(Element46, "Service Suggestions");
   	String Element47 = Text_Cancelled_Invoices.getText();
   	validateResults(Element47, "Cancelled Invoices");
   	boolean Element48 = Next_Button.isDisplayed();
   	validateResults(Element48, true);
   	String Element49 = Text_Button.getText();
   	validateResults(Element49, "Next");
   	boolean Element50 = NextButtonArrow.isDisplayed();
   	validateResults(Element50, true);
//   	String Element51 = Text_Parts_Services.getText();
//   	validateResults(Element51, "Parts / Services" + "Clear");
//   	String Element52 = Text_Clear.getText();
//   	validateResults(Element52, "Clear");
    String Element53 = Text_Cart_empty.getText();
   	validateResults(Element53, "Your Cart is empty. Please add items from your Inventory.");
   
	
	}
	
	public void AddCustomProductPOPScreen_AllLableValidation() {
		item_gride.click();
//	   	boolean Element54 = Text_AddCustomProducts.isDisplayed();
//	   	validateResults(Element54, true);
//	   	boolean Element55 = AddCustomProducts_CloseButton.isDisplayed();
//	   	validateResults(Element55, true);
//	   	boolean Element56 = PartNameSearch.isDisplayed();
//	   	validateResults(Element56, true);
//	   	boolean Element57 = Text_PartNamePartNo.isDisplayed();
//	   	validateResults(Element57, true);
	   	String Element58 = Text_PartNo.getText();
	   	validateResults(Element58, "Part No .");
	   	String Element59 = Text_PartName.getText();
	   	validateResults(Element59, "Part Name");
	   	String Element60 = Text_Brand.getText();
	   	validateResults(Element60, "Brand");
	   	String Element61 = Text_QoH.getText();
	   	validateResults(Element61, "QoH");
	   	String Element62 = Text_Margin₹.getText();
	   	validateResults(Element62, "Margin ₹");
	   	String Element63 = Text_Price₹.getText();
	   	validateResults(Element63, "Price ₹");
	   	String Element64 = Text_RackNo.getText();
	   	validateResults(Element64, "Rack No.");
	   	
	   	
	   	
		Selectindexnum0.click();
		Selectindexnum1.click();
		Selectindexnum2.click();
		//AddCustomProducts_CloseButton.click();
		
	}
	

	public void SellProductsBillingScreen_Actions() {
	SellProductsHome.click();
	SellProductsbutton.click();
	SellProductsHome.click();
	SellProductsbutton.click();

	

	
}

}
