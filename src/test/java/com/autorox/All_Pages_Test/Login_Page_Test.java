package com.autorox.All_Pages_Test;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class Login_Page_Test extends All_Page_Intializer {

	@Test(priority = 1)
	public void LoginPageLabelsValidations() throws Throwable {
		LoginPageTest().verifyAllElements();
	}

	@Test(priority = 2)
	public void LoginPageLoginsValidation() throws Exception {
		 LoginPageTest().InValid_Login();
		LoginPageTest().Licence_expaired_Login();
		 LoginPageTest().Licence_InActive_Login();
		LoginPageTest().Valid_Login("krishna@123", "Smart-09-14-2022");
		LoginPageTest().Application_Logout();

	}
	/*
	 * *
	 * 
	 * @Test(priority = 3) public void Book_Appointment_Enabled_logins() {
	 * LoginPageTest().Valid_Login("krishna@123", "Admin@321"); String Element =
	 * getWebDriver().getTitle(); System.out.println(Element);
	 * validateResults(Element, "Book Appointment - Autorox");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 4) public void Book_Appointment_Disabled_logins() {
	 * LoginPageTest().Valid_Login("Autorox@TC", "9l$3aiRC"); String Element =
	 * getWebDriver().getTitle(); System.out.println(Element);
	 * validateResults(Element, "Job Cards Dashboard - Autorox");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void Tyre_Pro_logins() {
	 * LoginPageTest().Valid_Login("Tyreshop", "Sairam@123"); String Element =
	 * getWebDriver().getTitle(); System.out.println(Element);
	 * validateResults(Element, "Sell Products Dashboard - Autorox");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void Franchises_Logins() {
	 * LoginPageTest().Valid_Login("vasumathi", "Krishna@123"); String Element =
	 * getWebDriver().getTitle(); System.out.println(Element);
	 * validateResults(Element, "Reports - Autorox"); ClickOnLinks("Logout");
	 * 
	 * }
	 * 
	 * @Test(priority = 7) public void Service_Advisor_Logins() {
	 * LoginPageTest().User_Valid_Login(5);
	 * LoginPageTest().UserRole_Name("ROLE_SERVICEADVISOR");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 8) public void Spares_Incharge_Logins() {
	 * LoginPageTest().User_Valid_Login(6);
	 * LoginPageTest().UserRole_Name("ROLE_SPARESINCHARGE");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 9) public void Cashier_Logins() {
	 * LoginPageTest().User_Valid_Login(7);
	 * LoginPageTest().UserRole_Name("ROLE_CASHIER");
	 * LoginPageTest().Application_Logout();
	 * 
	 * }
	 * 
	 * @Test(priority = 10) public void Sales_executive_Logins() {
	 * LoginPageTest().User_Valid_Login(8);
	 * LoginPageTest().UserRole_Name("ROLE_SALESEXECUTIVE");
	 * LoginPageTest().Application_Logout(); }
	 * 
	 * @Test(priority = 11) public void CRE_Logins() {
	 * LoginPageTest().User_Valid_Login(9);
	 * LoginPageTest().UserRole_Name("ROLE_CRE ");
	 * LoginPageTest().Application_Logout(); }
	 * 
	 * @Test(priority = 12) public void Sales_Manager_Logins() {
	 * LoginPageTest().User_Valid_Login(10);
	 * LoginPageTest().UserRole_Name("ROLE_SALESMANAGER");
	 * LoginPageTest().Application_Logout(); }
	 * 
	 * @Test(priority = 13) public void Works_Manager_Logins() {
	 * LoginPageTest().User_Valid_Login(11);
	 * LoginPageTest().UserRole_Name("ROLE_WORKSMANAGER");
	 * LoginPageTest().Application_Logout(); }
	 */
}
