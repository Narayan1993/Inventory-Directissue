package newJobcardcreation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import controllers.BaseMethod;

public class Newjobcard extends BaseMethod {

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
//@FindBy(xpath="//img[@class='halfLogo']")

//private WebElement Menu_button1;

//@FindBy(xpath="//nav[@class='main-menu']//li[2]") 
//private WebElement Menu_button;

@FindBy(xpath="//*[@id=\"style-1\"]/ul/li[2]/a") 
private WebElement Menu_button1;
//
@FindBy(xpath = "//span[@class='fa fa-chevron-down subMenu'][5]")
private WebElement TimeTracker_button;

@FindBy(xpath= "//nav[@class='main-menu']//li[26]")
private WebElement Time_Tracker;
@FindBy(xpath= "//nav[@class='main-menu']//li[26]")
private WebElement Job_Queue;

@FindBy(xpath= "//button[text()='Add New']")
private WebElement addTechnician;

@FindBy(xpath = "//input[@id='__BVID__33']")
private WebElement EmployeeName;

@FindBy(xpath = "//input[@id='__BVID__35']")
private WebElement EmployeeId;


@FindBy(xpath = "//input[@id='__BVID__37']")
private WebElement MobileNumber;

@FindBy(xpath = "//input[@id='__BVID__39']")
private WebElement Emailid;

@FindBy(xpath ="(//div[contains(text(), 'TECHNICIAN')] )[1]")
private WebElement Techniciandropdown;

@FindBy(xpath ="(//div[contains(text(), 'TECHNICIAN')] )[2]")
private WebElement Techniciandropdown2;

@FindBy(xpath ="//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[6]/div")
private WebElement EmployeeType1;


@FindBy(xpath = " //*[@id=\"__BVID__10\"]/tbody/tr[1]/td[5]/div/div[2]/div")
private WebElement selectTechnician;

@FindBy(xpath = "//input[@id='__BVID__44']")
private WebElement Designation;

@FindBy(xpath = "//input[@id='__BVID__47']")
private WebElement RatePerHour;

@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[11]/div/label/p")
private WebElement TechnicianEnabled;

@FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
private WebElement ClockInEnable;


@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[8]/button")
private WebElement ClockInButton;

@FindBy(xpath = "//*[@id=\"__BVID__10\"]/tbody/tr[1]/td[14]/button")
private WebElement save;

@FindBy(xpath = "//*[@id=\"estlater\"][2]")
private WebElement NewJobcard;

@FindBy(xpath = "//input[@id='reg_2']")
private WebElement StateCode;

@FindBy(xpath = "//input[@id='reg_3']")
private WebElement StateCode2;

@FindBy(xpath = "//input[@id='reg_4']")
private WebElement StateCode3;

@FindBy(xpath = "//input[@id='odometer']")
private WebElement odometer;

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
	
@FindBy(xpath= "//input[@id='customer_name']")
WebElement customerName;

@FindBy(xpath= "//input[@id='mobile_no']")
WebElement mobileNumber;

@FindBy(xpath= "//input[@id='email_id']")
WebElement emailid;

@FindBy(xpath = "//div[@class='dayContainer']/span[30]")
WebElement EstDeliveryDate;

@FindBy(xpath = "//button[@id='next']")
WebElement PrepareEstimation;

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

@FindBy(xpath = "//*[@id=\"__BVID__9\"]/tbody/tr[1]/td[4]/button")
WebElement TechnicianAssignment1;

//Select technician in the estimation screen 
/*public void TechnicianSelection(int No_Of_Technicians) throws Throwable {	
	for(int i=1; i<=No_Of_Technicians; i++) {
		driver.findElement(By.xpath("(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])["+i+"]")).click();
	}*/


@FindBy(xpath = "//*[@id=\"__BVID__9\"]/tbody/tr[2]/td[4]/button")
WebElement TechnicianAssignment2;

@FindBy(xpath = "//input[@class='search']")
WebElement searchInTechnicianPopup;

//Technician check

@FindBy(xpath = "(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])[1]")
WebElement check;

@FindBy(xpath = "(//div[@class= 'autorox-vue text-left']//label[@class='custom-control-label'])[2]")
 WebElement Technician2;


@FindBy(xpath = "(//div[@id='modal-ta___BV_modal_content_']//label[@class='custom-control-label'])[1]")
 WebElement Select;

@FindBy(xpath = "(//input[@class='display-time all-selected'])[1]")
 WebElement expectedTime;

@FindBy(xpath = "(//ul[@class='hours'])[1]//li[text()='01']")//div[@class='select-list']//li[5]")
 WebElement selectTime;

@FindBy(xpath = "(//ul[@class='minutes'])[1]//li[text()='01']")//*[@id='__BVID__247']/tbody/tr[1]/td[2]/span/div[3]/div/ul[2]/li[2]")
 WebElement selectMinutes;

@FindBy(xpath = "(//div[@id='modal-ta___BV_modal_body_']//div[@class='mt_29 buttons_footer']//button[@class='btn btn-outline-success'])")
 WebElement OK;

@FindBy(xpath = "//*[@id=\"__BVID__334\"]/tbody/tr[1]/td[1]/div/div[3]/span")
 WebElement tabout;

@FindBy(xpath = "//button[text()='Job Queue']")
 WebElement JobQueue;

//Elements validation

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

@FindBy(xpath = "//th[contains(text(), 'Active/Inactive')]")
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



//Technician Jobque page

@FindBy(xpath = "//button[@id='dropdownMenu1']")
WebElement TechnicianStartButton;

@FindBy(xpath = "(//ul[@class='dropdown-menu']//li//a//i)[1]")
WebElement TechnicianStart;

@FindBy(xpath = "//input[@class='search']")
WebElement TechnicianSearch;


@FindBy(xpath = "(//div[@class='dropdown option_dropdown']//button[@class='btn btn-default dropdown-toggle'])[2]")
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

//second service

@FindBy(xpath = "//tbody//tr[2]//td[4]/button")
WebElement SecondService;


	

public void newJobcardCreation() throws Throwable {

Navigation("workshop/serviceTickets");

NewJobcard.click();
StateCode.sendKeys(autoGenerateNumber(2, "123456789"));
StateCode2.sendKeys(getAutoGenerateOnlyString(3));
StateCode3.sendKeys(autoGenerateNumber(4, "123456789"));
odometer.sendKeys(autoGenerateNumber(3, "123456789"));


	VehicleName.sendKeys("toyota");
	 String Value0 = autoGenerateNumber(1, "1234");
 
driver.findElement(By.xpath("(//a[contains(@id,'ui')])[" + Value0 + "]")).click();
 VehicleYear.sendKeys("20");
 driver.findElement(By.xpath("//ul[@id='ui-id-478']//li[2]")).click();
driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu "
+ "ui-widget ui-widget-content ui-corner-all" + " autoclose_pop'][2]/li[1]//a")).click();

//scrollDown();
//Thread.sleep(5000);
customerName.click();
customerName.sendKeys("sairam");
mobileNumber.click();
mobileNumber.sendKeys("9100090851");
emailid.click();
emailid.sendKeys("Autorox13@gmail.com");
///EstDeliveryDate.click();
PrepareEstimation.click();
}
}