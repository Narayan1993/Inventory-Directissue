package com.techniciantracking;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import controllers.BaseMethod;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Techniciantracking extends BaseMethod {

	@FindBy(id = "logo1")
	private WebElement loginPageautoroxLogo;

	@FindBy(xpath = "//div[@class='col-sm-6 col-xs-12']/p")
	private WebElement login_HeaderText;
	@FindBy(id = "userName_login")
	private WebElement username_Field;
	@FindBy(id = "password_login")
	private WebElement password_Field;
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement login_Btn;
	// @FindBy(xpath="//img[@class='halfLogo']")

	// private WebElement Menu_button1;

	// @FindBy(xpath="//nav[@class='main-menu']//li[2]")
	// private WebElement Menu_button;

	@FindBy(xpath = "//*[@id=\"style-1\"]/ul/li[2]/a")
	private WebElement Menu_button1;

	@FindBy(xpath = "//span[@class='fa fa-chevron-down subMenu'][5]")
	private WebElement TimeTracker_button;

	@FindBy(xpath = "//nav[@class='main-menu']//li[26]")
	private WebElement Time_Tracker;
	@FindBy(xpath = "//nav[@class='main-menu']//li[26]")
	private WebElement Job_Queue;

	@FindBy(xpath = "//button[text()='Add New']")
	private WebElement addTechnician;

	@FindBy(xpath = "//input[@id='__BVID__33']")
	private WebElement EmployeeName;

	@FindBy(xpath = "//input[@id='__BVID__35']")
	private WebElement EmployeeId;

	@FindBy(xpath = "//input[@id='__BVID__37']")
	private WebElement MobileNumber;

	@FindBy(xpath = "//input[@id='__BVID__39']")
	private WebElement Emailid;

	@FindBy(xpath = "(//div[contains(text(), 'TECHNICIAN')] )[1]")
	private WebElement Techniciandropdown;

	@FindBy(xpath = "(//div[contains(text(), 'TECHNICIAN')] )[2]")
	private WebElement Techniciandropdown2;

	@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[6]/div")
	private WebElement EmployeeType1;

	@FindBy(xpath = " //*[@id=\"__BVID__10\"]/tbody/tr[1]/td[5]/div/div[2]/div")
	private WebElement selectTechnician;

	@FindBy(xpath = "//input[@id='__BVID__44']")
	private WebElement Designation;

	@FindBy(xpath = "//input[@id='__BVID__47']")
	private WebElement RatePerHour;

	@FindBy(xpath = "(//div[contains(text(),'TECHNICIAN')])[1]")
	private WebElement TechnicianEnabled1;

	@FindBy(xpath = "(//input[@class= 'text_capitalized form-control'])[1]")
	private WebElement EmployeeFirstRowName;
	// @FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[11]/div/label/p")
//	private WebElement TechnicianEnabled;
	@FindBy(xpath = "(//label[@class='custom-control-label']/p)[2]")
	private WebElement TechnicianActive;

	@FindBy(xpath = "//div[@id='modal-ta___BV_modal_content_']//div//div[2]//table//tbody")
	private WebElement TechnicianNameDisplay;

	@FindBy(xpath = "//div[@id='modal-ta___BV_modal_content_']//div//div[2]//table//tbody")
	private WebElement TechnicianNameDisplay1;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
	private WebElement ClockInEnable;

	@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[8]/button")
	private WebElement ClockInButton;

	@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[14]/button")
	private WebElement save;

	@FindBy(xpath = "//*[@id=\"modal-ta___BV_modal_body_\"]/div/div/div[3]/button[2]")
	private WebElement TechnicianSave;

	@FindBy(xpath = "(//button[@class='ta_button'])[2]")
	private WebElement Service2;

	@FindBy(xpath = "(//button[@class='ta_button'])[3]")
	private WebElement Service3;

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
	
	//Estimation and jobqueue colour xpath
	
	@FindBy(xpath = "//div[@class='status_div ']//i")
	WebElement colorinTechnicianpopup;
	
	
	
	
	
	

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
		if(regName == India) {
			
			StateCode.sendKeys(autoGenerateNumber(2, "123456789"));
			// StateCode.sendKeys("25");
			StateCode2.sendKeys(getAutoGenerateOnlyString(3));
			// StateCode2.sendKeys("eu");
			StateCode3.sendKeys(autoGenerateNumber(4, "123456789"));
			// StateCode3.sendKeys("1945");		
		} else if(regName == International) {
			
			IntregNo.sendKeys(autoGenerateNumber(3, "123456789") +getAutoGenerateOnlyString(3));
			
		}

		
	}

	public void verifyAllElementsEmployees() throws Throwable {
		Navigation("serviceticket/getTimeTracker");
		boolean timeLogo = TimeTrackerlogo.isDisplayed();
		validateResults(timeLogo, true);
		System.out.println(timeLogo); 
		String label = TimetrackerLabel.getText();
		validateResults(label, "Time Tracker");
		boolean Employee = EmployeesImage.isDisplayed();
		validateResults(Employee, true);
		// String Employeelabel = EmployeeText.getText();
		// validateResults(Employeelabel, "Employees");
		String labelshow = Show.getText();
		validateResults(labelshow, "Show");
		String labelEntries = Entries.getText();
		validateResults(labelEntries, "Entries");
		String AddbuttonLabel = Addbutton.getText();
		validateResults(AddbuttonLabel, "Add New");
		boolean searchlogo = SearchIcon.isDisplayed();
		validateResults(searchlogo, true);
		SearchIcon.click();
		SearchName.click();
		SearchName.sendKeys("sai");
		SearchClose.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		String SelectUserLabel = SelectUser.getText();
		validateResults(SelectUserLabel, "Select User");
		String EmployeeNameHeaderLable = EmployeeNameLabel.getText();
		validateResults(EmployeeNameHeaderLable, "Employee Name");
		String EmployeeidHeaderlabel = EmployeeIDLabel.getText();
		validateResults(EmployeeidHeaderlabel, "Employee ID");
		String MobileNumberHeaderLabel = MobileNumberLabel.getText();
		validateResults(MobileNumberHeaderLabel, "Mobile Number");
		String EmailidHeaderLabel = EmailId.getText();
		validateResults(EmailidHeaderLabel, "Email ID");
		String EmployeeTypeLabel = EmployeeType.getText();
		validateResults(EmployeeTypeLabel, "Employee Type");
		String DesignationLabelName = DesignationLabel.getText();
		validateResults(DesignationLabelName, "Designation");
		String RatePerHourHeaderLabel = RatePerHourLabel.getText();
		validateResults(RatePerHourHeaderLabel, "Rate per hour");
		String ClokLabel = ClockInEnableLabel.getText();
		// validateResults(ClokLabel,"Clock-in");
		String ActiveInactiveLabel = ActiveLabel.getText();
		validateResults(ActiveInactiveLabel, "Active / Inactive");
		String SendResetCopyLabel = SendResetCopy.getText();
		validateResults(SendResetCopyLabel, "Send / Reset / Copy");
		String ViewSummerylabel = ViewSummery.getText();
		validateResults(ViewSummerylabel, "View Summary");
		String SaveHeaderLabel = SaveLabel.getText();
		validateResults(SaveHeaderLabel, "Save");
		System.out.println(SaveHeaderLabel);

	}

	public void clockInbuttonValidation_and_Label_ValidationTest() throws InterruptedException {
		ClockinButton.click();
		Thread.sleep(5000);
		ClockInButton2.click();
		Thread.sleep(1000);
		ClockInButtonYes.click();
		// Clock-in validations
		String ClockInClockOutLable = ClockinButtonLabel.getText();
		validateResults(ClockInClockOutLable, "Clock-In/Clock-Out");
		boolean TimeImage = TimeTrackerImage.isDisplayed();
		validateResults(TimeImage, true);
		String Idlabel = IDLabel.getText();
		validateResults(Idlabel, "ID:");
		String LastClockInLabel = LastClockIn.getText();
		validateResults(LastClockInLabel, "Last Clock-In: -");
		String LastClockOutLabel = LastClockOut.getText();
		validateResults(LastClockOutLabel, "Last Clock-Out: -");
		String HoursLabel = HrsLabel.getText();
		validateResults(HoursLabel, "Today (hrs)");
		String ThisWeek = ThisWeekLabel.getText();
		validateResults(ThisWeek, "This Week (hrs)");
		String ThisMonth = ThisMonthLabel.getText();
		validateResults(ThisMonth, "This Month (hrs)");
		boolean ClockInButtonLabel = ClockInButton2.isDisplayed();
		validateResults(ClockInButtonLabel, true);

	}

	public void technicianpop_ValidationsInEstimationScreen() {
		TechnicianAssignment1.click();
		String popupHeader = TechnicianAssignmentHeader.getText();
		validateResults(popupHeader, "Technician Assignment");
//		String TechnicianNameInEstimationPage = TechnicianNameHeaderInEstimationPopup.getText();
//		validateResults(TechnicianNameInEstimationPage, "Technician Name");
//		String ExpectedHeader = ExpectedTimeHeader.getText();
//		validateResults(ExpectedHeader, "Expected Time");
		boolean Checkbox = CheckboxInTechnicianpopup.isDisplayed();
		validateResults(Checkbox, true);
		boolean Colour = colourInTechnicianpopup.isDisplayed();
		validateResults(Colour, true);
		boolean Timeformat = TimeFormat.isDisplayed();
		validateResults(Timeformat, true);
		boolean ViewJobqueue = ViewJobQueue.isDisplayed();
		validateResults(ViewJobqueue, true);
		boolean SaveInPopup = SaveInTechnicianPopup.isDisplayed();
		validateResults(SaveInPopup, true);
		boolean Closepopup = popupclose.isDisplayed();
		validateResults(Closepopup, true);
		popupclose.click();
	}

	// In job quque page, once we click on stop button, the popup will display

	public void technicianpopupscreen_Validation() {
		String HeaderText = TechnicianpopupHeader.getText();
		String actual = "Are You Sure You Want To Mark This Job As Complete ?";
		assertEquals(HeaderText, actual);
		System.out.println(HeaderText);
		String ServiceLabel = technicianpopupServiceLabel.getText();
		String Expected = "Service";
		assertEquals(ServiceLabel, Expected);
		System.out.println(ServiceLabel);
		String VehicleLable = technicianpopupVehicleLabel.getText();
		String vehicleNo = "Vehicle";
		assertEquals(VehicleLable, vehicleNo);
		System.out.println(VehicleLable);
		String JobcardNumber = technicianpopupJcNumberLabel.getText();
		String JcNumber = "JC Number";
		assertEquals(JobcardNumber, JcNumber);
		System.out.println(JobcardNumber);
		String StartTimeLabel = technicianpopupStartTimeLabel.getText();
		String StartTime = "Start Time";
		assertEquals(StartTimeLabel, StartTime);
		System.out.println(StartTimeLabel);
		String EndTimeLabel = technicianpopupEndTimeLabel.getText();
		String EndTime = "End Time";
		assertEquals(EndTimeLabel, EndTime);
		System.out.println(EndTimeLabel);
		String TotalTimeSpent = technicianpopupTotalTimeSpentLabel.getText();
		String TotalTime = "Total Time Spent";
		assertEquals(TotalTimeSpent, TotalTime);
		System.out.println(TotalTimeSpent);
		technicianpopupYesbutton.click();

	}

	public void Jobqueue_page_Label_Validation() throws Throwable {
		// Jobquepage label validations
		driver.navigate().back();
		Navigation("serviceticket/jobQueue");
		String Jobqueue = JobqueueLabel.getText();
		validateResults(Jobqueue, "Job Queue");
		boolean JobqueueSearchBox = TechnicianNameSearch.isDisplayed();
		validateResults(JobqueueSearchBox, true);
		String VehicleLabel = VehicleNumberLabel.getText();
		validateResults(VehicleLabel, "Vehicle Number");
		String JcLabel = JCNumberLabel.getText();
		validateResults(JcLabel, "JC Number");
		String service = ServiceLabel.getText();
		validateResults(service, "Service");
		String EmployeeId = EmployeeIdLabel.getText();
		validateResults(EmployeeId, "Employee ID");
		String TechnicianLabel = TechnicianLabelName.getText();
		validateResults(TechnicianLabel, "Technician");
		String StartTime = StartTimeLabel.getText();
		validateResults(StartTime, "Start Time");
		String EndTime = EndTimeLabel.getText();
		validateResults(EndTime, "End Time");
		String Duration = DurationLabel.getText();
		validateResults(Duration, "Duration");
		String Actions = ActionsLabel.getText();
		validateResults(Actions, "Actions");
		dropdownInJobqueue.click();
		SelectCompleted.click();

	}

//		String SaveHeaderLabel = SaveLabel.getText();
//		validateResults(SaveHeaderLabel, "Save");
	// System.out.println(SaveHeaderLabel);

	// }

	public void EmployeeAdd(int n) throws Throwable {

		Navigation("serviceticket/getTimeTracker");
		Thread.sleep(2000);

		// Employee Screen
		// Adding Technician 1 in Employee page
		for (int i = 0; i < n; i++) {
			System.out.println(i);
			addTechnician.click();
			Thread.sleep(2000);
			EmployeeName.sendKeys((getAutoGenerateOnlyString(5)));
			Thread.sleep(2000);
			EmployeeId.sendKeys(autoGenerateNumber(3, "123456789"));
			Thread.sleep(2000);
			MobileNumber.sendKeys(autoGenerateNumber(1, "6789") + autoGenerateNumber(9, "1234567890"));
			Thread.sleep(2000);
			Emailid.sendKeys(getAutoGenerateOnlyString(5));
			Thread.sleep(2000);
			EmployeeType1.click();
			Thread.sleep(3000);
			Techniciandropdown.click();
			Thread.sleep(3000);
			// selectTechnician.click();
			Designation.sendKeys("Denter");
			RatePerHour.sendKeys(autoGenerateNumber(1, "123456789"));
			TechnicianActive.click();
			ClockInEnable.click();
			ClockInButton.click();
			save.click();
			Thread.sleep(1000);
			ClockinButton.click();
			Thread.sleep(5000);
			ClockInButton2.click();
			Thread.sleep(1000);
			ClockInButtonYes.click();
			driver.navigate().back();
			break;

		}
	}

	// New job card page

	public void newJobcardOpen() throws Throwable {

		Navigation("workshop/serviceTickets");

		NewJobcard.click(); 
		NewJobcardSelect.click();
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
 
//Estimation screen

	public void EstimationScreen(int n) throws Exception {

		for (int i = 0; i < n; i++) {
			ServiceName.sendKeys(getAutoGenerateOnlyString(5));
			Labourprice.sendKeys(autoGenerateNumber(3, "123456789"));
			Save.click();
			Thread.sleep(2000); 
		}
		Thread.sleep(2000);
	}

	public void searchInJobqueuePage(String name) {
		Actions a = new Actions(driver);
		a.moveToElement(searchInTechnicianPopup).click().build().perform();
		searchInTechnicianPopup.sendKeys(name);
	}

	public void singletechnicianSelection() throws Exception {

		Thread.sleep(2000);
		driver.navigate().refresh();
		TechnicianAssignment1.click();
		Thread.sleep(2000);
		searchInJobqueuePage("Murthy");
		Thread.sleep(1000);
		String actual = "Murthy";
		// check name is correct or not
		String expected = EmployeeNameInPopupValidation.getText();
		System.out.println("Murthy name is :" + expected );
		if (actual.equals(expected)) {
			Assert.assertEquals(actual, expected);
			System.out.println("The murthy name is matching");
		} else
			System.out.println("The murthy name is not matched");
		check.click();
//		selectTime.click();
//		selectMinutes.click();
		Thread.sleep(1000);
		searchInTechnicianPopup.clear();
		Thread.sleep(3000);
		ViewJobQueue.click();
		// Redirecting to job queue page.
		driver.navigate().refresh();
		Jobqueuesearch.sendKeys("murthy");
		// Technician name is displaying or not in jobqueue page
		if (Techniciannamecheck.isDisplayed()) {

			System.out.println("Murthy name is displaying in jobqueue page.");
		} else {

			System.out.println("Murthy name is not displaying in jobqueue page.");
		}
		Thread.sleep(20000);
		List<WebElement> technicians = driver
				.findElements(By.xpath("//tbody[@role='rowgroup']//td[contains(text(), 'Murthy')]"));
		System.out.println("Total technicians with this name :" + technicians.size());
		int size = technicians.size();
		for (int i = 0; i < size; i++) {
			technicians.get(i);
			System.out.println("no.of technicians :" + i);
		}
		TechnicianStartWork();
		TechnicianStopTheWork();
		// technicianpopupYesbutton.click();

		String StartTime = StarttimeInJobqueuepage.getText();

		System.out.println(StartTime);
	}

	public void inActiveTechnicianInEstimationPage() throws Throwable {

		Navigation("serviceticket/getTimeTracker");
		addTechnician.click();
		Thread.sleep(2000);
		EmployeeName.sendKeys(getAutoGenerateOnlyString(3));
		Thread.sleep(2000);
		EmployeeId.sendKeys(getAutoGenerateOnlyString(2) + autoGenerateNumber(2, "123456789"));
		Thread.sleep(2000);
		MobileNumber.sendKeys(autoGenerateNumber(10, "123456789"));
		Thread.sleep(2000);
		Emailid.sendKeys(getAutoGenerateOnlyString(3) + "@autorox.co");
		Thread.sleep(2000);
		EmployeeType1.click();
		Thread.sleep(3000);
		Techniciandropdown.click(); 
		Thread.sleep(3000);
		// selectTechnician.click();
		Designation.sendKeys("Denter");
		RatePerHour.sendKeys("100");
		TechnicianActive.click();
		save.click();
		Thread.sleep(5000);
		String readEmployeeName1 = EmployeeFirstRowName.getText();
		String readEmployeeName = getValue("xpath", "(//input[@class= 'text_capitalized form-control'])[1]", "value");
		System.out.println(readEmployeeName);
		// Estimation page
		Navigation("workshop/serviceTickets");
		Thread.sleep(4000);
		DashboardFirstJobcard.click();
		ServiceName.sendKeys(getAutoGenerateOnlyString(5));
		Labourprice.sendKeys(autoGenerateNumber(3, "123456789"));
		Save.click();
		Thread.sleep(4000);
		TechnicianAssignment1.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// Thread.sleep(4000);
		searchInTechnicianPopup.sendKeys(readEmployeeName);
		Thread.sleep(4000);
		boolean DisplayTechnician = TechnicianNameDisplay.isDisplayed();
		validateResults(DisplayTechnician, true);

		// Estimation Page
		Navigation("serviceticket/getTimeTracker");
		TechnicianActive.click();
		save.click();
		driver.navigate().refresh();
		Navigation("workshop/serviceTickets");
		DashboardFirstJobcard.click();
		ServiceName.sendKeys(getAutoGenerateOnlyString(5));
		Labourprice.sendKeys(autoGenerateNumber(3, "123456789"));
		Save.click();
		Thread.sleep(4000);
		TechnicianAssignment1.click();
		Thread.sleep(4000);
		searchInTechnicianPopup.sendKeys(readEmployeeName);
		Thread.sleep(4000);
		boolean DisplayTechnician1 = TechnicianNameDisplay1.isDisplayed();
		validateResults(DisplayTechnician1, false);
		popupclose.click();

	}

	public void duplicate_TechniciancheckInJobqueueScreen() throws Throwable {
//		String newurl= driver.getCurrentUrl();
//		 
//		String timeTrackerScreen = newurl.replace("axuat/serviceticket/bookAppointment", "serviceticket/getTimeTracker");
//		driver.get(timeTrackerScreen);
//		System.out.println(timeTrackerScreen);

		// for(int i=0; i<ad; i++) {
		Navigation("serviceticket/getTimeTracker");
		addTechnician.click();
		Thread.sleep(2000);
		EmployeeName.sendKeys("karthik");
		Thread.sleep(2000);
		EmployeeId.sendKeys("ax921");
		Thread.sleep(2000);
		MobileNumber.sendKeys("9130488832");
		Thread.sleep(2000);
		Emailid.sendKeys("autorox51@autorox.co");
		Thread.sleep(2000);
		EmployeeType1.click();
		Thread.sleep(3000);
		Techniciandropdown.click();
		Thread.sleep(3000);
		// selectTechnician.click();
		Designation.sendKeys("Denter");
		RatePerHour.sendKeys("100");
		TechnicianActive.click();
		save.click();
		Thread.sleep(5000);
	}
	// String alert1 = driver.switchTo().alert().getText();
	// System.out.println(alert1);

	// Estimation screen
	public void technicianAssignmentinEstimationScreen() throws Throwable {

		TechnicianAssignment1.click();
		// TechnicianSelection(2);
		searchInTechnicianPopup.sendKeys("Sairam"); // first time sairam work statred in estimation
		Thread.sleep(1000);
		check.click();
		Thread.sleep(3000);
		searchInTechnicianPopup.clear();
		Thread.sleep(3000);
		searchInTechnicianPopup.sendKeys("Srikar"); // first time srikar work started in estimation
		check.click();
		Thread.sleep(2000);

		// Job queue screen

	}

	// In technician jobqueue screen
	public void technicianJobqueuepage() throws Throwable {

		ViewJobQueue.click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		Jobqueuesearch.sendKeys("sairam");
		Thread.sleep(3000);
		TechnicianStartWork();
		System.out.println("Sairam work started in jobqueue page");
		TechnicianSearch.clear();
		driver.navigate().refresh();
		Jobqueuesearch.sendKeys("Srikar");
		Thread.sleep(3000);
		TechnicianStartWork();
		System.out.println("Srikar work started in jobqueue page");
		driver.navigate().back();
		driver.navigate().refresh();
		// Selecting assigned technician for second time in estimation screen

		Service2.click();
		searchInTechnicianPopup.sendKeys("Sairam");
		check.click(); // second time sairam selected it should not click
		boolean c = check.isSelected();
		validateResults(c, false);
		System.out.println("Check box is not selected" + " " + c);
		searchInTechnicianPopup.clear();
		Thread.sleep(2000);
		searchInTechnicianPopup.sendKeys("Srikar"); // second time srikar selected. it should not click
		check.click();
		Thread.sleep(1000);
		boolean b = check.isSelected();
		validateResults(b, false);
		System.out.println("Check box is not selected" + " " + b);
		// Navigate to jobqueue screen
		ViewJobQueue.click();
		// Pause the technician sairam
		searchInTechnicianPopup.sendKeys("Sairam");
		TechnicianPauseTheWork();
		System.out.println("Sairam technician is paused. Now the colour is convert into redcolour");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().refresh();
		// Check the assigned technicians are selecting again or not in estimation
		// screen
		Service3.click();
		searchInTechnicianPopup.sendKeys("Sairam");
		check.click(); // Now sairam will check because it is in red colour

		if (check.isSelected() == true) {

			System.out.println("The check is not selected for sairam. It is not correct. Because the colour is red"
					+ " " + !check.isSelected());

		} else {

			System.out.println("The check is selected for sairam. It is correct. Because the colour is red" + " "
					+ !check.isSelected());
		}

		searchInTechnicianPopup.clear();
		searchInTechnicianPopup.sendKeys("Srikar");
		check.click(); // Srikar should not click becuase he is working for other task
		if (!check.isSelected() == true) {

			System.out.println("The check is not selected for Srikar. It is correct. Because the colour is orange" + " "
					+ !check.isSelected());

		} else {

			System.out.println("The check is selected for Srikar. It is not correct. Because the colour is orange" + " "
					+ !check.isSelected());
		}

		// Jobqueue screen
		ViewJobQueue.click();
		Jobqueuesearch.sendKeys("Srikar");
		TechnicianStopTheWork();
		System.out.println("Srikar stopped the work in the jobqueue page");
		driver.navigate().refresh();
		Jobqueuesearch.sendKeys("sairam");
		Thread.sleep(2000);
		// Stop the technician sairam
		TechnicianStopTheWork();
		List<WebElement> SairamTechnician = driver.findElements(By.xpath("//tbody[@role='rowgroup']//td[contains(text(),'Sairam')]"));
		int size = SairamTechnician.size();
		if (size > 1) {
			for (int j = 0; j < size; j++) {
			
				TechnicianStartWork();
				TechnicianStopTheWork();
				Thread.sleep(1000);
				break;
			}
		}
			System.out.println("Sairam stopped the work in the jobqueue page");
			// Last Technician
			driver.navigate().refresh();
			Thread.sleep(2000);
			dropdownInJobqueue.click();
			// Technician job completed screen
			SelectCompleted.click();
			Thread.sleep(2000);
			String Data = DataReflectionInJobqueueCompleted.getText();
			System.out.println(Data);
			// Close job card
			driver.navigate().back();
			driver.navigate().refresh();
			JobDone.click();
			Thread.sleep(2000);
			CreateInvoice.click();
			CloseCollections.click();
		}
	

	public void savebuttonvalidataioInTechnician() throws Throwable {
		// EmployeeAdd(1);
		// Thread.sleep(3000);
		// String EmpName =
		// driver.findElement(By.xpath("(//input[@class='text_capitalized
		// form-control'])[1]")).getText();
		// System.out.println("The random employee name is " + EmpName);
		newJobcardOpen();
		EstimationScreen(1);
		TechnicianAssignment1.click();
		Thread.sleep(3000);
		searchInJobqueuePage("raghu");
		Thread.sleep(1000);
		String actual = "Raghu";
		// check name is correct or not
		String expected = EmployeeNameInPopupValidation.getText();
		if (actual.equals(expected)) {
			Assert.assertEquals(actual, expected);
			System.out.println("The " + actual + "name is matching");
		} else
			System.out.println("The " + actual + "name is not matched");
		check.click();
		selectTime.click();
		// Adding Hours and minutes in the Technician popup
		selectTime.sendKeys("01");
		selectMinutes.click();
		selectMinutes.sendKeys("55");
		Thread.sleep(2000);
		SaveInTechnicianPopup.click();
		// Redirecting to job queue page.
		TechnicianAssignment1.click();
		// searchInJobqueuePage("raghu");
		// String Hours =
		// driver.findElement(By.xpath("//*[@id=\"__BVID__243\"]")).getAttribute("value");
		// System.out.println("Total hours provided for this technician: " + Hours);
		ViewJobQueue.click();
		driver.navigate().refresh();
		Jobqueuesearch.sendKeys("raghu");
		// Technician name is displaying or not in jobqueue page
		if (Techniciannamecheck.isDisplayed()) {

			System.out.println("The raghu name is displaying in jobqueue page.");
		} else {

			System.out.println("The raghu name is not displaying in jobqueue page.");
		}
		Thread.sleep(20000);

		List<WebElement> technicians = driver
				.findElements(By.xpath("//tbody[@role='rowgroup']//td[contains(text(), 'Raghu')]"));
		System.out.println("Total technicians with this nahttps://us06web.zoom.us/j/81400072843?pwd=gLdmQNLOyPc5O7dsEpRx8KD4Q8myNF.1#successme :" + technicians.size());
		int size = technicians.size();

		if (size > 1 || size == 1) {

			for (int i = 0; i < size; i++) {
				TechnicianStartWork();
				TechnicianStopTheWork();
			}
			Jobqueuesearch.clear();
			driver.navigate().refresh();
		}
	}
	
	public void colourValidationInEstimationScreen() throws Throwable {
		newJobcardOpen(); 
		EstimationScreen(1);
		TechnicianAssignment1.click();
		Thread.sleep(3000);
		searchInJobqueuePage("colour");
		Thread.sleep(1000);
		String Color = colorinTechnicianpopup.getCssValue("color");
		System.out.println("In technician pop up the color is :" + Color);
		String Hexacolor = org.openqa.selenium.support.Color.fromString(Color).asHex();
		System.out.println("The Hexa color of technician is :" + Hexacolor);
		String actualgrey = "#999999";
		String display = Hexacolor;
		if(actualgrey.equals(display)) { 
		assertEquals(actualgrey, display);	
		System.out.println("The grey color is matching in technician popup");
		} else { 
		
			System.out.println("The grey color is not matching in technician popup");
			
		}
		 
		 
		
		
		
		
		
	}

	public void superadmincheck() throws Throwable {
		// ManageWorkshoplatest.click();
		Home.click();
		String str = driver.getCurrentUrl(); 
		System.out.println(str);
		String ele[] = str.split("admin/console");
		System.out.println(ele[0]);
		System.out.println(ele[1]);

		String ele2 = ele[0] + "workshop/getAllWorkShops" + ele[1];
		driver.navigate().to(ele2);
		System.out.println(ele2);
		SearchInSuperAdmin.sendKeys("AX1710910315301");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		ViewProfileButton.click();
		Thread.sleep(3000);
		EditProfile.click();
		Thread.sleep(5000);
		NavigateToSettingsTab.click();
		OtherFeatures.click();

		SettingsOnOff("Other Features");

	}

	public void logoutcurrentpage() {
		UserNameClick.click();
		Logout.click();

	}

	public void SettingsOnOff(String SettingCategoryName) throws Throwable {

		/*
		 * String actualname = driver.findElement(By.
		 * xpath("//h4[contains(text(), 'Assign Technicians to Repairs')]")) .getText();
		 * System.out.println("The url name is :" + actualname); String Expected =
		 * "Assign Technicians to Repairs";
		 */
		driver.findElement(By.xpath("(//div[@class='workshop_dialog'])[10]")).click();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@id='status_10145']")).click();
		//WebElement TechnicianOnOff = 
				
		//if (actualname.equals(Expected)) { 

			//WebElement TechnicianOnOff = driver.findElement(By.xpath("//i[@id='status_10145']")).click();
			//JavascriptExecutor jse = (JavascriptExecutor) driver;
			//jse.executeScript("arguments[0].click()", TechnicianOnOff);
		

		driver.findElement(By.xpath("(//div[@class='container-pad']//button)[13]")).click();
		Thread.sleep(3000);
		// NewTogglebutton.click();
		// a.moveToElement(Toggle).click().perform();

		// driver.findElement(By.xpath("(//div[@class='price-percent']//i)[66]")).click();

	}
}
