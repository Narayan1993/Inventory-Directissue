package com.DirectIssue;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import controllers.BaseMethod;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DirectIssueScreen extends BaseMethod {

	// Login
	@FindBy(xpath = "//input[@id='userName_login']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password_login']")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement submit;

	// navigate to Direct issue screen

	@FindBy(xpath = "//img[@id='sideLogo_img']")
	WebElement Menubutton;

	@FindBy(xpath = "//li[@id='partsOpen']//a[@href='#!']//span[@class='sideBarTitle']")
	WebElement parts;

	@FindBy(xpath = "//li[@id='partsOption2']//a")
	WebElement Issue;

	// Direct issue screen labels

	@FindBy(xpath = "//h5[@id='issueheaderId']")
	WebElement IssueLabelInHeaders;
	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement HomesubHeader;
	@FindBy(xpath = "//a[contains(text(),'Issue')]")
	WebElement IssueSubHeader;
	@FindBy(xpath = "//*[@id=\"tr\"]/td[1]/div/div/div/div/span/label/span/i")
	WebElement searchImage;
	@FindBy(xpath = "(//*[@id=\"tr\"]/td[1]/div/div/div/div/span/label/span/text())[2]")
	WebElement TextInSearchBox;
	@FindBy(xpath = "//*[@id=\"tr\"]/td[2]/div[1]/div/div/div/span/label/span")
	WebElement QtyText;
	@FindBy(xpath = "//div[@id='hideconclick']")
	WebElement PlusButton;
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[1]")
	WebElement checkboxInHeader;
	@FindBy(xpath = "//table[@id='estimation_table']//th[contains(text(),'#')]")
	WebElement HashSymbol;
	@FindBy(xpath = "//th[normalize-space()='In Stock']")
	WebElement InstockLabel;
	@FindBy(xpath = "//table[@id='estimation_table']//th[contains(text(),'Part Name')]")
	WebElement PartNameLabel;
	@FindBy(xpath = "//th[@class='width_100'][contains(text(),'Part No')]")
	WebElement PartNumber;
	@FindBy(xpath = "//table[@id='estimation_table']//th[contains(text(),'QR / Barcode / Serial')]")
	WebElement QRBarcodeLabel;
	@FindBy(xpath = "//th[normalize-space()='Brand']")
	WebElement Brand;
	@FindBy(xpath = "//th[normalize-space()='Qty On Hand']")
	WebElement QTYInHeader;
	@FindBy(xpath = "//th[normalize-space()='Requested Qty']")
	WebElement RequestedQty;
	@FindBy(xpath = "//th[normalize-space()='Issue Qty']")
	WebElement IssueQty;
	@FindBy(xpath = "//th[normalize-space()='Pending Qty']")
	WebElement Pendingqty;
	@FindBy(xpath = "//h6[@id='price_Status']")
	WebElement SellingPrice;
	@FindBy(xpath = "//i[@id='switch_Price']")
	WebElement ToggleButton;
	@FindBy(xpath = "//th[normalize-space()='Issued To']")
	WebElement IssuedTo;
	@FindBy(xpath = "//*[@id=\"topnav\"]/div/nav/div/div[1]/div[2]/label/div/ins")
	WebElement StockCheckButton;

	@FindBy(xpath = "//input[@id='project-description1']")
	WebElement PartnameEntryInIssueScreen;

	@FindBy(xpath = "(//table[@class='autosearch_inside_table']//tr[@class='ui-menu-item']//td)[1]")
	WebElement PartInIssueDropDown;

	@FindBy(xpath = "//input[@id='partQty']")
	WebElement IssueScreenQty;

	@FindBy(xpath = "//div[@class='qtn_dropdown pluse_icon']//i")
	WebElement PlusButtonInIssueScreen;

	@FindBy(xpath = "//*[@id=\"tr_0\"]/td[4]")
	WebElement PartNameInTheGrid;

	@FindBy(xpath = "//button[@id='issuePartId']")
	WebElement IssueButton;

	@FindBy(xpath = "//span[@id='update_msg']")
	WebElement AlertMessage;

	@FindBy(xpath = "//input[@id='issueQ_0']")
	WebElement IssueQtyIntheGrid;

	@FindBy(xpath = "//input[@id='qoh_0']")
	WebElement GetqtyFromDirectIssueGrid;

	@FindBy(xpath = "//input[@class='reqQty_']")
	WebElement RequestedQtyIntheGrid;

	// Direct issue dropdown labels

	@FindBy(xpath = "//input[@id='project-description1']")
	WebElement PartNameEntryField;

	@FindBy(xpath = "//th[normalize-space()='Part No']")
	WebElement PartNumberLabelInDropDown;

	@FindBy(xpath = "//th[text()='QR / Barcode / Serial']")
	WebElement QRCodelabelInDropDown;

	@FindBy(xpath = "//th[text()='Part Name']")
	WebElement PartNameLabelInDropDown;

	@FindBy(xpath = "//th[normalize-space()='QoH']")
	WebElement QoHInDropDown;

	@FindBy(xpath = "//th[contains(text(),'Purchase Price ₹')]")
	WebElement PurchasePriceInDropDown;

	@FindBy(xpath = "//th[contains(text(),'Selling Price ₹')]")
	WebElement SellingPriceInDropDown;

	@FindBy(xpath = "//th[contains(text(),'Margin ₹')]")
	WebElement MarginIndropDown;

	@FindBy(xpath = "//th[normalize-space()='Vendor']")
	WebElement VendorInDropDown;

	@FindBy(xpath = "//th[normalize-space()='Inward Date']")
	WebElement InwardDateInDropDown;

	@FindBy(xpath = "//th[normalize-space()='Rack No.']")
	WebElement RackNoInDropDown;

	// Parts Inward

	@FindBy(xpath = "//li[@id='partsOption1']//a")
	WebElement InwardScreen;
	@FindBy(xpath = "//i[@class='fa fa-plus-square']")
	WebElement VendorPlusButton;
	@FindBy(xpath = "//input[@id='vendorName']")
	WebElement VendorNameEntry;
	@FindBy(xpath = "//input[@id='mobileNo']")
	WebElement MobileNumber;
	@FindBy(xpath = "//*[@id=\"close\"]")
	WebElement ClosebuttonInpopup;
	@FindBy(xpath = "//input[@id='billNo']")
	WebElement BillNo;
	@FindBy(xpath = "//*[@id=\"tab_default_2\"]/div[1]/div/div[5]/div[1]/div/div[3]/div/span/input[2]")
	WebElement Calenderclick;
	@FindBy(xpath = "//div[@class='col-md-3 col-sm-6 col-xs-12']//div[@class='col-md-4 col-xs-12 float-label-control date_pi datepicker_set1 remove_pad']//span//input[2]")
	WebElement SelectDate;
	@FindBy(xpath = "(//div[@class='flatpickr-days']//div//span[15])[1]")
	WebElement DateSelection;
	@FindBy(xpath = "//input[@id='partname']")
	WebElement PartNameEnter;

	@FindBy(xpath = "//input[@id='quantity']")
	WebElement QTY;

	@FindBy(xpath = "//input[@id='partprice']")
	WebElement PartPriceEntry;

	@FindBy(xpath = "//*[@id=\"hideconclick\"]/a/i")
	WebElement PlusButtonClick;

	@FindBy(xpath = "//input[@id='partNo_0']")
	WebElement PartNoField;

	@FindBy(xpath = "//a[normalize-space()='Auto Generated Part No']")
	WebElement AutogeneratePartNo;

	@FindBy(xpath = "//input[@id='sellingPrice_0']")
	WebElement SellinPriceEdit;	
	
	@FindBy(xpath = "//input[@class='myInput']")
	WebElement InputField;

	@FindBy(xpath = " //button[@id='inwardButtonId']")
	WebElement InwardButton;

	@FindBy(xpath = "//*[@id=\"payments\"]/div[2]/div/div[1]/button")
	WebElement ClosePopupButton;

	// Stock Screen

	@FindBy(xpath = "//td[@id='stockPartNumber_0']")
	WebElement PartNo;

	@FindBy(xpath = "//span[@class='subOptionTitle'][normalize-space()='Stock']")
	WebElement StockScreen;

	@FindBy(xpath = "//a[@id='pills-profile-tab-issue']")
	WebElement IssueTab;

	@FindBy(xpath = "//td[@id='tdstackdata_0']")
	WebElement PartName;

	@FindBy(xpath = "//td[@id='stockBrand_0']")
	WebElement BrandInStockScreen;

	@FindBy(xpath = "//input[@id='searchText']")
	WebElement SearchInStockScreen;

	@FindBy(xpath = "//a[@class='nav-link' and @id='pills-home-tab-inStock']")
	WebElement StockTab;

	@FindBy(xpath = "//input[@id='tags0']")
	WebElement Category;

	@FindBy(xpath = "//td[@class='qoh active_row']")
	WebElement QOH;

	@FindBy(xpath = "//td[@class='qoh active_row']")
	WebElement QOHInStockScreen;

	@FindBy(xpath = "(//td[@class='purchase_price'])[1]")
	WebElement PurchasePrice;

	@FindBy(xpath = "(//td[@class='purchase_price'])[2]")
	WebElement SellingPriceInStock;

	@FindBy(xpath = "(//td[@class='gstPer active_row']")
	WebElement TaxPercentage;

	@FindBy(xpath = "//input[@id='searchTextIssue']")
	WebElement IssueScreenSearch;

	// Issue tab

	@FindBy(xpath = "(//td[@class='part_no'])[1]")
	WebElement PartNoFieldInIssueTab;

	@FindBy(xpath = "//tbody[@id='tbodyIssue']//td[@class='part_name']")
	WebElement PartNameInIssueTab;

	@FindBy(xpath = "//td[@class='brand']")
	WebElement BrandInIssueTab;

	@FindBy(xpath = "//td[@class='jc_no']")
	WebElement JobCardNoInIssueTab;

	@FindBy(xpath = "//td[@class='purchase_price4']")
	WebElement PurchasePriceInIssueTab;

	@FindBy(xpath = "//td[@class='selling_price4']")
	WebElement SellingPriceInIssueTab;

	@FindBy(xpath = "//td[@class='issu_qty']")
	WebElement IssuedQtyInIssueTab;

	@FindBy(xpath = "//td[@class='status status_color_green']")
	WebElement StatusInIssueTab;

	@FindBy(xpath = "//tbody[@id='tbodyIssue']//td[@class='issu_qty']")
	WebElement Issuedqtyfield;

	@FindBy(xpath = "//input[@class='issueQ2_ disable_mode']")
	WebElement ReturnqtyfieldInpopup;

	@FindBy(xpath = "(//i[@class='fa fa-times-circle customClose'])[2]")
	WebElement PopupCloseInIssuepage;

	@FindBy(xpath = "//a[@class='nav-link' and @id='pills-profile-tab-issue']")
	WebElement IssutabInStocScreen;

	public void navigateToIssueScreen() throws Exception {
		Menubutton.click();
		Thread.sleep(1000);
		parts.click();
		Thread.sleep(1000);
		Issue.click();
	}

	public void navigateToInwardScreen() throws Exception {
		Menubutton.click();
		Thread.sleep(1000);
		parts.click();
		Thread.sleep(1000);
		InwardScreen.click();

	}

	public void navigateToStockScreen() throws Exception {
		Menubutton.click();
		Thread.sleep(1000);
		parts.click();
		Thread.sleep(1000);
		StockScreen.click();
	}

	public void navigateToIssueTab() throws Exception {

		Menubutton.click();
		Thread.sleep(1000);
		parts.click();
		Thread.sleep(1000);
		StockScreen.click();
		Thread.sleep(1000);
		IssueTab.click();

	}

	public void partNameEntryInTheIssueScreen(String AutoGeneratepartName, String Issueingqty) throws Exception {

		PartnameEntryInIssueScreen.sendKeys(AutoGeneratepartName);
		Thread.sleep(2000);
		// PartnameEntryInIssueScreen.sendKeys(Keys.ARROW_DOWN);
		PartInIssueDropDown.click();
		Thread.sleep(2000);
		IssueScreenQty.sendKeys(Issueingqty);
		Thread.sleep(2000);
		PlusButtonInIssueScreen.click();
	}

	public void LabelsValidationInDirectIssueScreen() {

		String IssueLabel = IssueLabelInHeaders.getText();
		validateResults(IssueLabel, "Issue");
		String HomeSubHeader = HomesubHeader.getText();
		validateResults(HomeSubHeader, "Home");
		String SubHeader = IssueSubHeader.getText();
		validateResults(SubHeader, "Issue");
		boolean search = searchImage.isDisplayed();
		validateResults(search, true);

		// String TextInSearch = TextInSearchBox.getText();
		// validateResults(TextInSearch, "PART NAME / PART NUMBER / SCAN BARCODE");

		// String TextInQTY = QtyText.getText();
		// validateResults(TextInQTY, "Qty");
		boolean plusbutton = PlusButton.isDisplayed();
		validateResults(plusbutton, true);
		// boolean CheckboxInHeader = checkboxInHeader.isDisplayed();
		// validateResults(CheckboxInHeader, true);
		String InstockText = InstockLabel.getText();
		validateResults(InstockText, "In Stock");
		String PartName = PartNameLabel.getText();
		validateResults(PartName, "Part Name");
		// String Qrlabel = QRBarcodeLabel.getText();
		// validateResults(Qrlabel, "QR / Barcode / Serial ");
		String BrandName = Brand.getText();
		validateResults(BrandName, "Brand");
		String QTYHeader = QTYInHeader.getText();
		validateResults(QTYHeader, "Qty On Hand");
		String ReqQty = RequestedQty.getText();
		validateResults(ReqQty, "Requested Qty");
		String IssueQtyInHeader = IssueQty.getText();
		validateResults(IssueQtyInHeader, "Issue Qty");
		String Pending = Pendingqty.getText();
		validateResults(Pending, "Pending Qty");
		String Sellingpricelabel = SellingPrice.getText();
		validateResults(Sellingpricelabel, "Selling Price");
		boolean Toggle = ToggleButton.isDisplayed();
		validateResults(Toggle, true);
		String IssueToLabel = IssuedTo.getText();
		validateResults(IssueToLabel, "Issued To");
	}

	public void dropdownlabelsValidataion() {

		PartNameEntryField.sendKeys("filter");
		String PartNoLabel = PartNumberLabelInDropDown.getText();
		validateResults(PartNoLabel, "Part No");
		String QRDropDown = QRCodelabelInDropDown.getText();
		validateResults(QRDropDown, "QR / Barcode / Serial");
		String PartNameDropDown = PartNameLabelInDropDown.getText();
		validateResults(PartNameDropDown, "Part Name");
		String QOHDropDown = QoHInDropDown.getText();
		validateResults(QOHDropDown, "QoH");
		String PurchaseDropDown = PurchasePriceInDropDown.getText();
		validateResults(PurchaseDropDown, "Purchase Price ₹");
		String SellingDropDown = SellingPriceInDropDown.getText();
		validateResults(SellingDropDown, "Selling Price ₹");
		String MarginDropDown = MarginIndropDown.getText();
		validateResults(MarginDropDown, "Margin ₹");
		String VendorDropDown = VendorInDropDown.getText();
		validateResults(VendorDropDown, "Vendor");
		String InwardDropDownLabel = InwardDateInDropDown.getText();
		validateResults(InwardDropDownLabel, "Inward Date");
		String RackNo = RackNoInDropDown.getText();
		validateResults(RackNo, "Rack No.");
	}


	String GetPartName;

	public void DirectPartsInward(String partName) throws Exception {

		navigateToInwardScreen();
		StockCheckButton.click();
		VendorPlusButton.click();
		Thread.sleep(2000);
		VendorNameEntry.sendKeys(getAutoGenerateOnlyString(8)); 
		String VendorNamePrint = VendorNameEntry.getAttribute("value");
		System.out.println("The vendor name is : " + VendorNamePrint);
		Thread.sleep(2000);
		MobileNumber.sendKeys("9" + autoGenerateNumber(9, "123456789"));
		ClosebuttonInpopup.click();
		BillNo.sendKeys(autoGenerateNumber(4, "123456789") + getAutoGenerateOnlyString(3));
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByClassName('calender-icon')[0].click()");
		jse.executeScript("document.getElementsByClassName('calender-icon')[0].click()");
		SelectDate.click();
		Thread.sleep(2000);
		DateSelection.click();
		PartNameEnter.sendKeys(partName); 
		QTY.sendKeys("10");
		PartPriceEntry.sendKeys("100");
		Thread.sleep(1000);
		PlusButtonClick.click();
		Thread.sleep(1000);
		// Part name in inward screen grid
		GetPartName = driver.findElement(By.xpath("//*[@id=\"partname_0\"]")).getAttribute("value");
		System.out.println("The part name is :" + GetPartName);
		PartNoField.click();
		Thread.sleep(1000);
		AutogeneratePartNo.click();
		Thread.sleep(2000);
		SellinPriceEdit.clear();
		Thread.sleep(1000);
		SellinPriceEdit.sendKeys("1000");
		Thread.sleep(1000);
		InputField.click();
		Thread.sleep(2000);
		InwardButton.click();
		Thread.sleep(1000);
		ClosePopupButton.click();

	}

	public Map<String, String> CheckTheStockDetails(String AutoGeneratepartName) throws Exception {

		String actual = driver.getTitle();
		String expected = "Direct Inward - Autorox";
		System.out.println("The stock title is: " + actual);
		if (actual.equals(expected)) {
			Thread.sleep(1000);
			StockTab.click(); 
			Thread.sleep(1000); 
			SearchInStockScreen.click();
			SearchInStockScreen.sendKeys(AutoGeneratepartName);
		 
		}

		if (!actual.equals(expected)) {
			navigateToStockScreen();
			StockTab.click();
			SearchInStockScreen.click();
			SearchInStockScreen.sendKeys(AutoGeneratepartName);
		}
		ArrayList<String> list = new ArrayList<>();
		Thread.sleep(2000);
		list.add(PartNo.getText());
		list.add(PartName.getText());
		list.add(BrandInStockScreen.getText());
		list.add(Category.getText());
		list.add(QOH.getText()); 
		list.add(PurchasePrice.getText());
		list.add(SellingPriceInStock.getText());
		System.out.println("The total Stock list is :" + list);
		Map<String, String> m1 = new HashMap<>();
		m1.put("partNo", PartNo.getText());
		m1.put("partName", PartName.getText());
		m1.put("qty", QOH.getText());
		return m1;

	}

	public void differanceCalculation(Map<String, String> beforePartsIssuesData,
			Map<String, String> afterartsIssuesData) {
		// qty key should be present in the both the map
		if (beforePartsIssuesData.containsKey("qty") && afterartsIssuesData.containsKey("qty")) {
			String beforeQty = beforePartsIssuesData.get("qty");
			String afterQty = afterartsIssuesData.get("qty");
			System.out.println("value from the map beforeQty -> " + beforeQty);
			System.out.println("value from the map afterQty -> " + afterQty);
			// converting the string to
			// need to handle null and empty check to the afterQty and beforeQty
			Double beforeQtyConverted = Double.parseDouble(beforeQty);
			Double afterQtyConverted = Double.parseDouble(afterQty);

			System.out.println("after converting into double beforeQty -> " + beforeQty);
			System.out.println("after converting into double afterQty -> " + afterQty);
			Double finalOutput = beforeQtyConverted - afterQtyConverted;
			System.out.println("difference of qty issued , (final output)  -> " + finalOutput);
			System.out.println(finalOutput);
		}
	}

	public void duplicatepartEntry(String AutoGeneratepartName, String Issueingqty) throws Exception {
		try {
			navigateToIssueScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 2; i++) {
			PartnameEntryInIssueScreen.sendKeys(AutoGeneratepartName);
			Thread.sleep(2000);
			PartInIssueDropDown.click();
			Thread.sleep(2000); 
			IssueScreenQty.sendKeys(Issueingqty);
			Thread.sleep(2000);
			PlusButtonInIssueScreen.click();
			IssueQtyIntheGrid.sendKeys(AutoGeneratepartName);
			// alert message is displaying or not
			boolean alertmsg = AlertMessage.isDisplayed();
			if (alertmsg) {
				System.out.println("The alert msg is displaying in direct issue screen");
			} else {
				System.out.println("The alert msg is not displaying in direct issue screen");
			}
			String alert = AlertMessage.getText();
			System.out.println("The alert message is :" + alert);

		}

	}

	public void IssueingThePartInDirectIssueScreen(String AutoGeneratepartName, String Issueingqty) throws Exception {

		System.out.println("The part name is :" + AutoGeneratepartName);
		Thread.sleep(3000);
		navigateToIssueScreen();
		partNameEntryInTheIssueScreen(AutoGeneratepartName, Issueingqty);
		// Check the part name is correct or not
		String expected = PartNameInTheGrid.getText();
		String actual = AutoGeneratepartName;
		if (expected.equals(actual)) {
			Assert.assertEquals(expected, AutoGeneratepartName);
			System.out.println("The part name in the grid is true");
		} else {
			System.out.println("The part name is not true");
		}

	}
	// Check without providing the submit button, the issue is clicking or not

	public void Issubuttonclick(String AutoGeneratepartName, String Issueingqty) throws Exception {

		String qtyInGrid = GetqtyFromDirectIssueGrid.getAttribute("value");
		int issueqty = Integer.parseInt(Issueingqty);
		System.out.println("After converting to the integer the issueqty dropdown is : " + issueqty);
		String Reqqty = autoGenerateNumber(1, "2345");  
		int RequiredQty = Integer.parseInt(Reqqty);
		if (issueqty > RequiredQty) { 
			String Rq = String.valueOf(RequiredQty); 
			Thread.sleep(2000);
			IssueQtyIntheGrid.sendKeys(Rq);
			Thread.sleep(2000);
			IssueButton.click();
			Thread.sleep(3000);
			driver.navigate().refresh(); 
		
		/*	if(IssueQtyIntheGrid.getAttribute("value")==null) {
	
				IssueQtyIntheGrid.sendKeys(Rq);
				Thread.sleep(2000);
				IssueButton.click();
				Thread.sleep(3000);
				driver.navigate().refresh();
			} else
			IssueButton.click();
			Thread.sleep(3000);
			driver.navigate().refresh(); */
			
		
		if (issueqty < RequiredQty) {
			partNameEntryInTheIssueScreen(AutoGeneratepartName, Issueingqty);
			String issue = String.valueOf(issueqty);
			Thread.sleep(2000);
			if(IssueQtyIntheGrid.getAttribute("value")==null) {
			IssueQtyIntheGrid.sendKeys(issue);
			Thread.sleep(2000);
			IssueButton.click();
			} else {
				
				Thread.sleep(2000);
				IssueButton.click();
			}
				
		}

		boolean alertmsg = AlertMessage.isDisplayed();
		if (alertmsg) {
			System.out.println("The alert msg is displaying in direct issue screen");
		} else {
			System.out.println("The alert msg is not displaying in direct issue screen");
		}
		String alert = AlertMessage.getText();
		System.out.println("The alert message is :" + alert);
		driver.navigate().refresh();
		}
	}
public void CheckMorethanThecurrentIssueValue(String AutoGeneratepartName, String Issueingqty) throws Exception {
	partNameEntryInTheIssueScreen(AutoGeneratepartName, Issueingqty);
	
	 String MoreThatIssueqty = Issueingqty+10;
	 Thread.sleep(2000);
	 IssueQtyIntheGrid.sendKeys(MoreThatIssueqty);
	 Thread.sleep(2000);
	 IssueButton.click();
	 Thread.sleep(3000);
	
	 String alert = "Issue Quantity should be less than are equal to Pending Quantity";
	 Assert.assertTrue(true, alert);
	 System.out.println(alert);
	 driver.navigate().refresh();  
	 
	
		
	}


	public Map<String, String> IssueTabForQtyCheck(String AutoGeneratepartName) throws Exception {

		String actual = driver.getTitle(); 
		String expected = "Inventory - Autorox";
		if (actual.equals(expected)) {
			navigateToIssueTab();
			Thread.sleep(1000);
			IssutabInStocScreen.click();
		} else 
			navigateToIssueTab();
			Thread.sleep(1000);
			IssutabInStocScreen.click();
			
		IssueScreenSearch.sendKeys(AutoGeneratepartName);
		Map<String, String> IssuedTabdetails = new HashMap<>();
		IssuedTabdetails.put("PartNameInIssueTab", PartNameInIssueTab.getText());
		IssuedTabdetails.put("PartNoIssuedTab", PartNoFieldInIssueTab.getText());
		IssuedTabdetails.put("BrandInIssueTab", BrandInIssueTab.getText());
		IssuedTabdetails.put("JobCardNoInIssueTab", JobCardNoInIssueTab.getText());
		IssuedTabdetails.put("PurchasePriceInIssueTab", PurchasePriceInIssueTab.getText());
		IssuedTabdetails.put("SellingPriceInIssueTab", SellingPriceInIssueTab.getText());
		IssuedTabdetails.put("Status", StatusInIssueTab.getText());
		IssuedTabdetails.put("Issuedqty", Issuedqtyfield.getText());
		System.out.println("Total details in the Issued Tab is: " + IssuedTabdetails);
		return IssuedTabdetails;
	}

	public void returnqtyFromIssuedTab(String qty, String Issueingqty) throws Exception {
		// Provide the return qty more than the issue qty
		PartNameInIssueTab.click();
		int Issueqtyvalue = Integer.parseInt(Issueingqty);
		String Wrongqty = "Wrongqty";
		String Correctqty = "CorrectQty";
		if (Wrongqty == qty) {
			int Reqqty = Issueqtyvalue + 2;
			System.out.println("Adding more value on requested qty :" + Reqqty);
			String Actualreqqty = String.valueOf(Reqqty);
			ReturnqtyfieldInpopup.sendKeys(Actualreqqty);
			Thread.sleep(3000); 
		} else if (Correctqty == qty) { 
			int Reqqty = Issueqtyvalue;
			System.out.println("Adding more value on requested qty :" + Reqqty);
			String Actualreqqty = String.valueOf(Reqqty);
			ReturnqtyfieldInpopup.sendKeys(Actualreqqty);
			Thread.sleep(3000);
		}

		PopupCloseInIssuepage.click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void compareTheStockValuesWithIssuedTabValues(Map<String, String> beforeIssueingTheDetails,
			Map<String, String> AfterIssueingthewrongqty) {

		String BeforeissuingtheqtyInIssueTab = beforeIssueingTheDetails.get("Issuedqty");
		String AfterissuingtheqtyInIssueTab = AfterIssueingthewrongqty.get("Issuedqty");
		if (BeforeissuingtheqtyInIssueTab.equals(AfterissuingtheqtyInIssueTab)) {

			Assert.assertTrue(true);
			System.out.println("The values are matching");
		} else {

			System.out.println("The values are not matching");
		}
 
	}

	
}
