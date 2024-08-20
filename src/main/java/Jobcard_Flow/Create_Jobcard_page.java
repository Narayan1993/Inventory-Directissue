package Jobcard_Flow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import controllers.BaseMethod;
import utils.ExcelUtils;

public class Create_Jobcard_page extends BaseMethod {

	Actions a = new Actions(driver);
	protected static ArrayList<String> DisplayedLabelsForCreatedJobcardPage = null;
	protected static Map<String, ArrayList<String>> DisplayedLabelsFromCreatedJobcardPage = new HashMap<String, ArrayList<String>>();

	public Create_Jobcard_page Create_Jobcard_Page_Validation_For_India() throws Throwable {

		Navigation("workshop/serviceTickets");
		DisplayedLabelsListfromCreateJobcardPage = new ArrayList<String>();
		NewJObCard.click();
		PrepareEstimationNow.click();
		DisplayedLabelsListfromCreateJobcardPage.add(AlertMessage.getText());
		EnterVehicleNumber("India"); 
		PrepareEstimationNow.click();
		DisplayedLabelsListfromCreateJobcardPage.add(AlertMessage.getText());
		EnterVehicleDetails();
		PrepareEstimationNow.click();
		DisplayedLabelsListfromCreateJobcardPage.add(AlertMessage.getText());
		a.moveToElement(CorporateNameFieldPlusIcon).click().perform();
		DisplayedLabelsListfromCreateJobcardPage.add(CorGSTlabel.getText());
		a.moveToElement(InsuranceNameFieldPlusIcon).click().perform();
		return this;

	}

	@FindBy(xpath = "//div[@class='job_form_set custmar_details_set']//div[1]//div[3]//label/span")
	private WebElement CorGSTlabel;
	@FindBy(xpath = "//div[@class='panel-body']/div[2]/div//label")
	private WebElement InsGSTlabel;

	public Create_Jobcard_page JObCard_Creation(String JobcardType, String TaxType, String country, String MobileNo)
			throws Throwable {
		Navigation("workshop/serviceTickets");
		NewJObCard.click();
		EnterVehicleNumber(country);
		EnterVehicleDetails();
		selectMMVY();
		Thread.sleep(2000);

		scrollDown();
		scrollDown();
		if (JobcardType == "Normal") {
			AddingCustomerDetails(TaxType, country, MobileNo);
		}
		if (JobcardType == "Corporate") {
			AddingCorporateDetails(TaxType, country, MobileNo);
		}
		if (JobcardType == "Insurance") {
			AddingCustomerDetails(TaxType, country, MobileNo);
			CloseButton.click();
			AddingInsuranceDetails(TaxType, country, MobileNo);
			InsurancePoliceSelection(country, MobileNo);
		}
		if (JobcardType == "Corporate_With_Insurance") {
			AddingCorporateDetails(TaxType, country, MobileNo);
		}

		CloseButton.click();
		Thread.sleep(2000);
		PrepareEstimationNow.click();

		boolean estimation_page = driver.findElement(By.xpath("//a[@class='active']")).isDisplayed();
		validateResults(estimation_page, true);
		return this;
	}

	public Create_Jobcard_page AddingCustomerDetails(String TAXtype, String Country, String MobileNumber)
			throws Exception, Throwable {
		//CustomerNameInput.sendKeys("Siddu");
		//MobileNumberinput.sendKeys("9222222222");
		CustomerNameInput.sendKeys(getAutoGenerateOnlyString(9));
		MobileNumber(MobileNumber, Country, MobileNumberinput);

		a.moveToElement(CustomerDetailsPopupExpand).click().perform();
		DriverName.sendKeys(autoGenerateNumber(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CustomerHouseNo.sendKeys(autoGenerateNumber(4, "123456789"));
		CustomerColony.sendKeys(autoGenerateNumber(8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CustomerCity.sendKeys(autoGenerateNumber(8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CustomerPincode.sendKeys(autoGenerateNumber(6, "56789"));
		StateSelection(TAXtype, "Normal");

		return this;
	}

	public Create_Jobcard_page AddingCorporateDetails(String TAXtype, String Country, String MobileNumber)
			throws Exception, Throwable {
		a.moveToElement(CorporateNameFieldPlusIcon).click().perform();
		CorporateName.sendKeys("CARS 24 AZ");
		// CorporateName.sendKeys(autoGenerateNumber(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CorpCustomerName.sendKeys(autoGenerateNumber(8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		MobileNo.sendKeys("9888888888");
		// MobileNumber(MobileNumber, Country, MobileNo);
		CorpEmailId.sendKeys("Test@gmail.com");
		// CorpEmailId.sendKeys(autoGenerateNumber(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ") +
		// "@Gmail.com");
		CorpDriverName.sendKeys(autoGenerateNumber(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		corpHouseNo.sendKeys(autoGenerateNumber(4, "123456789"));
		CorpColony.sendKeys(autoGenerateNumber(8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CorpCity.sendKeys(autoGenerateNumber(8, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		CorpPincode.sendKeys(autoGenerateNumber(6, "56789"));
		StateSelection(TAXtype, "Corporate");
		Thread.sleep(2000);
		String CorStateCode = driver.findElement(By.xpath("//span[@id='select2-stateCode_corperate-container']"))
				.getText();
		String CorGSTNumber = CorStateCode + "FDFREF4544TG4445";
		System.out.println(CorGSTNumber);
		typeWithDelay(500, "id", "gstnno", CorGSTNumber);
		// GSTNumberGeneration("Corporate", Country);
		return this;
	}

	public Create_Jobcard_page AddingInsuranceDetails(String TAXtype, String Country, String MobileNumber)
			throws Exception, Throwable {
		scrollDown();
		scrollDown();
		Thread.sleep(2000);
		a.moveToElement(InsuranceNameFieldPlusIcon).click().perform();
		Thread.sleep(3000);
		a.moveToElement(InsuranceCompany).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='select2-insuranceCompany-results']/li[3]")).click();
		// driver.findElement(By.xpath("//ul[@id='select2-insuranceCompany-results']/li["
		// + randomNo + "]")).click();
		Thread.sleep(2000);
		InsContantNo.clear();
		MobileNumber(MobileNumber, Country, InsContantNo);
		InsContantName.clear();
		InsContantName.sendKeys(autoGenerateNumber(9, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		InsMobileNo.clear();
		MobileNumber(MobileNumber, Country, InsMobileNo);
		InsHouseNo.clear();
		InsHouseNo.sendKeys(autoGenerateNumber(3, "123456789"));
		InsColony.clear();
		InsColony.sendKeys(autoGenerateNumber(11, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		InsCity.clear();
		InsCity.sendKeys(autoGenerateNumber(11, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		InsPincode.clear();
		InsPincode.sendKeys(autoGenerateNumber(6, "56789"));
		StateSelection(TAXtype, "Insurance");
		Thread.sleep(2000);
		GSTNumberGeneration("Insurance", Country);
		return this;
	}

	public Create_Jobcard_page InsurancePoliceSelection(String Country, String MobileNumber) throws Throwable {

		InsuranceClimTAb.click();
		Thread.sleep(2000);
		a.moveToElement(InsuranceClimOption).click().perform();
		PolicyNo.sendKeys(autoGenerateNumber(7, "123456798QWASEDCXZVGTRFUNKJKLOUUTGB"));
		LicenceNo.sendKeys(autoGenerateNumber(7, "123456789QWASEDCXZVGTRFUNKJKLOUUTGB"));
		SurveyorName.sendKeys(autoGenerateNumber(7, "QWASEDCXZVGTRFUNKJKLOUUTGB"));
		MobileNumber(MobileNumber, Country, SurveyorMobileNo);
		SurveyorEmail.sendKeys(autoGenerateNumber(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ") + "@Gmail.com");
		IDVAmount.sendKeys(autoGenerateNumber(4, "123456789"));
		ClaimNo.sendKeys(autoGenerateNumber(3, "123456789"));
		LicenceExpiryDate.click();
		dateselection("Policy Expiry Date");
		AceidentDate.click();
		dateselection("Others");
		return this;
	}

	public Create_Jobcard_page EnterVehicleNumber(String loginCountry) {
		if (loginCountry.equalsIgnoreCase("India")) {
			Vehicle1.sendKeys(autoGenerateNumber(2, "123456789"));
			Vehicle2.sendKeys(getAutoGenerateOnlyString(3));
			Vehicle3.sendKeys(autoGenerateNumber(4, "123456789"));
		} else if (loginCountry.equalsIgnoreCase("SaudiArabia")) {
			InterNationalVehicle.sendKeys(
					autoGenerateNumber(4, "123456789") + (autoGenerateNumber(3, "QWASEDCXZVGTRFUNKJKLOUUTGB")));
		} else {
			InterNationalVehicle.sendKeys(autoGenerateNumber(7, "1234QWASEDCXZVGTRFUNKJKLOUUTGB"));
		}
		return this;
	}

	public Create_Jobcard_page EnterVehicleDetails() throws Throwable {
		OdometerInput.sendKeys((autoGenerateNumber(2, "123456789")));
		VIN_Input.sendKeys(autoGenerateNumber(17, "1234QWASEDCXZVGTRFUNKJKLOUUTGB"));
		Engine_NumInput.sendKeys(autoGenerateNumber(7, "1234QWASEDCXZVGTRFUNKJKLOUUTGB"));
		return this;
	}

	public Create_Jobcard_page selectMMVY() throws Exception, Throwable {
		String Value0 = autoGenerateNumber(1, "123456");
		VehicleSearch.sendKeys("AT");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(@id,'ui')])[" + Value0 + "]")).click();
		driver.findElement(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all autoclose_pop']//li[2]"))
				.click();
		return this;
	}

	public Create_Jobcard_page MobileNumber(String MobileNumber, String Country, WebElement CustomerType) {

		if (Country == "India") {
			CustomerType.sendKeys(autoGenerateMobileNumber(1) + autoGenerateNumber(9, "123456789"));
		} else {
			CustomerType.sendKeys(MobileNumber);
		}
		return this;

	}

	public Create_Jobcard_page StateSelection(String TAXtype, String CustomerType) throws Throwable, Throwable {
		String State = getValue("id", "stateID", "value");
		if (TAXtype == "GST") {
			if (CustomerType == "Normal") {
				CustomerState.clear();
				CustomerState.sendKeys(State);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@id='statesDivs']//ul/li/a)[1]")).click();
			}
			if (CustomerType == "Corporate") {
				CorpState.clear();
				CorpState.sendKeys(State);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='statesDiv']//ul/li/a")).click();
			}
			if (CustomerType == "Insurance") {
				InsState.clear();
				InsState.sendKeys(State);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='state_Insurance_']//li")).click();
			}

		}
		if (TAXtype == "VAT") {
			if (CustomerType == "Normal") {
				CustomerState.clear();
				CustomerState.sendKeys("KA");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@id='statesDivs']//ul/li/a)[1]")).click();
			}
			if (CustomerType == "Corporate") {
				CorpState.clear();
				CorpState.sendKeys("KA");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='statesDiv']//ul/li/a")).click();
			}
			if (CustomerType == "Insurance") {
				InsState.clear();
				InsState.sendKeys("KA");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='state_Insurance_']//li[1]")).click();
			}

		}
		Random randomGenerator = new Random(); 
		int StateNo = randomGenerator.nextInt(27);
		if (TAXtype == "IGST") {
			if (CustomerType == "Normal") {
				CustomerState.clear(); 
				CustomerState.sendKeys(ExcelUtils.getTestData("Create_Jobcard_Page", "INDIAN States", StateNo));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='statesDivs']//ul/li/a")).click();
			}
			if (CustomerType == "Corporate") {
				CorpState.clear();
				CorpState.sendKeys(ExcelUtils.getTestData("Create_Jobcard_Page", "INDIAN States", StateNo));
				Thread.sleep(2000); 
				driver.findElement(By.xpath("//div[@id='statesDiv']//ul/li/a")).click();
			}
			if (CustomerType == "Insurance") {
				InsState.clear();
				InsState.sendKeys(ExcelUtils.getTestData("Create_Jobcard_Page", "INDIAN States", StateNo));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='state_Insurance_']//li[1]")).click();
			}
		}
		return this;
	}

	public Create_Jobcard_page GSTNumberGeneration(String JobcardType, String country) throws Throwable, Throwable {
		String Numbers = autoGenerateNumber(2, "123456789");
		String Char = autoGenerateNumber(3, "QWASEDCXZVGTRFUNKJKLOUUTGB");
		if (country == "Tanzania") {
			if (JobcardType == "Corporate") {

				String CorGSTNumber = "976543546";
				System.out.println(CorGSTNumber);
				typeWithDelay(500, "id", "gstnno", CorGSTNumber);
			}
			if (JobcardType == "Insurance") {
				String InsGSTNumber = "976543546";
				System.out.println(InsGSTNumber);
				typeWithDelay(500, "id", "gstNo_insurance", InsGSTNumber);
			}
		} else {
			if (JobcardType == "Corporate") {
				String CorStateCode = driver
						.findElement(By.xpath("//span[@id='select2-stateCode_corperate-container']")).getText();
				String CorGSTNumber = CorStateCode + Char + Char + Numbers + Numbers + Char + Numbers + Char;
				System.out.println(CorGSTNumber);
				typeWithDelay(500, "id", "gstnno", CorGSTNumber);
			}
			if (JobcardType == "Insurance") {

				String InsStateCode = driver
						.findElement(By.xpath("//span[@id='select2-stateCode_Insurance-container']")).getText();
				String InsGSTNumber = InsStateCode + Char + Char + Numbers + Numbers + Char + Numbers + Char;
				System.out.println(InsGSTNumber);
				typeWithDelay(500, "id", "gstNo_insurance", InsGSTNumber);
			}
		}
		return this;

	}

	public Create_Jobcard_page JC_VehicleDetailsSetionLabelValidation() throws Throwable {

		Navigation("serviceticket/create");
		//getActualLabels("Create_Jobcard_Page", "All_Labels", 26);
		getDisplayedLabelsFromCreateJobcard();
		//System.out.println(ActualLabels);
		System.out.println(DisplayedLabelsFromCreateJobcardPage);
		//validateResults(ActualLabels, DisplayedLabelsFromCreateJobcardPage);
		String Displayed_W_Name = WorkshopNameAndLocation.getText();
		String Actual_W_Name = WorkshopNameAndLocation.getText();
		validateResults(Displayed_W_Name, Actual_W_Name);
		boolean JC_Icon = JobcardIcon.isDisplayed();
		validateResults(JC_Icon, true);
		boolean JC_Icon_Plus = JobcardPlusIcon.isDisplayed();
		validateResults(JC_Icon_Plus, true);
		boolean T_R_Number = T_R_CheckBox.isDisplayed();
		validateResults(T_R_Number, true);
		boolean Search = UniversalSearchBar.isDisplayed();
		validateResults(Search, true);
		boolean SearchLabel = SearchBarWaterMark.isDisplayed();
		validateResults(SearchLabel, true);
		boolean R_Icon = RemainderIcon.isDisplayed();
		validateResults(R_Icon, true);
		boolean R_Button = RemainderButton.isDisplayed();
		validateResults(R_Button, true);
		boolean V_ColourBox = VehicleColourCheckbox.isDisplayed();
		validateResults(V_ColourBox, true);
		VehicleColourCheckbox.click();
		boolean ColourSelectionPopuo = OptionsSelectPopup.isDisplayed();
		validateResults(ColourSelectionPopuo, true);
		boolean FuelTypebox = FuelTypeCheckbox.isDisplayed();
		validateResults(FuelTypebox, true);
		FuelTypeCheckbox.click();
		boolean FuelTypePopup = FuelTypeOptionPopup.isDisplayed();
		validateResults(FuelTypePopup, true);
		boolean ServiceTypeBox = ServiceTypeSelectBox.isDisplayed();
		validateResults(ServiceTypeBox, true);
		ServiceTypeSelectBox.click();
		Thread.sleep(10000);
		boolean servicetypePopup = serviceTypePopup.isDisplayed();
		validateResults(servicetypePopup, true);
		ServiceTypeSelectBox.click();
		boolean ServiceAdvisor = ServiceAdvisorField.isDisplayed();
		validateResults(ServiceAdvisor, true);
		boolean ComplaintsBar = CustomerComplaints.isDisplayed();
		validateResults(ComplaintsBar, true);
		boolean ComplaintsSearch = CustomerComplaintsField.isDisplayed();
		validateResults(ComplaintsSearch, true);
		boolean AddServices = ComplaintsAddButton.isDisplayed();
		validateResults(AddServices, true);
		boolean CustomerDetailsOpenIcon = CustomerNameFieldPlusIcon.isDisplayed();
		validateResults(CustomerDetailsOpenIcon, true);
		boolean MobileNo_Filed = MobileNumberField.isDisplayed();
		validateResults(MobileNo_Filed, true);
		boolean AlterNateMobileNo_Field = AlterNateMobileNumberField.isDisplayed();
		validateResults(AlterNateMobileNo_Field, true);
		boolean EmailId = EmailIdFiled.isDisplayed();
		validateResults(EmailId, true);
		boolean CalendarIcon = EstimationDeliverydatecalendarIcon.isDisplayed();
		validateResults(CalendarIcon, true);
		/*
		 * boolean Est_DeliveryField = EstimationdeliveryField.isDisplayed();
		 * validateResults(Est_DeliveryField, true);
		 */
		boolean P_DropdownIcon = PaymentsoptionsDropDownIcon.isDisplayed();
		validateResults(P_DropdownIcon, true);
		boolean AddContact_DriverNameButton = AddContact_DriverName.isDisplayed();
		validateResults(AddContact_DriverNameButton, true);
		scrollDown();
		scrollDown();
		Thread.sleep(2000);
		a.moveToElement(CustomerNameFieldPlusIcon).click().perform();
		Thread.sleep(2000);
		boolean CustomerDetails = CustomerDetailsPopup.isDisplayed();
		validateResults(CustomerDetails, true);
		boolean CustomerDetailsEx = CustomerDetailsExpandMode.isDisplayed();
		validateResults(CustomerDetailsEx, true);

		return this;
	}

	protected static ArrayList<String> DisplayedLabelsListfromCreateJobcardPage = null;
	protected static Map<String, ArrayList<String>> DisplayedLabelsFromCreateJobcardPage = new HashMap<String, ArrayList<String>>();

	public Create_Jobcard_page getDisplayedLabelsFromCreateJobcard() throws Throwable {

		DisplayedLabelsListfromCreateJobcardPage = new ArrayList<String>();
		DisplayedLabelsListfromCreateJobcardPage.add(driver.getTitle());
		DisplayedLabelsListfromCreateJobcardPage.add(JobcardPageTitle.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(T_R_Label.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(RegistrationNoLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(OdometerField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(AvgKMSField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(VIN_NumField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(Engine_NumField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(MakeField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(ModelField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(YearField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(VariantField.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(VehicleColour.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(FuelType.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(ServiceType.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(ServiceAdvisorFieldName.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(CustomerNameLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(MobileNumberLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(AlternateMobileNumberLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(EmailIdLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(EstimationDeliverydatelabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(AdvancePaymentlabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(PaymentTypeLabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(BankNamelabel.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(GiveEstimationLater.getText());
		DisplayedLabelsListfromCreateJobcardPage.add(PrepareEstimationNow.getText());
		DisplayedLabelsFromCreateJobcardPage.put("Labels", DisplayedLabelsListfromCreateJobcardPage);

		return this;

	}

	@FindBy(xpath = "//div[@class='error_alert_field']")
	private WebElement AlertMessage;

	@FindBy(xpath = "//div[@class='title']/span[1]")
	private WebElement JobcardIcon;
	@FindBy(xpath = "//div[@class='title']/span[1]/i")
	private WebElement JobcardPlusIcon;
	@FindBy(xpath = "//div[@class='title']/span[2]")
	private WebElement JobcardPageTitle;
	@FindBy(id = "work_shop_name")
	private WebElement WorkshopNameAndLocation;
	@FindBy(xpath = "//label[@class='checkbox white_check']/span")
	private WebElement T_R_CheckBox;
	@FindBy(xpath = "//label[@class='checkbox white_check']")
	private WebElement T_R_Label;
	@FindBy(xpath = "//div[@class='data_table_search']")
	private WebElement UniversalSearchBar;
	@FindBy(xpath = "//div[@class='data_table_search']/input")
	private WebElement SearchBarWaterMark;
	@FindBy(xpath = "//div[@class='img_circle']/img")
	private WebElement RemainderIcon;
	@FindBy(xpath = "//a[@id='customer_additional']/span")
	private WebElement RemainderButton;
	@FindBy(xpath = "(//div[@class='form-group']/label)[2]")
	private WebElement RegistrationNoLabel;
	@FindBy(xpath = "(//div[@class='other_input_set']/span)[1]")
	private WebElement WorkshopNameStateCode;
	@FindBy(xpath = "(//span[contains(text(), 'Odometer In')])[1]")
	private WebElement OdometerField;
	@FindBy(xpath = "//input[@id='odometer']")
	private WebElement OdometerInput;
	@FindBy(xpath = "(//span[contains(text(), 'Avg KMS / Day')])[1]")
	private WebElement AvgKMSField;
	@FindBy(xpath = "(//span[contains(text(), 'VIN')])[1]")
	private WebElement VIN_NumField;
	@FindBy(xpath = "//input[@id='vinNo']")
	private WebElement VIN_Input;
	@FindBy(xpath = "(//span[contains(text(), 'Engine No')])[1]")
	private WebElement Engine_NumField;
	@FindBy(xpath = "//input[@id='engNo']")
	private WebElement Engine_NumInput;
	@FindBy(id = "vehicleDetail")
	private WebElement VehicleSearch;
	@FindBy(xpath = "//span[contains(text(), 'Make')]")
	private WebElement MakeField;
	@FindBy(xpath = "//span[contains(text(), 'Model')]")
	private WebElement ModelField;
	@FindBy(xpath = "//span[contains(text(), 'Year')]")
	private WebElement YearField;
	@FindBy(xpath = "//span[contains(text(), 'Variant')]")
	private WebElement VariantField;
	@FindBy(xpath = "//h4[contains(text(), 'Vehicle Colour')]")
	private WebElement VehicleColour;
	@FindBy(xpath = "(//label[@class='checkbox white_check']/span)[2]")
	private WebElement VehicleColourCheckbox;
	@FindBy(id = "colorList")
	private WebElement OptionsSelectPopup;
	@FindBy(xpath = "//h4[contains(text(), 'Fuel Type')]")
	private WebElement FuelType;
	@FindBy(xpath = "(//label[@class='checkbox white_check']/span)[5]")
	private WebElement FuelTypeCheckbox;
	@FindBy(xpath = "//div[@id='fuelTypeDiv']//div[@class='dropdown-menu dropdown-usermenu animated fadeInDown pull-left']")
	private WebElement FuelTypeOptionPopup;
	@FindBy(xpath = "//h4[contains(text(), 'Service Type')]")
	private WebElement ServiceType;
	@FindBy(xpath = "(//label[@class='checkbox white_check']/span)[16]")
	private WebElement ServiceTypeSelectBox;
	@FindBy(id = "serviceTypeId_")
	private WebElement serviceTypePopup;
	@FindBy(xpath = "//label[contains(text(), 'Service Advisor')]")
	private WebElement ServiceAdvisorFieldName;
	@FindBy(xpath = "//span[contains(text(), '   Select   ')]")
	private WebElement ServiceAdvisorField;
	@FindBy(id = "customFieldId")
	private WebElement CustomField;
	@FindBy(id = "additionalCustomFieldId")
	private WebElement AdditionalCustomField;
	@FindBy(xpath = "//div[@class='complent_search']")
	private WebElement CustomerComplaints;
	@FindBy(xpath = "//div[@class='complent_search']/input")
	private WebElement CustomerComplaintsField;
	@FindBy(xpath = "//button[contains(text(), 'Add Service')]")
	private WebElement ComplaintsAddButton;
	@FindBy(xpath = "//div[@class='checklabels']")
	private WebElement MostusedComplaints;
	@FindBy(xpath = "//button[contains(text(), 'Done')]")
	private WebElement ExistingComplaintsAddButton;
	@FindBy(xpath = "(//span[contains(text(), 'Customer Name')])[1]")
	private WebElement CustomerNameLabel;
	@FindBy(xpath = "//input[@id='customer_name']")
	private WebElement CustomerNameInput;
	@FindBy(xpath = "(//a[@id='customer_additional'])[2]/i")
	private WebElement CustomerNameFieldPlusIcon;
	@FindBy(xpath = "(//div[@class='mobile_no_feild']/label)[1]")
	private WebElement MobileNumberLabel;
	@FindBy(xpath = "(//div[@class='mobile_no_feild'])[1]")
	private WebElement MobileNumberField;
	@FindBy(xpath = "//input[@id='mobile_no']")
	private WebElement MobileNumberinput;
	@FindBy(id = "mobile_no_code")
	private WebElement MobileNumberCountryCode;
	@FindBy(xpath = "(//div[@class='mobile_no_feild']/label)[2]")
	private WebElement AlternateMobileNumberLabel;
	@FindBy(id = "alternate_mobile")
	private WebElement AlterNateMobileNumberField;
	@FindBy(id = "alternate_mobile_no_code")
	private WebElement AlternateMobileNumberCountryCode;
	@FindBy(xpath = "(//span[contains(text(), 'Email ID')])[1]")
	private WebElement EmailIdLabel;
	@FindBy(id = "email_id")
	private WebElement EmailIdFiled;
	@FindBy(xpath = "//span[contains(text(), 'Est. Delivery Date')]")
	private WebElement EstimationDeliverydatelabel;
	@FindBy(xpath = "//div[@class='uniq_bg']//img")
	private WebElement EstimationDeliverydatecalendarIcon;
	@FindBy(xpath = "//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr dateOfDeliveryFlatpickr checkEmptydt flatpickr-input input']")
	private WebElement EstimationdeliveryField;
	@FindBy(xpath = "(//span[@class='flatpickr-day today selected'])[3]")
	private WebElement EstimationDeliveryDate;
	@FindBy(xpath = "//button[contains(text(), ' Add Contact / Driver Name')]")
	private WebElement AddContact_DriverName;
	@FindBy(xpath = "//h3[contains(text(), 'Advance Payment')]")
	private WebElement AdvancePaymentlabel;
	@FindBy(xpath = "//span[contains(text(), 'Cash')]")
	private WebElement PaymentTypeLabel;
	@FindBy(xpath = "(//div[@class='payment_set_inputs']//span[@class='select2-selection__arrow'])[1]")
	private WebElement PaymentsoptionsDropDownIcon;
	@FindBy(id = "select2-paymode-results")
	private WebElement PaymentsOptionDropdown;
	@FindBy(xpath = "//span[contains(text(), 'Bank Name')]")
	private WebElement BankNamelabel;
	@FindBy(xpath = "(//div[@class='payment_set_inputs']//span[@class='select2-selection__arrow'])[2]")
	private WebElement BankNameoptionsDropDownIcon;
	@FindBy(id = "//ul[@id='select2-bankName-results']")
	private WebElement BankNamesOptionDropdown;
	@FindBy(id = "chequeNo")
	private WebElement chequeNofiled;
	@FindBy(xpath = "//div[@class='uniq_bg svRole']//img")
	private WebElement AdvancePaymentsCalendarIcon;
	@FindBy(xpath = "(//div[@class='uniq_bg svRole']//div//input)[4]")
	private WebElement PaymentDateIputField;
	@FindBy(xpath = "//button[contains(text(), 'Give Estimation Later')]")
	private WebElement GiveEstimationLater;
	@FindBy(xpath = "//button[contains(text(), 'Prepare Estimation Now')]")
	private WebElement PrepareEstimationNow;

//Customer Details Popup Fileds //

	@FindBy(xpath = "(//div[@class='modal-dialog insurance_com_pop'])[1]")
	private WebElement CustomerDetailsPopup;
	@FindBy(xpath = "//h4//span[contains(text(), 'Customer')][1]")
	private WebElement CustomerDetailsPopupHeader;
	@FindBy(xpath = "(//h4[@class='panel-title'])[4]//a[@aria-expanded='true']")
	private WebElement CustomerDetailsExpandMode;
	@FindBy(xpath = "(//div[@id='4a']//span[contains(text(), 'Town/ City')])[1]")
	private WebElement Town_CityLabel;
	@FindBy(id = "customerCity_cus")
	private WebElement Town_CityField;
	@FindBy(xpath = "//div[@id='4a']//span[contains(text(), 'State')]")
	private WebElement StateLabel;
	@FindBy(id = "customerState_cus")
	private WebElement StateField;
	@FindBy(xpath = "//div[@id='4a']//span[contains(text(), 'Pincode')]")
	private WebElement PincodeLabel;
	@FindBy(id = "customerPincode_cus")
	private WebElement PincodeFiled;
	@FindBy(xpath = "//div[@id='4a']//span[contains(text(), 'Credit Amount')]")
	private WebElement CreditAmountLabel;
	@FindBy(id = "customerCreditAmount")
	private WebElement CreditAmountFiled;
	@FindBy(xpath = "//div[@id='4a']//span[contains(text(), 'Credit Days')]")
	private WebElement CreditDaysLabel;
	@FindBy(id = "customerCreditExpiryDays")
	private WebElement CreditExpiryDaysFiled;
	@FindBy(xpath = "//div[@id='4a']//span[contains(text(), 'Discount')]")
	private WebElement CreditDiscountLabel;
	@FindBy(id = "customerDefaultPartsDiscountRate")
	private WebElement CreditDiscountField;
	@FindBy(xpath = "(//button/span/i)[1]")
	private WebElement CloseButton;

	@FindBy(id = "workshopname")
	private WebElement WorkshopNmae;
	@FindBy(id = "workshopStateCode")
	private WebElement workshopStateCode;
	@FindBy(id = "countryMasterPhoneCode")
	private WebElement workshopMobileCountryCode;
	@FindBy(id = "reg_2")
	private WebElement Vehicle1;
	@FindBy(id = "reg_3")
	private WebElement Vehicle2;
	@FindBy(id = "reg_4")
	private WebElement Vehicle3;
	@FindBy(id = "plainTextReg")
	private WebElement InterNationalVehicle;

	// Corporate Details Popup Fileds

	@FindBy(id = "companyName")
	private WebElement CorporateName;
	@FindBy(id = "gstnno")
	private WebElement GSTINnumber;
	@FindBy(id = "referenceNo")
	private WebElement RefNo;
	@FindBy(id = "contactName_corp")
	private WebElement CorpCustomerName;
	@FindBy(id = "mobileNo_")
	private WebElement MobileNo;
	@FindBy(id = "contacEmail_corp")
	private WebElement CorpEmailId;
	@FindBy(id = "driverName_corp")
	private WebElement CorpDriverName;
	@FindBy(id = "address1")
	private WebElement corpHouseNo;
	@FindBy(id = "colonyStrtLocatn")
	private WebElement CorpColony;
	@FindBy(id = "city")
	private WebElement CorpCity;
	@FindBy(id = "pincode")
	private WebElement CorpPincode;
	@FindBy(id = "state")
	private WebElement CorpState;
	@FindBy(xpath = "(//button[@class='close'])[1]")
	private WebElement Close_popup;
	@FindBy(xpath = "(//a[@id='corperate_additional'])[1]/i")
	private WebElement CorporateNameFieldPlusIcon;

	// Insurance Details Popup Fileds

	@FindBy(xpath = "(//span[contains(text(), 'Select Insurance Company')])[2]")
	private WebElement InsuranceCompany;
	@FindBy(id = "gstNo_insurance")
	private WebElement InsGSTINnumber;
	@FindBy(id = "contactNo")
	private WebElement InsContantNo;
	@FindBy(id = "contactName_Insurance")
	private WebElement InsContantName;
	@FindBy(id = "mobile_NoInsurance")
	private WebElement InsMobileNo;
	@FindBy(id = "contact_Email_insurance")
	private WebElement InsEmailId;
	@FindBy(id = "flatHouseNO_Insu")
	private WebElement InsHouseNo;
	@FindBy(id = "colony_street")
	private WebElement InsColony;
	@FindBy(id = "town_City")
	private WebElement InsCity;
	@FindBy(id = "pincode_Insurance")
	private WebElement InsPincode;
	@FindBy(id = "state_Insurance")
	private WebElement InsState;
	@FindBy(xpath = "(//a[@id='insurance_pop'])[1]/i")
	private WebElement InsuranceNameFieldPlusIcon;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement InsuranceCompanySearch;

	// Insurance ClaimDetails Popup Fileds

	@FindBy(xpath = "//span[@class='insuranceClaimDetails']/a")
	private WebElement InsuranceClimTAb;
	@FindBy(xpath = "//div[@class='claim_radio_set']//label[1]//span[2]")
	private WebElement InsuranceClimOption;
	@FindBy(id = "policyNo")
	private WebElement PolicyNo;
	@FindBy(id = "driverLicenceNo")
	private WebElement LicenceNo;
	@FindBy(id = "surveyorName")
	private WebElement SurveyorName;
	@FindBy(id = "surveyorMno")
	private WebElement SurveyorMobileNo;
	@FindBy(id = "surveyorEmail")
	private WebElement SurveyorEmail;
	@FindBy(id = "idvAmount")
	private WebElement IDVAmount;
	@FindBy(id = "claimNo")
	private WebElement ClaimNo;
	@FindBy(xpath = "(//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr "
			+ "checkEmptydt input-data-parts flatpickr-input form-control input'])[1]")
	private WebElement LicenceExpiryDate;

	@FindBy(xpath = "(//input[@class='input__field input__field--nao main_input form-control date_picker_in flatpickr "
			+ "checkEmptydt input-data-parts flatpickr-input form-control input'])[2]")
	private WebElement AceidentDate;
	@FindBy(xpath = "//button[contains(text(), 'New Job Card')]")
	private WebElement NewJObCard;

	// Customer additional Popup Fileds

	@FindBy(xpath = "(//a[@id='customer_additional'])[2]/i")
	private WebElement CustomerDetailsPopupExpand;
	@FindBy(xpath = "//input[@id='driverName_cus']")
	private WebElement DriverName;
	@FindBy(xpath = "//input[@id='customerAddress1_cus']")
	private WebElement CustomerHouseNo;
	@FindBy(xpath = "//input[@id='customerColonyStrtLocatn_cus']")
	private WebElement CustomerColony;
	@FindBy(xpath = "//input[@id='customerCity_cus']")
	private WebElement CustomerCity;
	@FindBy(xpath = "//input[@id='customerPincode_cus']")
	private WebElement CustomerPincode;
	@FindBy(xpath = "//input[@id='customerState_cus']")
	private WebElement CustomerState;
	@FindBy(id = "stateID")
	private WebElement WorkshopState;

}
