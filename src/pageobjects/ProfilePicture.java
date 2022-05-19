package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePicture {
	WebDriver driver;

	public ProfilePicture(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;
	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(8000);
	}

	@FindBy(xpath = "//*[@id=\"right-side\"]/header/div[1]/nav/div/div/ul[2]/li[1]/img")
	WebElement Image;
	
	
	public void profilePicture() throws InterruptedException{
		Image.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(8000);
		
		}

	@FindBy(id = "employeePicture")
	WebElement ProfilePicture;
		

	@FindBy(xpath = "//a[text()='Save']")
	WebElement ProfileSave;
	public void uploadpicture(String image) throws InterruptedException {
		Thread.sleep(10000);
		ProfilePicture.sendKeys(image);
		ProfileSave.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	

}
