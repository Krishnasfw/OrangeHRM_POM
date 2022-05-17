package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalaryDetails {
	WebDriver driver;

	public SalaryDetails(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//*[@id=\\\"top-menu\\\"]/li[3]/a")
	WebElement SalaryInfo ;
	
	public void salaryinfo () {
		SalaryInfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

}
