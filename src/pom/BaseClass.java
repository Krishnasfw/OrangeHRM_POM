package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
 WebDriver d ;
	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		 d = new ChromeDriver();
	
		d.manage().window().maximize();
		d.get("https://keshavaraj7-trials7401.orangehrmlive.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void CloseBrowser() {
		d.close();
	}
}