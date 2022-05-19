package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public void Screenshot(String Screenshot) throws Exception {
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	File file2 = new File("C:\\Users\\Admin\\eclipse-workspace\\OrangeHRM_POM\\Screenshots\\"+Screenshot
			+ "_" + timestamp + ".png");
	FileUtils.copyFile(file, file2);
}
	@AfterSuite
	public void CloseBrowser() {
		String text = driver.getTitle();
		System.out.println("Sub Module : " + text + " is Displayed");
		driver.close();
	}
}