package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.JobDetails;
import pageobjects.PersonalDetails;
import testbase.Baseclass;

public class TC003_JobDetails extends Baseclass {
	
	
	@Test(priority = 0)
	public void Myinfoclick() throws Exception {
		 PersonalDetails pd = PageFactory.initElements(driver, PersonalDetails.class);
		 pd.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	
	
	@Test(priority = 1)
	public void Job() throws Exception {
			JobDetails jd = PageFactory.initElements(driver, JobDetails.class);
			jd.Job_Info();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("File is Downloaded");
	}
}

