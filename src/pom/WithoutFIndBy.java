package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFIndBy {
	public static WebElement txtUsername;
	public  static WebElement txtPassword;
	public static WebElement submit;
@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://keshavaraj7-trials7401.orangehrmlive.com/");
		d.manage().window().maximize();
		PageFactory.initElements(d, WithoutFIndBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("d1BnR@1eBX");
		submit.click();
		
		d.close();
		
}
}
