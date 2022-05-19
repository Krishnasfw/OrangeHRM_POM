package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmergencyContacts {
	WebDriver driver;

	public EmergencyContacts(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;

	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	@FindBy(id = "top-menu-trigger")
	WebElement MenuButton;
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[3]/a/span[2]")
	WebElement EmergencyContactInfo ;
	
	@FindBy(xpath = "//*[@id=\"socialMediaDiv\"]/div/a/i")
	WebElement AddButton ;
	
	@FindBy(id = "name")
	WebElement Name ;
	
	@FindBy(id = "relationship")
	WebElement Relationship ;
	
	@FindBy(id = "home_phone")
	WebElement  H_Phone;
	
	@FindBy(id = "mobile_phone")
	WebElement  M_Phone;
	
	@FindBy(id = "office_phone")
	WebElement Office_Phone ;
	
	@FindBy(id = "modal-save-button")
	WebElement SaveButton ;
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement Attachment;

	@FindBy(id = "filename")
	WebElement File;

	@FindBy(id = "description")
	WebElement Description;

	@FindBy(id = "modal-save-button")
	WebElement Attach_Save;
	
	public void emergencycontact(String name,String relation,String h_phone,String m_phone,
			String office,String Vfilepath, String InVfilepath, String description) throws Exception {
		MenuButton.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EmergencyContactInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddButton.click();
		Name.sendKeys(name);
		Relationship.sendKeys(relation);
		H_Phone.sendKeys(h_phone);
		M_Phone.sendKeys(m_phone);
		Office_Phone.sendKeys(office);
		SaveButton.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Attachment.click();
		try {
			File.sendKeys(Vfilepath);
		} catch (Exception e) {
			File.sendKeys(InVfilepath);
		}
		Description.sendKeys(description);
		Attach_Save.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
