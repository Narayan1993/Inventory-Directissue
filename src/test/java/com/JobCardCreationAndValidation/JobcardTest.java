package com.JobCardCreationAndValidation;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class JobcardTest extends All_Page_Intializer{
	
	@Test(priority = 1) 
	public void JobCardCreation() throws Throwable {
		new_JobCard().Valid_Login("saicar", "Sairam@123"); 
		new_JobCard().navigatingToNewJobcard();
		new_JobCard().newJobcardOpen("IndividualCustomer");
		 
		
	}

}
