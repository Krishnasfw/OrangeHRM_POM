package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Qualification {
	WebDriver driver;

	public Qualification(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;
	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(8000);
	}
	@FindBy(id = "top-menu-trigger")
	WebElement MenuButton;
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[8]/a/span[2]")
	WebElement Membershipinfo ;
	
	@FindBy(xpath = "//*[@id=\"addButton\"]/div/a/i")
	WebElement Addbutton ;
	
	@FindBy(xpath = "//*[@id=\"additem-options-dropdown-qualifications\"]/li[1]/a")
	WebElement WorkExperience ;
	
	@FindBy(id = "employer")
	WebElement Companyname ;
	
	@FindBy(id = "jobtitle")
	WebElement Jobrole ;
	
	
	
	public void qualifyinfo(String com_name, String role) {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Membershipinfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Addbutton.click();
		WorkExperience.click();
		Companyname.sendKeys(com_name);
		Jobrole.sendKeys(role);
}


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