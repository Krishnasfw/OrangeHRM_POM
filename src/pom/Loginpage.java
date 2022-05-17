package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class Loginpage {
	
	
	@FindBy(id = "txtUsername")
	public static WebElement username;
	
	@FindBy(id = "txtPassword")
	public static WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	public static WebElement submit;
	
	/*
	 * public static WebElement username(WebDriver d) { 
	 * return d.findElement(By.id("txtUsername")); }
	 * 
	 * public static WebElement password(WebDriver d) { return
	 * d.findElement(By.id("txtPassword")); }
	 * 
	 * public static WebElement submit(WebDriver d) { return
	 * d.findElement(By.xpath("//button[text()='Login']")); }
	 */

}


