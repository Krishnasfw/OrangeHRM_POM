package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.ProfilePicture;
import testbase.Baseclass;
@Listeners(listeners.Listener1.class)
public class TC001_ProfilePicture extends Baseclass{
	
	
	@Test
	public void profilepicture() throws InterruptedException, Exception {
		ProfilePicture profile = PageFactory.initElements(driver, ProfilePicture.class);
		profile.Myinfo();
		profile.profilePicture();
		profile.uploadpicture("C:\\Users\\Admin\\Downloads\\Man.jpg");
		Screenshot("ProfilePicture");
		
	}
		
}