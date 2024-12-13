package com.autorox.All_Pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTestMethod;

public class InwardPage extends BaseTestMethod {
	
	public static ArrayList<String> DisplayedLabelsListFromLoginPage = null;
	public static Map<String, ArrayList<String>> DisplayedLabelsFromLoginPage= new HashMap<String, ArrayList<String>>();
	private WebDriverWait wait;

	
	public InwardPage(WebDriver driver) {
	        BaseTestMethod.driver = driver;
	        BaseTestMethod.js = (JavascriptExecutor) driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath = "//*[@id='trigger']/div[1]")
    private WebElement autoroxhome;
	@FindBy(id = "partsOpen")
    private WebElement parts;

    @FindBy(id = "partsOption1")
    private WebElement inward;
	
	@FindBy(xpath = "(//span[@class='input input--nao'])[1]")
    private WebElement inwardSearchBar;

    @FindBy(xpath = "(//div[@class='icheckbox_square-blue'])[1]")
    private WebElement stockCheckbox;
    @FindBy(id = "inwrdStockPage_red")
    private WebElement navigatetoStockList;
    @FindBy(xpath = "//input[@id='vendor-purchaseOrder']")
    private WebElement vendorSearchbar;
    @FindBy(xpath = "//label[@class='vender_add']//i")
    private WebElement addVendor;
    @FindBy(xpath = "(//i[@class='fa fa-angle-down'])[2]")
    private WebElement vendorSearchDropdown;
    @FindBy(id = "deliveryChallan")
    private WebElement deliveryReceipt;
    @FindBy(xpath = "//input[@id='billNo']")
    private WebElement billNo;
    @FindBy(xpath = "(//input[@type='text' and @readonly='readonly'])[2]")
    private WebElement billDate;
    
    @FindBy(xpath = "(//span[@class='flatpickr-day today'])[1]")
    private WebElement selectDate;
    @FindBy(xpath = "(//span[@class='flatpickr-day today'])[3]")
    private WebElement selectDate1;

    
    
   
    
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--single' and @role='combobox'])[2]")
    private WebElement taxTypeDropdown;

    @FindBy(xpath = "//span[@class='select2-results']//ul//li[1]")
    private WebElement gstOption;
    
    @FindBy(xpath = "//span[@class='select2-results']//ul//li[2]")
    private WebElement igstOption;
    
    @FindBy(xpath = "//span[@class='select2-results']//ul//li[3]")
    private WebElement naOption;
    
    
    @FindBy(id = "partname")
    WebElement partn;

    @FindBy(xpath = "//*[@id='ui-id-4']/table/tbody/tr[1]/td[1]")
    WebElement partnm;

    @FindBy(xpath = "//*[@id='hideconclick']/a/i")
    WebElement addplus;

    @FindBy(xpath = "//input[@id='quantity_0']")
    WebElement addquantity;

    @FindBy(xpath = "//input[@id='partPrice_0']")
    WebElement addunitprice;

    @FindBy(xpath = "//input[@id='discount_0']")
    WebElement adddiscount;
    @FindBy(id = "inwardButtonId")
    WebElement inwardButton;
    @FindBy(xpath = "(//button[@class='close'])[3]")
    WebElement closePayments;
    @FindBy(xpath = "(//button[@class='close'])[2]")
    WebElement closePayments1;
    @FindBy(xpath = "//a[@id='pills-home-tab-inStock']")
    WebElement gotoStock;
  
    @FindBy(xpath = "//input[@id='searchText']")
    WebElement stockSearchbar;
    @FindBy(id="stockPartNumber_0")
    WebElement selectPart;
  
    
    
    public void validateElementsPartsInward() {
        validateElement(inwardSearchBar, "Inward Search Bar");
        validateElement(stockCheckbox, "Stock Checkbox");
        validateElement(navigatetoStockList, "Navigate to Stock List");
        validateElement(vendorSearchbar, "Vendor Search Bar");
        validateElement(addVendor, "Add Vendor");
        validateElement(deliveryReceipt, "Delivery Receipt");
        validateElement(billNo, "Bill Number");
        validateElement(billDate, "Bill Date");
        validateElement(taxTypeDropdown, "Tax Type Dropdown");
        validateElement(partn, "Part Name");
        validateElement(addplus, "Add Plus");
        validateElement(addQuantity, "Add Quantity");
        validateElement(inwardButton, "Inward Button");
        
    }

    
    
    
    
    public static Map<String, String> ABC1 = new HashMap<String, String>();

	public InwardPage GetVendorDataFromOrder() {

		ABC1.put("VendorName", getValue("xpath", "//input[@id='vendor-purchaseOrder']", "value"));
		

		System.out.println(ABC1);
		return this;
	}
	public static Map<String, String> ABC2 = new HashMap<String, String>();

	public InwardPage GetActualVendorDataFromOrder() {

		ABC2.put("VendorName", getText("xpath", "//tr[@id='tr_0']//td[@class='vendorName']"));

		System.out.println(ABC2);
		return this;
	}
    public void directInward() throws InterruptedException {
    	
    	stockCheckbox.click();
    	vendorSearchbar.sendKeys("VISHNU");
    	enterBillNo();
    	clickonBillDate(); 
		selectBillDate();
		selectGST();
		GetVendorDataFromOrder();
		enterPartName.sendKeys("PAD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	enterPartDetails("200");
    	
    	
    }
public void directInwardVehiclefittment() throws InterruptedException {
    	
    	stockCheckbox.click();
    	vendorSearchbar.sendKeys("VISHNU");
    	enterBillNo();
    	clickonBillDate(); 
		selectBillDate();
		selectGST();
		GetVendorDataFromOrder();
		enterPartName.sendKeys("PAD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	enterPartDetailsvf("200");
    	
    	
    }
    public void verifyalert() throws InterruptedException {
    	stockCheckbox.click();
    	vendorSearchbar.sendKeys("VISHNU");
    	Thread.sleep(5000);
    	clickInward();
	    Alert1();
    	
    	
    }
public void directInwardfromNewVendor() throws Throwable {
    	
    	stockCheckbox.click();
    	addNewVendor();
    	enterBillNo();
    	clickonBillDate();
		selectBillDate();
		selectGST();
		enterPartName.sendKeys("PAD");
    	Thread.sleep(5000);
    	selectAutoroxPartName.click();
    	enterPartDetails("200");
    	
    }
      @FindBy(xpath="(//ul[@class='dropdown-menu animated fadeInDown']//table)[1]")
      WebElement selectVendorfromDropdown;
      @FindBy(xpath="//tbody[@id='inStockPopup']//tr//td[5]")
      WebElement billNo1;

public void InwardbyOrder() throws Throwable {
	
	stockCheckbox.click();
	vendorSearchDropdown.click();
	selectVendorfromDropdown.click();
	
	enterBillNo();
	clickonBillDate();
	selectBillDate1();
	selectGST();
	String BillNo = billNo.getText();
	
	String partno = getValue("xpath","//input[@id='partNo_0']","value");
    System.out.println(partno);
    scrollDown2();
    enterdisctax();
    inwardButton.click();
    Thread.sleep(3000);
    closePayments.click();
    Thread.sleep(3000);
    clickonStock.click();
    stockSearchbar.sendKeys(partno);
    Thread.sleep(3000);
    selectPart.click();
    String BillNo1 = billNo1.getText();
    assertTrue(BillNo.equals(BillNo1)); 
}
    @FindBy(id="pills-home-tab-inStock")
    WebElement clickonStock;
    @FindBy(id="pills-home-tab-issue")
    WebElement clickonIssue;

    public void directInwardUserChoice() throws InterruptedException {
    	
    	stockCheckbox.click();
    	vendorSearchbar.sendKeys("VISHNU");
    	enterBillNo();
    	clickonBillDate();
		selectBillDate();
		selectGST();
		enterPartName.sendKeys("PAD");
    	Thread.sleep(3000);
    	selectUserChoice.click();
    	Thread.sleep(3000);
    	selectUserPartName.click();
    	enterPartDetails("200");
    	
    }

    public void directInward1() throws InterruptedException {
    	
    	stockCheckbox.click();
    	vendorSearchbar.sendKeys("VISHNU");
    	enterBillNo();
    	clickonBillDate();
		selectBillDate();
		selectGST();
		
		enterPartDetailsfromstocklist("123");
    	
    }
    
    public void enterPartDetailsvf(String price) throws InterruptedException   {
        
    	String BillNo = billNo.getText();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addPrice.clear();
    	addPrice.sendKeys(price);
    	WebElement dropdownElement = driver.findElement(By.id("masterQntty"));
        Select pricetype = new Select(dropdownElement);
        pricetype.selectByValue("MRP");
        addplus.click();
        Thread.sleep(3000);
        
        addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
        String partno = getValue("xpath","//input[@id='partNo_0']","value");
        System.out.println(partno);
        
        scrollDown2();
        enterdisctax();
        inwardButton.click();
        Thread.sleep(3000);
        closePayments.click();
        Thread.sleep(3000);
        clickonInward.click();
        GetActualVendorDataFromOrder();
        assertTrue(ABC1.equals(ABC2));
        gotoStock.click();
        stockSearchbar.sendKeys(partno);
        Thread.sleep(3000);
        selectPart.click();
        
        String BillNo1 = billNo1.getText();
        assertTrue(BillNo.equals(BillNo1));
        
         
    }
    
    
  
    public void enterPartDetails(String price) throws InterruptedException   {
    
    	String BillNo = billNo.getText();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addPrice.clear();
    	addPrice.sendKeys(price);
    	WebElement dropdownElement = driver.findElement(By.id("masterQntty"));
        Select pricetype = new Select(dropdownElement);
        pricetype.selectByValue("MRP");
        addplus.click();
        Thread.sleep(3000);
        
        addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
        String partno = getValue("xpath","//input[@id='partNo_0']","value");
        System.out.println(partno);
        
        scrollDown2();
        enterdisctax();
        inwardButton.click();
        Thread.sleep(3000);
        closePayments.click();
        Thread.sleep(5000);
        clickonInward.click();
        Thread.sleep(3000);
        GetActualVendorDataFromOrder();
        Thread.sleep(5000);
        ValidateVendorDetails();
        //assertTrue(VendorDetails.equals(ABC2));
        gotoStock.click();
        stockSearchbar.sendKeys(partno);
        Thread.sleep(3000);
        selectPart.click();
        
        String BillNo1 = billNo1.getText();
        assertTrue(BillNo.equals(BillNo1));
        
        
         
    }
    
   

    public void ValidateVendorDetails() {
        

        // Case-Insensitive Comparison
        boolean isEqual = VendorDetails.entrySet().stream()
            .allMatch(e -> ABC2.containsKey(e.getKey()) &&
                    e.getValue().equalsIgnoreCase(ABC2.get(e.getKey())));

        // Assert or Log Result
        assertTrue(isEqual, "VendorDetails and ABC2 do not match case-insensitively!");
        if (isEqual) {
            System.out.println("Validation Passed: VendorDetails and ABC2 match case-insensitively.");
        } else {
            System.out.println("Validation Failed: VendorDetails and ABC2 do not match.");
        }
    }

    @FindBy(xpath="//a[@id='pills-profile-tab-inward']")
    WebElement clickonInward;
    @FindBy(xpath = "//tr[@id='tr_0']//td[6]")
    WebElement brand;
    @FindBy(xpath = "//span[@class='select2-results']//ul//li[9]")
    WebElement selectBrand;
    
    public void enterPartDetailsfromstocklist(String prtnm) throws InterruptedException   {
        
        
    	enterPartName.sendKeys(prtnm);
    	Thread.sleep(5000);
    	selectPartNumber.click();
    	addQuantity.sendKeys(autoGenerateNumber(1, "123456789"));
    	addplus.click();
        Thread.sleep(3000);
        String partno = getValue("xpath","//input[@id='partNo_0']","value");
        System.out.println(partno);
        scrollDown2();
        enterdisctax();
        inwardButton.click();
        Thread.sleep(3000);
        closePayments.click();
        Thread.sleep(3000);
        stockSearchbar.sendKeys(partno);
        Thread.sleep(3000);
        selectPart.click();
        
         
    }
    public void clickInward() {
    	
    	inwardButton.click();
    }
    
public void scrollDown2() throws InterruptedException {
    	
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.id("totalPurchasePrice"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
public void scrolldown() throws InterruptedException {
	
    js.executeScript("window.scrollBy(0, 1000);");
   
    }
public void scrollToElement(WebElement element) throws InterruptedException {
    js.executeScript("arguments[0].scrollIntoView(true);", element);
}
public void scrollDown1() throws InterruptedException {
	
    js.executeScript("window.scrollBy(0, 1000);");
    Thread.sleep(5000); 
    WebElement element = driver.findElement(By.id("partname"));
    js.executeScript("arguments[0].scrollIntoView(true);", element);
}

    public void enterdisctax() {
    	
    	adddiscount.sendKeys("10");
    	WebElement dropdownElement2 = driver.findElement(By.id("discountType_0"));
        Select discount = new Select(dropdownElement2);
        discount.selectByVisibleText("%");
        WebElement dropdownElement3 = driver.findElement(By.id("gst_0"));
        Select tax = new Select(dropdownElement3);
        tax.selectByVisibleText("12%");
    }
    public void enterPartDetails1(String prtnm, String qty,String price) throws InterruptedException{
    	enterPartNumber.sendKeys(prtnm);
    	Thread.sleep(3000);
    	selectPartNumber.click();
    	enterdisctax();
    	
    }
    
    
    @FindBy(id = "partname")
    WebElement enterPartName;
    @FindBy(id = "partname")
    WebElement enterPartNumber;
    @FindBy(id = "user_choice_tabli")
    WebElement selectUserChoice;

    
    @FindBy(xpath = "(//div[@id='autorox_tab']//ul//li)[2]")
    WebElement selectAutoroxPartName;
    @FindBy(xpath = "//ul[@id='userdefined_ul']//li[2]")
    WebElement selectUserPartName;

    @FindBy(xpath = "(//ul[@id='ui-id-4']//tbody)//tr[1]")
    WebElement selectPartNumber;
    
    
    @FindBy(id = "quantity")
    WebElement addQuantity;
    @FindBy(id = "partprice")
	WebElement addPrice;
    
    @FindBy(xpath = "//input[@id='partNo_0']")
    WebElement addPartNumber;
    @FindBy(xpath = "(//tr[@id='tr_0']//td)[5]")
    WebElement addBrandName;
    @FindBy(id = "(//span[@class='select2-results']//ul//li)[5]")
    WebElement selectBrandName;
        
    /////////////////////////////////////
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

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[4]")
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
    @FindBy(xpath = "//textarea[@id='remarks']")
    WebElement addRemarks;
  
    @FindBy(xpath = "//*[@id='myModal2']/div[2]/div/div[1]/button")
    WebElement close1;
    
    @FindBy(xpath = "//h5[@class='labelForm']")
    WebElement addVendorLabel;
    
  
    public static void validateResults(String displayed, String acutal) {
		logger.log(LogStatus.INFO, "Displayed", String.valueOf(displayed));
		logger.log(LogStatus.INFO, "Actual", String.valueOf(acutal));
		compareResults(displayed, acutal);
		assertEquals(displayed, acutal);
	}

	public static void compareResults(String displayed, String acutal) {
		if (!displayed.equals(acutal)) {
			logger.log(LogStatus.INFO, "Actual", acutal.toString());
			logger.log(LogStatus.FAIL, "Displays", displayed.toString());

		}
	}
	
	@FindBy(css = ".cur-month")
    WebElement currentMonth;

    @FindBy(css = ".numInput.cur-year")
    WebElement currentYearInput;
	
	@FindBy(css = ".flatpickr-prev-month")
    WebElement prevMonthButton;

    @FindBy(css = ".flatpickr-next-month")
    WebElement nextMonthButton;

    @FindBy(css = ".flatpickr-day:not(.prevMonth):not(.nextMonth)")
    WebElement dayOfMonth; // This locator assumes days are selectable with this class

    // Constructor
    
    // Method to select a specific date
    public void selectDate(int day, int monthOffset) {
        // Navigate to the previous or next month if necessary
        if (monthOffset < 0) {
            for (int i = 0; i > monthOffset; i--) {
                prevMonthButton.click();
            }
        } else if (monthOffset > 0) {
            for (int i = 0; i < monthOffset; i++) {
                nextMonthButton.click();
            }
        }

        waitForElementAndClick(dayOfMonth);
    }
    public void goToPreviousMonth() {
        prevMonthButton.click();
    }

    public void goToNextMonth() {
        nextMonthButton.click();
    }

    public String getCurrentMonth() {
        return currentMonth.getText();
    }

    
    public void waitForElementAndClick(WebElement element) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            System.out.println("Element clicked successfully.");
        } catch (Exception e) {
            System.err.println("Failed to click the element: " + e.getMessage());
        }
        }

    ////////////////
	
	public void verifyAddVendorLabel() throws InterruptedException {
        Thread.sleep(3000);
		String displayedText = addVendorLabel.getText();
        validateResults(displayedText,  "Add Vendor");
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
    	
    	branch.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
    	ifsc.sendKeys(getAutoGenerateOnlyStringCapital(4)+getAutoGenerateNumber(7));
    	pan.sendKeys(getAutoGenerateOnlyStringCapital(4)+getAutoGenerateNumber(4)+getAutoGenerateOnlyStringCapital(1));
    	accountNo.sendKeys(getAutoGenerateNumber(12));
    	addcreditAmount.sendKeys(getAutoGenerateNumber(5));
    	addcreditDays.sendKeys(getAutoGenerateNumber(2));
    	addvendorDiscount.sendKeys(getAutoGenerateNumber(2));
    	addRemarks.sendKeys(getAutoGenerateNumber(20));
    	
    }
    public void close() {
    	close1.click();
    }
    
    public void autorox() {
    	autoroxhome.click();
    }
    public void Stock() {
    	autoroxhome.click();
    	Stock.click();
    }
    @FindBy(id="pills-profile-tab-ordersStock")
    WebElement Stockorder;
    @FindBy(xpath="//input[@id='searchText_order']")
    WebElement StockorderSearchbar;
    @FindBy(id="inwardRedirectBtn_0")
    WebElement inwardOption;
    @FindBy(xpath="pills-profile-tab-ordersStock")
    WebElement Stockorder1;
    @FindBy(xpath="pills-profile-tab-ordersStock")
    WebElement Stockorde2r;
    @FindBy(xpath="pills-profile-tab-ordersStock")
    WebElement Stockorde3r;





  
    
    
    @FindBy(xpath="//li[@class='active treeview menu-open']")
    WebElement menu;
    @FindBy(xpath="(//i[@class='fa fa-circle-o'])[2]")
    WebElement menu1;
    @FindBy(xpath="//input[@id='searchText']")
    WebElement searchWorkshop;
    @FindBy(xpath="//a[@class='btn btn-primary1 btn-xs']")
    WebElement viewProfile;
    @FindBy(xpath="//a[@class='btn btn-success']")
    WebElement editProfile;
    @FindBy(xpath="//a[@id='pills-settings-tab']")
    WebElement gotoSettings;
    @FindBy(xpath="//*[@id=\"settings_tab\"]//button[6]")
    WebElement gotoInventoryManagement;
    @FindBy(xpath="//i[@id='status_15']")
    WebElement OFF;
    @FindBy(xpath="//i[@id='status_15']")
    WebElement ON;
    
    @FindBy(xpath="//li[@id='partsOpen']")
    WebElement PartsOption;
  
  
  
  
  
    public void superadminSettings() throws InterruptedException {
    	menu.click();
    	Thread.sleep(3000);
    	menu1.click();
    	searchWorkshop.sendKeys("AX1722586079740");
    	Thread.sleep(3000);
    	viewProfile.click();
    	Thread.sleep(3000);
    	editProfile.click();
    	gotoSettings.click();
    	js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(3000);
        gotoInventoryManagement.click();
        Thread.sleep(3000);
        
     }
    public void inventoryManagementOff() {
    	
    	OFF.click();
    }
    public void inventoryManagementOn() {
    	
    	ON.click();
    }
    
    public void verifyParts() {
    	
    	validateElement(PartsOption, "Parts Option");
    	
    }
    public void navigatetoInwardHomePage() throws Throwable {
		
    	
        Navigation("inventoryPage/directInward");
        
        }
    
    public void Parts() throws InterruptedException {
    	parts.click();
    	Thread.sleep(3000);
    	inward.click();
    	
    	
    }
    public void verifyBillnoDateTaxtype() {
    	
    	enterBillNo();
	    clickonBillDate();
	    selectBillDate();
	    selectGST();
	    selectIGST();
	    selectNA();
    }
    public void enterBillNo() {
        billNo.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateSpecialChars(2)+autoGenerateNumber(6, "123456789"));
        
    }
    public void clickonBillDate() {
        billDate.click();
    }
    
    public void selectBillDate() {
        selectDate.click();
    }
    public void selectBillDate1() {
        selectDate1.click();
    }
    public void selectGST() {
        selectOption(gstOption);
    }

    public void selectIGST() {
        selectOption(igstOption);
    }

    public void selectNA() {
        selectOption(naOption);
    }

    private void selectOption(WebElement option) {
        
    	taxTypeDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(option));
        option.click();
    }
    public void clickonNewVendor() throws Throwable {
        addVendor.click();
        
    }   
        public void addNewVendor() throws Throwable {
        	clickonNewVendor();
            addNewVendorinInwardPage();   
        	
        
    }
        public void partname(String prtnm) throws InterruptedException   {
        enterPartName.sendKeys(prtnm);
    	Thread.sleep(3000);
    	selectAutoroxPartName.click();
    	addplus.click();
    }
    public void addNewVendorinInwardPage() throws Throwable {
    	
    	Thread.sleep(3000);
    	newvendorName.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
    	contactName.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
    	Thread.sleep(3000);
    	GetActualVendorData();
    	mobileNo.sendKeys("9999999999");
    	emailId.sendKeys(getAutoGenerateOnlyString(10) + "@gmail.com");
    	address.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
    	street.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(8));
    	city.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
    	statename1("ANDHRA");
    	pincode.sendKeys(autoGenerateNumber(6, "123456789"));
    	bankfield();
    	Thread.sleep(3000);
    	bankdetails();
    	Thread.sleep(3000);
    	close();
    	Thread.sleep(3000);
    	//GetActualCreatedVendorData();
    	//compareVendorDetails();
    	
    }
    
    @FindBy(xpath="//ul[@class='menuList']//li[5]")
	WebElement Stock;
    @FindBy(id = "pills-profile-tab-inward")
	private WebElement goToInward;
    @FindBy(xpath="(//tr[@id='tr_0'])[2]//td[1]")
    WebElement selectInwardNo;
    @FindBy(xpath="(//div[@class='icheckbox_square-blue checked'])[2]")
	WebElement selectParttoReturn;
    @FindBy(xpath="(//a[@class='active_text selected_val_2'])[2]")
	WebElement rejected;
    @FindBy(xpath="//a[@class='close']")
	WebElement close;
    @FindBy(xpath="//button[@id='inwardButtonId']")
	WebElement update;
    @FindBy(xpath="//input[@id='carrierName']")
	WebElement carriername;
    @FindBy(xpath="//input[@id='trackNo']")
	WebElement trackno;
    @FindBy(xpath="//input[@id='freightAmount']")
	WebElement freightAmnt;
    @FindBy(xpath="(//div[@class='col-md-4 col-xs-12 float-label-control date_pi datepicker_set1'])[1]")
	WebElement clickDateofShipment;
    @FindBy(xpath="(//span[@class='flatpickr-day today'])[2]")
	WebElement selectDateofShipment;
    @FindBy(xpath="(//div[@class='col-md-4 col-xs-12 float-label-control date_pi datepicker_set1'])[2]")
	WebElement clickestDateofDelivery;
    @FindBy(xpath="(//span[@class='flatpickr-day today'])[2]")
	WebElement selectestDateofDelivery;
    @FindBy(xpath="//input[@id='remarksForPart']")
   	WebElement remarks;
    @FindBy(xpath="//button[@id='send_dispatch']")
   	WebElement save;
    @FindBy(xpath="(//button[@class='close'])[3]")
   	WebElement closePopup;
    
    
    @FindBy(id="partStatus_0")
   	WebElement partStatus;
    
    public void scrolldowntopartStatus() throws InterruptedException {
    	
        
        
        WebElement element = driver.findElement(By.id("partStatus_0"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

       
    }
    
    


    
  
  
  
    
  
    
    public void cancel() throws Exception {
    	
    	Stock.click();
    	goToInward.click();
    	selectInwardNo.click();
    	Thread.sleep(5000);
    	scrolldown();
    	
    	selectParttoReturn.click();
    	Thread.sleep(5000);
    	rejected.click();
    	Thread.sleep(2000);
    	close.click();
    	Thread.sleep(2000);
    	update.click();
    	Thread.sleep(2000);
    	carriername.sendKeys(getAutoGenerateOnlyString(10));
    	trackno.sendKeys(getAutoGenerateOnlyString(3)+autoGenerateNumber(6, "123456789"));
    	freightAmnt.sendKeys(autoGenerateNumber(3, "123456789"));
    	clickDateofShipment.click();
    	Thread.sleep(2000);
    	selectDateofShipment.click();
    	Thread.sleep(2000);
    	clickestDateofDelivery.click();
    	Thread.sleep(2000);
    	selectestDateofDelivery.click();
    	remarks.sendKeys(getAutoGenerateOnlyString(10));
    	save.click();
    	Thread.sleep(3000);
    	closePopup.click();
    	selectInwardNo.click();
    	Thread.sleep(3000);
    	scrolldowntopartStatus();
    	Thread.sleep(3000);
        String displayedText = partStatus.getText();
        
        validateResults(displayedText,  "RETURNED");
    	
    }
    
    public void compareVendorDetails() {
        String vendorNameFromDetails = VendorDetails.get("VendorName").toUpperCase();
        String vendorNameFromOpenDetails = VendorOpenDetails.get("VendorName");
        assertTrue(vendorNameFromDetails.equals(vendorNameFromOpenDetails));
    }
    @FindBy(xpath = "//input[@id='vendorName']")
    WebElement VendorNameEntry;
    public static Map<String, String> VendorDetails = new HashMap<String, String>();
    public void GetActualVendorData() {

    	VendorDetails.put("VendorName", VendorNameEntry.getAttribute("value"));
		
		System.out.println(VendorDetails);
		return;
	}
    @FindBy(xpath="//input[@id='vendor-purchaseOrder']")
    WebElement vname;

	 public static Map<String, String> VendorOpenDetails = new HashMap<String, String>();
	 public void GetActualCreatedVendorData() {
		 
		VendorOpenDetails.put("VendorName", vname.getAttribute("Value"));
		System.out.println(VendorOpenDetails);
		return;

	}
	 

	 
	 @FindBy(xpath="//span[@id='update_msg']")
	 WebElement alert;
	 public void Alert() {
		 clickInward();        
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	        
	        if (alertText.equals("Please select vehicle Registration No / Job Card No. / STOCK to complete the desired action.")) {
	            System.out.println("Alert text validation passed.");
	        } else {
	            System.out.println("Alert text validation failed.");
	        }
	 }
	 
	 
	 public void Alert1() {
		 
	        
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	        
	        if (alertText.equals("Please fill in all mandatory fields. Else, you may uncheck the Part.")) {
	            System.out.println("Alert text validation passed.");
	        } else {
	            System.out.println("Alert text validation failed.");
	        }
    }


	@FindBy(xpath="(//ul[@class='menuList'])//li[3]")
	WebElement SellProducts;
	@FindBy(xpath="//table[@id='example']//tbody//tr[1]//td[1]")
	WebElement SellProducts1;
	@FindBy(xpath="//*[@id='createInvoice']")
	WebElement SellProducts2;
	@FindBy(xpath="//div[@id='prefixInvoice_id']")
	WebElement SellProducts3;
	@FindBy(xpath="(//ul[@class='menuList'])//li[3]")
	WebElement SellProducts4;
	@FindBy(xpath="(//ul[@class='menuList'])//li[3]")
	WebElement SellProducts5;





	
	 public void Sell(int N) throws InterruptedException {
		 SellProducts.click();
		 SellProducts1.click();
		 for (int i = 0; i < N; i++) {
			   Thread.sleep(5000);
		        SellProducts2.click();
		        SellProducts3.click();
		    }

	 }
	 public void pendingInward(int N) throws InterruptedException {
		 
		 for (int i = 0; i < N; i++) {
		 
		 Stock();
		 Stockorder.click();
		 GetPendingInwardData();
		 StockorderSearchbar.sendKeys("Pending");
		 scrollToElement(inwardOption);
		 Thread.sleep(3000);
		 inwardOption.click();
		 enterBillNo();
		 clickonBillDate();
		 selectBillDate1();
		 selectGST();
		 Thread.sleep(5000);
		 inwardButton.click();
		 Thread.sleep(3000);
		 closePayments.click();
		 Thread.sleep(3000);
		 

		 }
		 
		 
		 
	 }
	 public static Map<String, String> PendingInwardDetails = new HashMap<String, String>();

		public InwardPage GetPendingInwardData() {

			PendingInwardDetails.put("VendorName", getText("xpath", "//tr[@id='trOrder_0']//td[2]"));
			

			System.out.println(PendingInwardDetails);
			return this;
		}
		public static Map<String, String> PendingInwardopenDetails = new HashMap<String, String>();

		public InwardPage GetActualPendingInwardData() {

			PendingInwardopenDetails.put("VendorName", getValue("xpath", "//input[@id='tr_inward_vendor_0']", "value"));

			System.out.println(PendingInwardopenDetails);
			return this;
		}
		
		public void inwardpartsfromJobcard() throws InterruptedException {

			clickJobcardImage();
		    Thread.sleep(3000);
		    selectjc();
		    clickInwardLink();
		    vendorSearchbar.sendKeys("SAI809");
		    enterBillNo();
			clickonBillDate();
			selectBillDate();
			selectGST();
			String BillNo = billNo.getText();
			addPartNumber.sendKeys(getAutoGenerateOnlyStringCapital(3)+autoGenerateNumber(6, "123456789"));
			
			
			String partno = getValue("xpath","//input[@id='partNo_0']","value");
		    System.out.println(partno);
		    brand.click();
	    	selectBrand.click();
		    
		    scrollDown2();
		    enterdisctax();
		    inwardButton.click();
		    Thread.sleep(3000);
		    closePayments1.click();
		    Thread.sleep(3000);
		    clickonStock.click();
		    stockSearchbar.sendKeys(partno);
		    Thread.sleep(3000);
		    selectPart.click();
		    String BillNo1 = billNo1.getText();
		    assertTrue(BillNo.equals(BillNo1)); 
		    
		    
			Thread.sleep(3000);
			
			
		}
		@FindBy(id="inventoryPartButton")
		static WebElement inwardpart;
	    
	    public void clickInwardLink() {
	    	inwardpart.click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        WebElement orderLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefInward")));
	        orderLink.click();
	    }
			
}
