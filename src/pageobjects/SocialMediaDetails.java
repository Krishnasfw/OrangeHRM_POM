package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialMediaDetails {
	
	WebDriver driver;

	public SocialMediaDetails(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[2]/a/span[2]")
	WebElement SocialMediaInfo;
	
	@FindBy(css = "#socialMediaDiv > div > a > i")
	WebElement AddButton ;
	
	@FindBy(id = "profileName")
	WebElement ProfileName;
	
	@FindBy(id = "profileLink")
	WebElement Link ;
	
	@FindBy(id = "modal-save-button")
	WebElement Detail_Save;
	
	
	
	public void socialmediadetails(String name, String link) {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SocialMediaInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddButton.click();
		ProfileName.sendKeys(name);
		Link.sendKeys(link);
		Detail_Save.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
