package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.ContactDetails;
import pageobjects.Dependent;
import pageobjects.EmergencyContacts;
import pageobjects.JobDetails;
import pageobjects.OhrmLogin;
import pageobjects.ProfilePicture;
import pageobjects.SalaryDetails;
import pageobjects.SocialMediaDetails;
import testbase.Baseclass;

public class Testcase extends Baseclass {

	@Test
	public void Validdata() throws InterruptedException {
		// LoginPage
		OhrmLogin login = PageFactory.initElements(driver, OhrmLogin.class);
		login.loginpage("Admin", "d1BnR@1eBX"); // d1BnR@1eBX
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// PersonalDetails
		//PersonalDetails pd = PageFactory.initElements(driver, PersonalDetails.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//pd.personalDeatils("C:\\Users\\Admin\\Downloads\\Formal_man.png", "Johnty", "Rhodes", "5654320",
	//			"C:\\Users\\Admin\\Desktop\\Testing Data\\Personal Details.docx",
			//	"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf");

		String text = driver.getTitle();
		System.out.println("Sub Module : " + text + "is Displayed");
		
		//Job
		JobDetails jd = PageFactory.initElements(driver, JobDetails.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("File is Downloaded");
		
		//Salary
		SalaryDetails salarydetails =PageFactory.initElements(driver, SalaryDetails.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//ContactDetails
		ContactDetails cd = PageFactory.initElements(driver, ContactDetails.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cd.contactdetails("6,Hargrave Street", "Manitoba", "Winnepeg", "(508)25254565", "+021-4658479", 
				"Johnty456@gmail.com", "Rhodes123@gmail.com",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Contact Detail File.docx", 
				"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf", "Contact details attachment");
		
		//SocialMedia Details
		SocialMediaDetails smd = PageFactory.initElements(driver, SocialMediaDetails.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		smd.socialmediadetails("Admin", "Not Available");
		
		//Emergency Details
		EmergencyContacts emergencydetails = PageFactory.initElements(driver, EmergencyContacts.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		emergencydetails.emergencycontact("J Kalis", "Friend", "+21-0422", "+091-276", "04879752", 
				"C:\\Users\\Admin\\Desktop\\Testing Data\\Emergency Contact Details.docx",
				"C:\\Users\\Admin\\Desktop\\Testing Data\\File upload for Testing.pdf" ,"Emergengy Contact Details attachment");
		
		//Dependent Details
		Dependent dependentdetails = PageFactory.initElements(driver, Dependent.class);
				
				
				
				
				
	}

}
