package com.autorox.All_Pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTestMethod;
import utils.ExcelUtils;

public class Login_Page extends BaseTestMethod {
	
	public static ArrayList<String> DisplayedLabelsListFromLoginPage = null;
	public static Map<String, ArrayList<String>> DisplayedLabelsFromLoginPage= new HashMap<String, ArrayList<String>>();
	
	public Login_Page(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	@FindBy(id = "logo1")
	public WebElement loginPageautoroxLogo;
	@FindBy(xpath = "//div[@class='col-sm-6 col-xs-12']/p")
	public static WebElement login_HeaderText;
	@FindBy(id = "userName_login")
	public WebElement username_Field;
	@FindBy(id = "password_login")
	public WebElement password_Field;
	@FindBy(xpath = "//*[text()='Continue']")
	public WebElement login_Btn;
	@FindBy(xpath = "//a[text()='I Forgot']")
	public WebElement forgotPassword;
	@FindBy(xpath = "//label[@for='checkboxSuccess']")
	public WebElement rememberPassword;
	@FindBy(xpath = "//input[@id='checkboxSuccess']")
	public WebElement CheckBox;
	@FindBy(className = "error_msg")
	public WebElement error_Msg;
	@FindBy(xpath = "//h3[text()='Sign In']")
	public WebElement signInLabel;
	@FindBy(xpath = "(//label[contains(text(),'Username')])[1]")
	public WebElement login_usernameLabel;
	@FindBy(xpath = "(//label[text()='Password'])[1]")
	public WebElement login_passwordLabel;
	@FindBy(xpath = "//div[@class='error_msg']")
	public static WebElement Login_Page_Alerts;
	@FindBy(xpath = "//div[@class='mega_menu dropdown keep-inside-clicks-open']")
	public static WebElement Logout_Popup;
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	public static WebElement Logout;
	
	public  Login_Page   verifyAllElements() throws Throwable {
		Thread.sleep(5000);
		getActualLabels("AllLogins", "Login_Page_Elements",7);
		getDisplayedLabels();
		validateResults(ActualLabels,DisplayedLabelsFromLoginPage);
		boolean Element1=loginPageautoroxLogo.isDisplayed();
		validateResults(Element1, true);
	rememberPassword.click();
	boolean Element2=CheckBox.isSelected();
	validateResults(Element2, true);
	return this;
	}

	
	public Login_Page getDisplayedLabels()   {
		DisplayedLabelsListFromLoginPage = new ArrayList<String>();
		DisplayedLabelsListFromLoginPage.add(driver.getTitle());
		DisplayedLabelsListFromLoginPage.add(login_HeaderText.getText());
		DisplayedLabelsListFromLoginPage.add(signInLabel.getText());
		DisplayedLabelsListFromLoginPage.add(login_usernameLabel.getText());
		DisplayedLabelsListFromLoginPage.add(login_passwordLabel.getText());
		DisplayedLabelsListFromLoginPage.add(forgotPassword.getText());
		DisplayedLabelsListFromLoginPage.add(rememberPassword.getText());
		DisplayedLabelsFromLoginPage.put("Labels", DisplayedLabelsListFromLoginPage);
		System.out.println(DisplayedLabelsFromLoginPage);
		return null;
	}
	
	
	public Login_Page InValid_Login() {
		String UserName = ExcelUtils.getTestData("AllLogins", "UserName", 2);
		String Password = ExcelUtils.getTestData("AllLogins", "Password", 2);
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Invalid username and password.");
		return this;
	}

	public Login_Page Licence_expaired_Login() {
		String UserName = ExcelUtils.getTestData("AllLogins", "UserName", 3);
		String Password = ExcelUtils.getTestData("AllLogins", "Password", 3);
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Your licence expired!");
		return this;
	}
	public Login_Page Licence_InActive_Login() {
		
		String UserName = ExcelUtils.getTestData("AllLogins", "UserName", 4);
		String Password = ExcelUtils.getTestData("AllLogins", "Password", 4);
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Your licence is not active!");
		return this;
	}
	public void Valid_Login(String UserName, String Password) {
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		
	}
	public void User_Valid_Login(int i) {
		
		String UserName = ExcelUtils.getTestData("AllLogins", "UserName", i);
		String Password = ExcelUtils.getTestData("AllLogins", "Password", i);
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		
	}
	
	public Login_Page Application_Logout() {
		Logout_Popup.click();
		Logout.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"You've logged out successfully!");
		return this;
	}
	
	public Login_Page UserRole_Name(String RoleName) {
		String query = driver.findElement(By.id("role")).getAttribute("value");
		validateResults(query, RoleName);
		return this;
		
	}
	
}