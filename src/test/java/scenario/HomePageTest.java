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
		loginPage.signOn();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
