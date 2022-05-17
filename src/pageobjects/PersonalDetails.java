package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetails {
	WebDriver driver;

	public PersonalDetails(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;

	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}

	@FindBy(id = "firstName")
	WebElement FirstName;

	@FindBy(id = "lastName")
	WebElement LastName;

	@FindBy(id = "employeeId")
	WebElement EmployeeID;

	@FindBy(id = "otherId")
	WebElement OtherID;

	@FindBy(id = "licenseNo")
	WebElement License;

	@FindBy(xpath = "//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[7]/div/sf-decorator/div/button")
	WebElement Save;

	public void personalDeatils(String fname, String lname, String employeeid, String otherid, String licenseno)
			throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		FirstName.clear();
		FirstName.sendKeys(fname);
		LastName.clear();
		LastName.sendKeys(lname);
		EmployeeID.clear();
		EmployeeID.sendKeys(employeeid);
		OtherID.clear();
		OtherID.sendKeys(otherid);
		License.clear();
		License.sendKeys(licenseno);
		Save.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*
	 * Attachment.click();
	 * 
	 * try { File.sendKeys(Vfilepath); } catch (Exception e) {
	 * File.sendKeys(InVfilepath); } Description.sendKeys(description);
	 * 
	 * Attach_Save.click(); Selectoption.click(); DeleteRecord.click();
	 * Deleteforever.click();
	 */

	@FindBy(xpath = "//a[text()='Add']")
	WebElement Attachment;

	@FindBy(id = "filename")
	WebElement File;

	@FindBy(id = "description")
	WebElement Description;

	@FindBy(id = "modal-save-button")
	WebElement Attach_Save;

	public void attachment(String Vfilepath, String InVfilepath, String description) {

		Attachment.click();

		try {
			File.sendKeys(Vfilepath);
		} catch (Exception e) {
			File.sendKeys(InVfilepath);
		}
		Description.sendKeys(description);

		Attach_Save.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
