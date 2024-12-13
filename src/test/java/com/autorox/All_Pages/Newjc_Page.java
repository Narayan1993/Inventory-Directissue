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


public class Newjc_Page extends BaseTestMethod {
	private WebDriverWait wait;
	public Newjc_Page(WebDriver driver) {
		BaseTestMethod.driver = driver;
		BaseTestMethod.js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Autorox Jobcard']")
    private WebElement autoroxJC;
	@FindBy(xpath = "//div[@class='dropdown d-inline-block verti_inherit drop_m5']//button[@id='dropdownMenu1']")
    private WebElement newJC;
	@FindBy(xpath = "//a[normalize-space()='New Job Card']")
    private WebElement newJobcard;
	@FindBy(xpath = "//a[normalize-space()='New Estimate']")
    private WebElement newEstimate;
	

	
	
	@FindBy(xpath = "//header[@id='modal-1___BV_modal_header_']")
    private WebElement modalHeader;

    
    @FindBy(xpath = "//h5[@id='modal-1___BV_modal_title_']")
    private WebElement modalTitle;

    
    @FindBy(xpath = "(//button[@class='close'])[3]")    
    private WebElement closeButton;
    
    
    @FindBy(xpath = "//div[contains(@class, 'tr_no_set')]/h5[@class='color2 font_17px d-inline-block fweight_600']")
    private WebElement primaryDetailsHeader;

    @FindBy(xpath = "//div[contains(@class, 'tr_no_set')]//label[contains(text(), 'TR No. / Other Number')]")
    private WebElement trNoOtherNumberLabel;

    @FindBy(xpath = "//div[contains(@class, 'search_m1')]/input[@type='text' and contains(@placeholder, 'Search Using Registration No.')]")
    private WebElement searchInputField;

    @FindBy(xpath = "//div[contains(@class, 'dropdown') and contains(@id, '__BVID__154')]/button")
    private WebElement servicePackageDropdown;

    @FindBy(xpath = "//div[contains(@class, 'dropdown') and contains(@id, '__BVID__19')]/button")
    private WebElement feedbackDropdown;

    @FindBy(xpath = "//div[@id='due_amount_view']/parent::button")
    private WebElement dueAmountDropdown;

    @FindBy(xpath = "//button[@type='button' and contains(@class, 'btn-secondary')]/img[contains(@src, 'Bell-GR.svg')]")
    private WebElement notificationButton;

    @FindBy(xpath = "//button[@type='button' and contains(@class, 'btn-secondary')]/img[contains(@src, 'battery_tyre.png')]")
    private WebElement batteryTyreButton;
    
 // Registration No. Dropdown
    @FindBy(xpath = "//div[@class='multi_select']//div[@class='ui fluid search selection dropdown']")
    private WebElement registrationNoDropdown;

    // Registration No. Input Fields
    @FindBy(xpath = "//div[@class='amount_feild exp_type_feild pr']//input[@type='number' and @maxlength='2']")
    private WebElement registrationNoFieldPart1;

    @FindBy(xpath = "//div[@class='amount_feild exp_type_feild pr']//input[@type='text' and @maxlength='3']")
    private WebElement registrationNoFieldPart2;

    @FindBy(xpath = "//div[@class='amount_feild exp_type_feild pr']//input[@type='number' and @maxlength='4']")
    private WebElement registrationNoFieldPart3;

    // Odometer Input Field
    @FindBy(xpath = "//input[@placeholder='Enter Odometer Reading']")
    private WebElement odometerInputField;

    // Avg KMS/Day Input Field
    @FindBy(xpath = "//input[@placeholder='Enter Average KM/Day']")
    private WebElement avgKmsPerDayField;

    // VIN Input Field
    @FindBy(xpath = "//input[@placeholder='Enter VIN Number']")
    private WebElement vinInputField;

    // Engine No. Input Field
    @FindBy(xpath = "//input[@placeholder='Enter Engine No.']")
    private WebElement engineNoField;
    
    
 // Make Dropdown
    @FindBy(xpath = "//div[@class='col-md-3 mt-22']//div[@class='ui fluid search selection dropdown'][@required]")
    private WebElement makeDropdown;

    // Model Dropdown
    @FindBy(xpath = "//div[@class='col-md-3 mt-22'][2]//div[@class='ui fluid search selection dropdown'][@required]")
    private WebElement modelDropdown;

    // Year Dropdown
    @FindBy(xpath = "//div[@class='col-md-3 mt-22'][3]//div[@class='ui fluid search selection dropdown'][@required]")
    private WebElement yearDropdown;

    // Variant Dropdown
    @FindBy(xpath = "//div[@class='col-md-3 mt-22'][4]//div[@class='ui fluid search selection dropdown'][@required]")
    private WebElement variantDropdown;
    
    
   

        @FindBy(xpath = "//h5[contains(@class, 'color2 font_17px fweight_600')]")
        private WebElement serviceInfoHeading;

        @FindBy(xpath = "//label[contains(text(), 'Service Type')]")
        private WebElement serviceTypeLabel;

        @FindBy(xpath = "//div[contains(@class, 'ui fluid search selection dropdown')]")
        private WebElement serviceTypeDropdown;

        @FindBy(xpath = "//div[contains(@class, 'color_dropdown fixed_dropdown_m1')]")
        private WebElement vehicleColorDropdown;

        @FindBy(xpath = "//div[contains(@class, 'ui fluid search selection dropdown') and contains(@class, 'fuel_type_dropdown')]")
        private WebElement fuelTypeDropdown;

        @FindBy(xpath = "//label[contains(text(), 'Fuel Type')]")
        private WebElement fuelTypeLabel;

        @FindBy(xpath = "//div[contains(@class, 'ui fluid search selection dropdown') and contains(@class, 'service_advisor_dropdown')]")
        private WebElement serviceAdvisorDropdown;

        @FindBy(xpath = "//label[contains(text(), 'Service Advisor')]")
        private WebElement serviceAdvisorLabel;

        @FindBy(xpath = "//label[contains(text(), 'Estimated Delivery Date') and contains(@class, 'color3')]")
        private WebElement estimatedDeliveryDateLabel;

        @FindBy(xpath = "//div[contains(@class, 'mx-datepicker')]")
        private WebElement estimatedDeliveryDatePicker;
        
        @FindBy(xpath = "(//input[@id='input-2'])[5]")
        private WebElement make;
        
        
        @FindBy(xpath = "(//*[@id=\"__BVID__17\"]/div/div[2]")
        private WebElement scroll;

        

        @FindBy(xpath = "//div[contains(@class, 'menu visible')]//div[contains(@class, 'item selected')]")
        private WebElement selectedItem;
        
        @FindBy(xpath = "(//input[@class='search'])[3]")
        private WebElement Model;
        
        @FindBy(xpath = "(//div[@class='item selected'])[2]")
        private WebElement selectedNexonItem;
        
        @FindBy(xpath = "(//div[@class='item selected'])[3]")
        private WebElement year;
        		
        





    
    
 
    
//	@FindBy(xpath = "")
//    private WebElement ;
//	@FindBy(xpath = "")
//    private WebElement ;
//	@FindBy(xpath = "")
//    private WebElement ;
//	@FindBy(xpath = "")
//    private WebElement ;
//	@FindBy(xpath = "")
//    private WebElement ;
//	@FindBy(xpath = "")
//    private WebElement ;
	
	
	public boolean isModalHeaderDisplayed() {
        return modalHeader.isDisplayed();
    }

    
    public String getModalTitle() {
        return modalTitle.getText();
    }

    
    public boolean isCloseButtonDisplayed() {
        return closeButton.isDisplayed();
    }
    
    public void gotonewJobcard() {
    	
    	autoroxJC.click();
    	newJC.click();
    	newJobcard.click();
        }
	
    
    public void validateElements() {
        validateElement(modalHeader, "Modal Header");
        validateElement(modalTitle, "Modal Title");
        validateElement(closeButton, "Close Button");
        validateElement(primaryDetailsHeader, "Primary Details Header");
        validateElement(trNoOtherNumberLabel, "TR No. / Other Number Label");
        validateElement(searchInputField, "Search Input Field");
        validateElement(servicePackageDropdown, "Service Package Dropdown");
        validateElement(feedbackDropdown, "Feedback Dropdown");
        validateElement(dueAmountDropdown, "Due Amount Dropdown");
        validateElement(notificationButton, "Notification Button");
        validateElement(batteryTyreButton, "Battery Tyre Button");
        validateElement(registrationNoDropdown, "Registration No. Dropdown");
        validateElement(registrationNoFieldPart1, "Registration No. Field Part 1 (State Code)");
        validateElement(registrationNoFieldPart2, "Registration No. Field Part 2 (Series)");
        validateElement(registrationNoFieldPart3, "Registration No. Field Part 3 (Number)");
        validateElement(odometerInputField, "Odometer Input Field");
        validateElement(avgKmsPerDayField, "Avg KMS / Day Input Field");
        validateElement(vinInputField, "VIN Input Field");
        validateElement(engineNoField, "Engine No. Input Field");
        validateElement(makeDropdown, "Make Dropdown");
        validateElement(modelDropdown, "Model Dropdown");
        validateElement(yearDropdown, "Year Dropdown");
        validateElement(variantDropdown, "Variant Dropdown");
        
        validateElement(serviceInfoHeading, "Service Info Heading");
        validateElement(serviceTypeLabel, "Service Type Label");
        validateElement(serviceTypeDropdown, "Service Type Dropdown");
        validateElement(vehicleColorDropdown, "Vehicle Color Dropdown");
        validateElement(fuelTypeDropdown, "Fuel Type Dropdown");
        validateElement(serviceAdvisorDropdown, "Service Advisor Dropdown");
        validateElement(estimatedDeliveryDateLabel, "Estimated Delivery Date Label");
        validateElement(estimatedDeliveryDatePicker, "Estimated Delivery Date Picker");
        
        

       
    }
    
    
    public void jcc() throws InterruptedException {
    	Thread.sleep(5000);
    	js.executeScript("arguments[0].scrollIntoView(true);", variantDropdown);
    	
//    	WebElement element = driver.findElement(By.xpath("//p[@class='card-text']"));
//
//        // Scroll to the element using JavaScript
//        
//        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'next' });", element);

    	//js.executeScript("document.body.style.zoom='0.5'");
    	//scrollDown(scroll);
    	
    	make.sendKeys("tata");
    	selectedItem.click();

    	Thread.sleep(5000);
    	Model.sendKeys("nexon");
    	selectedNexonItem.click();
    	Thread.sleep(5000);
    	year.click();
    	
    	
    	
    	
    	
    	
    }
	
      
    
    
}

