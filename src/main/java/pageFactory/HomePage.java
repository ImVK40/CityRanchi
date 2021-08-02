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
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
