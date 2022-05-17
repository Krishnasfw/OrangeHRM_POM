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
	
	@FindBy(xpath = "//label[@for='checkbox_attachments_4']")
	WebElement OldRecord ;
	
	@FindBy(xpath = "//i[@class='material-icons icons-color orange-text']")
	WebElement Selectoption ;
	
	@FindBy(xpath = "//a[text()='Delete Selected']")
	WebElement DeleteRecord ;
	
	@FindBy(id = "save-button")
	WebElement Deleteforever ;
	
	public void emergencycontact(String name,String relation,String h_phone,String m_phone,
			String office,String Vfilepath, String InVfilepath,String description) {
		MenuButton.click();
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
		Attachment.click();
		try {
			File.sendKeys(Vfilepath);
		} catch (Exception e) {
			File.sendKeys(InVfilepath);
		}
		Description.sendKeys(description);
		Attach_Save.click();
		Selectoption.click();
		DeleteRecord.click();
		Deleteforever.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

}
