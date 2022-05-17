package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCAse {
	WebDriver d;
	@BeforeTest
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://keshavaraj7-trials7401.orangehrmlive.com/");
		// d.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void page() {
		PageFactory.initElements(d, Loginpage.class);
		

		Loginpage.username.sendKeys("Admin");
		Loginpage.password.sendKeys("d1BnR@1eBX");
		Loginpage.submit.click();
		
		PageFactory.initElements(d, MyInfoPage.class);
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MyInfoPage.Myinfo.click();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		MyInfoPage.Lastname.clear();
		MyInfoPage.Lastname.sendKeys("Meredian");
		
		MyInfoPage.others.clear();
		MyInfoPage.others.sendKeys("Hi");
		
		MyInfoPage.Firstname.clear();
		MyInfoPage.Firstname.sendKeys("JD");
		
		MyInfoPage.savebutton.click();
	}
		/*
		 * Loginpage.username(d).sendKeys("Admin");
		 * Loginpage.password(d).sendKeys("d1BnR@1eBX"); Loginpage.submit(d).click();
		 */
@AfterTest
public void close(){
		
		//d.close();

	}

}