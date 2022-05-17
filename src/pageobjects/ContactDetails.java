package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetails {
	WebDriver driver;

	public ContactDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id = "top-menu-trigger")
	WebElement MenuButton;
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[1]/a")
	WebElement ContactInfo ;
	
	@FindBy(id = "street1")
	WebElement Address_1 ;
	
	@FindBy(id = "city")
	WebElement City ;
	
	@FindBy(id = "province")
	WebElement State ;
	
	@FindBy(id = "emp_hm_telephone")
	WebElement Telephone ;
	
	@FindBy(id = "emp_mobile")
	WebElement Mobile ;
	
	@FindBy(id = "emp_work_email")
	WebElement Employee_Email ;
	
	@FindBy(id = "emp_oth_email")
	WebElement OtherID ;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement Savebutton;
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement Attachment;

	@FindBy(id = "filename")
	WebElement File;

	@FindBy(id = "description")
	WebElement Description;

	@FindBy(id = "modal-save-button")
	WebElement Attach_Save;
	
	@FindBy(xpath = "//label[@for='checkbox_attachments_2']")
	WebElement OldRecord ;
	
	@FindBy(xpath = "//i[@class='material-icons icons-color orange-text']")
	WebElement Selectoption ;
	
	@FindBy(xpath = "//a[text()='Delete Selected']")
	WebElement DeleteRecord ;
	
	@FindBy(id = "save-button")
	WebElement Deleteforever ;
	
	
	
	public void contactdetails(String address1,String city,String state,String h_tele,String mobile, 
			String E_mail,String other_mail,String Vfilepath,
			String InVfilepath,String description) {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ContactInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Address_1.clear();
		Address_1.sendKeys(address1);
		City.clear();
		City.sendKeys(city);
		State.clear();
		State.sendKeys(state);
		Telephone.clear();
		Telephone.sendKeys(h_tele);
		Mobile.clear();
		Mobile.sendKeys(mobile);
		Employee_Email.clear();
		Employee_Email.sendKeys(E_mail);
		OtherID.clear();
		OtherID.sendKeys(other_mail);
		Savebutton.click();
		Attachment.click();
		try {
			File.sendKeys(Vfilepath);
		} catch (Exception e) {
			File.sendKeys(InVfilepath);
		}
		Description.sendKeys(description);
		Attach_Save.click();
		OldRecord.click();
		Selectoption.click();
		DeleteRecord.click();
		Deleteforever.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
}
