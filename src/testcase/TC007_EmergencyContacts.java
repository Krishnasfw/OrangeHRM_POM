package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.EmergencyContacts;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
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
	
	@Test (priority = 1, dataProvider ="EmergencyContactInfo",enabled = true)
	public void ValidEmergencyContacts(String name,String relation,String h_phone,String m_phone,
			String office) throws Exception  {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		emergencydetails.Myinfo();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			emergencydetails.emergencycontact(name, relation, h_phone, m_phone, office,
					"C:\\Users\\Admin\\Desktop\\Testing Data\\Emergency Contact Details.docx",
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"Emergency Contact Details attachment");
			Screenshot("ValidEmergencyContacts");
}
	@Test (priority = 2, dataProvider ="InvalidEmergencyContactInfo",enabled = true)
	public void InvalidEmergencyContacts(String name,String relation,String h_phone,String m_phone,
			String office) throws Exception  {
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			emergencydetails.emergencycontact(name, relation, h_phone, m_phone, office,
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"C:\\Users\\Admin\\Desktop\\Testing Data\\Emergency Contact Details.docx",
					"Edit Emergency Contact Details attachment");
			Thread.sleep(5000);
			Screenshot("InValidEmergencyContacts");
			
}
	

}
