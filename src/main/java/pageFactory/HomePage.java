package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement browserLibraryIcon;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement managementReport;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement searchLibrary; //value
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement VaR_Reports;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement submitButton;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement selectAll;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement newPackage;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement packageName; //value random
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement pageNumber;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement runDate;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement selectionsButton;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement allSelections;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement dateFiled; //value random
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement saveButton;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement saveReport;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement saveAndRun;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement alert_No;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement myReports; //wait for element to be present then click
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement subscription;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement reportRecipents; //value
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement deliveryReport;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBrowserLibraryIcon() {
		browserLibraryIcon.click();
	}
	
	public void clickOnManagementReport() {
		managementReport.click();
	}
	
	public WebElement getSearchLibrary() {
		return searchLibrary;
	}
	
	public void clickOnVaR_Reports() {
		VaR_Reports.click();
	}
	
	public void clickOnSubmit() {
		submitButton.click();
	}
	
	public void clickOnSelectAll() {
		selectAll.click();
	}
	
	public void clickOnNewPackage() {
		newPackage.click();
	}
	
	public WebElement getPackageName() {
		return packageName;
	}
	
	public void clickOnPageNumber() {
		pageNumber.click();
	}
	
	public void clickOnRunDate() {
		runDate.click();
	}
	
	public void clickOnSelectionsButton() {
		selectionsButton.click();
	}
	
	public void clickOnAllSelections() {
		allSelections.click();
	}
	
	public WebElement getDateFiled() {
		return dateFiled;
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public void clickOnSaveReport() {
		saveReport.click();
	}
	
	public void clickOnSaveAndRun() {
		saveAndRun.click();
	}
	
	public void clickOnAlertNo() {
		alert_No.click();
	}
	
	public WebElement getMyReports() {
		//wait for element to be present then click
		return myReports;
	}
	
	public void clickOnSubscription() {
		subscription.click();
	}
	
	public WebElement getReportRecipents() {
		return reportRecipents;
	}
	
	public void clickOnDeliveryReport() {
		deliveryReport.click();
	}
}
