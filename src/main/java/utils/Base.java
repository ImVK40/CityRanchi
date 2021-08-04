package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	static WebDriver driver;
	public Properties properties = new Properties();
	//public static void main(String args[]) throws IOException {
	public WebDriver initializeBrowser() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
		properties.load(fileInputStream);
		//System.out.print(properties.getProperty("URL"));
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(chromeOptions);
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void waitForElementToClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
	}
	
	public void waitForElementToSendData(WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String data = value;
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(data);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
