package controllers;

import static org.testng.Assert.assertEquals;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.netty.handler.timeout.TimeoutException;

/**
 * @Author Krishnaveni Vipparla
 * @Date 10-10-2022
 */
public class BaseMethod extends WebDriverFactory { 
	public static Properties config;
	public static ExtentTest logger;
	private static ExtentReports report = null;
	public static Logger log = Logger.getLogger("log");
	public static HashMap<String, String> xpath_DB = new HashMap<String, String>();
	public static Map<String, String> navigationLinks = new HashMap<String, String>();

	@FindBy(id = "userName_login")
	protected
	static WebElement username_Field; 
	
	@FindBy(xpath = "//*[text()='Continue']")
	protected
	static WebElement login_Btn;

	@FindBy(id = "password_login")
	protected
	static WebElement password_Field;
	public void Valid_Login(String UserName, String Password) {
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		
	}
	
	public static void validateResults(boolean displayed, boolean actual) {

		logger.log(LogStatus.INFO, "Displayed", String.valueOf(displayed));
		logger.log(LogStatus.INFO, "Actual", String.valueOf(actual));
		assertEquals(displayed, actual); 
	} 

	public static void validateResults(Map<String, ArrayList<String>> displayed,
			Map<String, ArrayList<String>> acutal) {
		logger.log(LogStatus.INFO, "Displayed", String.valueOf(displayed));
		logger.log(LogStatus.INFO, "Actual", String.valueOf(acutal));
		System.out.println(displayed);
		System.out.println(acutal);
		compareResults(displayed, acutal);
		assertEquals(displayed, acutal);

	}

	public static void validateResults(String displayed, String acutal) {
		logger.log(LogStatus.INFO, "Displayed", String.valueOf(displayed));
		logger.log(LogStatus.INFO, "Actual", String.valueOf(acutal));
		compareResults(displayed, acutal);
		assertEquals(displayed, acutal); 
		 
		if(displayed.equals(acutal)) { 
			
			System.out.println("" + displayed + " is correct");
		}else {
			
			System.out.println("" + displayed + "is not correct");
		}
	} 

	public static void compareResults(String displayed, String acutal) {
		if (!displayed.equals(acutal)) {
			logger.log(LogStatus.INFO, "Actual", acutal.toString());
			logger.log(LogStatus.FAIL, "Displays", displayed.toString());

		}
	}

	public static void compareResults(Map<String, ArrayList<String>> displayedResult,
			Map<String, ArrayList<String>> actualResult) {
		for (Map.Entry<String, ArrayList<String>> entry : actualResult.entrySet()) {
			ArrayList<String> list1 = entry.getValue();
			ArrayList<String> list2 = displayedResult.get(entry.getKey().trim());
			if (!String.valueOf(actualResult.get(entry.getKey().trim()))
					.equalsIgnoreCase(String.valueOf(displayedResult.get(entry.getKey().trim())))) {
				logger.log(LogStatus.INFO, "Actual",
						entry.getKey() + " - " + String.valueOf(actualResult.get(entry.getKey().trim())));
				logger.log(LogStatus.FAIL, "Displays",
						entry.getKey() + " - " + String.valueOf(displayedResult.get(entry.getKey().trim())));
			}
			for (int i = 0; i < list2.size(); i++) {
				if (list1.get(i).equals(list2.get(i))) {
				} else {
					logger.log(LogStatus.FAIL, "ERROR",
							entry.getKey() + " - " + list1.get(i) + " NOT EQUALS " + list2.get(i));
				}
			}

		}
	}
	@BeforeMethod
	public static String setup(Method method) {
		String testMethodName = method.getName();
		String descriptiveTestName = method.getAnnotation(Test.class).testName();
		report.addSystemInfo("Project", "Autorox");
		report.addSystemInfo("Environment", "User Acceptance Testing");
		report.addSystemInfo("Tester", "Krishnaveni Vipparla");
		logger = report.startTest(testMethodName);
		logger.log(LogStatus.INFO, "TestCase", descriptiveTestName);
		return testMethodName;
	}

	@BeforeSuite
	public void initiateReports(ITestContext ctx) throws IOException {
		WebElements.XpathHubStore("Locators\\Locators.xlsx", "DashboardPage");
		WebElements.XpathHubStore("Locators\\Locators.xlsx", "JobcardEstimationPage");
		WebElements.XpathHubStore("Locators\\Locators.xlsx", "StockDashboardPage");
		WebElements.XpathHubStore("Locators\\Locators.xlsx", "InwardPage");
		// WebElements.XpathHubStore("Locators\\Locators.xlsx", "ManageScheme");
		String suiteName = ctx.getCurrentXmlTest().getSuite().getName();
		System.setProperty("TestSuite", suiteName);
		report = new ExtentReports("./Reports/" + suiteName + ".html", true, DisplayOrder.NEWEST_FIRST);

	} 
	
	public static String getValue(String locatorType, String locatorValue, String attribute) {
        String text = "";
        try {
            if (locatorType.equalsIgnoreCase("xpath")) {
                text = driver.findElement(By.xpath(locatorValue)).getAttribute(attribute);
            }
            if (locatorType.equalsIgnoreCase("id")) { 
            
                text = driver.findElement(By.id(locatorValue)).getAttribute(attribute);
            } 
            if (locatorType.equalsIgnoreCase("class")) { 
    
                text = driver.findElement(By.className(locatorValue)).getAttribute(attribute);
            }
        } catch (NoSuchElementException e) {
        } catch (TimeoutException e) {
        }
        log.info("Get Value : " + text + "-->" + locatorValue);
        logger.log(LogStatus.INFO, "GetValue", text + "-->" + locatorValue);
        return text.trim();  
    }



	/* To get the Website Name */
	public String getUrlTitle() throws Exception {
		URL aURL = new URL(WebsiteURL);
		String WebName = aURL.getHost();
		String WebSiteName = WebName.toUpperCase();
		return WebSiteName;
	}

	/* To Press ENTER Key using Robot */
	public void hitEnter() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
	}

	/* To Press BACKSPACE Key using Robot */
	public void hitBackspace() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_BACK_SPACE);
		re.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	/* To Press DELETE Key using Robot */
	public void hitDelete() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_DELETE);
		re.keyRelease(KeyEvent.VK_DELETE);
	}
	
	/* To Select all the Text/Web Elements using ROBOT */
	public void selectAll() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_A);
	}

	/* To Copy all the Selected Text/Web Elements using ROBOT */
	public void copyAll() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_C);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_C);
	}

	/* To Paste all the Selected Text/Web Elements using ROBOT */
	public void pasteAll() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_V);
	}

	/* To Capture Screenshot(Replaces if already exists) */
	/*
	 * Also, Make sure that the automation in running in the foreground to capture
	 * the Image of the Browser. Else, It'll capture the open Window
	 */
	public void robotScreenCapture(String robotImageName) throws Exception {
		re = new Robot();
		Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage bufferedImage = re.createScreenCapture(area);
		// Save as PNG
		File file = new File(robotImageName);
		if (file.exists()) {
			file.delete();
		}
		ImageIO.write(bufferedImage, "png", file);
	}
	public static void dateselection(String Datetype)
	{
		Date objDate = new Date(); // Current System Date and time is assigned to objDate
		  System.out.println(objDate);
		  String strDateFormat = "MMM d, yyyy"; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		  String Date=objSDF.format(objDate);
		System.out.println(Date);
		if(Datetype=="Policy Expiry Date") {
			
			driver.findElement(By.xpath("(//div[@class='flatpickr-calendar animate arrowBottom open rightMost']//div)[6]//div//span[@aria-label='"+Date+"']")).click();
		}
		else {
			driver.findElement(By.xpath("(//div[@class='flatpickr-calendar animate arrowTop rightMost open']//div)[6]//div//span[@aria-label='"+Date+"']")).click();
		}
	}
	public static void dateSelection()
	{
		Format f = new SimpleDateFormat("EEEE");
	    String str = f.format(new Date());
	    System.out.println("Full Day Name = "+str);
		ZoneId z = ZoneId.of("Asia/Kolkata");
		LocalDate today = LocalDate.now(z);
		if(str.equals("Friday"))
		{
		long day = 1;
		
		LocalDate setDate = today.plusDays(day);
		driver.findElement(By.xpath("//td[@title='"+setDate+"']")).click();
		}
		else {
			long day = 1;
		LocalDate setDate = today.plusDays(day);
	driver.findElement(By.xpath("//td[@title='"+setDate+"']")).click();
		}
	}
		
	public static String autoGenerateMobileNumber(int n) {
		String AlphaNumericString = "6789";
		StringBuilder sb = new StringBuilder(n); 
		for (int i = 0; i < n; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();  
	}
	/* To ZoomOut */
	public void robotZoomOut() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}

	/* To ZoomIn */
	public void robotZoomIn() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}

	/* To ScrollUp using ROBOT */
	public void robotScrollUp() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_UP);
		re.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	/* To ScrollDown using ROBOT */
	public void robotScrollDown() throws Exception {
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_DOWN);
		re.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	/* To ScrollUp using JavaScript Executor */
	public void scrollUp() throws Exception {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, -100);");
	}

	/* To ScrollDown using JavaScript Executor */
	public void scrollDown() throws Exception {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 500);");
	}

	/* To Move cursor to the Desired Location */
	public void moveCursor(int X_Position, int Y_Position) throws Exception {
		re.mouseMove(X_Position, Y_Position);
	}

	/* To Accept the Alert Dialog Message */
	public void alertAccept() throws Exception {
		al = getWebDriver().switchTo().alert();
		al.accept();
	}

	/* To Dismiss the Alert Dialog Message */
	public void alertDismiss() throws Exception {
		al = getWebDriver().switchTo().alert();
		al.dismiss();
	}

	/* To Get the Alert Messages */
	public String getAlertText() throws Exception {
		al = getWebDriver().switchTo().alert();
		String text = al.getText();
		Thread.sleep(2000);
		alertAccept();
		return text;
	}

	/* To Upload a File using JAVA AWT ROBOT */
	public void fileUpload(String FileToUpload) throws Exception {
		Thread.sleep(5000);
		StringSelection filetocopy = new StringSelection(FileToUpload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filetocopy, null);
		Thread.sleep(1000);
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);

	}

	/* To Perform a WebAction of Mouse Over */
	public void mouseHover(WebElement element) {
		ac = new Actions(getWebDriver());
		ac.moveToElement(element).build().perform();
	}

	/* To Perform Select Option by Visible Text */
	public void selectByVisibleText(WebElement element, String value) {
		se = new Select(element);
		se.selectByVisibleText(value);
	}

	/* To Perform Select Option by Index */
	public void selectByIndex(WebElement element, int value) {
		se = new Select(element);
		se.selectByIndex(value);
	}

	/* To Perform Select Option by Value */
	public void selectByValue(WebElement element, String value) {
		se = new Select(element);
		se.selectByValue(value);
	}

	/* To click a certain Web Element */
	public void click(WebElement element) {
		element.click();
	}

	/* To click a certain Web Element using DOM/ JavaScript Executor */
	public void javaScriptExecutorClick(WebElement element) {
		((JavascriptExecutor) getWebDriver()).executeScript("return arguments[0].click();", element);
	}

	/* To Type at the specified location */
	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	/* To Clear the content in the input location */
	public void clear(WebElement element) {
		element.clear();
	}

	/* To Drag and Drop from Source Locator to Destination Locator */
	public void dragAndDrop(WebElement Source, WebElement Destination) {
		ac = new Actions(getWebDriver());
		ac.dragAndDrop(Source, Destination);
	}

	/*
	 * To Drag from the given WebElement Location and Drop at the given WebElement
	 * location
	 */
	public void dragAndDropTo(WebElement Source, int XOffset, int YOffset) throws Exception {
		ac = new Actions(getWebDriver());
		ac.dragAndDropBy(Source, XOffset, YOffset);
	}

	/* To Open a Page in New Tab */
	public void rightClick(WebElement element) {
		ac = new Actions(getWebDriver());
		ac.contextClick(element);
		ac.build().perform();
	}

	/* To Close Current Tab */

	public void closeCurrentTab() {
		getWebDriver().close();
	}

	/* To Perform Click and Hold Action */
	public void clickAndHold(WebElement element) {
		ac = new Actions(getWebDriver());
		ac.clickAndHold(element);
		ac.build().perform();
	}

	/* To Perform Click and Hold Action */
	public void doubleClick(WebElement element) {
		ac = new Actions(getWebDriver());
		ac.doubleClick(element);
		ac.build().perform();
	}

	/* To Switch To Frame By Index */
	public void switchToFrameByIndex(int index) throws Exception {
		getWebDriver().switchTo().frame(index);
	}

	/* To Switch To Frame By Frame Name */
	public void switchToFrameByFrameName(String frameName) throws Exception {
		getWebDriver().switchTo().frame(frameName);
	}

	/* To Switch To Frame By Web Element */
	public void switchToFrameByWebElement(WebElement element) throws Exception {
		getWebDriver().switchTo().frame(element);
	}

	/* To Switch out of a Frame */
	public void switchOutOfFrame() throws Exception {
		getWebDriver().switchTo().defaultContent();
	}

	/* To Get Tooltip Text */
	public String getTooltipText(WebElement element) throws Throwable {
		String tooltipText = element.getAttribute("title").trim();
		return tooltipText;
		
	}
 
	/* To Close all Tabs/Windows except the First Tab */

	public void closeAllTabsExceptFirst() {
		ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
		for (int i = 1; i < tabs.size(); i++) {
			getWebDriver().switchTo().window(tabs.get(i));
			getWebDriver().close();
		}
		getWebDriver().switchTo().window(tabs.get(0));
	}

	/* To Print all the Windows */
	public void printAllTheWindows() {
		ArrayList<String> al = new ArrayList<String>(getWebDriver().getWindowHandles());
		for (String window : al) {
			System.out.println(window);
		}
	}
	public static void navigateTo(String url) {
		log.info("Navigating to URL :" + url);
		logger.log(LogStatus.INFO, "Navigating to URL-->" + url);
		// driver.navigate().to(url);
		driver.get(url);
	}
	public void ClickOnLinks(String LinkName) {
		driver.findElement(By.linkText(LinkName)).click();
			}
	
	@FindBy(xpath = "(//nav[@class='main-menu']//a)[2]")
    WebElement link;
	
	public static String getAutoGenerateOnlyString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

	/*
	 * public void Navigation1(String ModleName,String presentpage) throws Throwable
	 * { String []ele= link.getAttribute("href").split(presentpage); String url =
	 * ele + ModleName; driver.navigate().to(url); System.out.println(ele[0]);
	 * System.out.println(ele[1]); System.out.println(url);
	 * 
	 * }
	 */
	public void Navigation(String ModleName) throws Throwable {      
        String []ele= link.getAttribute("href").split("serviceticket/bookAppointment");
        
        String ele1=ele[0]+ModleName+ele[1];
        driver.navigate().to(ele1);
                System.out.println(ele[0]);
                System.out.println(ele[1]);
                System.out.println(ele1); 
                
    }

public static String autoGenerateNumber(int n, String Number) {
    String AlphaNumericString = Number;
    StringBuilder sb = new StringBuilder(n);  
    for (int i = 0; i < n; i++) {
        int index = (int) (AlphaNumericString.length() * Math.random());
        sb.append(AlphaNumericString.charAt(index));
    }
    return sb.toString();  
} 
public static void typeWithDelay(int milliSeconds, String locatorType, String locatorValue, String text)
		throws Exception, Throwable {
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		final WebDriverWait wait2 = wait;
		if (locatorType.equalsIgnoreCase("id")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
			driver.findElement(By.id(locatorValue)).clear();
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.id(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("xpath")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.xpath(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("name")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.name(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("tagName")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.tagName(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("className")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.className(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("cssSelector")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.cssSelector(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("linkText")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.linkText(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		if (locatorType.equalsIgnoreCase("partialLinkText")) {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatorValue)));
			for (int i = 0; i < text.length(); i++) {
				Thread.sleep(milliSeconds);
				driver.findElement(By.partialLinkText(locatorValue)).sendKeys(String.valueOf(text.charAt(i)));
			}
		}

		log.info("Typing : " + text + " , in locator : " + locatorValue);
	}

	catch (NoSuchElementException e) {
		// Thread.sleep(3000);
		// driver.navigate().refresh();
	}

}
public static String autoGenerateNumber1(int n, String Number) {
//    String AlphaNumericString = Number;
    StringBuilder sb = new StringBuilder(n);
    for (int i = 0; i < n; i++) {
        int index = (int) (Number.length() * Math.random());
        sb.append(Number.charAt(index));
    }
    return sb.toString();
} 
/*public static String autogenerateNumbers(int n, String number) {
	
	String numbers = number;
	
	for (int i=0; i<n; i++);

	Random r = new Random();
	 r.nextInt(3);
	
	return r.toString();
	
	
	
	
}*/
public static void checktechniciancountinJobqueuepage() {
	ArrayList<String> technicianwithsamenameList = new ArrayList<>();
	Map<String, ArrayList<String> > technicianaddinMap = new HashMap<>();
	
}



public static void selectFromListDropdown(List<WebElement> elements, String value) {
	List<WebElement> elements2 = elements;
	for (WebElement element : elements2) {
		if (element.getText().equalsIgnoreCase(value)) {
			System.out.println(element.getText());
			log.info("Selecting value :  " + value + ", from locator : " + element);
			element.click();
			break;
		}
		}}


/*public static String generateNumber() {
Random random = new Random();
StringBuilder sb = new StringBuilder();
sb.append("9"); 

 for (int i = 1; i < 10; i++) {
 int digit = random.nextInt(10); // Generate a random digit (0-9)
sb.append(digit);
}

 return sb.toString ();
 
 
 
 
        }*/
	
	public void TechnicianSelection(int No_Of_Technicians) throws Throwable {	
		for(int i=1; i<=No_Of_Technicians; i++) {
			driver.findElement(By.xpath("(//*[@id=\"__BVID__10\"]/tbody[2]/tr/td[9]/div/ul/li[1]/a["+i+"]")).click();

			//*[@id="__BVID__10"]/tbody[2]/tr/td[9]/div/ul/li[1]/a
}}}
		
		
		
		
		
		
	