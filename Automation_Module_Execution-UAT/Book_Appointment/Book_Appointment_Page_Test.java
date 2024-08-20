package com.autorox.All_Pages_Test;

import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class Book_Appointment_Page_Test extends All_Page_Intializer {

	// Book appointment page labels and fields validation.

	@Test(priority = 1)
	public void BookAppointmentPageLabelsValidation() throws Throwable {
		LoginPageTest().Valid_Login("janae.marquardt", "3K#Bi&%9");
		Book_Appointment().AllLabelsVerification();
		Book_Appointment().NAallLabelsValidationClickOnCalender();
	}

	// All date and time validations

	@Test(priority = 2)
	public void BookAppointmentPageTimeValidation() throws Throwable {
		refresh();
		Book_Appointment().PastDatePastTimeValiadtionInBP();
		Book_Appointment().PresentDatePastTimeValiadtionInBP();
		refresh();
		Book_Appointment().PresentDateCurrentTimeValiadtionInBP();
		Book_Appointment().PresentDatePastTimeValiadtionInBP();
		refresh();
		Thread.sleep(2000);
		Book_Appointment().futureDateCurrentTimeValiadtionInBP();

	}

	
	// In week View All types of appointment creation and while creating
	// Appointment Provided data validation

	@Test(priority = 3)

	public void BookAppointmentPageNPCreationAndLabelValidation() throws Throwable {

		Book_Appointment().NPBookingClickOnAddNewIndividual();
		Book_Appointment().NPBookingClickOnCalenderIndividual();
		beforeMethod();
		LoginPageTest().Valid_Login("kelsi.reilly", "Krishna@123");
		Book_Appointment().NPBookingClickOnCalenderCorporate();
		Book_Appointment().NPBookingClickOnAddNewCorporate();
	}

	// Month view to day view appointment creation

	@Test(priority = 4)
	public void BookAppointment_through_jobcardCreation_Test() throws Throwable {
		beforeMethod();
		LoginPageTest().Valid_Login("nannie.braun", "zv#66P%t");
		Book_Appointment().Appointment_creation_MonthToDayView();
		refresh();
		Book_Appointment().BookAppointment_through_jobcardCreation();

	}

	@Test(priority = 5)
	public void Duplicate_Appointment_Creation_And_alert_Message_Validation() throws Throwable {
		beforeMethod();
		LoginPageTest().Valid_Login("triston.moore", "d1o1#Lw3");
		Book_Appointment().Duplicate_Appointment_Valiadtion();
		refresh();
		Book_Appointment().Based_On_Jobcard_Status_Appointment_Creation();

		Book_Appointment().BA_Page_Delete_And_Edit_Option_Validation();
	}
}
