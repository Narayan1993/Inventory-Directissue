package com.autorox.Jobcard_Flow_Test;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class Create_and_Validate_AllJobcardPage_Test extends All_Page_Intializer {

	@Test(priority = 1)
	public void CreateJobcardPageLabelsValidation_Test() throws Throwable {
		LoginPageTest().Valid_Login("janae.marquardt", "3K#Bi&%9");
		//CreateJobcardPage().JC_VehicleDetailsSetionLabelValidation();
		
	}

	@Test(priority = 2)
	public void IndiaAllTypesof_GST_JobCardsCreation_Test() throws Throwable {
		//LoginPageTest().Valid_Login("LabourChart", "LabourChart@371");
		//CreateJobcardPage().JObCard_Creation("Normal", "GST", "India", "NotRequired");
		//Book_Appointment().Add_stranded_parts_In_Estimation_Page(4);
		CreateJobcardPage().JObCard_Creation("Insurance", "GST", "India", "NotRequired");
		CreateJobcardPage().JObCard_Creation("Corporate", "GST", "India", "NotRequired");
	}

	@Test(priority = 3)
	public void IndiaAllTypesof_IGST_JobCardsCreation_Test() throws Throwable {
		beforeMethod();
		LoginPageTest().Valid_Login("janae.marquardt", "3K#Bi&%9");
		CreateJobcardPage().JObCard_Creation("Normal", "IGST", "India", "NotRequired");
		CreateJobcardPage().JObCard_Creation("Insurance", "IGST", "India", "NotRequired");
		CreateJobcardPage().JObCard_Creation("Corporate", "IGST", "India", "NotRequired");
	}

	@Test(priority = 4)
	public void SaudiArabia_AllTypesof_JobCardsCreation_Test() throws Throwable {
		//LoginPageTest().Valid_Login("sara", "Sara@321");
		CreateJobcardPage().JObCard_Creation("Normal", "VAT", "SaudiArabia", "532123456");
		CreateJobcardPage().JObCard_Creation("Insurance", "VAT", "SaudiArabia", "532123456");
		CreateJobcardPage().JObCard_Creation("Corporate", "VAT", "SaudiArabia", "532123456");
	}

	@Test(priority = 5)
	public void InterNational_AllTypesof_JobCardsCreation_Test() throws Throwable {
		beforeMethod();
		LoginPageTest().Valid_Login("tanzania", "Admin@2023");
		CreateJobcardPage().JObCard_Creation("Normal", "VAT", "Tanzania", "418989768");
		CreateJobcardPage().JObCard_Creation("Insurance", "VAT", "Tanzania", "418989768");
		CreateJobcardPage().JObCard_Creation("Corporate", "VAT", "Tanzania", "418989768");
	}

	@Test(priority = 6)
	public void JobCard_Page_Validation_ForAllCountrys_Test() throws Throwable {
		//LoginPageTest().Valid_Login("rylee.tremblay", "4NzF?sdm");
		CreateJobcardPage().Create_Jobcard_Page_Validation_For_India();
	}

}
