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

public class PassportUserLoginTestSuite {
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

		LoginPageObj.EnterUsername("passportuser@interswitchgroup.com");

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
	
	@Test(priority = 2)
	public void ValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickSignInButton();

		LoginPageObj.EnterUsername("test2fa@sharklasers.com");

		LoginPageObj.EnterPassword("password0$");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority = 3)
	public void InValidUsernameInvalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickSignInButton();

		LoginPageObj.EnterUsername("testerrrr2fa@sharklasers.com");

		LoginPageObj.EnterPassword("password0$");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority = 4)
	public void InValidUsernamevalidPassword() {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LoginPageObject LoginPageObj = new LoginPageObject(driver);

		LoginPageObj.ClickSignInButton();

		LoginPageObj.EnterUsername("testerrrr2fa@sharklasers.com");

		LoginPageObj.EnterPassword("password123");

		LoginPageObj.ClickLoginButton();

		LoginPageObj.verifyInvalidUsernameOrPasswordErrMsgIsPresent();
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






