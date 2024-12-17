package pageObjects.initializePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DirectIssue.DirectIssueScreen;
import com.JobCardCreationAndValidation.JobCardCreationAndValidation;
import com.JobCardCreationAndValidation.JobcardTest;
import com.autorox.All_Pages.Login_Page;
import com.techniciantracking.Techniciantracking;

import Jobcard_Flow.Create_Jobcard_page;
import controllers.BaseMethod;

public class All_Page_Intializer extends BaseMethod {

	    public Login_Page LoginPageTest() {
	        return PageFactory.initElements(getWebDriver(), Login_Page.class);
	    }
	    public Techniciantracking Technician_Test() {
	       return PageFactory.initElements(getWebDriver(), Techniciantracking.class);
	    	    
	}    
	    
	    public Create_Jobcard_page CreateJobcardPage() {
	        return PageFactory.initElements(getWebDriver(), Create_Jobcard_page.class);
	    }  
	    
	    public DirectIssueScreen Directissue() {
	    	 
	    	return PageFactory.initElements(getWebDriver(), DirectIssueScreen.class);
	    }
	    
	    public JobCardCreationAndValidation new_JobCard () {
	    	
	    	return PageFactory.initElements(getWebDriver(), JobCardCreationAndValidation.class);
	    		
	    		
	    	}
	    
	  
}
