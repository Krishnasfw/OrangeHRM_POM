package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.SalaryDetails;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC004_SalaryDetails extends Baseclass {
	
	@Test
	public void salary() throws Exception {
			SalaryDetails salarydetails =PageFactory.initElements(driver, SalaryDetails.class);
			salarydetails.Myinfo();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			salarydetails.salaryinfo();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
}
}