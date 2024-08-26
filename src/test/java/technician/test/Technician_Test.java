package technician.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import pageObjects.initializePageObjects.All_Page_Intializer;

public class Technician_Test extends All_Page_Intializer {

	
	  @Test(priority = 1)    
	  public void Techniciantracking_login() throws Throwable {  
	  LoginPageTest().InValid_Login();
	  LoginPageTest().Valid_Login("saicar","Sairam@123"); 
	  Thread.sleep(MaxPageLoadTime);  
	    
	  }     
	    
	  @Test(priority = 2)   
	   
	  public void verifyAllElements() throws Throwable { 
	  //addTechnician.click(); 
	  Technician_Test().verifyAllElementsEmployees(); //
	  Technician_Test().clockInbuttonValidation_and_Label_ValidationTest();
	  Technician_Test().Jobqueue_page_Label_Validation(); 
	  Technician_Test().duplicate_TechniciancheckInJobqueueScreen();
	    	 
	  } 
	    
	 
	  @Test(priority = 3)  //priority 3
	  public void newEmployeeaddInEmployeeScreen() throws Throwable { 
	  //Technician_Test().EmployeeAdd(4);
	  Technician_Test().newJobcardOpen();  
	  Technician_Test().EstimationScreen(5);   
	    
	  } 
	   
	  @Test(priority = 4) //priority 4
	  public void singleTechnicianCheck() throws Throwable {
	 // Technician_Test().technicianpop_ValidationsInEstimationScreen();
	  Technician_Test().singletechnicianSelection();  
	  Technician_Test().technicianpopupscreen_Validation();   
	  } 
	           
	   
	  @Test(priority = 5)   
	  public void selectMultipleTechnicians() throws Throwable {   
	  Technician_Test().newJobcardOpen();
	  Technician_Test().EstimationScreen(4); 
	  Technician_Test().technicianAssignmentinEstimationScreen(); 
	  Technician_Test().technicianJobqueuepage();
	        
	  }   
	    
	  public void duplicateTechnicians() throws Throwable {
	  
	  } 
	   
	  @Test(priority = 6) //priority 6
	  public void servicesInEstimationPage() throws Exception {
	  
	  //Technician_Test().labourNamesInExcel();
	  
	  }  
	  
	  @Test(priority = 7) //priority 7  
	  public void InactiveTechnicianTest() throws Throwable 
	  {
	  
	  Technician_Test().inActiveTechnicianInEstimationPage();  
	  Technician_Test().savebuttonvalidataioInTechnician();
	    
	  } 
	  @Test(priority = 8)   
	  public void ColorValidationInEstimationAndJobqueuePage() throws Throwable  { 
		  Technician_Test().colourValidationInEstimationScreen();
		  
		    
		  
	  }
	 
	@Test(priority = 9) 
	  public void EnableAndDisableTechnicianInSuperAdmin() throws Throwable {
		   
			/*
			 * // Technician_Test().logoutcurrentpage();
			 * 
			 * driver.navigate().refresh(); driver.getCurrentUrl();
			 * System.out.println("The current url is: " + driver.getTitle()); String
			 * currentPage = "Job Queue - Autorox"; if(driver.getTitle().equals(currentPage)
			 * ) { driver.findElement(By.xpath("//div[@class='dropdown-toggle']")).click();
			 * driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
			 * } else {
			 * driver.findElement(By.xpath("//div[@class='dropdown-toggle']")).click();
			 * driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
			 * 
			 * }
			 */  
		  LoginPageTest().Valid_Login("admin31", "Smart-09-14-2023");
		  Thread.sleep(4000);
		  Technician_Test().superadmincheck();   
		    
	}  
}

// public void zoomout() throws InterruptedException {
//      JavascriptExecutor jse=(JavascriptExecutor)driver;
//      js.executeScript("document.body.style.zoom='70%'");
