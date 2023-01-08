package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObject;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;

import java.io.IOException;

public class PassportNonIswAdminLoginTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void ValidUsernameValidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickSignInButton();

		LoginPageObj.EnterUsername("admin@sharklasers.com");

		LoginPageObj.EnterPassword("Admin123!@#");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyUserWelcomeMessageIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPageObj.ClickDropdown();
		
		LoginPageObj.ClickLogout();
		
		LoginPageObj.verifyLogoutMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Passport Login Page Test Passed Successfully with ");
	}

}






