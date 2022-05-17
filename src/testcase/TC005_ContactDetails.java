package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.ContactDetails;
import testbase.Baseclass;

public class TC005_ContactDetails extends Baseclass{
	
	@DataProvider 
	public Object[][] ContactDataProvider() throws Exception {
	Object[][]testdata = ExcelData.getdata("Contact_Details");
		return testdata;
	}
	
	@DataProvider 
	public Object[][] InvalidContactDataProvider() throws Exception {
	Object[][]testdata = ExcelData.getdata("");
		return testdata;
	}
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		ContactDetails cd = PageFactory.initElements(driver, ContactDetails.class);
		 cd.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	
	@Test (priority = 1, dataProvider ="ContactDataProvider",enabled = true)
	public void Contactinfo(String address1,String city,String state,String zipcode,String h_tele,String mobile, 
			String E_mail,String other_mail) throws Exception  {
		ContactDetails cd = PageFactory.initElements(driver, ContactDetails.class);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			cd.contactdetails(address1, city, state, zipcode,h_tele, mobile, E_mail, other_mail);
			Thread.sleep(8000);
}
	@Test (priority = 1, dataProvider ="InvalidContactDataProvider",enabled = false)
	public void InvalidContactinfo(String address1,String city,String state,String zipcode,String h_tele,String mobile, 
			String E_mail,String other_mail) throws Exception  {
		ContactDetails cd = PageFactory.initElements(driver, ContactDetails.class);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			cd.contactdetails(address1, city, state, zipcode,h_tele, mobile, E_mail, other_mail);
			Thread.sleep(8000);
}
	
	@Test(priority = 2,enabled = false)
	public void attach() throws Exception {
		ContactDetails cd = PageFactory.initElements(driver, ContactDetails.class);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	cd.contactattachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Contact Detail File.docx", 
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", "Contact details attachment");
		 	Thread.sleep(8000);
}
}