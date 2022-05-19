package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.S_Covid19;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC012_Covid19 extends Baseclass{
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
		 covid.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	@Test (priority = 1,enabled = true)
	public void covidinfo() throws Exception {
	S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
	covid.covid19("C:\\Users\\Admin\\Desktop\\Testing Data\\Covid-19.docx",
 			"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", 
 			"Covid-19 Vaccination details attachment");
	Thread.sleep(2000);
	Screenshot("Covid-19");
	}
	

	@Test(priority = 2,enabled = true)
	public void editattach() throws Exception {
		S_Covid19 covid = PageFactory.initElements(driver, S_Covid19.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	covid.editattachment("Previous Description Changed :  You are Vaccinated");
	 	Screenshot("Edit_Covid-19");
	}
}
