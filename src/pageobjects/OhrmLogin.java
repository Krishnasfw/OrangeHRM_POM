package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OhrmLogin  {
	

	WebDriver driver;
	
	public OhrmLogin(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(id = "txtUsername")
	 WebElement username;
	
	@FindBy(id = "txtPassword")
	 WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
     WebElement submit;
	
	@FindBy (id ="btnlogin")
	WebElement retrybutton;
	
	
	
	public void loginpage( String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		try {
			submit.click();
		} catch (Exception e) {
			retrybutton.click();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
