package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Immigration {
	WebDriver driver;

	public Immigration(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[5]/a/span[2]")
	WebElement ImmigrationInfo ;
	
	@FindBy(xpath = "//*[@id=\"immigrationDiv\"]/div/a/i")
	WebElement Addbutton ;
	
	@FindBy(id = "number")
	WebElement Number ;
	
	@FindBy(id = "issuedDate")
	WebElement IssuedDate ;
	
	@FindBy(id = "expiryDate")
	WebElement ExpiryDate ;
	
	@FindBy(id = "status")
	WebElement Status ;
	
	@FindBy(id = "notes")
	WebElement Comment ;
	
	@FindBy(id = "modal-save-button")
	WebElement Detail_Save;
	
	public void immigrationdetails(String number,String issueddate,String expirydate ,String status, String comment) throws Exception {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ImmigrationInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Addbutton.click();
		Thread.sleep(5000);
		Number.sendKeys(number);
		IssuedDate.sendKeys(issueddate);
		ExpiryDate.sendKeys(expirydate);
		Status.sendKeys(status);
		Comment.sendKeys(comment);
		Detail_Save.click();
		
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
