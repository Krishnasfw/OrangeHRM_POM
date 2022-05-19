package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.S_Covid19;
import testbase.Baseclass;

public class TC012_Covid19 extends Baseclass{
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
		 covid.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	@Test (priority =2,enabled = true)
	public void covidinfo() throws Exception {
	S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
	covid.covid19();
	Thread.sleep(3000);
	
}
	@Test(priority = 3,enabled = true)
	public void attach() throws Exception {
		S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	covid.attachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Covid-19.docx",
		 			"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", 
		 			"Covid-19 Vaccination details attachment");
		 	Thread.sleep(5000);
	}

	@Test(priority = 4,enabled = true)
	public void editattach() throws Exception {
		S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	covid.editattachment("Previous Description Changed :  You are Vaccinated");
	 	Thread.sleep(3000);
	}
}
