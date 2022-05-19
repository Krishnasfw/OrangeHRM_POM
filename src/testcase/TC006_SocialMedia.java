package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.SocialMediaDetails;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC006_SocialMedia extends Baseclass{
	

	@DataProvider 
	public Object[][] SocilaMediaDataProvider() throws Exception {
	Object[][]testdata = ExcelData.getdata("SocialMedia_Details1");
		return testdata;
	}

	@Test (priority = 1, dataProvider ="SocilaMediaDataProvider",enabled = true)
	public void SocialMediainfo(String name, String link) throws Exception  {
		SocialMediaDetails smd = PageFactory.initElements(driver, SocialMediaDetails.class);
		 smd.Myinfo();
		 Thread.sleep(10000);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			smd.socialmediadetails(name, link);
			Screenshot("SocialMedia");
}

}