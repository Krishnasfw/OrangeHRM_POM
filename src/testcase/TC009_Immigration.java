package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.Immigration;
import testbase.Baseclass;

public class TC009_Immigration extends Baseclass {
	@DataProvider
	public Object[][] ImmigrationInfo() throws Exception {
		Object[][] testdata = ExcelData.getdata("Immigration_Details");
		return testdata;
	}

	@Test(priority = 1, dataProvider = "ImmigrationInfo", enabled = true)
	public void ValidImmigration(String number, String issueddate, String expirydate, String status, String comment)
			throws Exception {
		Immigration immigration = PageFactory.initElements(driver, Immigration.class);
		immigration.Myinfo();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		immigration.immigrationdetails(number, issueddate, expirydate, status, comment,
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Immigration Details.docx",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf",
				"Immigration details attachment");
			Screenshot("Immigration");
	}

}
