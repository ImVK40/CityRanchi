package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {

		WebDriver driver;
	//public static void main(String args[]) throws IOException {
	public void initializeBrowser() throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VIKESH\\eclipse-workspace\\CityRanchi\\src\\main\\java\\resources\\Data.properties");
		properties.load(fileInputStream);
		System.out.print(properties.getProperty("URL"));
	}
	
}
