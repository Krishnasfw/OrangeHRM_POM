package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.Dependent;
import testbase.Baseclass;

public class TC008_Dependent extends Baseclass {
	
	@DataProvider 
	public  Object[][] DependentInfo() throws Exception {
	Object[][]testdata = ExcelData.getdata("Dependent_Details");
		return testdata;
	}
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		Dependent dependent = PageFactory.initElements(driver, Dependent.class);
		dependent.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	
	@Test (priority = 1, dataProvider ="DependentInfo",enabled = true)
	public void ValidDependent(String name,String dob) throws Exception  {
		Dependent dependent = PageFactory.initElements(driver, Dependent.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dependent.dependentinfo(name, dob);
		Thread.sleep(8000);
}
	@Test(priority = 3,enabled = false)
	public void attach() {
		Dependent dependent = PageFactory.initElements(driver, Dependent.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			dependent.attachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Dependant Details.docx",
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"Depandent details attachment");
}
}