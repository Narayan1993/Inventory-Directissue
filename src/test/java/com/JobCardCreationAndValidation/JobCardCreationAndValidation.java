package com.JobCardCreationAndValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import controllers.BaseMethod;

public class JobCardCreationAndValidation extends BaseMethod {
	
	
	@FindBy(xpath = "//*[@id=\"style-1\"]/ul/li[2]/a")
	private WebElement Menu_button1;

	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[1]/div[2]/div[2]")
	private WebElement NewJobcard;

	@FindBy(xpath = "//a[normalize-space()='New Job Card']")
	private WebElement NewJobcardSelect;

	@FindBy(xpath = "//input[@id='reg_2']")
	private WebElement StateCode;

	@FindBy(xpath = "//input[@id='reg_3']")
	private WebElement StateCode2;

	@FindBy(xpath = "//input[@id='reg_4']")
	private WebElement StateCode3;

	@FindBy(xpath = "//input[@id='odometer']")
	private WebElement odometer;

	// International reg no

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

	@FindBy(xpath = "//input[@id='partname']")
	WebElement ServiceName;

	@FindBy(xpath = "//input[@id='totallabourprice']")
	WebElement Labourprice;

	@FindBy(xpath = "//div[@id='hideconclick']/a")
	WebElement Save;

	@FindBy(xpath = "(//select[@class='custom-select']//option[text()='APPROVED'])[1]")
	WebElement Approved1;

	@FindBy(xpath = "(//select[@class='custom-select']//option[text()='APPROVED'])[2]")
	WebElement Approved2;

	@FindBy(xpath = "(//select[@class='custom-select']//option[text()='APPROVED'])[3]")
	WebElement Approved3;

	@FindBy(xpath = "(//select[@class='custom-select']//option[text()='APPROVED'])[4]")
	WebElement Approved4;

	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[3]/div/div/div[2]/div/div/div/div[5]/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/button")
	WebElement TechnicianAssignment1;

	// Dashboard page

	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[2]/div[1]/div/div/div[6]/table/tbody/tr[1]")
	WebElement DashboardFirstJobcard;

	// Select technician in the estimation screen

	public void TechnicianSelection(int No_Of_Technicians) throws Throwable {
		for (int i = 1; i <= No_Of_Technicians; i++) {
			driver.findElement(By
					.xpath("(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])[" + i + "]"))
					.click();

		}
	}

	public void Jobqueuescreen_completedscreendata(int n) {
		for (int i = 1; i < n; i++) {

			driver.findElement(
					By.xpath("(//div[@class='universal_table_main table-responsive']/table/tbody/tr)[" + i + "]\")"))
					.click();
		}

	}

	@FindBy(xpath = "//*[@id=\"__BVID__9\"]/tbody/tr[2]/td[4]/button")
	WebElement TechnicianAssignment2;

	@FindBy(xpath = "//div[@class='data_table_search search-btn']//input[@class='search']")
	WebElement searchInTechnicianPopup;

	// Technician check

	@FindBy(xpath = "(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])[1]")
	WebElement check;

	@FindBy(xpath = "(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])[2]")
	WebElement Technician2;

	@FindBy(xpath = "(//div[@id='modal-ta___BV_modal_content_']//label[@class='custom-control-label'])[1]")
	WebElement Select;

	@FindBy(xpath = "(//div[@id='modal-ta___BV_modal_body_']//tr)[2]//td[2]")
	WebElement expectedTime;

	@FindBy(xpath = "(//span[@class='input_m13']//input)[1]")
	WebElement selectTime;

	@FindBy(xpath = "(//span[@class='input_m13']//input)[2]") // *[@id='__BVID__247']/tbody/tr[1]/td[2]/span/div[3]/div/ul[2]/li[2]")
	WebElement selectMinutes;

	@FindBy(xpath = "//*[@id=\"modal-ta___BV_modal_body_\"]/div/div/div[3]/button[2]")
	WebElement TechnicianSaveButton;

	@FindBy(xpath = "//*[@id=\"__BVID__334\"]/tbody/tr[1]/td[1]/div/div[3]/span")
	WebElement tabout;

	@FindBy(xpath = "//button[text()= 'View Job Queue']")
	WebElement ViewJobQueue;

	@FindBy(xpath = "//button[@id='statusJobDone']")
	WebElement JobDone;

	@FindBy(xpath = "//button[@id='statusJobDone']")
	WebElement CreateInvoice;

	@FindBy(xpath = "(//i[@class='fa fa-times-circle'])[4]")
	WebElement CloseCollections;

	// Technician name validation

	@FindBy(xpath = "//span[@class='tech_name']")
	WebElement EmployeeNameInPopupValidation;

	// Elements validation

	@FindBy(xpath = "//span[@class='icon time_tracker_icon']")
	WebElement TimeTrackerlogo;

	@FindBy(xpath = "(//span[contains(text(),'Time Tracker')])[2]")
	WebElement TimetrackerLabel;

	@FindBy(xpath = "(//h2[@class='text-left']//i[@class='fa fa-users'])[1]")
	WebElement EmployeesImage;

	@FindBy(xpath = "//*[@id=\"check_in_out\"]/div[1]/div[1]/h2/text()")
	WebElement EmployeeText;

	@FindBy(xpath = "//b[text()='Show']")
	WebElement Show;

	@FindBy(xpath = "//b[text()='Entries']")
	WebElement Entries;

	@FindBy(xpath = "//button[text()='Add New']")
	WebElement Addbutton;

	@FindBy(xpath = "//div[@class='text-right col-sm-9']//i[@class='fa fa-search']")
	WebElement SearchIcon;

	@FindBy(xpath = "//div[@class='search_set v_search_Set active_search']//input[@class='search']")
	WebElement SearchName;

	@FindBy(xpath = "//div[@class='search_set v_search_Set active_search']//i")
	WebElement SearchClose;

	@FindBy(xpath = "//th[contains(text(), 'Select User')]")
	WebElement SelectUser;

	@FindBy(xpath = "//th[contains(text(), ' Employee Name ')]")
	WebElement EmployeeNameLabel;

	@FindBy(xpath = "//th[contains(text(), 'Employee ID')]")
	WebElement EmployeeIDLabel;

	@FindBy(xpath = "//th[contains(text(), 'Mobile Number')]")
	WebElement MobileNumberLabel;

	@FindBy(xpath = "//th[contains(text(), 'Email ID')]")
	WebElement EmailId;

	@FindBy(xpath = "//th[contains(text(), 'Employee Type')]  ")
	WebElement EmployeeType;

	@FindBy(xpath = "//th[contains(text(), 'Designation')]")
	WebElement DesignationLabel;

	@FindBy(xpath = "//th[contains(text(), 'Rate per hour')]")
	WebElement RatePerHourLabel;

	@FindBy(xpath = "//th[contains(text(), 'Rate per hour')]")
	WebElement ClockInEnableLabel;

	@FindBy(xpath = "//th[contains(text(), 'Active / Inactive')]")
	WebElement ActiveLabel;

	@FindBy(xpath = "//th[contains(text(), 'Send / Reset / Copy')]")
	WebElement SendResetCopy;

	@FindBy(xpath = "//th[contains(text(), 'View Summary')]")
	WebElement ViewSummery;

	@FindBy(xpath = "//th[contains(text(), 'Save')]")
	WebElement SaveLabel;

	@FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
	WebElement ClockinButton;

	@FindBy(xpath = "//div[text()='Clock-In/Clock-Out'][1]")
	WebElement ClockinButtonLabel;

	@FindBy(xpath = "(//span[@class= 'v-btn__content']//i)[1]")
	WebElement TimeTrackerImage;

	// Technician Jobque page

	@FindBy(xpath = "(//button[@id='dropdownMenu1'])[2]")
	WebElement TechnicianStartButton;

	@FindBy(xpath = "//input[@class='search']")
	WebElement Jobqueuesearch;

	@FindBy(xpath = "//tbody[@role='rowgroup']")
	WebElement Techniciannamecheck;

	@FindBy(xpath = "//tbody[@role='rowgroup']")
	WebElement SizeoftheTechnician;

	@FindBy(xpath = "(//ul[@class='dropdown-menu']//li//a//i)[1]")
	WebElement Technicianworkstarted;

	@FindBy(xpath = "//input[@class='search']")
	WebElement TechnicianSearch;

	@FindBy(xpath = "(//button[@id='dropdownMenu1'])[2]")
	WebElement TechnicianStart2button;

	@FindBy(xpath = "(//ul[@class='dropdown-menu']//li//a//i)[5]")
	WebElement TechnicianStart2;

	@FindBy(xpath = "//tr[@id= 'q34rMKT%2B%2BB6%2FveIWdFGIZg%3D%3D']//td[2]")
	WebElement OpenfirstJobcard;

	@FindBy(xpath = "(//ul[@class='dropdown-menu']//li//a//i)[2]")
	WebElement TechnicianPause;

	@FindBy(xpath = "(//ul[@class='dropdown-menu']//li//a//i)[4]")
	WebElement TechnicianStop2;

	@FindBy(xpath = "//div[contains(text(),' ID: ' )]")
	WebElement IDLabel;

	@FindBy(xpath = "//*[@id=\"inspire\"]/div/main/div/div/div/div[1]/div/div[1]/div/div[3]")
	WebElement LastClockIn;

	@FindBy(xpath = "//*[@id=\"inspire\"]/div/main/div/div/div/div[1]/div/div[1]/div/div[4]")
	WebElement LastClockOut;

	@FindBy(xpath = "//th[text()='Today (hrs)']")
	WebElement HrsLabel;

	@FindBy(xpath = "//th[text()='This Week (hrs)']")
	WebElement ThisWeekLabel;

	@FindBy(xpath = "//th[text()='This Month (hrs)']")
	WebElement ThisMonthLabel;

	@FindBy(xpath = "//*[@id=\"inspire\"]/div/main/div/div/div/div[3]/button/span")
	WebElement ClockInButton2;

	@FindBy(xpath = "(//body//div[@id='inspire']//div[@class='text-center v-card v-sheet theme--light']//div[@class='v-card__actions']//button)[1]")
	WebElement ClockInButtonYes;

	@FindBy(xpath = "(//h2[text()='Job Queue'])")
	WebElement JobqueueLabel;

	@FindBy(xpath = "//input[@class='search']")
	WebElement TechnicianNameSearch;

	@FindBy(xpath = "//th[contains(text(), 'Vehicle Number')]")
	WebElement VehicleNumberLabel;

	@FindBy(xpath = "//th[contains(text(), 'JC Number ')]")
	WebElement JCNumberLabel;

	@FindBy(xpath = "//th[contains(text(), 'Service')]")
	WebElement ServiceLabel;

	@FindBy(xpath = "//th[contains(text(), 'Employee ID')]")
	WebElement EmployeeIdLabel;

	@FindBy(xpath = "//th[contains(text(), 'Technician')] ")
	WebElement TechnicianLabelName;

	@FindBy(xpath = "//th[contains(text(), ' Start Time ')] ")
	WebElement StartTimeLabel;

	@FindBy(xpath = "//th[contains(text(), ' End Time ')] ")
	WebElement EndTimeLabel;

	@FindBy(xpath = "//th[contains(text(), 'Duration')] ")
	WebElement DurationLabel;

	@FindBy(xpath = "//th[contains(text(), 'Actions')]  ")
	WebElement ActionsLabel;

	@FindBy(xpath = "//select[@class='option_select']")
	WebElement dropdownInJobqueue;

	@FindBy(xpath = "//option[text()='Completed']")
	WebElement SelectCompleted;

	@FindBy(xpath = "(//div[@class='universal_table_main table-responsive']/table/tbody/tr)[1]")
	WebElement DataReflectionInJobqueueCompleted;

	// Single technician

	@FindBy(xpath = ("(//*[@class='text-left'])[5]"))
	WebElement StarttimeInJobqueuepage;

	@FindBy(xpath = "//button[text()='No']")
	WebElement technicianpopupNobutton;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement technicianpopupYesbutton;

	@FindBy(xpath = "(//div[@class='info_complete col-sm-6']/p/strong)[1]")
	WebElement technicianpopupServiceLabel;

	@FindBy(xpath = "(//div[@class='info_complete col-sm-6']/p/strong)[2]")
	WebElement technicianpopupVehicleLabel;

	@FindBy(xpath = "(//div[@class='info_complete col-sm-6']/p/strong)[3]")
	WebElement technicianpopupJcNumberLabel;

	@FindBy(xpath = "(//div[@class='right_confirm col-sm-5']/p/strong)[1]")
	WebElement technicianpopupStartTimeLabel;

	@FindBy(xpath = "(//div[@class='right_confirm col-sm-5']/p/strong)[2]")
	WebElement technicianpopupEndTimeLabel;

	@FindBy(xpath = "(//div[@class='right_confirm col-sm-5']/p/strong)[3]")
	WebElement technicianpopupTotalTimeSpentLabel;

	// second service

	@FindBy(xpath = "//tbody//tr[2]//td[4]/button")
	WebElement SecondService;

	// technicianpopupscreen_Validation

	@FindBy(xpath = "//header[@class='modal-header confirm_header']")
	WebElement TechnicianpopupHeader;

	// technicianpop_ValidationsInEstimationScreen

	@FindBy(xpath = "//h5[@id='modal-ta___BV_modal_title_']")
	WebElement TechnicianAssignmentHeader;

	@FindBy(xpath = "//input[@class='search']")
	WebElement TechnicianTextInSearch;

	@FindBy(xpath = "//*[@id=\"__BVID__226\"]/thead/tr/th[1]")
	WebElement TechnicianNameHeaderInEstimationPopup;

	@FindBy(xpath = "//*[@id=\"__BVID__226\"]/thead/tr/th[2]")
	WebElement ExpectedTimeHeader;

	@FindBy(xpath = "(//div[@class='pr w-auto custom-control custom-checkbox'])[1]")
	WebElement CheckboxInTechnicianpopup;

	@FindBy(xpath = "//i[@style='color: rgb(17, 157, 30);']")
	WebElement colourInTechnicianpopup;

	@FindBy(xpath = "(//input[@class='display-time all-selected'])[1]")
	WebElement TimeFormat;

	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement SaveInTechnicianPopup;

	@FindBy(xpath = "//*[@id=\"modal-ta___BV_modal_header_\"]/button")
	WebElement popupclose;

	// logout page

	@FindBy(xpath = "//div[@class='dropdown-toggle']")
	WebElement UserNameClick;
	// button[contains(text(), 'Logout')]

	@FindBy(xpath = "//button[contains(text(), 'Logout')]")
	WebElement Logout;

	// Super admin disable and enable

	@FindBy(xpath = "(//ul[@class='sidebar-menu tree']//li//a//i)[1]")
	WebElement Home;

	@FindBy(xpath = "//span[contains(text(), 'Workshop')]")
	WebElement ManageWorkshoplatest;

	@FindBy(xpath = "//li[@class='active treeview menu-open']//li[2]/a")
	WebElement ManageWorkshoplink;

	@FindBy(xpath = "//input[@id='searchText']")
	WebElement SearchInSuperAdmin;

	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 emphasis text-right']//a[@class='btn btn-primary1 btn-xs']")
	WebElement ViewProfileButton;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement EditProfile;

	@FindBy(xpath = "//li[@class='nav-item call_checklist']//a")
	WebElement NavigateToSettingsTab;

	@FindBy(xpath = "//button[@data-target='#otherfeatures_panel']")
	WebElement OtherFeatures;

	@FindBy(xpath = "(//div[@class='price-percent']//i)[66]")
	private WebElement Toggle;

	@FindBy(xpath = "//i[@class='swich fa fa-toggle-off fa-2x fa-toggle-on blue pad_t' and @id='status_10145' ]")
	WebElement NewTogglebutton;

	// Estimation and jobqueue colour xpath

	@FindBy(xpath = "//div[@class='status_div ']//i")
	WebElement colorinTechnicianpopup;

	// New job card screen

	// registration number
	@FindBy(xpath = "//input[@class='form-control input_custom ' ] [1]")
	WebElement regnumstatecode1;

	@FindBy(xpath = "//input[@class='form-control input_custom ' ] [2]")
	WebElement regnumstatecode2;

	@FindBy(xpath = "//input[@class='form-control input_custom ' ] [2]//following-sibling::input")
	WebElement regnumstatecode3;

	// odometer

	@FindBy(xpath = "//input[@placeholder='Enter Odometer Reading']")
	WebElement NewOdometer;

	// VIN Number

	@FindBy(xpath = "//input[@placeholder = 'Enter VIN Number']")
	WebElement NewVinNumber;

	// Engine number

	@FindBy(xpath = "//input[@placeholder = 'Enter Engine No.']")
	WebElement EngineNumber;

	// MMVY

	@FindBy(xpath = "//div[@class='search_m9 ']")
	WebElement SearchButton;

	// search button enter
	@FindBy(xpath = "//input[@class='floating-input form-control']")
	WebElement SearchButtonEnter;

	// Make

	@FindBy(xpath = "(//input[@id='input-2'])[5]")
	WebElement EnterMake;

	// Model

	@FindBy(xpath = "(//input[@class='search'])[3]")
	WebElement EnterModel;

	// Year
	@FindBy(xpath = "(//input[@class='search'])[4]")
	WebElement EnterYear;

	@FindBy(xpath = "(//div[@class='item selected'])[3]")
	WebElement YearSelect;

	// Variant

	@FindBy(xpath = "//div[contains(text(),'(e.g ZX, VX)')]//preceding-sibling::input")
	WebElement EnterVariant;

	@FindBy(xpath = "//div[@class='item' and normalize-space(text())='AUTOMATIC']")
	WebElement VariantEntry;

	@FindBy(xpath = "//div[@class='search_m9 ']//div")
	WebElement SearchButtonInNewJobcardScreen;

	// Other details like service type and custom details

	@FindBy(xpath = "//div[contains(text(),'Select Service Type')]//preceding-sibling::i")
	WebElement ServiceType;

	@FindBy(xpath = "//div[contains(text(),'Select Service Type')]//preceding-sibling::input")
	WebElement ServiceTypeEnter;

	@FindBy(xpath = "(//div[@class='form-group input_m15']//following::label)[13]")
	WebElement ServiceAdvisorLabel;

	@FindBy(xpath = "(//h5[@class='color2 font_17px d-inline-block fweight_600'])[3]")
	WebElement ServiceTypeFuelEstimationDelivery;

	// span[text()='WHITE']
	@FindBy(xpath = "//span[text()='WHITE']")
	WebElement WhiteColor;

	@FindBy(xpath = "//div[contains(text(),'PMS')]")
	WebElement PMSclick;

	@FindBy(xpath = "(//div[@class='ui fluid search selection dropdown']//i)[9]")
	WebElement CustomField1;

	@FindBy(xpath = "(//div[@class='menu visible'])//div[3]")
	WebElement CustomFieldselect;

	// Navigating to new job card from Menu

	@FindBy(xpath = "(//span[contains(text(), 'Job Cards')])[1]//preceding::img[1]")
	WebElement NavigatingJobCardFromMenu;

	@FindBy(xpath = "//input[@placeholder='Customer Name']")
	WebElement CustomerNameEnter;

	@FindBy(xpath = "(//input[@class='form-control pad_l60'])[1]")
	WebElement MobileNumberEnter;

	// Click prepare estimationNow button

	@FindBy(xpath = "//button[contains(text(), 'PREPARE ESTIMATION')]")
	WebElement PrepareEstimationNowButton;

	// Click customer Concerns in left side menu

	@FindBy(xpath = "//*[@id=\"__BVID__17\"]/div/div[1]/ul/li[3]/a")
	WebElement ClickCustomerConcernsInLeftMenu;

	// Vehicle Details Label

	@FindBy(xpath = "//h3[contains(text(),'VEHICLE DETAILS')]")
	WebElement VehicleDetailsLabel;
	
	///Corporate for new job card
	
	
	@FindBy(id = "companyName")
    WebElement corpName;
    
    @FindBy(id = "gstnno")
    WebElement gstn;
    
    @FindBy(id = "contactName_corp")
    WebElement corpcontactName;
    
    @FindBy(xpath = "//input[@class='form-control pad_l60']")
    WebElement mobNo;
    
    @FindBy(xpath = "//input[@placeholder='Contact Email' and @type='text' and contains(@class, 'form-control')]")
    WebElement corpemail;
    
    @FindBy(id = "driverName_corp")
    WebElement corpcontacnamedrivername;
    
    @FindBy(id = "address1")
    WebElement corpflat;
    
    @FindBy(id = "colonyStrtLocatn")
    WebElement corpcolony;
    
    @FindBy(xpath = "//input[@id='city']")
    WebElement corpcity;
    
    
    @FindBy(xpath = "(//i[@class='dropdown icon'])[11]")
    WebElement corpstate;
    
    @FindBy(xpath = "//div[@class='item' and text()='Telangana']")
    WebElement corpstate1;
    
    @FindBy(xpath = "//input[@type='text' and @placeholder='Pincode' and contains(@class, 'form-control') and @maxlength='6']")
    WebElement corppincode;

	public void newregistrationnumberEnter() throws Exception {

		regnumstatecode1.sendKeys(autoGenerateNumber(2, "123456789"));
		Thread.sleep(2000);
		regnumstatecode2.sendKeys(getAutoGenerateOnlyString(2));
		Thread.sleep(2000);
		regnumstatecode3.click();
		Thread.sleep(2000);
		regnumstatecode3.sendKeys(autoGenerateNumber(4, "123456789"));
	}

	public void newodometer() {

		NewOdometer.sendKeys(autoGenerateNumber(4, "123456789"));

	}

	public void VINnumber() {

		NewVinNumber.sendKeys(autoGenerateNumber(5, "123456789"));
	}

	public void EngineNumber() {

		EngineNumber.sendKeys(autoGenerateNumber(5, "123456789"));
	}

	public void MMVY() throws Exception {

		Thread.sleep(2000);
		// EnterMake.click();
		Thread.sleep(2000);

		Actions ac = new Actions(driver);
		ac.moveToElement(EnterMake).doubleClick().build().perform();

		EnterMake.sendKeys("Tata");
		Thread.sleep(1000);
		EnterMake.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		EnterModel.sendKeys("Tiago");
		EnterModel.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		EnterYear.click();
		EnterYear.sendKeys("2000");
		Thread.sleep(1000);
		YearSelect.click();
		Thread.sleep(1000);
		EnterVariant.sendKeys("Automatic");
		Thread.sleep(1000);
		VariantEntry.click();
		// JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("document.body.style.zoom='65%'");

	}

	public void EnterOtherDetails() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByClassName('dropdown icon')[5].click();");
		// jse.executeScript("getElementsByClassName('text default')[1].click();");
		ServiceAdvisorLabel.click();
		Thread.sleep(3000);
		ServiceType.click();
		WhiteColor.click();

		Actions sc = new Actions(driver);
		sc.moveToElement(ServiceType).click().build().perform();
		Thread.sleep(4000);
		ServiceTypeEnter.sendKeys("PMS");
		Thread.sleep(2000);
		PMSclick.click();
		CustomField1.click();
		Thread.sleep(2000);
		CustomFieldselect.click();

	}

	public void CustomerDetails() {

		CustomerNameEnter.sendKeys(getAutoGenerateOnlyString(5));
		MobileNumberEnter.sendKeys("99" + autoGenerateNumber(8, "123456789"));

	}

	public void ClickCustomerConcernsInLeftSideMenu() {
		ClickCustomerConcernsInLeftMenu.click();

	}

	public void ClickPrepareEstimationNow() {
		PrepareEstimationNowButton.click();
	}

	public void TechnicianStartWork() throws Exception {

		TechnicianStartButton.click();
		Thread.sleep(1000);
		Technicianworkstarted.click();
		Thread.sleep(1000);

	}

	public void TechnicianPauseTheWork() throws Exception {
		TechnicianStartButton.click();
		Thread.sleep(1000);
		TechnicianPause.click();
		Thread.sleep(1000);
	}

	public void TechnicianResumeTheWork() {

	}

	public void TechnicianStopTheWork() throws Exception {
		TechnicianStartButton.click();
		Thread.sleep(1000);
		TechnicianStop2.click();
		Thread.sleep(1000);
		technicianpopupNobutton.click();
		technicianpopupYesbutton.click();
	}

	public void registrationNumber(String regName) {

		String India = "India";
		String International = "International";
		if (regName == India) {

			StateCode.sendKeys(autoGenerateNumber(2, "123456789"));
			// StateCode.sendKeys("25");
			StateCode2.sendKeys(getAutoGenerateOnlyString(3));
			// StateCode2.sendKeys("eu");
			StateCode3.sendKeys(autoGenerateNumber(4, "123456789"));
			// StateCode3.sendKeys("1945");
		} else if (regName == International) {

			IntregNo.sendKeys(autoGenerateNumber(3, "123456789") + getAutoGenerateOnlyString(3));

		}

	}
	
public void navigatingToNewJobcard() throws InterruptedException {
		
		String Title = driver.getTitle();
		System.out.println("The current title is : " + Title);
		
		if(Title != "Book Appointment - Autorox") {
			
			Menu_button1.click();
			Thread.sleep(1000);
			NavigatingJobCardFromMenu.click();
		}	
		}

	public void newJobcardOpen(String IndividualJobcard) throws Throwable {
		
		String IndividualCustomers = "IndividualCustomer";
		String CorporateCustomer = "CorporateJobcard";
		if(IndividualCustomers == IndividualJobcard){
       
		// Navigation("workshop/serviceTickets");
		String VehicleLabel = "VEHICLE DETAILS";
		NewJobcard.click();
		NewJobcardSelect.click();
		String VehicleLabelInNewJobcard = VehicleDetailsLabel.getText();

		if (VehicleLabelInNewJobcard.equals(VehicleLabel)) {
			newregistrationnumberEnter();
			newodometer();
			VINnumber();
			EngineNumber();
			MMVY();
			EnterOtherDetails();
			CustomerDetails();
			ClickCustomerConcernsInLeftSideMenu();
			Thread.sleep(2000);
			ClickPrepareEstimationNow();
		} else {
			odometer.sendKeys(autoGenerateNumber(3, "123456789"));
			registrationNumber("India");
			Thread.sleep(3000);
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
			driver.findElement(By.xpath("//span[text()='Select']")).click();
			driver.findElement(By.xpath("(//li[@role='treeitem'])[3]")).click();
			scrollDown();
			// Thread.sleep(5000);
			customerName.click();
			// customerName.sendKeys("siddhu");
			customerName.sendKeys(getAutoGenerateOnlyString(5));
			mobileNumber.click();
			mobileNumber.sendKeys("9100090851");
			emailid.click();
			emailid.sendKeys("Autorox13@gmail.com");
			// EstDeliveryDate.click();
			PrepareEstimation.click();

			// GiveEstimationLater.click();

		}
	
	}
}}
