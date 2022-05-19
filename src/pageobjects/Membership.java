package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Membership {
	WebDriver driver;

	public Membership(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[9]/a/span[2]")
	WebElement Membershipinfo ;
	
	@FindBy(xpath = "//*[@id=\"socialMediaDiv\"]/div/a/i")
	WebElement Addbutton ;
	
	@FindBy(id = "subscriptionFee")
	WebElement Subscription_Amount ;
	
	@FindBy(id = "modal-save-button")
	WebElement Detail_Save;
	
	@FindBy(xpath = "//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")
	WebElement Cancel ;
	

	@FindBy(xpath = "//a[text()='Add']")
	WebElement Attachment;

	@FindBy(id = "filename")
	WebElement File;

	@FindBy(id = "description")
	WebElement Description;

	@FindBy(id = "modal-save-button")
	WebElement Attach_Save;
	
	
	public void membershipinfo(String amount,String Vfilepath, String InVfilepath, String description) throws Exception {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Membershipinfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Addbutton.click();
		Subscription_Amount.sendKeys(amount);
		Cancel.click();
		Thread.sleep(3000);
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