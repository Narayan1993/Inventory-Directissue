package com.autorox.All_Pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import controllers.BaseMethod;
import utils.ExcelUtils;

public class Book_Appointment_Page extends BaseMethod {

	@FindBy(xpath = "//div/span/img")
	private WebElement CalendarIcon;
	@FindBy(xpath = "//div[@class='title nav-link']/span[2]")
	private WebElement CalendarLabel;
	@FindBy(xpath = "//div[@class='v-toolbar__content']//button[1]")
	private WebElement TodayButton;
	@FindBy(xpath = "//div[@class='v-toolbar__content']//button[1]/span")
	private WebElement TodayButtonLable;
	@FindBy(xpath = "(//div[@class='v-toolbar__content']//i)[1]")
	private WebElement BackwardDatesArrow;
	@FindBy(xpath = "(//div[@class='v-toolbar__content']//i)[2]")
	private WebElement Forward_Dates_Arrow;
	@FindBy(xpath = "//div[@class='v-toolbar__title']")
	private WebElement Dispalyed_Month_Year;
	@FindBy(xpath = "//button[@class='search_btn']")
	private WebElement Search_Icon;
	@FindBy(xpath = "//button[@class='v-btn v-btn--outlined theme--light "
			+ "v-size--default grey--text text--darken-2']")
	private WebElement Page_View_DropDown;
	@FindBy(xpath = "//button//Span[@class='v-btn__content']/span")
	private WebElement Page_view_Label;
	@FindBy(xpath = "(//button//Span[@class='v-btn__content']/i)[3]")
	private WebElement Page_View_DropDown_Icon;
	@FindBy(xpath = "//div[@class='v-list-item__title']")
	private WebElement PV_DropDown_Options;
	@FindBy(xpath = "//div/span[contains(text(),'Appointment')]")
	private WebElement Appointment_Button;
	@FindBy(xpath = "//div[contains(text(),'Working Staff')]")
	private WebElement Working_Staff_Label;
	@FindBy(xpath = "//div[@class='ui fluid search selection dropdown']/i")
	private WebElement Working_Staff_DropDown;
	@FindBy(xpath = "//div[@class='menu visible']/div")
	private WebElement Working_Staff_List;
	@FindBy(xpath = "//button[contains(text(),'Add New')]")
	private WebElement Add_New_Button;
	@FindBy(xpath = "//div/input[@class='form-control']")
	private WebElement Main_Search_Bar;
	@FindBy(xpath = "//div[contains(text(),'Sun')]")
	private WebElement Day_Sun_Label;
	@FindBy(xpath = "//div[contains(text(),'Mon')]")
	private WebElement Day_Mon_Label;
	@FindBy(xpath = "//div[contains(text(),'Tue')]")
	private WebElement Day_Tue_Label;
	@FindBy(xpath = "//div[contains(text(),'Wed')]")
	private WebElement Day_Wed_Label;
	@FindBy(xpath = "//div[contains(text(),'Thu')]")
	private WebElement Day_Thu_Label;
	@FindBy(xpath = "//div[contains(text(),'Fri')]")
	private WebElement Day_Fri_Label;
	@FindBy(xpath = "//div[contains(text(),'Sat')]")
	private WebElement Day_Sat_Label;
	@FindBy(xpath = "(//div[@class='v-calendar-daily__interval-text'])[1]")
	WebElement Hours_Label1;
	@FindBy(xpath = "//div[@class='v-calendar-daily__day v-past']")
	WebElement Past_Dates;
	@FindBy(xpath = "//div[@class='v-calendar-daily_head-day v-present']")
	WebElement Present_Dates;
	@FindBy(xpath = "//div[@class='v-calendar-daily_head-day v-future']")
	WebElement future_Dates;
	@FindBy(xpath = "//div[@id='modal-newAppointment___BV_modal_body_']")
	WebElement New_Appointment_Popup;
	@FindBy(xpath = "(//div[@class='v-calendar-daily__day v-present']/div)[6]")
	WebElement TodaysPastTimeclick;
	@FindBy(xpath = "//div[@class='v-calendar-daily__day v-present']/div[@class='v-current-time']")
	WebElement TodayspresentTimeclick;
	@FindBy(xpath = "//div[@class='v-calendar-daily__day v-present']/div[18]")
	WebElement TodaysActiveTimeclick;
	@FindBy(xpath = "//div[@class='alert ax-alert-error alert-dismissible alert-info']")
	WebElement AlertMes;
	@FindBy(xpath = "//button[@class='btn btn-link']//span[contains(text(),'X')]")
	WebElement NewAppointmentPopupClose;
	@FindBy(xpath = "(//div[@class='v-calendar-daily__day v-past']/div)[6]")
	WebElement PastdateAndTimeclick;
	@FindBy(xpath = "(//div[@class='v-calendar-daily__day v-future']/div)[13]")
	WebElement fururedateAndTimeclick;
	@FindBy(xpath = "(//div[@class='v-calendar-daily__scroll-area']")
	WebElement scrollDown;

	// New Appointment Popup Elements.(NA Means New Appointment)

	@FindBy(xpath = "//div[@class='table_search pr']/input")
	WebElement NASecrch;
	@FindBy(xpath = "//div[@class='new_appointment_header black_txt']/h4")
	WebElement NALabel;
	@FindBy(xpath = "//i[@class='fa fa-clock-o']")
	WebElement NAClockIcon;
	@FindBy(xpath = "//div[@class='mx-calendar mx-calendar-panel-date']")
	WebElement NACalenderpopup;
	@FindBy(xpath = "//div[@class='mx-input-wrapper']/input")
	WebElement NADatefield;
	@FindBy(xpath = "//i[@class='mx-icon-calendar']")
	WebElement NACalenderIcon;
	@FindBy(xpath = "//div[@class='start_time']//span[@class='vue__time-picker time-picker']")
	WebElement NAStartTime;
	@FindBy(xpath = "//div[@class='end_time']//span[@class='vue__time-picker time-picker']")
	WebElement NAEndTime;
	@FindBy(xpath = "//button[contains(text(),'Individual')]")
	WebElement NAIndividual;
	@FindBy(xpath = "//button[contains(text(),'Corporate')]")
	WebElement NACorporate;
	@FindBy(xpath = "(//i[@class='fa fa-user'])[2]")
	WebElement CustomerIcon;
	@FindBy(xpath = "(//i[@class='fa fa-user'])[3]")
	WebElement ServiceAdvisorIcon;
	@FindBy(xpath = "//i[@class='v-icon notranslate mdi mdi-van-utility theme--light']")
	WebElement VehicleIcon;
	@FindBy(xpath = "//i[@class='fa fa-envelope']")
	WebElement EmailIcon;
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	WebElement MobileIcon;
	@FindBy(xpath = "//i[@class='fa fa-cog']")
	WebElement ServiceIcon;
	@FindBy(xpath = "//i[@class='fa fa-map-marker']")
	WebElement BayIcon;
	@FindBy(xpath = "//label[contains(text(),'Customer Name')]")
	WebElement CustomerLabel;
	@FindBy(xpath = "//label[contains(text(),'Vehicle Number')]")
	WebElement VehicleLabel;
	@FindBy(xpath = "//label[contains(text(),'Email')]")
	WebElement EmailLabel;
	@FindBy(xpath = "//label[contains(text(),'Mobile Number')]")
	WebElement MobileLable;
	@FindBy(xpath = "//label[contains(text(),'Service')]")
	WebElement serviceLabel;
	@FindBy(xpath = "//label[contains(text(),'Service Advisor')]")
	WebElement ServiceAdvisorLabel;
	@FindBy(xpath = "//label[contains(text(),'Bay')]")
	WebElement BayLabel;
	@FindBy(xpath = "//Button[contains(text(),'Book')]")
	WebElement BookButton;
	@FindBy(xpath = "//div[contains(text(),'Choose a service advisor')]")
	WebElement ServiceAdvisorfield;
	@FindBy(xpath = "(//i[@class='dropdown icon'])[3]")
	WebElement SAdropdownicon;
	@FindBy(xpath = "(//div[@class='ui fluid search selection dropdown'])[2]")
	WebElement Statedropdownicon;
	@FindBy(xpath = "//input[@class='form-control text_capitalized']")
	WebElement CustomerInput;
	@FindBy(xpath = "//div[@class='text']")
	WebElement VehicleState;
	@FindBy(xpath = "(//input[@class='form-control input_custom'])[2]")
	WebElement VehicleNoSecond;
	@FindBy(xpath = "//input[@class='form-control input_custom error_msg']")
	WebElement VehicleNoLast;
	@FindBy(xpath = "(//input[@class='form-control input_custom'])[1]")
	WebElement VehicleNoFirst;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement EmailInput;
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	WebElement serviceInput;
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	WebElement BayInput;
	@FindBy(xpath = "(//div[@class='menu hidden']/div[1])[3]")
	WebElement SAdropdown;
	@FindBy(xpath = "//input[@class='form-control pad_l60']")
	WebElement Mobileinput;
	@FindBy(xpath = "//button[@class='dropdown-toggle']")
	WebElement Countrycode;
	@FindBy(xpath = "(//input[@class='search'])[2]")
	WebElement VehicleStateCode;
	@FindBy(xpath = "//div[@class='menu visible']")
	WebElement StsteCodeDD;
	@FindBy(xpath = "//label[contains(text(),'Corporate Name')]")
	WebElement CorporateNamelabel;
	@FindBy(xpath = "//div[@class='v-calendar-daily__day v-future']")
	WebElement ListOfActiveDays;
	@FindBy(xpath = "//button[@class='btn btn-link']//span[contains(text(), 'X')]")
	WebElement NewAppointmentClose;

//New appointment opening validation by clicking on add new button.

	public Book_Appointment_Page AddNewButtonValiadtionInBP() {
		Add_New_Button.click();
		boolean Element = New_Appointment_Popup.isDisplayed();
		validateResults(Element, true);
		NewAppointmentPopupClose.click();
		return this;
	}

//New appointment opening validation by clicking on todays dates active Time.
	public Book_Appointment_Page PresentDateCurrentTimeValiadtionInBP() throws Throwable {

		Thread.sleep(1000);
		refresh();
		scrollDown();
		Thread.sleep(1000);
		TodaysActiveTimeclick.click();
		boolean Element = New_Appointment_Popup.isDisplayed();
		validateResults(Element, true);
		NewAppointmentPopupClose.click();
		return this;
	}

//New appointment opening validation by clicking on todays dates past time.
	public Book_Appointment_Page PresentDatePastTimeValiadtionInBP() {
		TodaysPastTimeclick.click();
		String[] Alert = AlertMes.getText().split("P");
		String Element1 = Alert[1];
		validateResults(Element1, ExcelUtils.getTestData("Book_Appointment_Page", "Alerts", 1));
		NewAppointmentPopupClose.click();
		return this;
	}

//New appointment opening validation by clicking on past dates past time.
	public Book_Appointment_Page PastDatePastTimeValiadtionInBP() throws Throwable {
		Actions a = new Actions(driver);
		a.moveToElement(PastdateAndTimeclick).click().perform();
		Thread.sleep(1000);
		boolean element = isElementPresent(New_Appointment_Popup);
		validateResults(element, false);
		return this;
	}

//New appointment opening validation by clicking on future and time dates.
	public Book_Appointment_Page futureDateCurrentTimeValiadtionInBP() {
		fururedateAndTimeclick.click();
		boolean Element = New_Appointment_Popup.isDisplayed();
		validateResults(Element, true);
		NewAppointmentPopupClose.click();
		return this;
	}

	public static boolean isElementPresent(WebElement element) {
		try {
			if (element.isDisplayed())
				return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	public Book_Appointment_Page AllLabelsVerification() throws Throwable {

		Thread.sleep(5000);
		getActualLabels("Book_Appointment_Page", "BA All Element", 13);
		getDisplayedLabelsFrom_BA();
		validateResults(ActualLabels, DisplayedLabelsFromBookAppointment);
		boolean Element = CalendarIcon.isDisplayed();
		validateResults(Element, true);
		boolean Element1 = TodayButton.isDisplayed();
		validateResults(Element1, true);
		boolean Element2 = BackwardDatesArrow.isDisplayed();
		validateResults(Element2, true);
		boolean Element3 = Forward_Dates_Arrow.isDisplayed();
		validateResults(Element3, true);
		boolean Element4 = Search_Icon.isDisplayed();
		validateResults(Element4, true);
		boolean Element5 = Page_View_DropDown.isDisplayed();
		validateResults(Element5, true);
		boolean Element6 = Page_View_DropDown_Icon.isDisplayed();
		validateResults(Element6, true);
		boolean Element7 = Appointment_Button.isDisplayed();
		validateResults(Element7, true);
		boolean Element8 = Add_New_Button.isDisplayed();
		validateResults(Element8, true);
		Search_Icon.click();
		boolean Element9 = Main_Search_Bar.isDisplayed();
		validateResults(Element9, true);
		Page_View_DropDown.click();
		Thread.sleep(1000);
		boolean Element10 = PV_DropDown_Options.isDisplayed();
		validateResults(Element10, true);
		boolean Element11 = Past_Dates.isDisplayed();
		validateResults(Element11, true);
		boolean Element12 = Present_Dates.isDisplayed();
		validateResults(Element12, true);
		boolean Element13 = future_Dates.isDisplayed();
		validateResults(Element13, true);
		boolean Element14 = TodayspresentTimeclick.isDisplayed();
		validateResults(Element14, true);
		String Element15 = GetCurrentMonth();
		String Element16 = Dispalyed_Month_Year.getText();
		// validateResults(Element15, Element16);
		return this;
	}

	protected static ArrayList<String> DisplayedLabelsListfromBookAppointPage = null;
	protected static Map<String, ArrayList<String>> DisplayedLabelsFromBookAppointment = new HashMap<String, ArrayList<String>>();

	public Book_Appointment_Page getDisplayedLabelsFrom_BA() {

		DisplayedLabelsListfromBookAppointPage = new ArrayList<String>();
		DisplayedLabelsListfromBookAppointPage.add(getWebDriver().getTitle());
		DisplayedLabelsListfromBookAppointPage.add(CalendarLabel.getText());
		DisplayedLabelsListfromBookAppointPage.add(TodayButtonLable.getText());
		DisplayedLabelsListfromBookAppointPage.add(Page_view_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Working_Staff_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Appointment_Button.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Sun_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Mon_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Tue_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Wed_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Thu_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Fri_Label.getText());
		DisplayedLabelsListfromBookAppointPage.add(Day_Sat_Label.getText());

		DisplayedLabelsFromBookAppointment.put("Labels", DisplayedLabelsListfromBookAppointPage);
		return this;

	}

	public Book_Appointment_Page NAallLabelsValidationClickOnCalender() throws Throwable {
		fururedateAndTimeclick.click();
		getActualLabels("Book_Appointment_Page", "NA Popup All Element", 12);
		getDisplayedLabelsFrom_BA_NA_Popup();
		validateResults(ActualLabels, DisplayedLabelsFromNewAppointmentPopup);

		Boolean Element1 = NASecrch.isDisplayed();
		validateResults(Element1, true);
		Boolean Element2 = NAClockIcon.isDisplayed();
		validateResults(Element2, true);
		Boolean Element3 = NACalenderIcon.isDisplayed();
		validateResults(Element3, true);
		NADatefield.click();
		Thread.sleep(5000);
		Boolean Element4 = NACalenderpopup.isDisplayed();
		validateResults(Element4, true);
		Boolean Element5 = NADatefield.isDisplayed();
		validateResults(Element5, true);
		Boolean Element6 = NAStartTime.isDisplayed();
		validateResults(Element6, true);
		Boolean Element7 = NAEndTime.isDisplayed();
		validateResults(Element7, true);
		Boolean Element8 = ServiceAdvisorIcon.isDisplayed();
		validateResults(Element8, true);
		Boolean Element9 = VehicleIcon.isDisplayed();
		validateResults(Element9, true);
		Boolean Element10 = EmailIcon.isDisplayed();
		validateResults(Element10, true);
		Boolean Element11 = MobileIcon.isDisplayed();
		validateResults(Element11, true);
		Boolean Element12 = ServiceIcon.isDisplayed();
		validateResults(Element12, true);
		Boolean Element13 = BayIcon.isDisplayed();
		validateResults(Element13, true);
		Boolean Element14 = BookButton.isDisplayed();
		validateResults(Element14, true);
		Boolean Element15 = CustomerIcon.isDisplayed();
		validateResults(Element15, true);
		Boolean Element16 = SAdropdownicon.isDisplayed();
		validateResults(Element16, true);
		Boolean Element18 = Statedropdownicon.isDisplayed();
		validateResults(Element18, true);
		NewAppointmentClose.click();
		return this;

	}

	protected static ArrayList<String> DisplayedLabelsListfromNewAppointPopup = null;
	protected static Map<String, ArrayList<String>> DisplayedLabelsFromNewAppointmentPopup = new HashMap<String, ArrayList<String>>();

	public Book_Appointment_Page getDisplayedLabelsFrom_BA_NA_Popup() {

		DisplayedLabelsListfromNewAppointPopup = new ArrayList<String>();
		DisplayedLabelsListfromNewAppointPopup.add(NALabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(NAIndividual.getText());
		DisplayedLabelsListfromNewAppointPopup.add(NACorporate.getText());
		DisplayedLabelsListfromNewAppointPopup.add(CustomerLabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(VehicleLabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(EmailLabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(MobileLable.getText());
		DisplayedLabelsListfromNewAppointPopup.add(serviceLabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(ServiceAdvisorLabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(BayLabel.getText());
		NACorporate.click();
		DisplayedLabelsListfromNewAppointPopup.add(CorporateNamelabel.getText());
		DisplayedLabelsListfromNewAppointPopup.add(BookButton.getText());
		DisplayedLabelsFromNewAppointmentPopup.put("Labels", DisplayedLabelsListfromNewAppointPopup);
		return this;

	}

//Individual Customer appointment creation validation 
	String CustomerName;

	public void appointmentCreation() throws Throwable {
		CustomerInput.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
		CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value");
		System.out.println(CustomerName);
		VehicleNoFirst.sendKeys(autoGenerateNumber(2, "123456789"));
		VehicleNoSecond.sendKeys(getAutoGenerateOnlyStringCapital(3));
		VehicleNoLast.sendKeys(autoGenerateNumber(4, "123456789"));
		EmailInput.sendKeys(getAutoGenerateOnlyString(10) + "@gmail.com");
		Mobileinput.sendKeys(autoGenerateMobileNumber(10));
		serviceInput.sendKeys(getAutoGenerateOnlyStringCapital(10));
		GetActualDataFromNA();
		GetDisplayedDataFromNA();
		Thread.sleep(3000);
		BookButton.click();
		
	}

	@FindBy(xpath = "(//div[@class=\"edit_delete_btn\"]//button)[1]")
	WebElement EditIcon;

	public Book_Appointment_Page NPBookingClickOnCalenderIndividual() throws Throwable {
		String Value = autoGenerateNumber(1, "123456789");
		System.out.println(Value);
		driver.findElement(By.xpath("(//div[@class='v-calendar-daily__day v-future']/div)[" + Value + "]")).click();
		appointmentCreation();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		GetDisplayedCreatedAppontmentData();
		assertTrue(BP_EditPopupDetails.equals(Created_BP_EditPopupDetails));
		EditIcon.click();
		GetActualCreatedAppontmentData();
		assertTrue(BookAppointmentDetails.equals(BookAppointmentOpenDetails));
		NewAppointmentClose.click();

		return this;
	}

	public void selectStartAndEndTime() throws InterruptedException {
		NAStartTime.click();
		String Value = autoGenerateNumber(1, "1234");
		String Value1 = autoGenerateNumber(1, "456");
		driver.findElement(By.xpath("((//ul[@class='hours'])[1]//li)[" + Value + "]")).click();
		driver.findElement(By.xpath("((//ul[@class='minutes'])[1]/li)[2]")).click();
		driver.findElement(By.xpath("(//ul//li[contains(text(), 'PM')])[1]")).click();
		NAStartTime.click();
		NAEndTime.click();
		driver.findElement(By.xpath("((//ul[@class='hours'])[2]//li)[" + Value1 + "]")).click();
		driver.findElement(By.xpath("((//ul[@class='minutes'])[2]/li)[2]")).click();
		driver.findElement(By.xpath("(//ul//li[contains(text(), 'PM')])[2]")).click();
		NAEndTime.click();

	}

	public Book_Appointment_Page NPBookingClickOnAddNewIndividual() throws Throwable {
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		appointmentCreation();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		GetDisplayedCreatedAppontmentData();
		assertTrue(BP_EditPopupDetails.equals(Created_BP_EditPopupDetails));
		EditIcon.click();
		GetActualCreatedAppontmentData();
		assertTrue(BookAppointmentDetails.equals(BookAppointmentOpenDetails));
		NewAppointmentClose.click();

		return this;
	}

//Corporate Customer appointment  validation 

	public Book_Appointment_Page NPBookingClickOnCalenderCorporate() throws Throwable {
		WebElement elements = driver.findElement(By.xpath("//div[@class='v-calendar-daily__day v-future']"));

		String Value = "1" + autoGenerateNumber(1, "12345");
		System.out.println(Value);
		driver.findElement(By.xpath("(//div[@class='v-calendar-daily__day v-future']/div)[" + Value + "]")).click();
		NACorporate.click();
		appointmentCreation();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		GetDisplayedCreatedAppontmentData();
		assertTrue(BP_EditPopupDetails.equals(Created_BP_EditPopupDetails));
		EditIcon.click();
		GetActualCreatedAppontmentData();
		assertTrue(BookAppointmentDetails.equals(BookAppointmentOpenDetails));
		NewAppointmentClose.click();

		return this;
	}

	public Book_Appointment_Page NPBookingClickOnAddNewCorporate() throws Throwable {
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		NACorporate.click();
		appointmentCreation();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		GetDisplayedCreatedAppontmentData();
		assertTrue(BP_EditPopupDetails.equals(Created_BP_EditPopupDetails));
		EditIcon.click();
		GetActualCreatedAppontmentData();
		assertTrue(BookAppointmentDetails.equals(BookAppointmentOpenDetails));
		NewAppointmentClose.click();

		return this;
	}

//New Appointment Provided Details Validation HasMaps

	public static Map<String, String> BookAppointmentDetails = new HashMap<String, String>();

	public Book_Appointment_Page GetActualDataFromNA() {

		BookAppointmentDetails.put("CustomerName",
				getValue("xpath", "//input[@class='form-control text_capitalized']", "value"));
		BookAppointmentDetails.put("StartVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[1]", "value"));
		BookAppointmentDetails.put("SecondVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[2]", "value"));
		BookAppointmentDetails.put("LastVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[3]", "value"));
		BookAppointmentDetails.put("Email", getValue("xpath", "(//input[@class='form-control'])[2]", "value"));
		BookAppointmentDetails.put("Mobile", getValue("xpath", "//input[@class='form-control pad_l60']", "value"));
		BookAppointmentDetails.put("Services", getValue("xpath", "(//input[@class='form-control'])[3]", "value"));
		System.out.println(BookAppointmentDetails);
		return this;
	}

	public static Map<String, String> BookAppointmentOpenDetails = new HashMap<String, String>();

	public Book_Appointment_Page GetActualCreatedAppontmentData() {
		BookAppointmentOpenDetails.put("CustomerName",
				getValue("xpath", "//input[@class='form-control text_capitalized']", "value"));
		BookAppointmentOpenDetails.put("StartVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[1]", "value"));
		BookAppointmentOpenDetails.put("SecondVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[2]", "value"));
		BookAppointmentOpenDetails.put("LastVehicle",
				getValue("xpath", "(//input[@class='form-control input_custom'])[3]", "value"));
		BookAppointmentOpenDetails.put("Email", getValue("xpath", "(//input[@class='form-control'])[2]", "value"));
		BookAppointmentOpenDetails.put("Mobile", getValue("xpath", "//input[@class='form-control pad_l60']", "value"));
		BookAppointmentOpenDetails.put("Services", getValue("xpath", "(//input[@class='form-control'])[3]", "value"));
		System.out.println(BookAppointmentOpenDetails);
		return this;

	}

	public static Map<String, String> BP_EditPopupDetails = new HashMap<String, String>();

	public Book_Appointment_Page GetDisplayedDataFromNA() {

		String Vehicle1 = getValue("xpath", "(//input[@class='form-control input_custom'])[1]", "value");
		String Vehicle2 = getValue("xpath", "(//input[@class='form-control input_custom'])[2]", "value");
		String Vehicle3 = getValue("xpath", "(//input[@class='form-control input_custom'])[3]", "value");
		String StateCode = VehicleState.getText();
		String Mobile = getValue("xpath", "//input[@class='form-control pad_l60']", "value");
		System.out.println(StateCode);
		BP_EditPopupDetails.put("VehicleAndMobile", Mobile + " | " + StateCode + Vehicle1 + Vehicle2 + Vehicle3);
		BP_EditPopupDetails.put("Services", getValue("xpath", "(//input[@class='form-control'])[3]", "value"));
		System.out.println(BP_EditPopupDetails);
		return this;

	}

	@FindBy(xpath = "//div[@class='event_name']/small")
	WebElement Mobile;
	@FindBy(xpath = "(//div[@class='col-sm-7'])[4]")
	WebElement Serv;
	@FindBy(xpath = "//div//select[@class='select_colored']")
	WebElement Appointment_status;

	public static Map<String, String> Created_BP_EditPopupDetails = new HashMap<String, String>();

	public Book_Appointment_Page GetDisplayedCreatedAppontmentData() {
		String VM = Mobile.getText();
		String Servic = Serv.getText();
		Created_BP_EditPopupDetails.put("VehicleAndMobile", VM);
		Created_BP_EditPopupDetails.put("Services", Servic);
		System.out.println(Created_BP_EditPopupDetails);
		return this;

	}

//Month view Appointment creations
	@FindBy(xpath = "//div[@class='v-calendar-weekly__day v-future']")
	WebElement monthviewCal;
	@FindBy(xpath = "(//div[@class='v-list-item v-list-item--link theme--light'])[3]")
	WebElement monthview_selection;

	public Book_Appointment_Page Appointment_creation_MonthToDayView() throws Throwable {
		Page_View_DropDown.click();
		monthview_selection.click();
		String Value = autoGenerateNumber(1, "123456789");
		int Value1 = Integer.parseInt(Value);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='v-calendar-weekly__day v-future']"));
		List<WebElement> elements1 = driver
				.findElements(By.xpath("//div[@class='v-calendar-weekly__day v-future v-outside']"));
		int elementsCount = elements.size();
		int elementsCount1 = elements1.size();
		System.out.println(elementsCount);
		System.out.println(elementsCount);
		System.out.println(Value1);

		Thread.sleep(3000);
		if (elementsCount >= 2) {
			if (elementsCount >= Value1) {
				driver.findElement(By.xpath("(//div[@class='v-calendar-weekly__day v-future'])[" + Value1 + "]"))
						.click();
				scrollDown();
				scrollDown();

			} else {
				int value2 = elementsCount;
	driver.findElement(By.xpath("(//div[@class='v-calendar-weekly__day v-future'])[" + value2 + "]")).click();
				scrollDown();
				scrollDown();
			}
		} else {
			if (elementsCount1 >= Value1) {
				driver.findElement(
						By.xpath("(//div[@class='v-calendar-weekly__day v-future v-outside'])[" + Value1 + "]"))
						.click();
				scrollDown();
				scrollDown();
			} else {
				int value2 = elementsCount1;
				driver.findElement(
						By.xpath("(//div[@class='v-calendar-weekly__day v-future v-outside'])[" + value2 + "]"))
						.click();
				scrollDown();
				scrollDown();
			}
		}
		String Value11 = autoGenerateNumber(1, "123456789");
		System.out.println(Value11);
		driver.findElement(By.xpath("(//div[@class='v-calendar-daily__day v-future']/div)[" + Value11 + "]")).click();
		appointmentCreation();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		GetDisplayedCreatedAppontmentData();
		assertTrue(BP_EditPopupDetails.equals(Created_BP_EditPopupDetails));
		EditIcon.click();
		GetActualCreatedAppontmentData();
		assertTrue(BookAppointmentDetails.equals(BookAppointmentOpenDetails));
		NewAppointmentClose.click();

		return this;
	}

	@FindBy(xpath = "(//div[@class='v-event-draggable']/strong)[1]")
	WebElement OpeningExistingAppointment;
	@FindBy(xpath = "//select[@class='select_colored']")
	WebElement Statusbox;
	@FindBy(xpath = "//select[@class='select_colored']/option[1]")
	WebElement ArrivedOption;
	@FindBy(id = "select2-stateCode-container")
	WebElement VehicleStateJC;
	@FindBy(xpath = "//input[@id='vehicleDetail']")
	WebElement VehicleName;
	@FindBy(id = "year")
	WebElement VehicleYear;
	@FindBy(xpath = "(//div[@class='col-md-4 col-xs-12 float-label-control date_pi datepicker_set1'])[1]//label")
	WebElement Estimationdate;
	@FindBy(xpath = "//button[contains(text(), 'Prepare Estimation Now')]")
	WebElement PrepareEstimation;
	@FindBy(id = "odometer")
	WebElement Odometer;

	public Book_Appointment_Page BookAppointment_through_jobcardCreation() throws Throwable {

		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		appointmentCreation();
		refresh();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		EditIcon.click();
		GetDisplayedDataFromNAValidation();
		refresh();
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		Statusbox.click();
		ArrivedOption.click();
		Thread.sleep(2000);
		GetDisplayedDataFromJCValidation();
		assertTrue(BP_DetailsReflectionIn_NA_Validation.equals(BP_DetailsReflectionIn_Jc_Validation)); // VehicleName.click();
		VehicleName.sendKeys("toyota");
		String Value0 = autoGenerateNumber(1, "123456789");
		driver.findElement(By.xpath("(//a[contains(@id,'ui')])[" + Value0 + "]")).click();
		VehicleYear.sendKeys("20");
		driver.findElement(By.xpath("//ul[@id='ui-id-478']//li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu "
				+ "ui-widget ui-widget-content ui-corner-all" + " autoclose_pop'][2]/li[1]//a")).click();
		String Value1 = autoGenerateNumber(3, "123456789");
		Odometer.sendKeys(Value1);
		PrepareEstimation.click();
		Navigation("serviceticket/bookAppointment");
		
		return this;
	}

	public static Map<String, String> BP_DetailsReflectionIn_NA_Validation = new HashMap<String, String>();

	public Book_Appointment_Page GetDisplayedDataFromNAValidation() {

		String Vehicle1 = getValue("xpath", "(//input[@class='form-control input_custom'])[1]", "value");
		String Vehicle2 = getValue("xpath", "(//input[@class='form-control input_custom'])[2]", "value");
		String Vehicle3 = getValue("xpath", "(//input[@class='form-control input_custom'])[3]", "value");
		String StateCode = VehicleState.getText();
		String Mobile = getValue("xpath", "//input[@class='form-control pad_l60']", "value");
		String CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value");
		BP_DetailsReflectionIn_NA_Validation.put("CustomerName", CustomerName);
		BP_DetailsReflectionIn_NA_Validation.put("Vehicle1", Vehicle1);
		BP_DetailsReflectionIn_NA_Validation.put("Vehicle2", Vehicle2);
		BP_DetailsReflectionIn_NA_Validation.put("Vehicle3", Vehicle3);
		BP_DetailsReflectionIn_NA_Validation.put("StateCode", StateCode);
		BP_DetailsReflectionIn_NA_Validation.put("Mobile", Mobile);
		System.out.println(BP_DetailsReflectionIn_NA_Validation);
		return this;

	}

	public static Map<String, String> BP_DetailsReflectionIn_Jc_Validation = new HashMap<String, String>();

	public Book_Appointment_Page GetDisplayedDataFromJCValidation() {

		String Vehicle1 = getValue("id", "reg_2", "value");
		String Vehicle2 = getValue("id", "reg_3", "value");
		String Vehicle3 = getValue("id", "reg_4", "value");
		String StateCode = VehicleStateJC.getText();
		String Mobile = getValue("id", "mobile_no", "value");
		String CustomerName = getValue("id", "customer_name", "value");
		BP_DetailsReflectionIn_Jc_Validation.put("CustomerName", CustomerName);
		BP_DetailsReflectionIn_Jc_Validation.put("Vehicle1", Vehicle1);
		BP_DetailsReflectionIn_Jc_Validation.put("Vehicle2", Vehicle2);
		BP_DetailsReflectionIn_Jc_Validation.put("Vehicle3", Vehicle3);
		BP_DetailsReflectionIn_Jc_Validation.put("StateCode", StateCode);
		BP_DetailsReflectionIn_Jc_Validation.put("Mobile", Mobile);
		System.out.println(BP_DetailsReflectionIn_Jc_Validation);
		return this;

	}

	String Vehicle1;
	String Vehicle2;
	String Vehicle3;

	public void Repeated_appointment_Creation() throws Throwable {
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		CustomerInput.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
		CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value");
		System.out.println(CustomerName);
		VehicleNoFirst.sendKeys(autoGenerateNumber(2, "123456789"));
		VehicleNoSecond.sendKeys(getAutoGenerateOnlyStringCapital(3));
		VehicleNoLast.sendKeys(autoGenerateNumber(4, "123456789"));
		EmailInput.sendKeys(getAutoGenerateOnlyString(10) + "@gmail.com");
		Mobileinput.sendKeys(autoGenerateMobileNumber(10));
		serviceInput.sendKeys(getAutoGenerateOnlyStringCapital(10));
		Vehicle1 = getValue("xpath", "(//input[@class='form-control input_custom'])[1]", "value");
		Vehicle2 = getValue("xpath", "(//input[@class='form-control input_custom'])[2]", "value");
		Vehicle3 = getValue("xpath", "(//input[@class='form-control input_custom'])[3]", "value");
Thread.sleep(2000);
		BookButton.click();
	}

	public void Jobcard_Creation_Throw_BP() throws Throwable {
		driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
		Statusbox.click();
		ArrivedOption.click();
		Thread.sleep(2000);
		VehicleName.sendKeys("toyota");
		String Value0 = autoGenerateNumber(1, "123456789");
		driver.findElement(By.xpath("(//a[contains(@id,'ui')])[" + Value0 + "]")).click();
		VehicleYear.sendKeys("20");
		driver.findElement(By.xpath("//ul[@id='ui-id-478']//li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu "
				+ "ui-widget ui-widget-content ui-corner-all" + " autoclose_pop'][2]/li[1]//a")).click();
		String Value1 = autoGenerateNumber(3, "123456789");
		Odometer.sendKeys(Value1);
		PrepareEstimation.click();

	}

	public Book_Appointment_Page Duplicate_Appointment_Valiadtion() throws Throwable {

		Repeated_appointment_Creation();
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		CustomerInput.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
		CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value");
		System.out.println(CustomerName);
		VehicleNoFirst.sendKeys(Vehicle1);
		VehicleNoSecond.sendKeys(Vehicle2);
		VehicleNoLast.sendKeys(Vehicle3);
		EmailInput.click();
		String[] Duplicate_Alert = AlertMes.getText().split("D");
		System.out.println(Duplicate_Alert);
		validateResults(ExcelUtils.getTestData("Book_Appointment_Page", "Alerts", 2), Duplicate_Alert[1]);
		return this;
	}

	@FindBy(xpath = "//input[@type='search']")
	WebElement SearchBar;
	@FindBy(xpath = "//tbody//tr[1]/td[2]")
	WebElement Jobcard_open;
	@FindBy(id = "statusJobDone")
	WebElement JobDone;
	
	public Book_Appointment_Page Based_On_Jobcard_Status_Appointment_Creation() throws Throwable {

		Repeated_appointment_Creation();
		Jobcard_Creation_Throw_BP();
		String[] JobcardNo = getValue("xpath", "(//div[@class='header_inputs']//input)[1]", "value").split("JC: ");

		String Alert_Actual = " Job Card ( JC no. " + JobcardNo[1] + " ) is already open for this "
				+ "vehicle. Close this Job Card in order to open another Job Card for the same vehicle";
		Navigation("serviceticket/bookAppointment");
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		CustomerInput.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(10));
		CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value");
		System.out.println(CustomerName);
		VehicleNoFirst.sendKeys(Vehicle1);
		VehicleNoSecond.sendKeys(Vehicle2);
		VehicleNoLast.sendKeys(Vehicle3);
		EmailInput.click();
		String[] alertDisplayed = AlertMes.getText().split("A");
		System.out.println(alertDisplayed);
		validateResults(Alert_Actual, alertDisplayed[1]);

		Navigation("workshop/serviceTickets");
		Thread.sleep(2000);
		SearchBar.sendKeys(JobcardNo[1]);
		Actions a = new Actions(driver);
		a.moveToElement(Jobcard_open).click().perform();
		Thread.sleep(1000);
		Add_stranded_parts_In_Estimation_Page(3);
		Jobcard_Inward();
		Jobcard_Issues();
		JobDone.click();
		Navigation("serviceticket/bookAppointment");
		Add_New_Button.click();
		NADatefield.click();
		Thread.sleep(1000);
		dateSelection();
		selectStartAndEndTime();
		VehicleNoFirst.sendKeys(Vehicle1);
		VehicleNoSecond.sendKeys(Vehicle2);
		VehicleNoLast.sendKeys(Vehicle3);
		EmailInput.click();
		Thread.sleep(2000);
		BookButton.click();
		return this;
	}
	
	@FindBy(xpath = "(//div[@class=\"edit_delete_btn\"]//button)[2]")
	WebElement DeleteIcon;
	
	public Book_Appointment_Page BA_Page_Delete_And_Edit_Option_Validation() throws Throwable {
		
	Repeated_appointment_Creation();
	driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
	DeleteIcon.click();
	Add_New_Button.click();
	NADatefield.click();
	Thread.sleep(1000);
	dateSelection();
	selectStartAndEndTime();
	CustomerInput.sendKeys(getAutoGenerateOnlyStringCapital(1)+getAutoGenerateOnlyString(7));
	CustomerName = getValue("xpath", "//input[@class='form-control text_capitalized']", "value"); 
	System.out.println(CustomerName);
	VehicleNoFirst.sendKeys(Vehicle1);
	VehicleNoSecond.sendKeys(Vehicle2);
	VehicleNoLast.sendKeys(Vehicle3);
	EmailInput.sendKeys(getAutoGenerateOnlyString(10) + "@gmail.com");
	Mobileinput.sendKeys(autoGenerateMobileNumber(10));
	serviceInput.sendKeys(getAutoGenerateOnlyStringCapital(10));
	Thread.sleep(2000);
	BookButton.click();	
	driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
    boolean Delete=	DeleteIcon.isEnabled();
	boolean Edit =EditIcon.isEnabled();
	validateResults(Delete, true);
	validateResults(Edit, true);
	refresh();
	Jobcard_Creation_Throw_BP();
	Navigation("serviceticket/bookAppointment");
	driver.findElement(By.xpath("//strong[contains(text(), '" + CustomerName + "')]")).click();
    boolean Delete1=DeleteIcon.isEnabled();
	boolean Edit1 =EditIcon.isEnabled();
	validateResults(Delete1, false);
	validateResults(Edit1, false);
	return this;

	}
	@FindBy(xpath = "//div[contains(text(),'Ready For Delivery')]")
	WebElement RFD_Status_bar;
	@FindBy(xpath = "//div[@class='search_dropdown']")
	WebElement Search_DropDown;
	public Book_Appointment_Page AB_For_Existing_Customer_Through_Search() throws Throwable {
		Navigation("workshop/serviceTickets");
		RFD_Status_bar.click();
	String VehicleNo = Jobcard_open.getText();
	Navigation("serviceticket/bookAppointment");
	Search_Icon.click();
	SearchBar.sendKeys(VehicleNo);
	boolean SerchResult = Search_DropDown.isDisplayed();
	validateResults(SerchResult, true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		return this;	
	}
		
	
}
