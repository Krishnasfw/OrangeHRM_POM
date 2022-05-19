package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.SalaryDetails;
import testbase.Baseclass;

public class TC004_SalaryDetails extends Baseclass {
	
	
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		SalaryDetails  salarydetails  = PageFactory.initElements(driver, SalaryDetails.class);
		 salarydetails.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	@Test
	public void salary() throws Exception {
			SalaryDetails salarydetails =PageFactory.initElements(driver, SalaryDetails.class);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			salarydetails.salaryinfo();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
}
}