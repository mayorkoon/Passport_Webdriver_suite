package actions;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.NavigateToURL;
import pages.LoginPageObject;
import pages.StartBrowser;
import pages.URL;

public class PassportForgotPasswordTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void ValidEmail() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickSignInButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LoginPageObj.ClickForgotPassword();

		LoginPageObj.EnterEmailOrMobileNumber("passportuser@interswitchgroup.com");

		LoginPageObj.ClickContinue();

		LoginPageObj.verifyResetLinkMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	@Test(priority = 2)
//	public void InValidEmail() {
//
//		NavigateToURL startWebsite = new NavigateToURL(driver);
//
//		startWebsite.launchURL();
//
//
//		LoginPageObject LoginPageObj = new LoginPageObject(driver);
//
//		LoginPageObj.ClickSignInButton();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		LoginPageObj.ClickForgotPassword();
//
//		LoginPageObj.EnterEmailOrMobileNumber("passportuser@interswitchgroup");
//
//		LoginPageObj.ClickContinue();
//
//		LoginPageObj.verifyResetLinkMsgIsPresent();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
	
	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Passport Login Page Test Passed Successfully with ");
	}

}






