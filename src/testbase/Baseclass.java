package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
 public WebDriver driver ;
	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://keshavaraj7-trials7401.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("d1BnR@1eBX");
		  driver.findElement(By.xpath("//button[text()='Login']")).click();
}
	
	
	@AfterSuite
	public void CloseBrowser() {
		String text = driver.getTitle();
		System.out.println("Sub Module : " + text + " is Displayed");
		driver.close();
	}
}