package com.DirectIssue;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.initializePageObjects.All_Page_Intializer;

public class DirectIssueMethods extends All_Page_Intializer {

	String AutoGeneratepartName = "";
	String Issueingqty = "";
	Map<String, String> beforePartsIssuesDataGlobal = new HashedMap<>();
	//Map<String, String> beforePartsIssuesDataGlobal;
	
 
	@Test(enabled = false)
	public void login() throws Exception {
		LoginPageTest().Valid_Login("saicar", "Sairam@123");
		Directissue().navigateToIssueScreen();
		Directissue().LabelsValidationInDirectIssueScreen();
		Directissue().dropdownlabelsValidataion();

	} 

	@Test(priority = 2)
	public void PartsInward() throws Exception {
		LoginPageTest().Valid_Login("saicar", "Sairam@123");
		String AutoGeneratepartName = getAutoGenerateOnlyString(5);
		this.AutoGeneratepartName = AutoGeneratepartName;
		System.out.println("Sai Test :" + this.AutoGeneratepartName);
		String Issueingqty = autoGenerateNumber(1, "12345");  
		this.Issueingqty = Issueingqty;   
		Directissue().DirectPartsInward(AutoGeneratepartName);  
		// Directissue().Inwardscreen(AutoGeneratepartName);
		this.beforePartsIssuesDataGlobal = Directissue().CheckTheStockDetails(AutoGeneratepartName);
		Directissue().IssueingThePartInDirectIssueScreen(AutoGeneratepartName, Issueingqty);
		Directissue().Issubuttonclick(AutoGeneratepartName, Issueingqty); 
		Map<String, String> afterartsIssuesData = Directissue().CheckTheStockDetails(AutoGeneratepartName);
		Directissue().duplicatepartEntry(AutoGeneratepartName, Issueingqty);
		Directissue().differanceCalculation(this.beforePartsIssuesDataGlobal, afterartsIssuesData);

	}
 
	@Test(priority = 3)
	public void IssueTabQtyCheck() throws Exception {
		Map<String, String> beforeIssueingTheDetails = Directissue().IssueTabForQtyCheck(AutoGeneratepartName);
		System.out.println("The issue qty part name is :" + AutoGeneratepartName);
		// Directissue().CheckTheStockDetails(AutoGeneratepartName);
		Directissue().returnqtyFromIssuedTab("Wrongqty", Issueingqty); 
		Directissue().CheckTheStockDetails(AutoGeneratepartName);
		Map<String, String> AfterIssueingthewrongqty = Directissue().IssueTabForQtyCheck(AutoGeneratepartName);
		Directissue().compareTheStockValuesWithIssuedTabValues(beforeIssueingTheDetails, AfterIssueingthewrongqty);
	} 
  
	@Test(priority = 4)  
	public void IssueTabQtycheckWithCorrectValue() throws Exception {
		Directissue().IssueTabForQtyCheck(AutoGeneratepartName);
		Directissue().returnqtyFromIssuedTab("CorrectQty", Issueingqty);
		Map<String, String> beforePartsIssuesData = Directissue().CheckTheStockDetails(AutoGeneratepartName);
		Directissue().differanceCalculation(this.beforePartsIssuesDataGlobal, beforePartsIssuesData);
 
	} 

}
