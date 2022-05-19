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
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;

	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	@FindBy(id = "top-menu-trigger")
	WebElement MenuButton;
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[1]/a/span[2]")
	WebElement ContactInfo ;
	
	@FindBy(id = "street1")
	WebElement Address_1 ;
	
	@FindBy(id = "city")
	WebElement City ;
	
	@FindBy(id = "province")
	WebElement State ;
	
	@FindBy(id = "emp_zipcode")
	WebElement ZipCode ;
	
	@FindBy(id = "emp_hm_telephone")
	WebElement Telephone ;
	
	@FindBy(id = "emp_mobile")
	WebElement Mobile ;
	
	@FindBy(id = "emp_work_email")
	WebElement Employee_Email ;
	
	@FindBy(id = "emp_oth_email")
	WebElement OtherID ;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/section/div[2]/ui-view/div[2]/div/div[1]/div/button")
	WebElement ContactDetailSavebutton;
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement Attachment;

	@FindBy(id = "filename")
	WebElement File;

	@FindBy(id = "description")
	WebElement Description;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[3]/button[2]")
	WebElement Attach_Save;
	
	
	public void contactdetails(String address1,String city,String state,String zipcode,String h_tele,String mobile, 
			String E_mail,String other_mail,String Vfilepath, String InVfilepath,String description) throws Exception {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ContactInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Address_1.clear();
		Address_1.sendKeys(address1);
		City.clear();
		City.sendKeys(city);
		State.clear();
		State.sendKeys(state);
		ZipCode.clear();
		ZipCode.sendKeys(zipcode);
		Telephone.clear();
		Telephone.sendKeys(h_tele);
		Mobile.clear();
		Mobile.sendKeys(mobile);
		Employee_Email.clear();
		Employee_Email.sendKeys(E_mail);
		OtherID.clear();
		OtherID.sendKeys(other_mail);
		Thread.sleep(3000);
		ContactDetailSavebutton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Attachment.click();
		try {
			File.sendKeys(Vfilepath);
		} catch (Exception e) {
			File.sendKeys(InVfilepath);
		}
		Description.sendKeys(description);
		Attach_Save.click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
}