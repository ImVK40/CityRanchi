package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement username;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement password;
	@FindBy (xpath = "*//input[@id=\"email\"]") private WebElement signOn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 public WebElement getUsername() { return
	 username; }
	 
	 public WebElement getPassword() { return
	 password; }
	 
	 public void signOn() { signOn.click(); }
	 

}
