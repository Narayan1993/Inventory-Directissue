package com.autorox.All_Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Locale;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Base.BaseTestMethod;

public class Order_Page extends BaseTestMethod {

	public Order_Page(WebDriver driver) {
		BaseTestMethod.driver = driver;
		BaseTestMethod.js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// WebDriver driver;
	
	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id='trigger']/div[1]")
	private WebElement autoroxhome;

	@FindBy(id = "partsOpen")
	private WebElement parts;

	@FindBy(id = "partsOption")
	private WebElement order;
	@FindBy(id = "partsOption2")
	private WebElement issue;
	
	@FindBy(id = "project-description1")
	private WebElement enterparttoIssue;
	
	@FindBy(xpath = "//tr[@class='ui-menu-item']//td[4]")
	private WebElement qtynumber;
	@FindBy(id = "reqQty_0")
	private WebElement reqQ;
	@FindBy(id = "issueQ_0")
	private WebElement issueQ;
	
	@FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content mega_table_autosearch']")
    WebElement checkStock;
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//tr[@class='ui-menu-item']")
	private WebElement selectparttoIssue;
	
	@FindBy(xpath = "//input[@id='partQty']")
	private WebElement IssueQty;
	
	@FindBy(id = "hideconclick")
	private WebElement clickonAdd;
	
	@FindBy(id = "issuePartId")
	private WebElement issuePart;
	
	@FindBy(xpath = "//i[@class='zmdi zmdi-close close_detail_drp']")
	private WebElement closeDetailDrop;

	@FindBy(id = "vendor_purchaseOrder")
	private WebElement existingVendor;

	@FindBy(xpath = "//ul[@id='ui-id-3']//li[3]")
	private WebElement vendorNameMenu;

	@FindBy(id = "insuarance_details")
	private WebElement addVendor;

	@FindBy(id = "select2-stock_drp-container")
	private WebElement stockType;

	@FindBy(xpath = "//span[@class='select2-results']//ul//li[1]")
	private WebElement stock1;
	@FindBy(xpath = "//span[@class='select2-results']//ul//li[2]")
	private WebElement stock2;
	@FindBy(xpath = "//span[@class='select2-results']//ul//li[3]")
	private WebElement stock3;

	@FindBy(xpath = "//*[@id='select2-taxType-container']")
	private WebElement paymentTypeMenu;

	@FindBy(xpath = "//span[@class='select2-results']//ul//li[2]")
	private WebElement paymentType1;

	@FindBy(id = "partsOption1")
	private WebElement goToOrders;
	
	@FindBy(id = "pills-profile-tab-ordersStock")
	private WebElement StockOrders;
	

	@FindBy(xpath = "//*[@id='trOrder_0']/td[6]")
	private WebElement orderNo;

	////////////// Parts-Order////////////////

	@FindBy(xpath = "//span[@class='icon ']")
	private WebElement ordercartimage;
	@FindBy(xpath = "//label[@id='stockTitle1']")
	private WebElement stockTitle;
	@FindBy(id = "inwrdStockPage_red")
	private WebElement Home;

	@FindBy(id = "Invoice_")
	private WebElement selectorder;
	@FindBy(xpath = "//ul[@class='dropdown order_part_drp']")
	private WebElement orderslist;
	@FindBy(xpath = "//ul[@class='dropdown-menu animated fadeInDown ']//li[4]")
	private WebElement selectorderFromList;
	@FindBy(id = "displayPO")
	private WebElement ordersDropdown;
	@FindBy(id = "podate")
	private WebElement ordersdate;
	@FindBy(id = "vendor_purchaseOrder")
	private WebElement searchforVendor;
	@FindBy(id = "insuarance_details")
	private WebElement addingVendor;
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-12 col-xs-12 other_input_set petrol_select1 not_imp']//label")
	private WebElement stockOption;
	@FindBy(xpath = "//div[@class='col-md-4 col-sm-12 col-xs-12 other_input_set petrol_select1']//label")
	private WebElement paymentType;

	@FindBy(id = "partname")
	private WebElement partnamesearch;
	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement chooseQuantity;
	@FindBy(id = "masterQntty")
	private WebElement priceMRP;
	@FindBy(id = "totallabourprice")
	private WebElement serviceLabour;
	@FindBy(xpath = "//*[@id=\"hideconclick\"]/a/i")
	private WebElement addPartbutton;
	@FindBy(xpath = "(//div[@class='icheckbox_square-blue'])[5]")
	private WebElement partCheckbox;
	@FindBy(id = "estimation_table")
	private WebElement partsTable;
	@FindBy(xpath = "//span[@class='foot_link ']")
	private WebElement navigateBack;
	@FindBy(id = "createPurchaseOrder")
	private WebElement createPObuy;
	@FindBy(id = "li_0")
	private WebElement sidebar1;
	@FindBy(id = "li_1")
	private WebElement sidebar2;
	@FindBy(id = "li_2")
	private WebElement sidebar3;
	
	@FindBy(xpath = "//i[@id='status_37']")
	WebElement PartsOrderOff;
	@FindBy(xpath = "//i[@id='status_37']")
	WebElement PartsOrderOn;
	
public void PartsOrderSettingOff() {
    	
	PartsOrderOff.click();
    }
    public void PartsOrderSettingOn() {
    	
    	PartsOrderOn.click();
    }

	public void clickonHome() {
		Home.click();
	}

	public void clickonGsfCarParts() {
		sidebar1.click();
	}

	public void clickonAutozilla() {
		sidebar1.click();
	}

	public void clickonRajOtomate() {
		sidebar3.click();
	}

	public void clickonOrderslist() {
		orderslist.click();
		
	}
	public void verifyOrderslist() {
		Assert.assertNotNull(orderslist, "Element is not present");
		
	}
	@FindBy(xpath = "//div[@class='title']//span[2]")
	private WebElement stocklistPageName;

	@FindBy(id = "invoice_emailId")
	private WebElement emailid1;

	public void enteremailId(String emailId) {
		emailid1.sendKeys();

	}

	@FindBy(xpath = "(//button[@class='btn btn-primary mailOrder-data'])[1]")
	private WebElement save;

	public void clickonSave() throws InterruptedException {
		save.click();
		Thread.sleep(5000);
		stocklogo.click();
	}

	@FindBy(xpath = "//*[@id=\"style-1\"]/ul/li[5]/a")
	private WebElement stocklogo;

	
	@FindBy(xpath = "//div[@id='viewOrder']//a[1]")
	private WebElement viewOrder;

	public void clickonviewOrder() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(viewOrder));
			viewOrder.click();
		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		}
	}

	// *[@id="order_status"]/div[2]/div/div/h3
	// *[@id="viewOrder"]/a[2] continue shopping

	@FindBy(css = "ul.dropdown.order_part_drp > li.open > ul.dropdown-menu > li > a")
	List<WebElement> orderListItems;

	// Method to find and click on the specified order row
	public void clickOnOrderRow(String orderId, String vendorName) {
		for (WebElement item : orderListItems) {
			String itemText = item.getText();
			if (itemText.contains(orderId) && itemText.contains(vendorName)) {
				item.click();
				return;
			}
		}
		throw new RuntimeException("Order row with ID: " + orderId + " and Vendor: " + vendorName + " not found.");
	}

	public void selectOrderByPosition(int position) {
		ordersDropdown.click();

		String cssSelector = ".dropdown-menu li:nth-of-type(" + position + ") a";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));

		element.click();
//        WebElement order = driver.findElement(By.cssSelector(cssSelector));
//        order.click();
	}
///////////

	@FindBy(xpath = "//tr[@id='tr_0']//td[3]")
	WebElement row1Details;
	@FindBy(xpath = "//tr[@id='tr_0']//td[3]")
	WebElement row2Details;

	public List<String> getRow1Values() {
		List<String> row1 = new ArrayList<>();
		row1.add(row1Details.getText());
		return row1;
	}

	public List<String> getRow2Values() {
		List<String> row2 = new ArrayList<>();
		row2.add(row2Details.getText());
		return row2;
	}

	@FindBy(xpath = "//tr[@id='trOrder_0']")
	WebElement selectOrder;

	public void clickOrder() {
		selectOrder.click();
	}

	//////// jc//////////

	@FindBy(xpath = "//tr[@class='es-li']//input[@type='number' and @id='__BVID__126']")
	WebElement unit;

	@FindBy(xpath = "//*[@id='__BVID__9']//tr[2]//td[7]//span[2]")
	WebElement rate;

	// Web elements for comparison
	@FindBy(id = "tddata_0")
	private WebElement partname1;

	@FindBy(id = "partNo_0")
	private WebElement partNo1;

	@FindBy(id = "quantity_0")
	private WebElement Quantity1;

	@FindBy(id = "partPrice_0")
	private WebElement PartPrice1;

	@FindBy(id = "vendorName")
	WebElement newvendorName;

	@FindBy(id = "contactName")
	WebElement contactName;

	@FindBy(id = "gstnno")
	WebElement gstNumber;

	@FindBy(id = "mobileNo")
	WebElement mobileNo;

	@FindBy(id = "contactEmail")
	WebElement emailId;

	@FindBy(id = "address")
	WebElement address;

	@FindBy(id = "colonyStrtLocatn")
	WebElement street;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "ui-id-1")
	WebElement selectState;
	@FindBy(id = "ui-id-3")
	WebElement selectState1;

	@FindBy(id = "pincode")
	WebElement pincode;

	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[5]")
	WebElement bankName;

	@FindBy(xpath = "//ul[@id='select2-bankName-results']//li[6]")
	WebElement bank;

	@FindBy(id = "branch")
	WebElement branch;

	@FindBy(id = "ifsccode")
	WebElement ifsc;

	@FindBy(id = "panNo")
	WebElement pan;

	@FindBy(id = "accountNo")
	WebElement accountNo;

	@FindBy(id = "creditAmount")
	WebElement addcreditAmount;

	@FindBy(id = "creditDays")
	WebElement addcreditDays;

	@FindBy(id = "vendorDiscount")
	WebElement addvendorDiscount;
	@FindBy(xpath = "//*[@id='myModal2']/div[2]/div/div[1]/button")
	WebElement close1;
	
	@FindBy(xpath="//span[normalize-space()='In Stock']")
	WebElement stocktype;
	
	@FindBy(xpath = "//div[@class='optWrapper up']//ul//li[3]")
	WebElement reorder;
	@FindBy(id = "redirectToReOrder")
	WebElement redirecttoorder;
	
	@FindBy(id = "stockPartNumber_0")
	WebElement parttoreorder;
	@FindBy(xpath = "//div[@id='reorderLevel']")
	WebElement clickreorder;
	@FindBy(id = "tdreorder_0")
	WebElement reordervalue;
	@FindBy(id = "tdminorder_0")
	WebElement minorder;
	
	
	
	public void reOrderLevel() throws Throwable {
		
		Stock.click();
		Thread.sleep(3000);
		String prt = parttoreorder.getText();
		System.out.println(prt);
		parttoreorder.click();
		Thread.sleep(3000);
		clickreorder.click();
		Thread.sleep(6000);
		reordervalue.sendKeys("3");
		Thread.sleep(3000);
		minorder.sendKeys("10");
		
		stocktype.click();
		reorder.click();
		redirecttoorder.click();
		existingVendor.sendKeys("SAI809");
		buy.click();
		
		
		
		
	}
	public void statename(String stname) throws InterruptedException {
		state.sendKeys(stname);
		Thread.sleep(5000);
		selectState.click();
	}

	public void statename1(String stname) throws InterruptedException {
		state.sendKeys(stname);
		Thread.sleep(5000);
		selectState1.click();
	}

	public void bankfield() {
		bankName.click();
		bank.click();
	}

	public void bankdetails() {

		branch.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(10));
		ifsc.sendKeys(getAutoGenerateOnlyStringCapital(4) + getAutoGenerateNumber(7));
		pan.sendKeys(
				getAutoGenerateOnlyStringCapital(4) + getAutoGenerateNumber(4) + getAutoGenerateOnlyStringCapital(1));
		accountNo.sendKeys(getAutoGenerateNumber(12));
		addcreditAmount.sendKeys(getAutoGenerateNumber(5));
		addcreditDays.sendKeys(getAutoGenerateNumber(2));
		addvendorDiscount.sendKeys(getAutoGenerateNumber(2));

	}

	public void close() {
		close1.click();
	}
public void verifyPartsOrder() throws InterruptedException {
    	
	
	autoroxhome.click();
	Thread.sleep(5000);
	parts.click();	
	validateElement(order, "PartsOrder Option");
    	
    }

	public void navigatetoOrdersHomePage() throws InterruptedException {
        autoroxhome.click();
		Thread.sleep(3000);
		parts.click();
		Thread.sleep(3000);
		order.click();
		}
	public void IssuePart() throws InterruptedException {
		autoroxhome.click();
		Stock.click();
		navigatetoorders();
		orderNo.click();
		String partno=partNo1.getAttribute("value");
		autoroxhome.click();
		Thread.sleep(3000);
		parts.click();
		Thread.sleep(3000);
		issue.click();
		enterparttoIssue.sendKeys(partno);
		Thread.sleep(3000);
		String qtyNo=qtynumber.getText();
		Thread.sleep(3000);
		selectparttoIssue.click();
		Thread.sleep(3000);
		IssueQty.sendKeys(qtyNo);
		Thread.sleep(3000);
		clickonAdd.click();
		String qtyonHand= getValue("id", "qoh_0", "value");
		Thread.sleep(3000);
		reqQ.clear();
		reqQ.sendKeys(qtyonHand);
		Thread.sleep(3000);
		issueQ.clear();
		issueQ.sendKeys(qtyonHand);
		Thread.sleep(3000);
		
		issuePart.click();
		Thread.sleep(3000);
		enterparttoIssue.sendKeys(partno);
		Thread.sleep(3000);
		
		
		isCheckStockAbsent();
	}
	
	@FindBy(id = "stockPartNumber_0")
	private WebElement partNumber;
	
	public void IssuePart1(int n) throws InterruptedException {
		
		for (int i = 1; i <= n; i++) {
		autoroxhome.click();
		Stock.click();
		
		String partno=partNumber.getText();
		autoroxhome.click();
		Thread.sleep(3000);
		parts.click();
		Thread.sleep(3000);
		issue.click();
		enterparttoIssue.sendKeys(partno);
		Thread.sleep(3000);
		String qtyNo=qtynumber.getText();
		Thread.sleep(3000);
		selectparttoIssue.click();
		Thread.sleep(3000);
		IssueQty.sendKeys(qtyNo);
		Thread.sleep(3000);
		clickonAdd.click();
		String qtyonHand= getValue("id", "qoh_0", "value");
		Thread.sleep(3000);
		reqQ.clear();
		reqQ.sendKeys(qtyonHand);
		Thread.sleep(3000);
		issueQ.clear();
		issueQ.sendKeys(qtyonHand);
		Thread.sleep(3000);
		
		issuePart.click();
		Thread.sleep(3000);
			
	}
	}
		
	public void isCheckStockAbsent() {
	   
		try {
	        // Attempt to locate the element
	        List<WebElement> elements = driver.findElements(By.xpath("//tr[@class='ui-menu-item']//td[4]"));
	        
	        // Check if the element is found (size > 0), and assert its absence
	        Assert.assertTrue(elements.isEmpty(), "The element was found but it should be absent.");
	    } catch (NoSuchElementException e) {
	        // Handle the exception if the element is not found
	        Assert.fail("The element is absent as expected, but was caught via an exception.");
	    }
	}

	
	
	    
	

	public void issue() throws Throwable {

		Navigation("directIssue");
		
		

	}

	public void verifynavigatetostocklist() throws InterruptedException {

		navigatetoOrdersHomePage();
		clickonHome();
		String pageName = stocklistPageName.getText();
	    assertEquals(pageName, "Stock List", "Page name validation failed");

	}
	
	

	public void orderpartsfromJobcard() throws InterruptedException {

		orderpartsfromJC();
		Thread.sleep(3000);
		selectVendor();
		//paymenttype();
		createpo();
		Thread.sleep(5000);
//		selectstock();
//		navigatetoorders();
//		Thread.sleep(3000);
//
//		String vendorName = getOrderName();
//		System.out.println("Vendor Name: " + vendorName);
//
//		String vendorNameToValidate1 = "SAI809";
//		assertTrue(vendorName.contains(vendorNameToValidate1), "Vendor name validation failed");
	}
	

	private double parseDouble(String value) {
		NumberFormat format = NumberFormat.getInstance(Locale.US);
		try {
			return format.parse(value).doubleValue();
		} catch (Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	public void validateCalculations() {
		// Get all rows in the pricing table, assuming each row has a unique suffix like
		// "_0", "_1", etc.
		List<WebElement> rows = driver.findElements(By.xpath("//tr[starts-with(@id, 'row_')]"));

		// Initialize variables to accumulate totals
		double totalDiscount = 0.0;
		double totalGstAmount = 0.0;
		double totalPurchasePrice = 0.0;

		// Loop through each row
		for (int i = 0; i < rows.size(); i++) {
			// Constructing IDs dynamically based on the row index
			String qtyId = "quantity_" + i;
			String priceId = "partPrice_" + i;
			String discountValueId = "discountValue_" + i;
			String discountTypeId = "discountType_" + i;
			String taxId = "gst_" + i;

			// Retrieve input elements
			WebElement qtyElement = driver.findElement(By.id(qtyId));
			WebElement priceElement = driver.findElement(By.id(priceId));
			WebElement discountValueElement = driver.findElement(By.id(discountValueId));
			Select discountTypeDropdown = new Select(driver.findElement(By.id(discountTypeId)));
			Select taxDropdown = new Select(driver.findElement(By.id(taxId)));

			// Extract and parse the values
			int qty = Integer.parseInt(qtyElement.getAttribute("value").trim());
			double unitPrice = Double.parseDouble(priceElement.getAttribute("value").trim());
			double discountValue = 0.0;

			// Check if discount is defined
			String discountValueAttr = discountValueElement.getAttribute("value").trim();
			if (!"undefined".equals(discountValueAttr) && !"".equals(discountValueAttr)) {
				discountValue = Double.parseDouble(discountValueAttr);
			}

			// Get the discount type
			String discountType = discountTypeDropdown.getFirstSelectedOption().getText().trim();

			// Calculate the discount amount based on the type
			double discountAmount = 0.0;
			if ("%".equals(discountType)) {
				discountAmount = (unitPrice * qty) * (discountValue / 100);
			} else if ("₹".equals(discountType)) {
				discountAmount = discountValue;
			}

			// Select the tax value from the dropdown
			double tax = Double.parseDouble(taxDropdown.getFirstSelectedOption().getText().replace("%", "")) / 100;

			// Calculate the total purchase price for this row
			double purchasePrice = unitPrice * qty;
			double totalAfterDiscount = purchasePrice - discountAmount;
			double gstAmount = totalAfterDiscount * tax;
			double total = totalAfterDiscount + gstAmount;

			// Accumulate totals for all rows
			totalDiscount += discountAmount;
			totalGstAmount += gstAmount;
			totalPurchasePrice += total;

			String displayedDiscountTotalStr = driver.findElement(By.id("discountTotal")).getText().replace(",", "")
					.trim();
			double displayedDiscountTotal = Double.parseDouble(displayedDiscountTotalStr);

			String displayedGstTotalAmountStr = driver.findElement(By.id("gstTotalAmount")).getText().replace(",", "")
					.trim();
			double displayedGstTotalAmount = Double.parseDouble(displayedGstTotalAmountStr);

			String displayedTotalPurchasePriceStr = driver.findElement(By.id("totalPurchasePrice")).getText()
					.replace(",", "").trim();
			double displayedTotalPurchasePrice = Double.parseDouble(displayedTotalPurchasePriceStr);

			
			Assert.assertEquals(displayedDiscountTotal, discountAmount, 0.01,
					"Discount amount validation failed for row " + i);
			Assert.assertEquals(displayedGstTotalAmount, gstAmount, 0.01, "Total GST amount validation failed");
			Assert.assertEquals(displayedTotalPurchasePrice, total, 0.01, "Total purchase price validation failed");
		}
	}

	public void orderpartstoGSFvendor() throws InterruptedException {

		navigatetoOrdersHomePage();
		Thread.sleep(5000);
		clickonGsfCarParts();
		Thread.sleep(5000);
		stockstatus();
		paymenttype();
		GetActualVendorDataFromOrder();
		partname1("OIL FIL");

//	    partname2("CLUTCH");
//	    Thread.sleep(3000);

		GetActualDataFromOrder();
		Thread.sleep(3000);
		scrollDown2();
		

		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
//	    String emailId = excelUtils.getCellData(12, 2);
//	    partsorderPage.enteremailId(emailId);
//	    partsorderPage.clickonSave();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		assertTrue(VendorDetails.equals(VendorOpenDetails));
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));

	}

	public static Map<String, String> VendorDetails = new HashMap<String, String>();

	public Order_Page GetActualVendorDataFromOrder() {

		VendorDetails.put("VendorName", getValue("xpath", "//input[@id='vendor_purchaseOrder']", "value"));

		System.out.println(VendorDetails);
		return this;
	}

	public static Map<String, String> VendorOpenDetails = new HashMap<String, String>();

	public Order_Page GetActualCreatedVendorOrderData() {

		VendorOpenDetails.put("VendorName", getText("xpath", "//tr[@id='trOrder_0']//td[6]"));
		System.out.println(VendorOpenDetails);
		return this;

	}

	public void compareVendorDetails() {
		String vendorNameFromDetails = VendorDetails.get("VendorName").toUpperCase();
		String vendorNameFromOpenDetails = VendorOpenDetails.get("VendorName").toUpperCase();
		assertTrue(vendorNameFromDetails.equals(vendorNameFromOpenDetails));
	}

	public String getText(String locatorType, String locatorValue) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = null;

			// Determine the locator type and find the element
			if (locatorType.equalsIgnoreCase("xpath")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
			} else if (locatorType.equalsIgnoreCase("id")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
			} else if (locatorType.equalsIgnoreCase("class")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
			}

			// Retrieve the text content if the element is found
			if (element != null) {
				text = element.getText();
			} else {
				System.out.println("Element not found: " + locatorValue);
				log.warn("Element not found: " + locatorValue);
			}
		} catch (TimeoutException e) {
			System.out.println("Timeout waiting for element: " + locatorValue + " - " + e.getMessage());
			log.warn("Timeout waiting for element: " + locatorValue + " - " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception while getting text: " + e.getMessage());
			log.warn("Exception while getting text: " + e.getMessage());
		}

		// Return the trimmed text if it's not null, otherwise return an empty string
		if (text != null) {
			log.info("Get Text: " + text + " --> " + locatorValue);
			return text.trim();
		} else {
			log.warn("Text is null for locator: " + locatorValue);
			return "";
		}
	}

	public static String getValue(String locatorType, String locatorValue, String attribute) {
		String text = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = null;

			// Determine the locator type and find the element
			if (locatorType.equalsIgnoreCase("xpath")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
			} else if (locatorType.equalsIgnoreCase("id")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
			} else if (locatorType.equalsIgnoreCase("class")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
			}

			// Retrieve the attribute value if the element is found
			if (element != null) {
				text = element.getAttribute(attribute);
			} else {
				System.out.println("Element not found: " + locatorValue);
				log.warn("Element not found: " + locatorValue);
			}
		} catch (TimeoutException e) {
			System.out.println("Timeout waiting for element: " + locatorValue + " - " + e.getMessage());
			log.warn("Timeout waiting for element: " + locatorValue + " - " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception while getting value: " + e.getMessage());
			log.warn("Exception while getting value: " + e.getMessage());
		}

		// Return the trimmed text if it's not null, otherwise return an empty string
		if (text != null) {
			log.info("Get Value : " + text + " --> " + locatorValue);
			return text.trim();
		} else {
			log.warn("Value is null for locator: " + locatorValue);
			return "";
		}
	}

	public static Map<String, String> PartsDetails = new HashMap<String, String>();

	public Order_Page GetActualDataFromOrder() {

		try {

			String partName = getText("id", "tddata_0");
			PartsDetails.put("PartName", partName);
			String partNo = getValue("id", "partNo_0", "value");
			PartsDetails.put("PartNo", partNo);

			System.out.println(PartsDetails);
		} catch (Exception e) {
			System.out.println("Exception in GetActualDataFromOrder: " + e.getMessage());
			log.warn("Exception in GetActualDataFromOrder: " + e.getMessage());
		}
		return this;
	}

	DecimalFormat df = new DecimalFormat("#.00");
	public static Map<String, String> Part1Details = new HashMap<String, String>();

	public Order_Page GetActualDataFromOrder1() {

		Part1Details.put("Requested Qty", getValue("id", "quantity_0", "value"));
		Part1Details.put("UnitPrice", df.format(Double.parseDouble(getValue("id", "partPrice_0", "value"))));

		System.out.println(Part1Details);
		return this;
	}

	public static Map<String, String> PartsOpenDetails = new HashMap<String, String>();

	public Order_Page GetActualCreatedOrderData() {
		try {
			String partName = getText("id", "tddata_0");
			PartsOpenDetails.put("PartName", partName);
			String partNo = getValue("id", "partNo_0", "value");
			PartsOpenDetails.put("PartNo", partNo);
			System.out.println(PartsOpenDetails);
		} catch (Exception e) {
			System.out.println("Exception in GetActualDataFromOrder: " + e.getMessage());
			log.warn("Exception in GetActualDataFromOrder: " + e.getMessage());
		}
		return this;
	}

	public static Map<String, String> Part1OpenDetails = new HashMap<String, String>();

	public Order_Page GetActualCreatedOrderData1() {

		Part1OpenDetails.put("Requested Qty", getValue("id", "quantity_0", "value"));

		Part1OpenDetails.put("UnitPrice", df.format(Double.parseDouble(getValue("id", "partPrice_0", "value"))));
		System.out.println(Part1OpenDetails);
		return this;
	}

	public void addNewVendorinOrderPage() throws Throwable {

		Thread.sleep(3000);
		newvendorName.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(10));
		contactName.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(10));
		mobileNo.sendKeys("9999999999");
		emailId.sendKeys(getAutoGenerateOnlyString(10) + "@gmail.com");
		address.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(10));
		street.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(8));
		city.sendKeys(getAutoGenerateOnlyStringCapital(1) + getAutoGenerateOnlyString(10));
		statename("ANDHRA");
		pincode.sendKeys(autoGenerateNumber(6, "123456789"));
		js.executeScript("window.scrollBy(0, 1000);");
		bankfield();
		Thread.sleep(3000);
		bankdetails();
		Thread.sleep(3000);
		close();

	}

	public void orderPartstoAutoZilla() throws InterruptedException {
		navigatetoOrdersHomePage();
		Thread.sleep(5000);
		clickonAutozilla();
		Thread.sleep(5000);
		//stockType.click();
		//paymenttype();
		GetActualVendorDataFromOrder();
//	    partname("OIL FIL");

		partname1("CLUTCH");
		Thread.sleep(3000);
		GetActualDataFromOrder();
		Thread.sleep(3000);
		scrollDown2();
		addpartdetailsforAutozillaOrder();
//	    addpartdetails1();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
//	    String emailId = excelUtils.getCellData(12, 2);
//	    partsorderPage.enteremailId(emailId);
//	    partsorderPage.clickonSave();
		Thread.sleep(5000);
		clickonviewOrder();
		Thread.sleep(5000);
		GetActualCreatedVendorOrderData();
		assertTrue(VendorDetails.equals(VendorOpenDetails));
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));
	}

	public void orderPartstoRajOtomateVendor() throws InterruptedException {
		navigatetoOrdersHomePage();
		Thread.sleep(3000);
		clickonRajOtomate();
		stockstatus();
		paymenttype();
		GetActualVendorDataFromOrder();
		partname("OIL FIL");

//	    partname2("CLUTCH");
//	    Thread.sleep(3000);
		GetActualDataFromOrder();
		Thread.sleep(3000);
		scrollDown2();
		addpartdetails();
//	    addpartdetails1();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		assertTrue(VendorDetails.equals(VendorOpenDetails));
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));

	}

	public void orderpartstoExistingVendor() throws InterruptedException {

		navigatetoOrdersHomePage();
		Thread.sleep(5000);
		existingvendor1();
		enterPartName.sendKeys("ROD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addPrice.clear();
    	addPrice.sendKeys("450");
    	addplus.click();
    	addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
    	brand.click();
    	selectBrand.click();
		Thread.sleep(3000);
		scrollDown2();
		addpartdetails();
		Thread.sleep(3000);
		createpo();
		Thread.sleep(3000);
	}
	
	@FindBy(xpath = "(//div[@id='autorox_tab']//ul//li)[2]")
    WebElement selectAutoroxPartName;
	@FindBy(id = "partname")
    WebElement enterPartName;
	@FindBy(id = "quantity")
    WebElement addQuantity;
    @FindBy(id = "partprice")
	WebElement addPrice;
    @FindBy(xpath = "//input[@id='partNo_0']")
    WebElement addPartNumber;
    @FindBy(xpath = "//tr[@id='tr_0']//td[6]")
    WebElement brand;
    @FindBy(xpath = "//span[@class='select2-results']//ul//li[9]")
    WebElement selectBrand;
  

	public void orderpartstoexistingvendor() throws InterruptedException {

		navigatetoOrdersHomePage();
		Thread.sleep(5000);
		existingvendor1();
		paymenttype();
		GetActualVendorDataFromOrder();
//	    enterPartdetail();
		enterPartName.sendKeys("PAD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addPrice.clear();
    	addPrice.sendKeys("450");
    	addplus.click();
    	addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
    	brand.click();
    	selectBrand.click();

		//partname2("123");
	    Thread.sleep(3000);
		GetActualDataFromOrder();
		Thread.sleep(3000);
		scrollDown2();
		addpartdetails();
//	    addpartdetails1();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		compareVendorDetails();
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));

	}

    @FindBy(xpath="//*[@id=\"check_data_0\"]/div/ins")
    WebElement clickonCheckbox;
    
	public void orderpartsforOutofStockorder() throws InterruptedException {

		Stock.click();
		navigatetoorders();
		String Vendorname= vendorName.getText();
		navigatetoOrdersHomePage();
		Thread.sleep(3000);
		existingVendor.sendKeys(Vendorname);
		Thread.sleep(3000);
		stockstatusOutofStock();
		Thread.sleep(3000);
		paymenttype();
		GetActualVendorDataFromOrder();
		GetActualDataFromOrder();
		Thread.sleep(3000);
		//clickonCheckbox.click();
		scrollDown2();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		compareVendorDetails();
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));

	}
	public void orderpartsfrompreviousorder() throws InterruptedException {

		navigatetoOrdersHomePage();
		Thread.sleep(5000);
		existingvendor1();
		stockstatusPrevious();
		paymenttype();
		GetActualVendorDataFromOrder();
		GetActualDataFromOrder();
		Thread.sleep(3000);
		
		scrollDown2();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		scrollDown3();
		Thread.sleep(3000);
		
		
		validateCalculations();
		createpo();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		compareVendorDetails();
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));

	}
	
	@FindBy(xpath="//ul[@class='menuList']//li[5]")
	WebElement Stock;
	@FindBy(xpath="//tr[@id='trOrder_0']//td[6]")
	WebElement vendorName;
	@FindBy(id="onoffButton")
	WebElement activeToggle;

	
	
	@FindBy(xpath="//tr[@id='trOrder_0']")
	WebElement SelectOrder;
	@FindBy(xpath="//tr[@id='trOrder_0']//td[13]//span")
	WebElement orderStatus;
	@FindBy(xpath="//button[@id='cancellPurchaseOrder']")
	WebElement cancelPO;
	
	

	public void CO() {
		
		autoroxhome.click();
		Stock.click();
		navigatetoorders();
		String OrderStatus = orderStatus.getText();
        validateResults(OrderStatus, "PENDING");
		SelectOrder.click();
		cancelPO.click();
		String OrderStatus1 = orderStatus.getText();
        validateResults(OrderStatus1, "CANCELLED");
		
		
	}
	
	public void VendorActive() throws Throwable {

		Stock.click();
		navigatetoorders();
		String Vendorname= vendorName.getText();
		navigatetoOrdersHomePage();
		Thread.sleep(3000);
		addVendor.click();
		newvendorName.sendKeys(Vendorname);
		Thread.sleep(8000);
		
		activeToggle.click();
		Thread.sleep(4000);
		//close1.click();
		
		
		
		
		
	}
	public void OOS() throws Throwable {

		Stock.click();
		navigatetoorders();
		String Vendorname= vendorName.getText();
		navigatetoOrdersHomePage();
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	
	

	public void orderPartsfromNewVendor() throws Throwable {

		navigatetoOrdersHomePage();
		Thread.sleep(3000);
		clickonaddnewvendor();
		addNewVendorinOrderPage();
		paymenttype();
		GetActualVendorDataFromOrder();
		enterPartName.sendKeys("ROD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addPrice.clear();
    	addPrice.sendKeys("450");
    	addplus.click();
    	addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
    	brand.click();
    	selectBrand.click();
		GetActualDataFromOrder();
		Thread.sleep(3000);
		scrollDown2();
		addpartdetailsforAutozillaOrder();
//	    addpartdetails1();
		Thread.sleep(3000);
		GetActualDataFromOrder1();
		// validateCalculations();
		createpo();
		Thread.sleep(3000);
		navigatetoorders();
		Thread.sleep(3000);
		GetActualCreatedVendorOrderData();
		compareVendorDetails();
		clickOrder();
		Thread.sleep(3000);
		GetActualCreatedOrderData();
		Thread.sleep(3000);
		assertTrue(PartsDetails.equals(PartsOpenDetails));
		scrollDown2();
		GetActualCreatedOrderData1();
		assertTrue(Part1Details.equals(Part1OpenDetails));
	}

	public void navigatetoorders() {
		StockOrders.click();
	}
	
	/*
	 * public void activetoggle() { // WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10)); // WebElement element1 =
	 * wait.until(ExpectedConditions.elementToBeClickable(activeToggle)); //
	 * element1.click(); Actions a = new Actions(driver);
	 * a.moveToElement(activeToggle).click().perform(); }
	 */
	

	public String getOrderName() {
		WebElement orderElement = orderNo;
		return orderElement.getText();
	}

	public void existingvendor1() throws InterruptedException {

		existingVendor.sendKeys("SAI809");

	}
	public void existingvendor2() throws InterruptedException {

		existingVendor.sendKeys("kp spares");

	}

	public List<String> printAllVendorNames() {
		List<String> vendorNames = new ArrayList<>();
		WebElement vendorDropdown = driver.findElement(By.id("vendor_purchaseOrder"));
		List<WebElement> options = vendorDropdown.findElements(By.tagName("a"));

		for (WebElement option : options) {
			vendorNames.add(option.getText());

		}

		return vendorNames;
	}

	// add part
	@FindBy(id = "partname")
	WebElement partn;

	@FindBy(xpath = "//*[@id='ui-id-2']/table/tbody/tr[1]/td[1]")
	WebElement partnm;

	@FindBy(xpath = "//*[@id='hideconclick']/a/i")
	WebElement addplus;

	@FindBy(xpath = "//input[@id='quantity_0']")
	WebElement addquantity;

	@FindBy(xpath = "//input[@id='partPrice_0']")
	WebElement addunitprice;

	@FindBy(xpath = "//input[@id='discount_0']")
	WebElement adddiscount;

	@FindBy(xpath = "//input[@id='quantity_1']")
	WebElement addquantity1;

	@FindBy(xpath = "//input[@id='partPrice_1']")
	WebElement addunitprice1;

	@FindBy(xpath = "//input[@id='discount_1']")
	WebElement adddiscount1;

	@FindBy(id = "createPurchaseOrder")
	WebElement buy;

	@FindBy(xpath = "//*[@id='cmpy_deailed_drp']")
	WebElement partn1;

	@FindBy(xpath = "//li[@id='l_4']")
	WebElement partnm1;

	public void clickonaddnewvendor() {
		addVendor.click();
	}

	////////////////////////////////
	public void stockstatus() throws InterruptedException {
		stockType.click();
		Thread.sleep(5000);
		stock1.click();
	}

	public void stockstatusReOrderLevel() throws InterruptedException {
		stockType.click();
		Thread.sleep(5000);
		stock1.click();
	}
	
	public void stockstatusOutofStock() throws InterruptedException {
		stockType.click();
		Thread.sleep(5000);
		stock2.click();
	}
	public void stockstatusPrevious() throws InterruptedException {
		stockType.click();
		Thread.sleep(5000);
		stock3.click();
		Thread.sleep(5000);	}

	public void paymenttype() throws InterruptedException {
		paymentTypeMenu.click();
		Thread.sleep(5000);
		paymentType1.click();
	}

	

	public void partname(String prtnm) throws InterruptedException {
		partn.sendKeys(prtnm);
		Thread.sleep(5000);
		partnm.click();
		addplus.click();
	}

	public void partname2(String prtnm) throws InterruptedException {
		partn.sendKeys(prtnm);
		Thread.sleep(5000);
		partnm.click();
		addplus.click();
	}

	public void scrollDown2() throws InterruptedException {

		js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("totalPurchasePrice"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollDown3() throws InterruptedException {

		
		WebElement element = driver.findElement(By.id("check_data_0"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void addpartdetails() throws InterruptedException {
		addquantity.clear();
		Thread.sleep(3000);
		addquantity.sendKeys("2");
		// driver.findElement(addunitprice).sendKeys("500");
		adddiscount.sendKeys("10");
		WebElement dropdownElement = driver.findElement(By.id("discountType_0"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("%");
		WebElement dropdownElement1 = driver.findElement(By.id("gst_0"));
		Select dropdown1 = new Select(dropdownElement1);
		dropdown1.selectByVisibleText("12%");

	}

	public void addpartdetailsforAutozillaOrder() throws InterruptedException {
		addquantity.clear();
		Thread.sleep(3000);
		addquantity.sendKeys("2");

	}

	public void addpartdetails1() throws InterruptedException {
		addquantity1.clear();
		Thread.sleep(3000);
		addquantity1.sendKeys("2");
		// driver.findElement(addunitprice).sendKeys("500");
		adddiscount1.sendKeys("5");
		WebElement dropdownElement = driver.findElement(By.id("discountType_1"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("%");
		WebElement dropdownElement1 = driver.findElement(By.id("gst_1"));
		Select dropdown1 = new Select(dropdownElement1);
		dropdown1.selectByVisibleText("12%");

	}

	public void partname1(String prtnm) throws InterruptedException {
		partn1.sendKeys(prtnm);
		Thread.sleep(5000);
		partnm1.click();
		closeDetailDrop.click();

	}

	public void createpo() {
		buy.click();
	}

	public void orderParts() {
		autoroxhome.click();
	}

	@FindBy(xpath = "(//img[@alt='Autorox Logo'])[5]")
	WebElement stock;

	@FindBy(xpath = "//img[@alt='Autorox Jobcard']")
	WebElement jobcardImage;

	@FindBy(xpath = "//span[text()='CST-J002729']")
	WebElement choosejc;

	@FindBy(xpath = "//*[@id='partname']")
	WebElement partNameField;

	@FindBy(xpath = "(//tr[@class='ui-menu-item']//td[@class='pointer-style'])[1]")
	WebElement selectpart;

	@FindBy(xpath = "//i[@class='fa fa-plus'][1]")
	WebElement addPartButton;

	public void selectVendor() throws InterruptedException {

		existingVendor.sendKeys("SAI809");
		Thread.sleep(3000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
//        WebElement newLocalVendorOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'New Local Vendor')]")));
//        newLocalVendorOption.click();

	}

	public void selectstock() {

		stock.click();
	}

	@FindBy(xpath = "//*[@id='tr_0']")
	WebElement partsDisplayed;

	public void validateexistingVendordetails() {
		
		orderslist.click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.dropdown-menu.animated.fadeInDown")));

	    List<WebElement> listItems = dropdownMenu.findElements(By.tagName("li"));
	    String mahStorPattern = "RAH-STOR\\d{6}";
	    
	    for (WebElement item : listItems) {
	        try {
	            
	            List<WebElement> spans = item.findElements(By.tagName("span"));
	            if (!spans.isEmpty()) {
	                String actualText = spans.get(0).getText();
	                System.out.println("Actual Text: " + actualText);
                    Assert.assertTrue(Pattern.matches(mahStorPattern, actualText));
	            } 
	        } catch (NoSuchElementException e) {
	            System.out.println("Element not found: " + e.getMessage());
	        }
	    }
	}

	public void validateElementsPartsOrder() {
		validateElement(ordercartimage, "Order Cart Image");
		validateElement(stockTitle, "Stock Title");
		validateElement(Home, "Home Button");
		validateElement(selectorder, "Select Order");
		validateElement(orderslist, "Orders List");
		validateElement(ordersDropdown, "Orders Dropdown");
		validateElement(ordersdate, "Orders Date");
		validateElement(searchforVendor, "Search for Vendor");
		validateElement(addingVendor, "Adding Vendor");
		validateElement(stockOption, "Stock Option");
		validateElement(paymentTypeMenu, "Payment Type");
		validateElement(partnamesearch, "Part Name Search");
		validateElement(chooseQuantity, "Choose Quantity");
		validateElement(priceMRP, "Price MRP");
		validateElement(serviceLabour, "Service Labour");
		validateElement(addPartbutton, "Add Part Button");
		validateElement(partCheckbox, "Part Checkbox");
		validateElement(partsTable, "Parts Table");
		validateElement(navigateBack, "Navigate Back");
		validateElement(createPObuy, "Create PO Buy");

	}
	
	
	@FindBy(xpath = "//div[@class='dropdown-toggle']")
    WebElement workshopProfile;
	@FindBy(xpath = "(//button[@class='btn btn-default my_profile_btn'])[1]")
    WebElement myProfile;
	@FindBy(xpath = "//a[@id='integrations_tab-tab']")
    WebElement intigrations;
	@FindBy(xpath = "//button[@id='autozillConnect']")
    WebElement autozillaConnect;

	
	public void autozillasettings() {
		workshopProfile.click();
		myProfile.click();
		intigrations.click();
		autozillaConnect.click();
		}
public void registrationNumber() {
        
//        String India = "India";
//        String International = "International";
//        if(regName == India) {
//            
//            StateCode.sendKeys(autoGenerateNumber(2, "123456789"));
//            // StateCode.sendKeys("25");
//            StateCode2.sendKeys(getAutoGenerateOnlyString(3));
//            // StateCode2.sendKeys("eu");
//            StateCode3.sendKeys(autoGenerateNumber(4, "123456789"));
//            // StateCode3.sendKeys("1945");        
//        } else if(regName == International) {
//            
            IntregNo.sendKeys(autoGenerateNumber(4, "123456789") +getAutoGenerateOnlyString(3));
            
        

        
    }


public void newJobcardOpen() throws Throwable {
    int n = 50;  // Total number of iterations
    for (int i = 26; i <= n; i++) {  // Start from 51
        Thread.sleep(2000);
        NewJobcard.click(); 
        NewJobcardSelect.click();
        odometer.sendKeys(autoGenerateNumber(4, "123456789")); 
        registrationNumber(); 
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"vinNo\"]")).sendKeys(getAutoGenerateOnlyString(17));
        driver.findElement(By.xpath("//*[@id=\"engNo\"]")).sendKeys(getAutoGenerateOnlyString(15));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        Thread.sleep(5000); 
        int r = 1;
        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        while (r < 2) { 
            r++;
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ARROW_DOWN);
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ENTER);
        } 
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1997");
        driver.findElement(By.xpath("//a[text()='1997']")).click();
     
        // Customer Field
        driver.findElement(By.xpath("(//ul[@class='right_dropset color_selt_dp'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"serviceTypeId_\"]/label[1]/span[2]")).click();

        driver.findElement(By.id("select2-serviceAdvisor-container")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='select2-results__option']")).click();
        
        scrollDown();
        customerName.click();
        Thread.sleep(2000);
        // Append the iteration number to the name
        customerName.sendKeys("Job " + convertNumberToWord(i));
        
        mobileNumber.click();
        mobileNumber.sendKeys("744444444");
        emailid.click();
        emailid.sendKeys("Autorox13@gmail.com");
        
        //driver.findElement(By.xpath("//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr dateOfDeliveryFlatpickr checkEmptydt flatpickr-input form-control input']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div[2]/div/span[25]")).click();

        PrepareEstimation.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@id='wheelBalancing']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='totallabourprice']")).sendKeys(autoGenerateNumber(4, "123456789"));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@id='wheelAlignment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='totallabourprice']")).sendKeys(autoGenerateNumber(4, "123456789"));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("statusJobDone")).click();
        Thread.sleep(2000);
        
//        driver.findElement(By.id("statusJobDone")).click();
//        Thread.sleep(2000);
//        
//        driver.findElement(By.xpath("(//i[@class='fa fa-times-circle'])[5]")).click();
//        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//*[@id=\"style-1\"]/ul/li[1]/a/img")).click();
    }
}

public void newJobcardOpenusa() throws Throwable {
    int n = 30;  // Total number of iterations
    for (int i = 21; i <= n; i++) {  

        NewJobcard.click(); 
        NewJobcardSelect.click();
        odometer.sendKeys(autoGenerateNumber(4, "123456789")); 
        registrationNumber(); 
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"vinNo\"]")).sendKeys(getAutoGenerateOnlyString(17));
        driver.findElement(By.xpath("//*[@id=\"engNo\"]")).sendKeys(getAutoGenerateOnlyString(15));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        Thread.sleep(5000); 
        int r = 1;
        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        while (r < 2) { 
            r++;
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ARROW_DOWN);
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ENTER);
        } 
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1997");
        driver.findElement(By.xpath("//a[text()='1997']")).click();
     
        // Customer Field
        driver.findElement(By.xpath("(//ul[@class='right_dropset color_selt_dp'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"serviceTypeId_\"]/label[1]/span[2]")).click();

//        driver.findElement(By.xpath("//*[@id=\"serviceAdvisorDiv\"]/span/span[1]/span/span[2]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//li[@class='select2-results__option']")).click();
        
        scrollDown();
        customerName.click();
        Thread.sleep(10000);
        // Append the iteration number to the name
        customerName.sendKeys("ramo " + convertNumberToWord(i));
        
        mobileNumber.click();
        mobileNumber.sendKeys("12345678999");
        emailid.click();
        emailid.sendKeys("Autorox13@gmail.com");
        
        driver.findElement(By.xpath("//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr dateOfDeliveryFlatpickr checkEmptydt flatpickr-input form-control input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div[2]/div/span[24]")).click();

        PrepareEstimation.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@id='wheelBalancing']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='totallabourprice']")).sendKeys(autoGenerateNumber(3, "123456789"));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@id='wheelAlignment']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='totallabourprice']")).sendKeys(autoGenerateNumber(3, "123456789"));
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("statusJobDone")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"style-1\"]/ul/li[1]/a/img")).click();
    }
}
public void newEstimation() throws Throwable {
    int n = 20;  // Total number of iterations
    for (int i = 1; i <= n; i++) {  // Start from 30 to 50

        NewJobcard.click(); 
        NewJobcardSelect.click();
        odometer.sendKeys(autoGenerateNumber(4, "123456789")); 
        registrationNumber(); 
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"vinNo\"]")).sendKeys(getAutoGenerateOnlyString(17));
        driver.findElement(By.xpath("//*[@id=\"engNo\"]")).sendKeys(getAutoGenerateOnlyString(15));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        Thread.sleep(5000); 
        int r = 1;
        driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys("AUD");
        while (r < 2) { 
            r++;
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ARROW_DOWN);
            driver.findElement(By.xpath("//input[@id='vehicleDetail']")).sendKeys(Keys.ENTER);
        } 
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("1997");
        driver.findElement(By.xpath("//a[text()='1997']")).click();
     
        // Customer Field
        driver.findElement(By.xpath("(//ul[@class='right_dropset color_selt_dp'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"serviceTypeId_\"]/label[1]/span[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"serviceAdvisorDiv\"]/span/span[1]/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='select2-results__option']")).click();
        
        scrollDown();
        customerName.click();
        Thread.sleep(10000);
        // Append the iteration number to the name
        customerName.sendKeys("Hana " + convertNumberToWord(i));
        
        mobileNumber.click();
        mobileNumber.sendKeys("744444444");
        emailid.click();
        emailid.sendKeys("Autorox13@gmail.com");
        
        driver.findElement(By.xpath("//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr dateOfDeliveryFlatpickr checkEmptydt flatpickr-input form-control input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[11]/div[2]/div/div[2]/div/span[18]")).click();

        PrepareEstimation.click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"style-1\"]/ul/li[1]/a/img")).click();
    }
}

public String convertNumberToWord(int number) {
    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                      "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen", "twenty"};
    
    if (number <= 20) {
        return words[number];  // Numbers 0-20
    } else if (number < 30) {
        return "twenty-" + words[number - 20];  // Numbers 21-29
    } else if (number < 40) {
        return "thirty-" + words[number - 30];  // Numbers 30-39
    } else if (number < 50) {
        return "forty-" + words[number - 40];  // Numbers 40-49
    } else if (number == 50) {
        return "fifty";  // Number 50
    } else {
        return String.valueOf(number);  // Fallback
    }
}




	
	
@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[1]/div[2]/div[2]")
    private WebElement NewJobcard;

    @FindBy(xpath = "//li[@id='estlater']")
    private WebElement NewJobcardSelect;

    @FindBy(xpath = "//input[@id='reg_2']")
    private WebElement StateCode;

    @FindBy(xpath = "//input[@id='reg_3']")
    private WebElement StateCode2;

    @FindBy(xpath = "//input[@id='reg_4']")
    private WebElement StateCode3;

    @FindBy(xpath = "//input[@id='odometer']")
    private WebElement odometer;
    
    //International reg no
    
    @FindBy(xpath = "//input[@id='plainTextReg']")
    private WebElement IntregNo;

    @FindBy(xpath = "//input[@id='make']")
    private WebElement SelectMake;

    @FindBy(xpath = "//a[@id='ui-id-32']")
    private WebElement Make;

    @FindBy(xpath = "//a[@id='ui-id-158']")
    private WebElement Model;

    @FindBy(xpath = "//input[@id='vehicleDetail']")
    WebElement VehicleName;

    @FindBy(id = "year")
    WebElement VehicleYear;

    @FindBy(id = "//div[@id='colorList']/label[12]/input")
    WebElement Checkbox;

    @FindBy(xpath = "//input[@id='customer_name']")
    WebElement customerName;

    @FindBy(xpath = "//input[@id='mobile_no']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='email_id']")
    WebElement emailid;

    @FindBy(xpath = "//div[@class='dayContainer']/span[30]")
    WebElement EstDeliveryDate;

    @FindBy(xpath = "//button[@id='next']")
    WebElement PrepareEstimation;

    @FindBy(xpath = "//*[@id=\"estlater\"]")
    WebElement GiveEstimationLater;
    
    
    


}

     
