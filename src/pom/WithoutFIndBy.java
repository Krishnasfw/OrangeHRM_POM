package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFIndBy {
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement submit;

@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://keshavaraj7-trials7401.orangehrmlive.com/");
		d.manage().window().maximize();
		PageFactory.initElements(d, WithoutFIndBy.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("d1BnR@1eBX");
		submit.click();
		
		d.close();
		
}
}
/*
 * // Drop down
 * 
 * @FindBy(xpath = "//*[@id=\"country_inputfileddiv\"]/div/input") WebElement
 * NationlityDropDownArrow;
 * 
 * @FindAll(@FindBy(xpath =
 * "//*[@id=\"select-options-df41d021-6893-13d6-d3c0-60a473bc47bb\"]"))
 * List<WebElement> nationality_List;
 * 
 * @FindBy(xpath = "//button[text()='Save']") WebElement
 * ContactDetailSavebutton1;
 * 
 * public void select_Country(String countryName) throws Exception {
 * NationlityDropDownArrow.click(); try { Thread.sleep(2000);} catch
 * (InterruptedException e) {}
 * 
 * for(WebElement country : nationality_List){
 * if(country.getText().equals(countryName)) { country.click(); try {
 * Thread.sleep(3000);} catch (InterruptedException e) {} break; }
 * ContactDetailSavebutton1.click(); Thread.sleep(3000); } }
 */