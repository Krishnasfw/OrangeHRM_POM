package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.Dependent;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC008_Dependent extends Baseclass {
	
	@DataProvider 
	public  Object[][] DependentInfo() throws Exception {
	Object[][]testdata = ExcelData.getdata("Dependent_Details");
		return testdata;
	}
	@DataProvider 
	public  Object[][] InVaildDependentInfo() throws Exception {
	Object[][]testdata = ExcelData.getdata("Invalid_Dependent");
		return testdata;
	}
	
	@Test (priority = 1, dataProvider ="DependentInfo",enabled = true)
	public void ValidDependent(String name,String dob) throws Exception  {
		Dependent dependent = PageFactory.initElements(driver, Dependent.class);
		dependent.Myinfo();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dependent.dependentinfo(name, dob,"C:\\Users\\Admin\\Desktop\\Testing Data\\Dependant Details.docx",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
				"Dependent details attachment");
		Screenshot("ValidDependent");
}
	@Test (priority = 2, dataProvider ="InVaildDependentInfo",enabled = true)
	public void InValidDependent(String name,String dob) throws Exception  {
		Dependent dependent = PageFactory.initElements(driver, Dependent.class);
		dependent.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dependent.dependentinfo(name, dob,"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Dependant Details.docx",
				"Edit Dependent details attachment");
		Thread.sleep(3000);
		Screenshot("InValidDependent");
			
}
}