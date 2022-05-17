package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPage extends TestCAse {
	
	@FindBy(xpath ="//span[text()='My Info']")
	public static WebElement Myinfo;
	
	@FindBy(id = "firstName")
	public static WebElement  Firstname;
	
	@FindBy(id = "lastName")
	public static WebElement  Lastname;
	
	@FindBy(id = "otherId")
	static WebElement others; 
	
	
	
	@FindBy(xpath = "//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[7]/div/sf-decorator/div/button")
	public static WebElement savebutton;

	
	
	}

