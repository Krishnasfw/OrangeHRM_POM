package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.Qualification;
import testbase.Baseclass;

public class TC010_Qualification extends Baseclass {
	@DataProvider 
	public  Object[][] QualificationDataprovider() throws Exception {
	Object[][]testdata = ExcelData.getdata("WorkExperience_Details1");
		return testdata;
	}
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		Qualification qualify =PageFactory.initElements(driver, Qualification.class);
		qualify.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	@Test (priority = 1, dataProvider = "QualificationDataprovider", enabled = true)
	public void Validpersonalinfo(String com_name,String role) throws Exception  {
		Qualification qualify =PageFactory.initElements(driver, Qualification.class);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			qualify.qualifyinfo(com_name, role);
			Thread.sleep(8000);
}
	@Test(priority = 3,enabled = true)
	public void attach() throws Exception {
		Qualification qualify =PageFactory.initElements(driver, Qualification.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			qualify.attachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Qualification Details.docx",
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"Qualification details attachment");
			Thread.sleep(3000);
}
	
}
