package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.PersonalDetails;
import testbase.Baseclass;

@Listeners(listeners.Listener1.class)
public class TC002_PersonalDetails extends Baseclass {

	@DataProvider
	public Object[][] PersonalDataProvider() throws Exception {
		Object[][] testdata = ExcelData.getdata("Personal_Details");
		return testdata;
	}
	@DataProvider
	public Object[][] invaliddata() throws Exception {
		Object[][] testdata = ExcelData.getdata("Invalid_Personal");
		return testdata;
	}

	@Test(priority = 0, dataProvider = "PersonalDataProvider", enabled = true,description=" To Validate that user is able to edit the Contact details information from My info tab")
	public void Validpersonalinfo(String fname, String lname, String employeeid, String otherid, String licenseno)
			throws Exception {
		PersonalDetails pd = PageFactory.initElements(driver, PersonalDetails.class);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(8000);
		pd.personalDeatils(fname, lname, employeeid, otherid, licenseno,
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Personal Details.docx",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", "Personal details attachment");	
		Screenshot("ValidPersonal");
	}
	
	@Test(priority = 1, dataProvider = "invaliddata", enabled = true)
	public void Invalidpersonalinfo(String fname, String lname, String employeeid, String otherid, String licenseno) throws Exception {
		PersonalDetails pd = PageFactory.initElements(driver, PersonalDetails.class);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(8000);
		pd.personalDeatils(fname, lname, employeeid, otherid, licenseno,"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", 
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Personal Details.docx","Edit Personal details attachment"	);
		Screenshot("InValidPersonal");
	}

}
