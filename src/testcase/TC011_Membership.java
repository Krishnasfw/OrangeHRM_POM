package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelData;
import pageobjects.Membership;
import testbase.Baseclass;

public class TC011_Membership extends Baseclass {
	
	@DataProvider 
	public  Object[][] MembershipDataprovider() throws Exception {
	Object[][]testdata = ExcelData.getdata("Membership_Details");
		return testdata;
	}
	@Test(priority = 0, enabled = true)
	public void Myinfoclick() throws Exception {
		Membership membership =PageFactory.initElements(driver, Membership.class);
		membership.Myinfo();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
	}
	@Test(priority = 1, enabled = true)
	public void Membership1() throws Exception {
		Membership membership =PageFactory.initElements(driver, Membership.class);
		membership.membershipinfo();;
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(10000);
}
	
	@Test (priority = 2, dataProvider ="MembershipDataprovider",enabled = true)
	public void ValidDependent(String amount) throws Exception  {
		Membership membership =PageFactory.initElements(driver, Membership.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		membership.addmembershipinfo(amount);
		Thread.sleep(8000);

}

	@Test(priority = 3,enabled = true)
	public void attach() throws Exception {
		Membership membership =PageFactory.initElements(driver, Membership.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			membership.attachment("C:\\Users\\Admin\\Desktop\\Testing Data\\Membership Details.docx",
					"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,
					"Membership details attachment");
			Thread.sleep(3000);
}
}