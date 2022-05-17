package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SocialMediaDetails {
	
	WebDriver driver;

	public SocialMediaDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id = "top-menu-trigger")
	WebElement MenuButton;
	
	@FindBy(xpath = "//*[@id=\"top-menu-overflow\"]/li[3]/a/span[2]")
	WebElement SocialMediaInfo;
	
	@FindBy(css = "#socialMediaDiv > div > a > i")
	WebElement AddButton ;
	
	@FindBy(id = "typeId")
	WebElement Type ;
	
	@FindBy(id = "profileName")
	WebElement ProfileName;
	
	@FindBy(id = "profileLink")
	WebElement Link ;
	
	@FindBy(id = "modal-save-button")
	WebElement Attach_Save;
	
	@FindBy(xpath = "//label[@for='checkbox_list2_7']")
	WebElement OldRecord ;
	
	@FindBy(xpath = "//i[@class='material-icons icons-color orange-text']")
	WebElement Selectoption ;
	
	@FindBy(xpath = "//a[text()='Delete Selected']")
	WebElement DeleteRecord ;
	
	@FindBy(id = "save-button")
	WebElement Deleteforever ;
	
	public void socialmediadetails(String name, String link) {
		MenuButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SocialMediaInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddButton.click();
		Type.click();
		new Select(Type).selectByIndex(2);
		ProfileName.sendKeys(name);
		Link.sendKeys(link);
		Attach_Save.click();
		OldRecord.click();
		Selectoption.click();
		DeleteRecord.click();
		Deleteforever.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
