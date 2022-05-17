package pageobjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobDetails {
	WebDriver driver;

	public JobDetails(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement Myinfo;
	public void Myinfo() throws InterruptedException {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
	}
	
	@FindBy(xpath = "//*[@id='top-menu']/li[2]/a")  
	WebElement Jobinfo;
	
	@FindBy(id = "createDocumentButton")
	WebElement Document;
	
	@FindBy(xpath = "//*[@id=\"DocumentExport\"]/tbody/tr[1]/td[2]/ng-include/div/button")
	WebElement DocumentExport ;
	
	@FindBy(xpath = "//*[@id=\"documentDownloadModal\"]/div/div[3]/button")
	WebElement Close;
	
	public void Job_Info() throws Exception {
		Myinfo.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Jobinfo.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Document.click();
		DocumentExport.click();
		Close.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
}
