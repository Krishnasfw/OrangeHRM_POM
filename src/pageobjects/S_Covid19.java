package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class S_Covid19 {
	WebDriver driver;

	public S_Covid19(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[11]/a/span[2]")
	WebElement Covid19info ;
	
	public void covid19() throws Exception {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Covid19info.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
	
	@FindBy(xpath = "//i[text()='edit_item']")
	WebElement Edit ;
	
	@FindBy(id = "description")
	WebElement Description_Edit;
	
	@FindBy(id = "modal-save-button")
	WebElement Attach_Save_Edit;
	
	public void editattachment(String editdescription) {
		Edit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Description_Edit.clear();
		Description_Edit.sendKeys(editdescription);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Attach_Save_Edit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	
}

