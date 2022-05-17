package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.EmergencyContacts;
import testbase.Baseclass;

public class TC007_EmergencyContacts extends Baseclass {
	
	@DataProvider 
	public  Object[][] EmergencyContactInfo() throws Exception {
	Object[][]testdata = ExcelData.getdata("EmergencyContact_Details");
		return testdata;
	}
	
	@DataProvider 
	public  Object[][] InvalidEmergencyContactInfo() throws Exception {
	Object[][]testdata = ExcelData.getdata("Invalid_Emergency");
		return testdata;
	}
	
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		emergencydetails.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	
	@Test (priority = 1, dataProvider ="EmergencyContactInfo",enabled = true)
	public void Validpersonalinfo(String name,String relation,String h_phone,String m_phone,
			String office) throws Exception  {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			emergencydetails.emergencycontact(name, relation, h_phone, m_phone, office);
			Thread.sleep(8000);
}
	@Test (priority = 2, dataProvider ="InvalidEmergencyContactInfo",enabled = false)
	public void Invalidpersonalinfo(String name,String relation,String h_phone,String m_phone,
			String office) throws Exception  {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			emergencydetails.emergencycontact(name, relation, h_phone, m_phone, office);
			
}
	@Test(priority = 3,enabled = false)
	public void attach() {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			emergencydetails.attachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Emergency Contact Details.docx",
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"Emergengy Contact Details attachment");

		
	}

}
