package scenario;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import pageFactory.HomePage;
import pageFactory.LoginPage;
import utils.Base;

public class HomePageTest extends Base{
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() throws IOException {
		this.driver = initializeBrowser();
	}
		
	public void loginToApplication(){
		loginPage = new LoginPage(driver);
		loginPage.getUsername().sendKeys(properties.getProperty("Username"));
		loginPage.getPassword().sendKeys(properties.getProperty("Password"));
		loginPage.clickOnSignOn();
	}
	
	public void sendReport() {
		homePage = new HomePage(driver);
		homePage.clickOnBrowserLibraryIcon();
		homePage.clickOnManagementReport();
		homePage.getSearchLibrary().sendKeys(properties.getProperty("Search_Library"));
		homePage.clickOnVaR_Reports();
		homePage.clickOnSubmit();
		homePage.clickOnSelectAll();
		homePage.clickOnNewPackage();
		homePage.getPackageName().sendKeys(properties.getProperty("Package_Name"));
		homePage.clickOnPageNumber();
		homePage.clickOnRunDate();
		homePage.clickOnSelectionsButton();
		homePage.clickOnAllSelections();
		homePage.getDateFiled().sendKeys(properties.getProperty("Date_Field"));
		homePage.clickOnSaveButton();
		homePage.clickOnSaveReport();
		homePage.clickOnSaveAndRun();
		homePage.clickOnAlertNo();
		waitForElementToClick(homePage.getMyReports());
		homePage.clickOnSubscription();
		homePage.getReportRecipents().sendKeys(properties.getProperty("Report_Recipents"));
		homePage.clickOnDeliveryReport();
	}
	
	public void exitBrowser() {
		closeBrowser();
	}
	
	public static void main(String[] args) throws IOException {
		
		HomePageTest homePageTest = new HomePageTest();
		homePageTest.loginToApplication();
		homePageTest.sendReport();
		homePageTest.exitBrowser();

	}

}
