package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.JobDetails;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC003_JobDetails extends Baseclass {
	
	@Test(priority =0)
	public void Job() throws Exception {
			JobDetails jd = PageFactory.initElements(driver, JobDetails.class);
			jd.Job_Info();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("File is Downloaded");
	}
}

